package Methods;

public class Student {
    int NumberOfStudentID;
    String studentFirstName;
    String studentSurName;
    int YearOfStudy;
    int AverageGradeInEconomics;
    int AverageGradeInMath;
    int AverageGradeInEnglish;

    int AverageGrade(int AverageGradeInEconomics, int AverageGradeInMat, int AverageGradeInEnglish) {
        int result = (AverageGradeInEconomics + AverageGradeInMat + AverageGradeInEnglish)/3;
        return result;
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student Nastych = new Student();
        Student Melnyk = new Student();
        Student Gonsharenko = new Student();

        Nastych.NumberOfStudentID = 1;
        Nastych.studentFirstName = ("Eduard");
        Nastych.studentSurName = ("Nastych");
        Nastych.YearOfStudy = 2020;
        Nastych.AverageGradeInEconomics = 90;
        Nastych.AverageGradeInMath = 75;
        Nastych.AverageGradeInEnglish = 95;

        Melnyk.NumberOfStudentID = 2;
        Melnyk.studentFirstName = ("Olena");
        Melnyk.studentSurName = ("Melnyk");
        Melnyk.YearOfStudy = 2018;
        Melnyk.AverageGradeInEconomics = 75;
        Melnyk.AverageGradeInMath = 60;
        Melnyk.AverageGradeInEnglish = 80;

        Gonsharenko.NumberOfStudentID = 3;
        Gonsharenko.studentFirstName = ("Elizabeth");
        Gonsharenko.studentSurName = ("Gonsharenko");
        Gonsharenko.YearOfStudy = 2022;
        Gonsharenko.AverageGradeInEconomics = 60;
        Gonsharenko.AverageGradeInMath = 60;
        Gonsharenko.AverageGradeInEnglish = 70;

        int AvaregeGradeE = Nastych.AverageGrade(Nastych.AverageGradeInEconomics, Nastych.AverageGradeInMath, Nastych.AverageGradeInEnglish);
        int AvaregeGradeO = Melnyk.AverageGrade(Melnyk.AverageGradeInEconomics, Melnyk.AverageGradeInMath, Melnyk.AverageGradeInEnglish);
        int AvarageGradeL = Gonsharenko.AverageGrade(Gonsharenko.AverageGradeInEconomics, Gonsharenko.AverageGradeInMath, Gonsharenko.AverageGradeInEnglish);

        System.out.println(AvaregeGradeE);
        System.out.println(AvaregeGradeO);
        System.out.println(AvarageGradeL);
    }
}
