package com.cydeo.DTO;

import com.cydeo.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private String addressInfo;
    private State state;
    private String phoneNumber;
}
