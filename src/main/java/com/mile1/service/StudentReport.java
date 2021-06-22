package com.mile1.service;

import com.mile1.bean.Student;

/**
 * Darcy Xian  22/6/21  6:06 pm      MiniProject3
 */
public class StudentReport{

    public String findGrades(Student student){
        boolean F = true;
        int marks[] = student.getMarks();
        for(int mark : marks){
            if(mark > 35){
                F = false;
                break;
            }
        }
        if(F){
            return "F";
        }else {
            int sum =0;
            for(int i = 0; i<marks.length; i++){
                sum+= marks[i];
            }
            if(sum<150){
                return "C";
            }
            else if(sum<200){
                return "B";
            }else if(sum<250){
                return "A";
            }else{
                return "A+";
            }
        }
    }
    public String validate(Student student)  throws NullMarksArrayException,NullNameException,NullStudentObjectException {

        try{
            if(student == null){
                throw new NullStudentObjectException();
            }else if(student.getName() == null) {
                throw new NullNameException();
            }else if(student.getMarks() == null){
                throw new NullMarksArrayException();
            }
        }
        catch (NullNameException e) {
           e.printStackTrace();
        }
        catch (NullStudentObjectException e){
            e.printStackTrace();
        }
        catch (NullMarksArrayException e){
            e.printStackTrace();
        }
    return "VALID";
    }
}
