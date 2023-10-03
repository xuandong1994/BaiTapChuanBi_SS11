package BaiTapSession11.BaiTap7;

import java.util.*;

public class Students {
    private String studentName;
    private String gender;
    private String dateOfBirth;

    public Students(String studentName, String gender, String dateOfBirth) {
        this.studentName = studentName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    private static List<Students> demerging(List<Students> students){
        Queue<Students>  NU  = new LinkedList<>();
        Queue<Students> NAM  = new LinkedList<>();
        for (Students s : students) {
            if (s.gender.equalsIgnoreCase("nữ")){
                NU.add(s);
            }else {
                NAM.add(s);
            }
        }
        List<Students> sortedStudents = new ArrayList<>();
        while (!NU.isEmpty() && NAM.isEmpty()){
            sortedStudents.add(NU.poll());
            sortedStudents.add(NAM.poll());
        }
        while (!NU.isEmpty()) {
            sortedStudents.add(NU.poll());
        }

        while (!NAM.isEmpty()) {
            sortedStudents.add(NAM.poll());
        }


        return sortedStudents;
    }
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Alice", "Nữ","1999"));
        students.add(new Students("Bob", "Nam","1995"));
        students.add(new Students("Catherine", "Nữ","1996"));
        students.add(new Students("David", "Nam", "1997"));
        students.add(new Students("Emily", "Nữ", "1998"));

        List<Students> sortedStudents = demerging(students);

        for (Students student : sortedStudents) {
            System.out.println(student.studentName + " - " + student.gender + "-" + student.dateOfBirth);
        }
    }
}
