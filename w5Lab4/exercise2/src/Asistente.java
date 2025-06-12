public class Asistente {

    private String nombre, apellido;
    private Long numTicket;
    private static Long contador = 0L;
    


    public Asistente() {
    }

    public Asistente(String nombre, String apellido) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
        setNumTicket(contador);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(Long contador) {
        this.numTicket = contador;
    }

    
    

    
    
    


}
