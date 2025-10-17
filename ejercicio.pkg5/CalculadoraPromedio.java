package ejercicio.pkg5;

import java.util.Scanner;

public class CalculadoraPromedio {


    public void ejecutarCalculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo de Promedio ");
        
        System.out.print("Ingrese la nota de la Guia: ");
        double notaGuia = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del Control de Lectura: ");
        double notaControl = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del Parcial : ");
        double notaParcial = scanner.nextDouble();
        
        scanner.close();

        mostrarResultado(notaGuia, notaControl, notaParcial);
    }
    public double calcularNotaGuia(double notaGuia) {
        return notaGuia * 0.30;
    }

    public double calcularNotaControl(double notaControl) {
        return notaControl * 0.10;
    }

    public double calcularNotaParcial(double notaParcial) {
        return notaParcial * 0.60;
    }

    public double calcularPromedio(double guia, double control, double parcial) {
        double notaFinalGuia = calcularNotaGuia(guia);
        double notaFinalControl = calcularNotaControl(control);
        double notaFinalParcial = calcularNotaParcial(parcial);
        
        return notaFinalGuia + notaFinalControl + notaFinalParcial;
    }

    public void mostrarResultado(double guia, double control, double parcial) {
        double promedio = calcularPromedio(guia, control, parcial);
        
        System.out.printf("\nPromedio Final de la 3ra. Evaluacion: %.2f\n", promedio);
        
        if (promedio >= 6.0) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: REPROBADO ");
        }
    }
}

