package com.demo.student_ms;

import com.demo.student_ms.entity.Student;
import com.demo.student_ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentMsApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

     /*   Student student1 = new Student("Kemal","Ekim","sample@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Student","2","s2@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Third","Student","third@hotmail.com");
        studentRepository.save(student3);
      */
    }
}
