package com.mile1.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Darcy Xian  22/6/21  3:07 pm      MiniProject3
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int marks[];
    private String grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}
