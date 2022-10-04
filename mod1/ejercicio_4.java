public class ejercicio_4 {

    public static void main(String[] args) {
        int numero = -4;
        comparativa(numero);
        bucle_while();
        do_while_loop();
        for_loop();
        estaciones();
    }

    public static void comparativa(int num){
        System.out.println("Aqui comienza la comparación de numeros:");
        if (num == 0){
            System.out.println("El número ingresado es: " + num);
        } else if (num < 0){
            System.out.println("El número ingresado: " + num + " es negativo");
        } else {
            System.out.println("El número ingresado: " + num + " es positivo");
        }
    }

    public static void bucle_while(){
        int numeroWhile = 0;
        System.out.println("Aqui comienza el While:");
        System.out.println("El conteo es:");
        
        while (numeroWhile < 3){
            System.out.println(numeroWhile + 1);
            numeroWhile++;
        }
    }

    public static void do_while_loop(){
        int numeroDoWhile = 0;
        System.out.println("Aqui comienza el Do While:");

        do {
            numeroDoWhile++;
            System.out.println("El numero es:" + numeroDoWhile);
            numeroDoWhile = 3;
        } while (numeroDoWhile < 3);
    }

    public static void for_loop(){
        System.out.println("Aqui comienza el For:");
        System.out.println("El conteo es:");

        for(int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor + 1);
        }
    }

    public static void estaciones(){
        System.out.println("Aqui comienza el Switch:");
        String estacion = "invierno";

        switch(estacion){
            case "primavera":
            System.out.println("La estación es: " + estacion);
            break;

            case "verano":
            System.out.println("La estación es: " + estacion);
            break;

            case "otoño":
            System.out.println("La estación es: " + estacion);
            break;

            case "invierno":
            System.out.println("La estación es: " + estacion);
            break;
        }
    }
}