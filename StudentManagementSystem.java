import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static class Student {
        String name;
        String rollNo;
        String course;

        Student(String name, String rollNo, String course) {
            this.name = name;
            this.rollNo = rollNo;
            this.course = course;
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addStudent();
            } 
            else if (choice == 2) {
                viewStudents();
            } 
            else if (choice == 3) {
                searchStudent();
            } 
            else if (choice == 4) {
                deleteStudent();
            } 
            else if (choice == 5) {
                System.out.println("Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        students.add(new Student(name, rollNo, course));

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {

            System.out.println("----------------------");
            System.out.println("Name: " + student.name);
            System.out.println("Roll No: " + student.rollNo);
            System.out.println("Course: " + student.course);
        }
    }

    static void searchStudent() {

        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();

        for (Student student : students) {

            if (student.rollNo.equals(rollNo)) {

                System.out.println("Student found!");
                System.out.println("Name: " + student.name);
                System.out.println("Course: " + student.course);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {

        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();

        for (Student student : students) {

            if (student.rollNo.equals(rollNo)) {

                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}


