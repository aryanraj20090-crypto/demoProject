package com.personal.demoProject.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.javapoet.ClassName;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table (name = "class")
public class ClassesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Integer id;
    @Column(name= "class_name")
    private String ClassName;
    @Column(name = "section")
    private String section;
}
