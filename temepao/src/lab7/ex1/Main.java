package lab7.ex1;

public class Main {
    public static void main(String[] args) {
        DoubleCalculator calculator = new DoubleCalculator();

        // Teste pentru fiecare caz
        try {
            System.out.println("Test adunare normala: " + calculator.add(5.0, 10.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test adunare cu null: " + calculator.add(null, 10.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test overflow: " + calculator.add(Double.MAX_VALUE, Double.MAX_VALUE));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test impartire normala: " + calculator.divide(10.0, 2.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test impartire la zero: " + calculator.divide(10.0, 0.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test media valorilor din fisier: ");
            Double[] values = calculator.readValuesFromFile("values.txt");
            System.out.println("Media: " + calculator.average(values));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test citire fisier inexistent: ");
            Double[] values = calculator.readValuesFromFile("inexistent.txt");
            System.out.println("Media: " + calculator.average(values));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test medie cu vector gol: ");
            Double[] empty = new Double[0];
            System.out.println("Media: " + calculator.average(empty));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
