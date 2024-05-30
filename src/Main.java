public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de la clase Hotel con valores

        Hotel hotel1 = new Hotel("Hilton colon", "Quito-El Ejido", 4);
// Literal 2, 3
        Hotel hotel2 = new Hotel("Bellavista", "Bellavista", 3); //

        Hotel hotel3 = new Hotel("Marriot", "Guayaquil guasmo", 5); //

        Hotel hotel4 = new Hotel("Fenix", "Cuenca, centro", 2); //

        Hotel hotel5 = new Hotel("Hotel Ppito", "Quito-San roque", 4);
// Literal 2, 3
        // Crear dos objetos con valores nulos y luego establecer sus
        Hotel hotel6 = new Hotel();
        hotel6.setNombre("Hotel Cafe rojo");
        hotel6.setDireccion("Quito sector Universidades");
        hotel6.setEstrellas(3);
        Hotel hotel7 = new Hotel();
        hotel7.setNombre("Pepe´s House");
        hotel7.setDireccion("La Mariscal");
        hotel7.setEstrellas(5);
        // Modificar un hotel previamente creado
        hotel1.modificarHotel("Finlandia", "Quito-Cumbaya", 5); //
        // Imprimir todos los hoteles
        System.out.println("Informacion de los hotel3s :");
        hotel1.imprimirHotel();
        hotel2.imprimirHotel();
        hotel3.imprimirHotel();
        hotel4.imprimirHotel();
        hotel5.imprimirHotel();
        hotel6.imprimirHotel();
        hotel7.imprimirHotel();
        // Modificar atributos de hoteles con valor NULL y mostrar los

        hotel4.setNombre("Hotel Casa Blanca");
        hotel5.setDireccion("Cuenca, Sector Rupica");
        hotel7.setEstrellas(4);
        // Imprimir los hoteles modificados
        System.out.println("\nInformacion de los hoteles");
        hotel4.imprimirHotel();
        hotel5.imprimirHotel();
        hotel7.imprimirHotel();
    }
}
