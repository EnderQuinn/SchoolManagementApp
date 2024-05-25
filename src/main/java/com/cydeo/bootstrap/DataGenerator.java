package com.cydeo.bootstrap;

import com.cydeo.DTO.AddressDTO;
import com.cydeo.DTO.CourseDTO;
import com.cydeo.DTO.RoleDTO;
import com.cydeo.DTO.UserDTO;
import com.cydeo.entity.User;
import com.cydeo.enums.Gender;
import com.cydeo.enums.State;
import com.cydeo.service.AddressService;
import com.cydeo.service.CourseService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RoleService roleService;
    private final UserService userService;
    private final AddressService addressService;
    private final CourseService courseService;

    public DataGenerator(RoleService roleService, UserService userService, AddressService addressService, CourseService courseService) {
        this.roleService = roleService;
        this.userService = userService;
        this.addressService = addressService;
        this.courseService = courseService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO admin = new RoleDTO(1L, "Admin");
        RoleDTO manager = new RoleDTO(2L, "Manager");
        RoleDTO instructor = new RoleDTO(3L, "Instructor");

        roleService.save(admin);
        roleService.save(manager);
        roleService.save(instructor);

        AddressDTO address1 = new AddressDTO("123 Main Street Anytown 12345", State.CALIFORNIA, "+1 (555) 555-1234");
        AddressDTO address2 = new AddressDTO("456 Oak Avenue Smallville 67890", State.TEXAS, "+1 (555) 555-5678");
        AddressDTO address3 = new AddressDTO("789 Maple Drive Suburbia 45678", State.NEW_YORK, "+1 (555) 555-9012");
        AddressDTO address4 = new AddressDTO("321 Elm Street Springfield 23456", State.ILLINOIS, "+1 (555) 555-2456");
        AddressDTO address5 = new AddressDTO("567 Pine Road Lakeside 78901", State.FLORIDA, "+1 (555) 555-7890");
        AddressDTO address6 = new AddressDTO("789 Maple Drive Suburbia 45678", State.NEW_YORK, "+1 (555) 555-9012");
        AddressDTO address7 = new AddressDTO("321 Elm Street Springfield 23456", State.ILLINOIS, "+1 (555) 555-3456");
        AddressDTO address8 = new AddressDTO("890 Cedar Lane Mountainview 56789", State.COLORADO, "+1 (555) 555-2345");
        AddressDTO address9 = new AddressDTO("101 Pineapple Avenue Beachtown 98765", State.HAWAII, "+1 (555) 555-6789");

        UserDTO user1 = new UserDTO("Michael", "Jordan", "mick@gmail.com", "PassWord$1", "PassWord$1", admin, Gender.MALE, address1);
        UserDTO user2 = new UserDTO("Larry", "Bird", "larry@gmail.com", "PassWord$2", "PassWord$2", manager, Gender.MALE, address2);
        UserDTO user3 = new UserDTO("Angelina", "Sea", "star@yahoo.com", "PassWord$3", "PassWord$3", instructor, Gender.FEMALE, address3);
        UserDTO user4 = new UserDTO("Elizabeth", "Loren", "loren@hotmail.com", "PassWord$4", "PassWord$4", instructor, Gender.FEMALE, address4);
        UserDTO user5 = new UserDTO("Bill", "Wooden", "bill@gmail.com", "PassWord$5", "PassWord$5", instructor, Gender.MALE, address5);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);

        CourseDTO course1 = new CourseDTO(1L, "Spring Boot", "Spring Boot with MVC, ORM, REST", user2, LocalDate.of(2024, 4, 10), LocalDate.of(2024, 8, 18));
        CourseDTO course2 = new CourseDTO(2L, "Java Advanced", "Functional Programming, Streams, New Features", user2, LocalDate.of(2024, 2, 4), LocalDate.of(2024, 7, 18));
        CourseDTO course3 = new CourseDTO(3L, "React Spring Rest", "Create web app with React and Spring Rest", user2, LocalDate.of(2023, 12, 24), LocalDate.of(2024, 5, 8));

        courseService.save(course1);
        courseService.save(course2);
        courseService.save(course3);

    }

}

