import java.io.*;

public class Externalizable {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SubClass sub = new SubClass(10, 12);

        /*ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\patel\\IdeaProjects\\JavaClasses\\External.ser"));
        out.writeObject(sub);
        out.close();*/

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\patel\\IdeaProjects\\JavaClasses\\External.ser"));
        SubClass readSub = (SubClass) in.readObject();
    }

    public static class MainClass {
        int mainValue;

        /*public MainClass () {
            System.out.println("Default Const.");
        }*/
        public MainClass (int mainValue) {
            this.mainValue = mainValue;
        }
    }

    public static class SubClass extends MainClass implements java.io.Externalizable {
        int subValue;

        /*public SubClass () {
            System.out.println("SubClass default const.");
        }*/

        public SubClass (int mainValue, int subValue) {
            super(mainValue);
            this.subValue = subValue;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            System.out.println("External Writer");
            out.writeObject(mainValue);
            out.writeObject(subValue);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            System.out.println("External reader");
            int mainValue = (int) in.readObject();
            int subValue = (int) in.readObject();
            System.out.println("Main Value : "+mainValue);
            System.out.println("Sub Value : "+subValue);
        }
    }
}
