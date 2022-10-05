public class ejemplo01 {

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.velocidad_actual);
        coche.acelear();
        System.out.println(coche.velocidad_actual);
        coche.desacelerar();
        
    }

    class Coche {
        int num_puertas;
        int velovidad_maxima;
        float velocidad_actual;

        public Coche() {
            num_puertas = 5;
            velovidad_maxima = 120;
            System.out.println("Estoy en el constructor...");
        }

        public void acelear() {
            velocidad_actual += 15;
        }

        public void desacelerar() {}
    }

    @Override
    public String toString() {
        return "ejemplo01 []";
    }
}