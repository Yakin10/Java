import java.awt.desktop.SystemEventListener;

public class GarbageCollector {
    public static void main(String[] args) {
        Students s1 = new Students(1,"Ram");
        s1.display();
        s1 = null;
        System.gc();
    }
    public static class Students {
        int rollno;
        String name;
        public Students (int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }
        public void display () {
            System.out.println("Roll No. : "+rollno);
            System.out.println("Name : "+name);
        }

        protected void finalize() throws Exception {
            System.out.println("Calling Finalize method");
        }
    }
}
