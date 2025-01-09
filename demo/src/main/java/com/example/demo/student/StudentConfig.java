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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
             Student sean = new Student(
                     "Sean",
                     "kembosean72004@gmail.com",
                     LocalDate.of(2004, Month.APRIL,5)
             );

             Student mandisi = new Student(
                     "Mandisi",
                     "mandisitaro9720@gmail.com",
                     LocalDate.of(2000, Month.AUGUST,23)
             );
             repository.saveAll(
                     List.of(sean, mandisi)
             );
        };
    }
}
