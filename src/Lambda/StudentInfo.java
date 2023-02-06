package Lambda;
import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo{
    void printStudent(Student st){
        System.out.println("Name of student: " + st.name + ", student`s gender: " + st.gender + ", student`s age: " + st.age + ", student`s grade: " + st.grade + ".");
    }
    void testStudent(ArrayList <Student> list, Predicate <Student> t){
        for(Student s: list){
            if (t.test(s)){
                printStudent(s);
            }
        }
    }
        public static void main(String[] args) {
            Student st1 = new Student("Vlad", 'm', 20, 84);
            Student st2 = new Student("Orest", 'm', 19, 78);
            Student st3 = new Student("Olena", 'f', 23, 66);
            Student st4 = new Student("Ilona", 'f', 18, 88);
            Student st5 = new Student("Igor", 'm', 34, 60);

            ArrayList<Student> list = new ArrayList<>();
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);

            StudentInfo info = new StudentInfo();
            info.testStudent(list, s -> s.gender=='f');
        }
    }

/*
    interface studentChecks{
    boolean check(Student s);
    }
*/

