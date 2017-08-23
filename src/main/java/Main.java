/**
 * Created by GK on 23.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        DataTypes.process();

        SimpleClasses sc = new SimpleClasses(13, 15);

        System.out.println(SimpleClasses.sumThreeIntegers(12, 13, -5));

        System.out.println(sc.average() + " " + sc.sum() + " " + sc.substract() + " " + sc.multiply() + " " + sc.divide());

    }

}
