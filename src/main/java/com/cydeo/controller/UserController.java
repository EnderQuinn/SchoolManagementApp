package com.cydeo.controller;

import com.cydeo.DTO.UserDTO;
import com.cydeo.service.AddressService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final RoleService roleService;
    private final AddressService addressService;

    public UserController(UserService userService, RoleService roleService, AddressService addressService) {
        this.userService = userService;
        this.roleService = roleService;
        this.addressService = addressService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles", roleService.findAll());
        model.addAttribute("addresses", addressService.findAll());
        model.addAttribute("states", addressService.findAllStates());
        model.addAttribute("users", userService.findAll());

        return "user/user-create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("user") UserDTO userDTO) {
        userService.save(userDTO);

        return "redirect:/user/create";
    }

    @GetMapping("/update/{username}")
    public String updateUser(@PathVariable ("username") String username, Model model) {
        model.addAttribute("user", userService.findById(username));
        model.addAttribute("roles", roleService.findAll());
        model.addAttribute("addresses", addressService.findAll());
        model.addAttribute("states", addressService.findAllStates());
        model.addAttribute("users", userService.findAll());

        return "user/user-update";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") UserDTO user) {

        userService.update(user);

        return "redirect:/user/create";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable ("username") String username) {

        userService.deleteById(username);

        return "redirect:/user/create";
    }

}
