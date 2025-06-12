public class App {
    public static void main(String[] args) throws Exception {
        
        /* 3- DIRECCION POSTAL (objeto como atributo de una clase)

        Tienes dos clases, Dirección y Cliente

        La clase Dirección debe tener estas propiedades: Calle, ciudad, codigo postal

        La clase Cliente  debe tener estas propiedades: id, nombre, edad, dirección

        En la clase principal (Main), crea un objeto de tipo Direccion y uno de tipo Persona, y muestra la información completa de la persona, incluyendo su dirección.

        +EXTRA: que la persona pueda tener varias direcciones (arraylist de objetos) */

        Direccion direccion1 = new Direccion("Bailen", "Barcelona", 8013); 
        
        Direccion direccion2 = new Direccion("Gran Vía 123", "Madrid", 28013);

        Cliente cliente1 = new Cliente("Juan Díaz", 29, direccion1);
        cliente1.setDireccion(direccion2);

        System.out.printf("%s con ID: %d; tiene %.2f años tiene por direcciones:.\n", cliente1.getNombre(), cliente1.getId(), cliente1.getEdad());
        cliente1.mostrarDirecciones();




    }
}
