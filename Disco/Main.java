public class Main {
    public static void main(String[] args){

        Disco cd1 = new Disco();
        cd1.titulo = "DAMN";
        cd1.generoMusical = "Rap";
        cd1.cantante = "Kendrick Lamar";
        cd1.duracion = 55.0;

        Disco cd2 = new Disco();
        cd2.titulo = "Twilight";
        cd2.generoMusical = "Rock";
        cd2.cantante = "Bôa";
        cd2.duracion = 59.4;

        cd1.mostrarDatos();
        System.out.println();
        cd2.mostrarDatos();

        
    }
}
