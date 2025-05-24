package com.joeljebitto.demo.rest;

import com.joeljebitto.demo.entity.Student;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
  private List<Student> theStudents;

  @PostConstruct
  public void loadData() {
    theStudents = new ArrayList<>();

    theStudents.add(new Student("Joel", "Jebitto"));
    theStudents.add(new Student("Judson", "Leo"));
    theStudents.add(new Student("Jaba", "Jasphin"));
    theStudents.add(new Student("Obed", "Otto"));
  }

  @GetMapping("/students")
  public List<Student> getStudents() {

    return theStudents;
  }
}
