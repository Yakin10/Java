import java.io.*;

public class SerializationInheritance {

    public static void main(String[] args) throws  Exception {
        /*Why is this not Taking the parameter I am giving*/
        Employees EMP = new Employees(1,"Shyam", "No Department", 00);
        Employees EMP2 = new Employees(2,"Ram","HR", 02);
        EMP.display();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\patel\\IdeaProjects\\JavaClasses\\Employees.txt"));
        oos.writeObject(EMP);
        oos.writeObject(EMP2);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\patel\\IdeaProjects\\JavaClasses\\Employees.txt"));
        ois.readObject();
        ois.readObject();
        ois.close();

    }

    public static class Department implements Serializable {
        static String Dept;
        static int Dept_ID;

        public Department(String dept, int deptid) {
            this.Dept = dept;
            this.Dept_ID = deptid;
        }
    }

    public static class Employees extends Department {
        int Emp_no;
        String Emp_name;

        public Employees (int empno,String empname) {
            super("No Department",00);
            this.Emp_name = empname;
            this.Emp_no = empno;
        }
        public Employees (int empno, String empname, String dept, int deptno) {
            super(dept,deptno);
            this.Emp_no = empno;
            this.Emp_name = empname;
        }

        public void display () {
            System.out.println("Employee Name : "+Emp_name);
            System.out.println("Employee Number : "+Emp_no);
            System.out.println("Employee Department : "+Dept);
            System.out.println("Department ID : "+Dept_ID);
        }

        private void writeObject (ObjectOutputStream oos) throws IOException, ClassNotFoundException {
            System.out.println("Write object dept : "+Dept);
            if(Dept == "No Department") {
                Dept = "Boss";
                Dept_ID = 100;
                oos.writeObject(Dept);
                oos.writeObject(Dept_ID);
            }
            oos.defaultWriteObject();
        }

        private void readObject (ObjectInputStream ois) throws IOException, ClassNotFoundException {
           ois.defaultReadObject();
           if(Emp_no == 2) {
               System.out.println("Employee will be terminated");
               System.out.println("Employee Name : "+Emp_name);
           }
           else {
               display();
           }

        }
    }
}
