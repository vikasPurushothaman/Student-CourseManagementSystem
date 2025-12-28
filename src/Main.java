import entity.Student;
import service.StudentService;
import util.IdGenerator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService stueStudentService = new StudentService();

        while (true){
            System.out.println("1 -> Add Student");
            System.out.println("2 -> View all Students");
            System.out.println("0 -> Exist");

            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.print("First Name: ");
                String fn = sc.nextLine();
                System.out.print("Last Name: ");
                String ln = sc.nextLine();
                Student s = new Student(
                        IdGenerator.nextStudentId(),
                        fn, ln,null,"Batch"+ IdGenerator.nextEntrollmentId()
                );
                    stueStudentService.addStudent(s);
                    System.out.println(s);

            }
            else if(choice == 2) {
                stueStudentService.listAllTheStudents();
            }
            else {
                break;
            }
        }
    }
}