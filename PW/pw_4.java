/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2'
 and that of name as "John" by creating an object of the class Student. */
class Student {
    String name;
    int roll_no;
}

public class pw_4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("The name=" + s.name);
        System.out.println("The roll_no=" + s.roll_no);
    }
}
