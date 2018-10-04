import java.util.Scanner;

/**
 * Created by GK on 23.08.2017.
 */
public class Grades {

    public Grades() {

    }

    public static String translate(double grade) {

        try {
            if (grade == 2) return "niedostateczny";
            else if (grade == 2.5) return "niedostateczny plus";
            else if (grade == 3) return "dostateczny";
            else if (grade == 3.5) return "dostateczny plus";
            else if (grade == 4) return "dobry";
            else if (grade == 4.5) return "dobry plus";
            else if (grade == 5) return "bardzo dobry";
            else return translate(readGrade());
        } catch (Exception e) {
            return translate(readGrade());
        }
    }

    public static double readGrade() {

        try {
            double[] possibleGrades = {2, 2.5, 3, 3.5, 4, 4.5, 5};
            double scannedGrade;
            Scanner s = new Scanner(System.in);
            System.out.println("Podaj ocenę do przetłumaczenia");
            scannedGrade = s.nextDouble();
            for (double d : possibleGrades) {
                if (d == scannedGrade) return scannedGrade;
                else continue;
            }
            return 1;
        } catch (Exception e) {
            return readGrade();
        }
    }

    public static void writeTranslation(String translation) {
        System.out.println(translation);
    }

}

