import java.util.Scanner;

public class plantilla {
    public int elegirOperacion(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija la operación: \nSuma(1) \nPotenciación(2) \nMultiplicación(3) \nRaiz(4)");
        int opciones = sc.nextInt();
        System.out.println();
        return opciones;
    }

    public double pedirDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        Double num1 = sc.nextDouble();
        return num1;
        
    }

    public void resultado(){
        double num1;
        double num2;
        int opcion;
        boolean condicion = false; 

        do {
            opcion = elegirOperacion();
            condicion = opcionValida(opcion);
        } while (condicion == false);

        num1 = pedirDatos();
        num2 = pedirDatos();
       
        switch (opcion) {
                
            case 1:
                System.out.println("Has elegido suma, el resultado es:");
                System.out.println(suma(num1,num2));          
                break;
            case 2:
                System.out.println("Has elegido potencia, el resultado es:");
                System.out.println(potencia(num1, num2));
                break;
            case 3:
                System.out.println("Has elegido multiplicación, el resultado es:");
                System.out.println(multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("Has elegido raiz, el resultado es:");
                raices(num1,num2);
                break;
            }
        System.out.println();    
    }

    public double suma(double num1, double num2){
        return (num1 + num2);
    }

    public double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public double multiplicacion(double num1, double num2){
        return num1*num2;
    }

    public double raizCuadrada(double num1){
        System.out.println("Raiz cuadrada de " + num1);
        return Math.sqrt(num1);
    }
    public double raizCubica(double num2){
        System.out.println("Raiz cubica de " + num2);
        return Math.cbrt(num2);
    }


    public void raices(double num1, double num2){
        System.out.println(raizCuadrada(num1));
        System.out.println(raizCubica(num2));
    }
;
    public boolean opcionValida(int opcion){
        if (opcion > 4) {

            System.out.println("El numero no corresponde a ningun opción intentelo de nuevo");
            return false;

        }else {
            return true;
        }

    }
}



