class Student {  //creating a blueprint first

    String name;
    int id;
    double cgpa;

}

public class Program_25_StudentClass {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.name = "Babul";
        student1.id = 101;
        student1.cgpa = 3.85;

        student2.name = "Abul";
        student2.id = 102;
        student2.cgpa = 3.50;

        student3.name = "Karim";
        student3.id = 103;
        student3.cgpa = 3.90;

        System.out.println("Student 1");
        System.out.println("Name : " + student1.name);
        System.out.println("ID : " + student1.id);
        System.out.println("CGPA : " + student1.cgpa);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("Name : " + student2.name);
        System.out.println("ID : " + student2.id);
        System.out.println("CGPA : " + student2.cgpa);

        System.out.println();

        System.out.println("Student 3");
        System.out.println("Name : " + student3.name);
        System.out.println("ID : " + student3.id);
        System.out.println("CGPA : " + student3.cgpa);

    }

}