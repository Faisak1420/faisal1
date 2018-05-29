package app.typecasting;

public abstract class A {


    int x;

    public void print() {
        System.out.println("This is just an example.");
    }

    public abstract void setX(int x);     // كل كلاس يرثها Override إذاً يجب أن يفعل لها <-- abstract هنا قمنا بتعريف دالة نوعها

    public abstract int getX();           // كل كلاس يرثها Override إذاً يجب أن يفعل لها <-- abstract هنا قمنا بتعريف دالة نوعها


}
