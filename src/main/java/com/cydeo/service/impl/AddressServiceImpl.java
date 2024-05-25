package com.cydeo.service.impl;

import com.cydeo.DTO.AddressDTO;
import com.cydeo.enums.State;
import com.cydeo.service.AddressService;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class AddressServiceImpl extends AbstractMapService<AddressDTO, String> implements AddressService {
    @Override
    public AddressDTO save(AddressDTO address) {
        return super.save(address.getAddressInfo(), address);
    }

    @Override
    public void update(AddressDTO address) {
        super.update(address.getAddressInfo(), address);
    }

    @Override
    public AddressDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<AddressDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public List<State> findAllStates() {
        return Arrays.asList(State.values());
    }

}
