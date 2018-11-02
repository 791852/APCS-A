
/**
 * Veronica Pratt
 */
import java.util.Scanner;
public class Student extends StudentList
{
    private String firstName;
    private String middleName;
    private String lastName;
    private int stuNumber;
    private double GPA;
    public Student(String name, int number, double gpa){
        firstName = "";
        middleName = "";
        lastName = "";
        stuNumber = 0;
        GPA = 0.00;
    }
    public void setfirstName(String sn){
        firstName = sn;
    }
    public void setmiddleName(String sn){
        middleName = sn;
    }
    public void setlastName(String sn){
        lastName = sn;
    }
    public String getlastName(){
        return lastName;
    }
    public String getfullName(){
        return lastName + ", " + firstName + " " + middleName;
    }
    public void setGPA(double sn){
        GPA = sn;
    }
    public double getGPA(){
        return GPA;
    }
    public int getstuNumber(){
        return stuNumber;
    }
}