package com.examly.springapp.service;

import com.examly.springapp.model.Course;
import com.examly.springapp.repository.CourseRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseRepo repo;

    public boolean post(Course c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Course> getAll() {
        return repo.findAll();

    }

    public List<Course> getPerson(String age) {
        return repo.findByCourseName(age);

    }

}
