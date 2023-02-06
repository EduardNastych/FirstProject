package Overloaded;

public class Student2 {

    Student2(int NumberOfStudentID, String studentFirstName, String studentSurName, int YearOfStudy, int AverageGradeInEconomics, int AverageGradeInMath, int AverageGradeInEnglish) {
        this(1, "Eduard", "Nastych", 2020);
        AverageGradeInEconomics = 90;
        AverageGradeInMath = 75;
        AverageGradeInEnglish = 95;
    }

    Student2(int NumberOfStudentID, String studentFirstName, String studentSurName, int YearOfStudy) {
        NumberOfStudentID = 2;
        studentFirstName = ("Olena");
        studentSurName = ("Melnyk");
        YearOfStudy = 2018;
    }

    Student2() {
        this(0, null, null, 0, 0, 0, 0);
    }

    ;
}
    class Student2Test {
        public static void main (String [] args) {
        Student2 Gonsharenko = new Student2(3, "Elizabeth", "Gonsharenko", 2016);
        Student2 Melnyk = new Student2(2, "Olena", "Melnyk", 2018, 90, 90, 90);
        Student2 Nastych = new Student2();



        }
    }

