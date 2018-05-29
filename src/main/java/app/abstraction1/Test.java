package app.abstraction1;

public class Test {


    public static void main(String[] args) {

        // و هو عبارة عن إنسان له خصائص طالب Student هنا قمنا بإنشاء كائن من الكلاس
        Student s = new Student("Mhamad", "Male", "1994", false, "Computer Science");
        s.displayInfo();

        // و هو عبارة عن إنسان له خصائص موظف أو عامل Employee هنا قمنا بإنشاء كائن من الكلاس
        Employee e = new Employee("Rana", "Female", "1986", true, "Al-Iman school");
        e.displayInfo();

    }


}
