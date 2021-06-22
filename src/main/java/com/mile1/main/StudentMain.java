package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Darcy Xian  22/6/21  8:07 pm      MiniProject3
 */

public class StudentMain {
    static Student data[] = new Student[6];

    StudentMain(){
        for(int i=0; i<data.length;i++){
            data[i] = new Student();
        }
        data[0] = new Student("",new int[]{85,75,95});
        data[1] = new Student(null,new int[]{11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj",null);
        //F check
        data[4] = new Student("David",new int[]{11,22,33});
        //A+ check
        data[5] = new Student("ABC",new int[]{99,99,90});
    }
public static void main(String[] args) throws NullMarksArrayException, NullNameException, NullStudentObjectException {
        StudentMain studentMain = new StudentMain();


      StudentReport studentReport = new StudentReport();
      StudentService studentService = new StudentService();
        for(Student student: data){
            studentReport.validate(student);
        }

    System.out.println("Number of Null Object: "+studentService.findNumberOfNullObjects(data));
    System.out.println("Number of Null Marks Array: "+ studentService.findNumberOfNullMarksArray(data));
    System.out.println("Number of Null Marks Array: "+ studentService.findNumberOfNullName(data));
    System.out.println("Grades should be F: "+ studentReport.findGrades(data[4]));
    System.out.println("Grades should be A+ :"+studentReport.findGrades(data[5]));
    }
}
