package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student karan = new Student(
                    "Karan", LocalDate.of(1997, Month.JUNE, 12), "karan.parmar@gmail.com");

            Student vivek = new Student(
                    "Vivek", LocalDate.of(1992, Month.MARCH, 21), "vivek@gmail.com");

            repository.saveAll(List.of(karan, vivek));

        };
    }

}
