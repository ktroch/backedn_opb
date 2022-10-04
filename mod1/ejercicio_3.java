public class ejercicio_3 {

    public static void main(String[] args) {

        int resultado = suma_3numeros(10, 20, 30);
        System.out.println(resultado);

        Coche miCoche = new Coche(4);
        miCoche.addPuerta();
        System.out.println(miCoche);

        

    }

    public static int suma_3numeros(int a, int b, int c) {
        return a + b + c;
        

    }
}

class Coche {
    int puertas_coche;

    Coche(int puertas_coche) {
        this.puertas = puertas_coche;
    }

    int addPuerta() {
        this.puertas_coche = this.puertas_coche + 1;
        return this.puertas_coche;
    }


}