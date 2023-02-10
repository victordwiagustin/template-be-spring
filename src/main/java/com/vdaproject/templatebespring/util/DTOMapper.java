package com.vdaproject.templatebespring.util;

import com.vdaproject.templatebespring.dto.UserRegistrationDTO;
import com.vdaproject.templatebespring.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.text.ParseException;

@Component
public class DTOMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public User convertDtoToUser(UserRegistrationDTO userRegistrationDTO) throws ParseException {
        var user = modelMapper.map(userRegistrationDTO, User.class);

        // TODO: encrypt password first

        user.setId(IdGenerator.generateId());
        user.setRegistrationDate(DateUtil.now());

        return user;
    }
}
