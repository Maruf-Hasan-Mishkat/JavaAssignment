public class Program_26_LocalInstance {

    // Instance Variables
    String name = "Maruf";
    int age = 24;

    public void display() {

        // Local Variable
        String university = "Pundra University";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);

    }

    public static void main(String[] args) {

        Program_26_LocalInstance student = new Program_26_LocalInstance();

        student.display();

    }

}
