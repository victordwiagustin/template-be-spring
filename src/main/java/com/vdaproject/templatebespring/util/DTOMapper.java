package com.vdaproject.templatebespring.util;

import com.vdaproject.templatebespring.dto.UserDto;
import com.vdaproject.templatebespring.dto.UserRegistrationDto;
import com.vdaproject.templatebespring.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.text.ParseException;

@Component
public class DTOMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    // TODO: Logic set datanya JANGAN TARUH SINI -> disini pure nge-map saja
    public User toUser(UserRegistrationDto userRegistrationDTO) {
        var user = modelMapper.map(userRegistrationDTO, User.class);

        // TODO: encrypt password first

        user.setId(IdGenerator.generateId());
        user.setRegistrationDate(DateUtil.now());

        return user;
    }

    public UserDto toUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
