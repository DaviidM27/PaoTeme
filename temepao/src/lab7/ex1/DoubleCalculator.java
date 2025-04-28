package lab7.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DoubleCalculator implements Calculator {
    
    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul dintre parametrii este null la adunare.");
        }
        double result = a + b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Rezultatul adunarii este +inf.");
        }
        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Rezultatul adunarii este -inf.");
        }
        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul dintre parametrii este null la impartire.");
        }
        if (b == 0) {
            throw new MyArithmeticException("Impartire la zero.");
        }
        return a / b;
    }

    @Override
    public double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException {
        if (values == null) {
            throw new NullParameterException("Vectorul de valori este null.");
        }
        if (values.length == 0) {
            throw new MyArithmeticException("Vectorul de valori este gol.");
        }
        Double sum = 0.0;
        for (Double value : values) {
            sum = add(sum, value);
        }
        return divide(sum, (double) values.length);
    }

    public Double[] readValuesFromFile(String fileName) throws FileProcessingException {
        List<Double> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                list.add(Double.parseDouble(line.trim()));
            }
        } catch (IOException | NumberFormatException e) {
            throw new FileProcessingException("Eroare la citirea valorilor din fisier: " + e.getMessage());
        }
        return list.toArray(new Double[0]);
    }
}
