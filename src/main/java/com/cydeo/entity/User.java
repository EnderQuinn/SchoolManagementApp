package com.cydeo.entity;

import com.cydeo.DTO.AddressDTO;
import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String confirmPassword;
    private Role role;
    private Gender gender;
    private AddressDTO address;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String password, String confirmPassword, Role role, Gender gender, AddressDTO address) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.role = role;
        this.gender = gender;
        this.address = address;
    }
}
