package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public void run (String... strings) throws Exception{
        Course course;

        course = new Course("Astrophysics", "Neil D Tyson", "Just a course on stars", 3);
        courseRepository.save(course);

        course = new Course("Calculus", "Carol Henley", "Rate of Change", 3);
        courseRepository.save(course);

        course = new Course("English", "Geraldine pegram", "Learn Language", 3);
        courseRepository.save(course);
    }


}
