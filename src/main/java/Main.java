/**
 * Created by GK on 23.08.2017.
 */

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Powitanie");

        String htmlText = "<html><font size=+3>" + "Witaj <font color=red><b>Javo</b></font><br>" + "<font color=blue>... A witaj!</font></html>";

        Icon icon = new ImageIcon("java_logo.png");
        JLabel label = new JLabel(htmlText, icon, JLabel.CENTER);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


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
