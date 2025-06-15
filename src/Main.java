import java.io.*;
import java.lang.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.Integer.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

//    static class Employee {
//        String name, department = "\0";
//        int salary = 0;
//        Employee (String name) {
//            this.name = name;
//        }
//        Employee (String name, int salary) {
//            this.name = name;
//            this.salary = salary;
//        }
//        Employee (String name, int salary, String department) {
//            this.name = name;
//            this.salary = salary;
//            this.department = department;
//        }
//        public void display () {
//            System.out.println(this.name);
//            System.out.println(this.salary);
//            System.out.println(this.department);
//        }
//    }
//    static class MathUtils {
//        int multiply (int a, int b) {
//            return a*b;
//        }
//        double multiply (double a, double b) {
//            return a*b;
//        }
//        int multiply (int a, int b, int c) {
//            return a*b*c;
//        }
//    }
//    static class Animal {
//        void eat () {
//            System.out.println("Animal is eating");
//        }
//    }
//    static class Dog extends Animal {
//        void bark () {
//            System.out.println("Dog is barking");
//        }
//    }
//    static class A {
//        void method1 () {
//            System.out.println("This is method 1");
//        }
//    }
//    static class B extends A{
//        void method2 () {
//            System.out.println("This is method 2");
//        }
//    }
//    static class C extends B {
//        void method3 () {
//            System.out.println("This is method 3");
//        }
//    }
//    static class Shape {
//        void area () {
//            System.out.println("This is parent class Area method");
//        }
//    }
//    static class Circle extends Shape {
//        void area () {
//            System.out.println("This Circle Class Area method");
//        }
//    }
//    static class Rectangle extends Shape {
//        void area () {
//            System.out.println("This is Rectangle class Area method");
//        }
//    }
//    static interface Flayable {
//        default void move() {
//            System.out.println("Flayable");
//        }
//    }
//    static interface Swimming {
//        default void move() {
//            System.out.println("Swimming");
//        }
//    }
//    static class Duck implements Flayable, Swimming {
//        public void move () {
//            System.out.println("Duck");
//            Flayable.super.move();
//            Swimming.super.move();
//        }
//    }
//    static class Printer {
//        void print() {
//            System.out.println("This is Parent class Print method");
//        }
//    }
//    static class ColorPrinter extends Printer {
//        void print() {
//            System.out.println("This is Color Printer");
//        }
//    }
//    abstract static class BankAccount {
//        void withdraw(int amount){}
//    }
//    static class SavingAccount extends BankAccount {
//        void withdraw(int amount) {
//            System.out.println("Withdraw "+amount+" from Saving Account");
//        }
//    }
//    static class CurrentAccount extends BankAccount {
//        void withdraw(int amount) {
//            System.out.println("Withdraw "+amount+" from Current Account");
//        }
//    }
//    static class Student {
//        private int marks;
//        private String name;
//
//        void setdata (String name, int marks) {
//            this.name = name;
//            if(marks <= 100 && marks>=0) {
//                this.marks=marks;
//            }
//            else  {
//                System.out.println("Invalid Marks");
//            }
//        }
//        void getdata () {
//            System.out.println("Name : "+this.name);
//            System.out.println("Marks : "+this.marks);
//        }
//    }
//    public static class School {
//        int rollno;
//        public class Student {
//
//            String name;
//            public Student(int rollno, String name) {
//                School.this.rollno = rollno;
//                this.name = name;
//            }
//        }
//}
    public static void main(String[] args) {
        //Class.forName("NUmberFormat" );
//        try {
//            File reader = new File("concept.txt");
//            Scanner myreader = new Scanner(reader);
//        }
//        catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            int a[] = {1,2,3,4,5};
//            System.out.println(a[5]);
//            try {
//                int x = a[1]/0;
//            }
//            catch (ArithmeticException e1 ) {
//                System.out.println(e1.getMessage());
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e2) {
//            System.out.println(e2.getLocalizedMessage());
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name :");
//        String name = input.next();
//        System.out.println("Enter your age :");
//        int age = input.nextInt();
//        try{
//            test2();
//        }
//        catch (InvalidException e) {
//            System.out.println(e.getMessage());
//        }
//        getPassword();
//        School SH = new School();
//        School.Student stu = SH.new Student(10,"Ram");
        //readDirectory();
        //readFile();
//        writeFile();
//        copyFile();
//        countLine();
//        Thread thread1 = new Thread(new MyThread());
//        Thread thread2 = new Thread(new MyThread());
//        thread1.start();
//        thread2.start();
//        Threading task1 = new Threading();
//        task1.setName("Task1");
//        Threading task2 = new Threading();
//        task2.setName("Task2");
//
//        task1.start();
//        task2.start();
//        task2.start();
        Even task1 = new Even();
        Odd task2 = new Odd();
        task1.start();
        task2.start();
    }

    public static class Even extends Thread {
        public void run () {
            System.out.println("Even Numbers");
            for(int i=1; i<=30; i++) {
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
    }

    public static class Odd extends Thread {
        public void run () {
            System.out.println("Odd Numbers");
            for(int i=1; i<=20; i++) {
                if(i%2!=0) System.out.println(i);
            }
        }
    }

    public static class Threading extends Thread {
        public void run () {
            for(int i=0; i<5; i++) {
                System.out.println("Hello From thread : "+this.getName());
            }
        }
    }
    public static class MyThread implements Runnable {
        public void run () {
            for(int i=1;i<=10;i++) {
                System.out.println(i);
            }
        }
    }
//    public static void readDirectory ( ) {
//        File file = new File("D:/Java Basic/");
//        for(File files : file.listFiles()) {
//            if(files.isFile()) {
//                System.out.println(files.getName());
//            }
//        }
//    }
//
//    public static void readFile () throws IOException {
//        FileReader reader = new FileReader( "D:/Java Basic/FileDemo.txt");
//        int ch;
//        while((ch = reader.read()) != -1) {
//            System.out.print((char)ch);
//        }
//        reader.close();
//    }
//
//    public static void writeFile () throws IOException {
//        FileWriter writer = new FileWriter("D:/Java Basic/FileDemo.txt");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter Your Input : ");
//        String line = input.next();
//        writer.write(line);
//        for(int i =0; i< line.length();i++) {
//            writer.append((char)line.charAt(i));
//        }
//        writer.append("A");
//        writer.close();
//
//    }
//
//    public static void copyFile () throws IOException {
//        BufferedReader buffreader = new BufferedReader(new FileReader("D:/Java Basic/FileDemo.txt"));
//        BufferedWriter buffwriter = new BufferedWriter(new FileWriter("D:/Java Basic/FileDemo1.txt"));
//
//        String line;
//        while((line = buffreader.readLine()) != null) {
//            buffwriter.write(line);
//        }
//        System.out.println("Copy Complete");
//        buffreader.close();
//        buffwriter.close();
//    }
//
//    public static void countLine () throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("D:/Java Basic/FileDemo.txt"));
//        String line;
//        int noLine = 0, noWord = 0;
//        while((line = reader.readLine()) != null) {
//            noLine+=1;
//            noWord+=line.length();
//        }
//        System.out.println("Number of Lines in File : "+noLine);
//        System.out.println("Number of Words in File : "+noWord);
//        reader.close();
//    }
    //Exception Example
//    public static class InsufficientBalanceException extends Exception {
//        public InsufficientBalanceException(String message) {
//            super(message);
//        }
//    }
//    public static void bankingApp () {
//        int balance = 5000;
//        int withdraw;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Withdrawal Amount : ");
//        withdraw = parseInt(input.next());
//        try {
//            if (balance < withdraw) {
//                throw new InsufficientBalanceException("Insufficient Balance");
//            }
//        } catch (InsufficientBalanceException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//    public static class NegativeNumberException extends Exception {
//        public NegativeNumberException(String message) {
//            super(message);
//        }
//    }
//    public static void sqrt () {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int number = input.nextInt();
//        try {
//            if(number <= 0 ) {
//                throw new NegativeNumberException ("Number Should not be negative");
//            }
//        }
//        catch (NegativeNumberException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static void numberFormatEXP () throws NumberFormatException {
//        Scanner bf = new Scanner(System.in);
//        System.out.println(parseInt(bf.next()));
//    }
//    public static class InvalidException extends Exception {
//        public InvalidException(String Message) {
//            super(Message);
//        }
//    }
//    public static void test1 () throws InvalidException{
//        throw new InvalidException ("It is invalid");
//    }
//    public static void test2 () throws InvalidException {
//        try {
//            test1();
//        }
//        catch (InvalidException e) {
//            System.out.println(e.getMessage());
//            throw new InvalidException("Second Invalid");
//        }
//    }
//    public static class InvalidPasswordException extends Exception {
//        public InvalidPasswordException (String Message) {
//            super(Message);
//        }
//    }
//    public static void getPassword() throws InvalidPasswordException {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Password : ");
//        String pass = input.next();
//        try {
//            if(pass.length() < 12 ) {
//                throw new InvalidPasswordException("Password Should be at least 12 character");
//            }
//        }
//        catch (InvalidPasswordException e) {
//            System.out.println(e.getMessage());
//            getPassword();
//        }
//    }

//    public static void nSum(int n) {
//        int sum = 0;
//        for (int i = 1; i<=n; i++) {
//            sum += i;
//        }
//        System.out.printf("Sum of %d Natural Numbers is : %d", n, sum);
//    }
//
//    public static void multiplication (int n) {
//        int i;
//        for ( i =1; i <= 10; i++) {
//            System.out.printf(" %d X %d = %d\n", n,i,n*i);
//        }
//    }
//
//    public static void primeNumbers () {
//        int i;
//        boolean d;
//        for (i = 2; i<=50; i++) {
//            d = false;
//            for (int j = 2; j<i; j++){
//                if(i%j == 0) {
//                    d = true;
//                    break;
//                }
//            }
//            if(d == false) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void triangle () {
//        for (int i =1; i<=5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%d",j);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void reverseDigit () {
//        int num = 256;
//        int revNum = 0;
//        while(num>0) {
//            int reminder = num % 10;
//            num /= 10;
//            revNum *=10;
//            revNum += reminder;
//        }
//
//        System.out.println(revNum);
//    }
//
//    public static void whileLoopQ1 () {
//        int i = 10;
//        while(i>=1) {
//            System.out.println(i);
//            i--;
//        }
//    }
//
//    public  static void doWhileQ2 () {
//        Scanner input = new Scanner(System.in);
//        int number;
//        do {
//            System.out.println("Enter a number : ");
//            number = input.nextInt();
//        }while(number!=100);
//    }
//
//    public static void differenceDoWhileAndWhile () {
//        int i = 100;
//        while(i<50) {
//            System.out.println("While Loop :"+i);
//            i--;
//        }
//        i = 100;
//        do {
//             System.out.println("Do-While Loop :"+i);
//             i--;
//        }while(i<50);
//    }
//
//    public static void breakAndContQ1 () {
//        int sum = 0;
//        for (int i = 1; i<=100; i++) {
//            sum += i;
//            System.out.println(sum);
//            if(sum > 50) break;
//        }
//    }
//
//    public static void breakAndContQ2 () {
//        for( int i = 1; i<=10; i++) {
//            if(i%2 == 0) continue;
//            System.out.println(i);
//        }
//    }
//
//    public static int sumNNumbers (int i) {
//        if(i==1) return 1;
//        return i+sumNNumbers(i-1);
//    }
//
//    public static int powerOF (int num, int pow) {
//        if(pow==1) return num;
//        return num * powerOF(num,pow-1);
//    }
//
//    public static void array1D () {
//        int a[] = new int[5];
//        int sum = 0;
//        Scanner input = new Scanner(System.in);
//        for(int i = 0; i<a.length; i++) {
//            System.out.println("Please Enter a Number : ");
//            a[i] = input.nextInt();
//            sum += a[i];
//        }
//        System.out.println("Sum of All numbers is :"+sum);
//    }
//
//    public static void array2DMax () {
//        int a[] [] = {
//                {54,69,14},
//                {98,87,55},
//                {1,8,99}
//        };
//        int max = 0;
//        for(int row = 0; row<a.length; row++) {
//            for(int col = 0; col<a[row].length; col++) {
//                if(max<a[row][col]) max = a[row][col];
//            }
//        }
//        System.out.println("Max = "+max);
//    }
//
//    static  class book {
//        String name;
//        double price;
//
//        public book () {
//            name = "Default";
//            price = 0.00;
//        }
//
//        public book (String name, double price) {
//            this.name = name;
//            this.price = price;
//        }
//
//        public String toString () {
//            System.out.println("Name : "+this.name+"\tPrice :"+this.price);
//            return this.name+this.price;
//        }
//
//        public int hashCode () {
//            return (int) this.price;
//        }
//    }
//
//    public static void bookDemo (){
//        book b1 = new book();
//        book b2 = new book("CPP",23.99);
//
//        System.out.println("b1.getclass : "+b1.getClass());
//        System.out.println("b1.gethashcode : "+b1.hashCode());
//        System.out.println("b2.hashcode : "+b2.hashCode());
//        b2.toString();
//
//    }
}