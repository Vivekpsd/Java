package Array;

class Student {
    String name;
    int roll_no;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vivek";
        s1.roll_no = 21;
        s1.marks = 89;
        
        Student s2 = new Student();
        s2.name = "Ankit";
        s2.roll_no = 11;
        s2.marks = 99;

        Student s3 = new Student();
        s3.name = "Ishan";
        s3.roll_no = 12;
        s3.marks = 91;

        // array of objects
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // iterating array of objects via enhanced for loop
        for(Student stud: students) {
            System.out.println(stud.name + " with rollno " + stud.roll_no + " got " + stud.marks);
        }
    }
    

}
