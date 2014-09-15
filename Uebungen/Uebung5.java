import java.util.*;
/**
 * Write a description of class Uebung5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung5
{
    Queue<Reservation> _reservationen = new LinkedList<Reservation>();
    
    public void speichereReservation(Reservation r)
    {
        _reservationen.offer(r);
    }
    
    public Reservation gibNaechsteReservation() {
        return _reservationen.poll();
    }
    
    public Reservation zeigeNaechsteReservation() {
        return _reservationen.peek();
    }
}
