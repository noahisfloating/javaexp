/**
 * Created by GK on 23.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        DataTypes.process();

        SimpleClasses sc = new SimpleClasses(13, 15);

        System.out.println(SimpleClasses.sumThreeIntegers(12, 13, -5));

        System.out.println(sc.average() + " " + sc.sum() + " " + sc.substract() + " " + sc.multiply() + " " + sc.divide());

        Employee e = new Employee("Kamil", "Staszewski", 4100);
        System.out.println(e.toString());
        Employee f = new Employee("Kamil", "Staszewski", 4100);
        System.out.println(e.equals(f));

        Grades.writeTranslation(Grades.translate(Grades.readGrade()));

    }

}
