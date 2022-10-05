public class ejercicio_tema8 {

    public static void main(String[] args) {

        Perona persona1 = new Perona();
        persona1.setEdad(18);
        persona1.setNombre("Pepe Sierra");
        persona1.setTelefono("+34478954687");

        System.out.println("El usuario de nombre: " + persona1.getNombre() + ", su edad es: " + persona1.getEdad() + " y su numero de telefono es: " + persona1.getTelefono());
        
    }
}

class Perona {
    private int edad;
    private String nombre;
    private String telefono;

    // Metodos setter....

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Metodos getter...

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }


    public String getTelefono() {
        return this.telefono;
    }


}