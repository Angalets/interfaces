interface OperacionesMatematicas {
    int suma(int a, int b);
    int resta(int a, int b);
    int multiplicacion(int a, int b);
    int division(int a, int b);
}

class Calculadora implements OperacionesMatematicas {

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoSuma = calculadora.suma(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = calculadora.resta(8, 4);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = calculadora.multiplicacion(2, 6);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        int resultadoDivision = calculadora.division(10, 2);
        System.out.println("División: " + resultadoDivision);
    }
}
