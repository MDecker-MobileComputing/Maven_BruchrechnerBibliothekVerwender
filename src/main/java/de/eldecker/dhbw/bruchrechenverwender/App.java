package de.eldecker.dhbw.bruchrechenverwender;

import de.eldecker.dhbw.bruchrechnen.Bruch;


public class App {
    
    public static void main( String[] args ) {
        
        System.out.println();
        
        final Bruch b1 = new Bruch( 1, 3 );
        final Bruch b2 = new Bruch( 2, 5 );
        
        final Bruch ergebnis = b1.dividieren( b2 );
        
        System.out.println( ergebnis + "\n" );        
    }
    
}
