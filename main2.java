public class main2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
        
    }

}

class Coche{
    public int puertas;
    public void agregarPuerta() {
        this.puertas++;
    }
}