import java.util.Scanner;
import java.util.ArrayList;
/**
 * Veronica Pratt
 */
public class StudListRunner 
{
    public static void main(){
        StudentList studentListObject = new StudentList();
        Student student = new Student("p", 7, 0.00);
        int loopEnd = 1;
        Scanner in = new Scanner(System.in);
        while(loopEnd != 0){
            System.out.println("Welcome to my StudentList Project)");
            System.out.println("To add a student, enter 1");
            System.out.println("To delete a student, enter 2");
            System.out.println("To edit the StudentList, enter 3");
            System.out.println("To clear the list, enter 4");
            System.out.println("To print the list, enter 5");
            System.out.println("To print a Student, enter 6");
            System.out.println("To exit this program, enter 0");
            int loopVar = studentListObject.menuNumber();
            System.out.println(loopVar);
            if(loopVar == 0){
                loopEnd = 0;
            }
            if(loopVar ==1){
                System.out.println("Please enter the information of the student you wish to add");
                String name = in.nextLine();
                int num = student.getstuNumber();
                double GPA = student.getGPA();
                studentListObject.addStudenttoList(name,num, GPA);
            }
            if(loopVar ==2){
                System.out.println("Please enter the last name or student number of the student you wish to delete");
                String statement = in.nextLine();
                System.out.print(studentListObject.deleteStudent("john", ArrayList.studList.get(0)));
            }
            if(loopVar ==3){
                System.out.print(studentListObject.editStudentList());
            }
            if(loopVar ==4){
                System.out.print(studentListObject.clearList());
            }
            if(loopVar ==5){
                System.out.print(studentListObject.printList());
            }
            if(loopVar ==6){
                System.out.print(studentListObject.printStudent());
            }
        }
    }
}