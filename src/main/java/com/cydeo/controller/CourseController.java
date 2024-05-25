package com.cydeo.controller;

import com.cydeo.DTO.CourseDTO;
import com.cydeo.service.CourseService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;
    private final UserService userService;

    public CourseController(CourseService courseService, UserService userService) {
        this.courseService = courseService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createCourse(Model model) {
        model.addAttribute("course", new CourseDTO());
        model.addAttribute("managers", userService.findAll());
        model.addAttribute("courses", courseService.findAll());

        return "course/course-create";
    }

    @PostMapping("/create")
    public String createCourse(@ModelAttribute("course") CourseDTO course) {
        courseService.save(course);

        return "redirect:/course/create";
    }

    @GetMapping("/update/{courseID}")
    public String updateCourse(@PathVariable("courseID") Long CourseCode, Model model) {
        model.addAttribute("course", courseService.findById(CourseCode));
        model.addAttribute("managers", userService.findAll());
        model.addAttribute("courses", courseService.findAll());

        return "course/course-update";
    }

    @PostMapping("/update")
    public String updateCourse(@ModelAttribute("course") CourseDTO course) {
        courseService.update(course);

        return "redirect:/course/create";
    }

    @GetMapping("/delete/{courseID}")
    public String deleteCourse(@PathVariable("courseID") Long CourseCode) {
        courseService.deleteById(CourseCode);

        return "redirect:/course/create";
    }
}
