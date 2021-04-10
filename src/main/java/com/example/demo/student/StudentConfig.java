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
            Student onur = new Student(
                    1L,
                    "Onur",
                    "onurr@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 5)

            );
            Student onur2 = new Student(
                    2L,
                    "Onur2",
                    "onur2@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 5)

            );

            repository.saveAll(
                    List.of(onur,onur2)
            );
        };
    }
}
