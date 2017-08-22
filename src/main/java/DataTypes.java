/**
 * Created by GK on 22.08.2017.
 */
public class DataTypes {

    public static void main(String[] args)

    {
        double Fahrenheit = 76.8;
        double Celsius;

        System.out.println("Witaj świecie!");

        Celsius = 5.0 / 9.0 * (Fahrenheit - 32);

        System.out.println();
        System.out.println(Fahrenheit + " stopni w skali Fahreheita to " + Celsius + " stopni w skali Celsjusza.");

        double applePrice = 3.0;
        double appleQty = 2.5;
        double pearPrice = 3.5;
        double pearQty = 1.5;
        double appleCost = applePrice * appleQty;
        double pearCost = pearPrice * pearQty;
        double totalCost = appleCost + pearCost;

        System.out.println("łączny koszt zakupów wyniósł " + totalCost + ", z czego jabłka stanowiły " + appleCost / totalCost * 100 + "%, a gruszki " + pearCost / totalCost * 100 + "%.");

        System.out.println();

        for (int i = 97; i < 123; i++) {
            System.out.println((char) i);
        }

    }

}
