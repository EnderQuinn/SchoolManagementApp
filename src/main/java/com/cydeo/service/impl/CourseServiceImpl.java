package com.cydeo.service.impl;
import com.cydeo.DTO.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl extends AbstractMapService<CourseDTO, Long> implements CourseService {
    @Override
    public CourseDTO save(CourseDTO CourseCode) {
        return super.save(CourseCode.getId(), CourseCode);
    }


    @Override
    public void update(CourseDTO CourseCode) {
        super.update(CourseCode.getId(), CourseCode);
    }

    @Override
    public CourseDTO findById(Long CourseCode) {
        return super.findById(CourseCode);
    }

    @Override
    public List<CourseDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long CourseCode) {
        super.deleteById(CourseCode);
    }
}
