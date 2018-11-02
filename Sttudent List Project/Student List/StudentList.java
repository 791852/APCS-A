
/**
 *Veronica Pratt
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudentList
{
    ArrayList<Student> studList;
    public StudentList(){
        studList = new ArrayList<Student>();;
    }
    public static int menuNumber(){
        Scanner in = new Scanner(System.in);
        int returnVar = in.nextInt();
        return returnVar;
    }
    public void parseUserInput(String name, Student student){
        String fn = "";
        String mn = "";
        String ln = "";
        int i = name.indexOf(" ");
        int j = name.indexOf(" ", i+1);
        if(name.indexOf(",") == -1){
            fn = name.substring(0, i);
            j = name.indexOf(" ", i +1);
            mn = name.substring(i+1, j);
            ln = name.substring(j+1);
        }else{
            if( j == -1){
                ln = name.substring(0, i-1);
                fn = name.substring(i+1);
            }else{
                ln = name.substring(0, i-1);
                j = name.indexOf(" ", i+1);
                fn = name.substring(i+1, j);
                mn = name.substring(j+1);
            }
        }
        student.setfirstName(fn);
        student.setmiddleName(mn);
        student.setlastName(ln);
    }
    public void addStudenttoList(String name, int num, double GPA){
        studList.add(new Student(name, num, GPA)); 
        parseUserInput(name, studList.get(studList.size()-1));
    }
    public void deleteStudent(String name, Student student){
        String deletedName = student.getlastName();
        int deletedNumber = student.getstuNumber();
        if(studList.indexOf(deletedName) >= 0){
            studList.remove(studList.indexOf(deletedName));
        }else if(studList.indexOf(deletedNumber) >= 0){
            studList.remove(studList.indexOf(deletedNumber));        
        }
        else{
            System.out.println("Illegal Input. Pick a student that exists to delete!");
        }
    }
    public static int editStudentList(){
        return 0;
    }
    public static int clearList(){
        return 0;
    }
    public static int printList(){
        return 0;
    }
    public static int printStudent(){
        return 0;
    }
}