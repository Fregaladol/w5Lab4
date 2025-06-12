import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Long id; 
    private String nombre;
    private List<Direccion> direcciones = new ArrayList<>();
    private double edad;
    private static Long contador = 0L;
    
    public Cliente() {
    }

    public Cliente(String nombre, double edad, Direccion direcciones) {
        
        contador++;
        
        setNombre(nombre);
        setEdad(edad);
        setDireccion(direcciones);
        setId(contador);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        
        if ( edad > 0){
            this.edad = edad;
        } else {
            System.out.println("Edad invalida");
        }
    }

    public void  mostrarDirecciones() {
        for (Direccion dir : direcciones) {
            System.out.println(dir);
            }
        }


    public void setDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

 

    

    
}
