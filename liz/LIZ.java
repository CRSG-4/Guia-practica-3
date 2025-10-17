package liz;

public class LIZ {  
    
    public static void main(String[] args) {
        Plantilla ILCM = new Plantilla();
        ILCM.nombreCliente = "Ivan Liznadro Castellnos Martinez";
        ILCM.fecha = "20/10/2025";
        ILCM.hora = "20:30";
        ILCM.numeroPersonas = 4;
        ILCM.tipoMesa = "Ventana";

        System.out.println("Reserva para: " + ILCM.nombreCliente);
        System.out.println("Fecha: " + ILCM.fecha + " | Hora: " + ILCM.hora);
        System.out.println("Numero de personas: " + ILCM.numeroPersonas);
        System.out.println("Tipo de mesa: " + ILCM.tipoMesa);
    }
    
}
