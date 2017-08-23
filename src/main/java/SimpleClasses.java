/**
 * Created by GK on 23.08.2017.
 */
public class SimpleClasses {

    private int a;
    private int b;

    public SimpleClasses(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return a+b;
    }

    public int substract() {
        return a-b;
    }

    public int multiply() {
        return a*b;
    }

    public int divide() {
        return a/b;
    }

    public double average() {
        return (a+b)/2;
    }


    public static String sumThreeIntegers(int a, int b, int c) {

        int sum = a + b + c;
        return "Suma liczb = " + sum;

    }


}
