package AbstractClasses;

public class Base12 implements Base11 {
    @Override
    public void method1() {
        System.out.println(greet);
    }

    public static void main(String[] args) {
        Base12 b12 = new Base12();
        b12.method1();
    }
}
