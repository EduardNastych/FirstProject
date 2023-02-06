package OOP;

import Methods.Student;

public class Encapsulation {
    private StringBuilder name;
    public StringBuilder getName() {
        return name; }
    public void setName(StringBuilder newname) {
        if(newname.length()<=3) {
            name = newname;
        }
    }
    private int course;

    public int getCourse() {
        return course;
    }
    public void setCourse (int i){
        if(i>=1 && i<=4) {
            course = i;
        }
    }
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int j) {
        if(j>=1 && j<=10) {
            grade = j;
        }
    }
     public void showInfo(){
        System.out.println("Lambda.Student name is " + getName() + ". " + "His grade: " + getGrade()  + ". " +  "He study at " + getCourse() + " course.");
    }

    public static void main(String[] args) {
        Encapsulation Student = new Encapsulation();
        StringBuilder u = new StringBuilder("Oli");
        Student.setName(u);
        Student.setGrade(9);
        Student.setCourse(3);
        Student.showInfo();

    }
}

