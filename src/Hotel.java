//ANGEL VILLAMIL
public class Hotel {
    // Atributos
    private String nombre;
    private String direccion;
    private int estrellas;
    // Constructor por defecto o vacio
    public Hotel() {}
    // Realizamos un constructor con parametros
    public Hotel(String nombre, String direccion, int estrellas) { //
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
    }
    // Getters y setters
    public String getNombre() {
        return nombre; // Literal 1
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; // Literal 1
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getEstrellas() {
        return estrellas;
    }
    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    // Metodo personalizado para modificar un hotel
    public void modificarHotel(String nombre, String direccion, int
            estrellas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
    }
    // Metodo personalizado para imprimir la información del hotel
    public void imprimirHotel() { // Literal 4b
        System.out.println("El hotel: " + nombre); // Literal 4b
        System.out.println("Ubicado en: " + direccion); // Literal 4b
        System.out.println(" cuenta con calificacion de: " +
                estrellas+ " estrellas"); // Literal 4b
    }
}

