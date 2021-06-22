package com.mile1.service;

import com.mile1.bean.Student;

/**
 * Darcy Xian  22/6/21  7:06 pm      MiniProject3
 */
public class StudentService {

    public int findNumberOfNullMarksArray(Student students[]){
        int nullCount = 0;
        for(Student student : students ){
            if(student != null && student.getMarks() == null){
                nullCount++;
            }
        }
        return nullCount;
    };
    public int findNumberOfNullObjects(Student students[]){
        int nullObjectCount = 0;
        for(Student student : students ){
            if(student == null ){
                nullObjectCount++;
            }
        }
        return nullObjectCount;

    }
    public int findNumberOfNullName(Student students[]){
        int nullCount = 0;
        for(Student student : students ){
            if(student != null && student.getName() == null){
                nullCount++;
            }
        }
        return nullCount;
    };
}
