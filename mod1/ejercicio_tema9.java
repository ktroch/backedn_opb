public class ejercicio_tema9 {
    public static void main(String[] args) {

        Cliente c1 = new Cliente(18, "Diego Perez", "+34458798563", 1500);
        Trabajador t1 = new Trabajador(25, "Jack Paradise", "+34987564879", 3500.25);

        System.out.println("El nombre es: " + c1.getNombre() + ", la edad es: " + c1.getEdad() + ", el telefono es: " + c1.getTelefono() + " y cuenta con un credito de: " + c1.getCredito() );
        System.out.println("El nombre es: " + t1.getNombre() + ", la edad es: " + t1.getEdad() + ", el telefono es: " + t1.getTelefono() + " y cuenta con un salario de: " + t1.getSalario() );
        
    }
}

class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Perona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Metodos gettter...

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    //Metodos setter...

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

class Cliente extends Perona{
    private float credito;

    public Cliente(int edad, String nombre, String telefono, float credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

}

class Trabajador extends Perona{
    private float salario;

    public Trabajador(int edad, String nombre, String telefono, float salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}