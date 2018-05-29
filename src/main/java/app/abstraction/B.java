package app.abstraction;


public class B extends A {     // abstract لأي دالة سيرثها من النوع Override يجب أن يفعل A يرث من الكلاس B بما أن الكلاس

    // setX() للدالة Override هنا فعلنا
    @Override
    public void setX(int x) {
        super.x = x;
    }

    // setX() للدالة Override هنا فعلنا
    @Override
    public int getX() {
        return super.x;
    }

}