package com.example.SpringDataJPA.model;
import jakarta.persistence.*;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String name;
   
   @Column(unique = true)
   private Long accountNo;
   private Long marks;
}
