import java.util.Scanner;

class Student{
    String name;
    double marks1;
    double marks2;
    double marks3;
    double total;
    double a;

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter marks in marks1: ");
        marks1 = in.nextInt();
        System.out.print("Enter marks in marks2: ");
        marks2 = in.nextInt();
        System.out.print("Enter marks in marks3: ");
        marks3 = in.nextInt();
    }

    public void aveage(){
        total = marks1 + marks2 + marks3;
        a = total / 3.0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks in marks1: " + marks1);
        System.out.println("Marks in marks2: " + marks2);
        System.out.println("Marks in marks3: " + marks3);
        System.out.println("Average Marks: " + a);
    }
}

public class StuDemo {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.accept();
        obj.aveage();
        obj.display();
    }
}
