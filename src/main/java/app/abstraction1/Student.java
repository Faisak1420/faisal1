package app.abstraction1;

public class Student extends Person{


    String specialization;

    public Student(String n, String g, String b, boolean i, String s) {
        super(n, g, b, i);

        specialization = s;


}


    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------------");
    }



    }