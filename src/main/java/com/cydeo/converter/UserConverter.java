package com.cydeo.converter;


import com.cydeo.DTO.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class UserConverter implements Converter<String, UserDTO> {
    UserService userService;
    public UserConverter(UserService userService) {
        this.userService = userService;
    }

    public UserDTO convert(String source) {
        return userService.findById(source);
    }
}
