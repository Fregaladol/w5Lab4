public class App {
    public static void main(String[] args) throws Exception {
        
        /* 2- CONTADOR DE TICKETS

        Hay un concierto, y los asistentes reciben un ticket numerado, que es incremental por orden de llegada, y no puede repetirse.

        Crea la clase Asistente que contenga nombre, apellido y numero de ticket.

        En el main, instancia diversos asistentes y verifica que el numero de ticket es autoincremental
     */



        Asistente asistente1 = new Asistente("Julian", "Alvarez");
        Asistente asistente2 = new Asistente("Julian", "Alvarez");
        Asistente asistente3 = new Asistente("Carmen", "Salinas");

        System.out.printf("El ticket n.%d pertenece a %s %s.\n",asistente1.getNumTicket(), asistente1.getNombre(), asistente1.getApellido());
        System.out.printf("El ticket n.%d pertenece a %s %s.\n",asistente2.getNumTicket(), asistente2.getNombre(), asistente2.getApellido());
        System.out.printf("El ticket n.%d pertenece a %s %s.\n",asistente3.getNumTicket(), asistente3.getNombre(), asistente3.getApellido());


    }
}
