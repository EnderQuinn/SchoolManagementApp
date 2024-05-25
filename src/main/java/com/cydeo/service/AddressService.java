package com.cydeo.service;

import com.cydeo.DTO.AddressDTO;
import com.cydeo.enums.State;
import java.util.List;


public interface AddressService extends CrudService<AddressDTO, String> {

    List<State> findAllStates();

}
