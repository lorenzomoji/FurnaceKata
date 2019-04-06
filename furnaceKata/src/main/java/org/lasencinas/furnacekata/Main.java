
package org.lasencinas.furnacekata;

import org.lasencinas.furnacekata.RoomTemperature;
import paquete.interfaces.Heater;
import paquete.interfaces.Thermometer;


public class Main {
    
    public static void main (String[] args) {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = new RoomTemperature(15);
        Heater gh = new GasHeater();
        Thermometer rcs = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(rcs, gh,temperature);
        
       /* Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak(); */
    }
}