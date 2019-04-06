
package org.lasencinas.furnacekata;

import org.lasencinas.furnacekata.RoomTemperature;
import paquete.interfaces.Heater;
import paquete.interfaces.Thermometer;


public class Main {
    
    public static void main (String[] args) {
        
        RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        RemoteCommandSensor rcs = new RemoteCommandSensor();
        GasHeater gh = new GasHeater();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(rcs, gh,temperature);
        
        Charmander charmander = new Charmander();
        System.out.println( "\nDando amor a charmander: " );
        regulator.regulate(rcs, gh, temperature);
        charmander.charmiSpeak(); 
    }
}