package app.abstraction1;

public class Employee extends Person {


    String workPlace;     // هنا قمنا بتعريف خاصية مكان العمل و التي يملكها فقط الموظفون و العمال

    // هنا قمنا بتعريف الكونستركتور
    public Employee(String n, String g, String b, boolean i, String w) {
        super(n, g, b, i);       // Person هنا سيتم إرسال أول أربع قيم إلى كونستركتور الكلاس
        workPlace = w;
    }

    // بشكل ملائم للموظفين أو العمال displayInfo() للدالة Override هنا فعلنا
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Work place: " + workPlace);
        System.out.println("---------------------------------");
    }

}
