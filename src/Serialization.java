import java.io.*;

public class Serialization {
    public static void main (String[] args) throws Exception {
        Student s1 = new Student(1,10,"Ram", "R@m123", "Defence School");
        Student s2 = new Student(2, 10, "Shyam", "Shyam123");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\patel\\IdeaProjects\\JavaClasses\\student.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\patel\\IdeaProjects\\JavaClasses\\student.txt"));
        Student s3 = (Student) ois.readObject();
        s3.display();
        s3 = (Student)  ois.readObject();
        s3.display();

    }

    public static class School {
        static String schoolName = "ABC School";

    }
    public static class Student extends School implements Serializable {
        int studentID, studentClass ;
        String studentName;
        transient String password;

        public void display () {
            System.out.println("Student ID : "+this.studentID);
            System.out.println("Student Name : "+this.studentName);
            System.out.println("Student Class  : "+this.studentClass);
            System.out.println("Student School : "+schoolName);
        }
        public Student(int id, int Class, String name,String password, String schoolname) {
            this.studentID = id;
            this.studentClass = Class;
            this.studentName = name;
            this.password = password;
            schoolName = schoolname;
        }
        public Student(int id, int Class, String name,String password) {
            this.studentID = id;
            this.studentClass = Class;
            this.studentName = name;
            this.password = password;
        }
    }
}
