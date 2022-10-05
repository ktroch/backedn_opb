public class ejemplo02{

    public static void main(String[] args) {
        //System.out.println("Hello..");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("Coche");
        System.out.println(vehiculo.getTipo());
        
    }

}

class Vehiculo{
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public String getTipo() {
        return this.tipo;
    }

}