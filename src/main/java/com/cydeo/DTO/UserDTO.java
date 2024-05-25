package com.cydeo.DTO;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String confirmPassword;
    private RoleDTO role;
    private Gender gender;
    private AddressDTO address;
}
