package com.vdaproject.templatebespring.service;

import com.vdaproject.templatebespring.dto.UserDto;
import com.vdaproject.templatebespring.dto.UserRegistrationDto;
import com.vdaproject.templatebespring.enums.ServiceResponseStatusEnum;
import com.vdaproject.templatebespring.exceptions.ServiceResponseException;
import com.vdaproject.templatebespring.model.User;
import com.vdaproject.templatebespring.repository.UserRepository;
import com.vdaproject.templatebespring.util.DTOMapper;
import com.vdaproject.templatebespring.util.PasswordUtil;
import com.vdaproject.templatebespring.util.ServiceResponse;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DTOMapper dtoMapper;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(rollbackOn = Exception.class) // TODO: test rollback
    public ServiceResponse<UserDto> registerUser(UserRegistrationDto userRegistrationDto) {
        try {
            var isValidPassword = PasswordUtil.validatePassword(userRegistrationDto.getPassword());
            if (!isValidPassword) {
                throw new ServiceResponseException(new ServiceResponse<UserDto>(ServiceResponseStatusEnum.FAILED_PASSWORD_CONTENT_INVALID));
            }

            var exsistedUser = userRepository.findFirstByUsernameOrderByRegistrationDateDesc(userRegistrationDto.getUsername());

            if (exsistedUser != null) {
                throw new ServiceResponseException(new ServiceResponse<UserDto>(ServiceResponseStatusEnum.FAILED_USER_EXISTED));
            }

            var user = dtoMapper.toUser(userRegistrationDto);
            var savedUser = userRepository.save(user);

            return new ServiceResponse<>(dtoMapper.toUserDto(savedUser), ServiceResponseStatusEnum.SUCCESS);
        } catch (ServiceResponseException e) {
            System.out.println("masuk ServiceResponseException");
            return (ServiceResponse<UserDto>) e.getServiceResponse();
        } catch (Exception e) {
            e.printStackTrace();
            return new ServiceResponse<>(ServiceResponseStatusEnum.ERROR);
        }
    }
}
