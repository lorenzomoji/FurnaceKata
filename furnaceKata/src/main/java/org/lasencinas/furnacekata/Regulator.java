
package org.lasencinas.furnacekata;

import paquete.interfaces.Regulable;
import org.lasencinas.furnacekata.RoomTemperature;
import org.lasencinas.furnacekata.GasHeater;

public class Regulator implements Regulable {
    
    private final double MINTEMPERATURE = 15;
    private final double MAXTEMPERATURE = 22;
    
    @Override
    public void regulate(RemoteCommandSensor rcs, GasHeater gh, RoomTemperature temperature) {
        
        if(rcs.read(temperature) < MINTEMPERATURE) {
            gh.engage(temperature);
            System.out.println("Calentando al sala");
        }
        
        if(rcs.read(temperature) > MAXTEMPERATURE) {
            gh.disengage(temperature);
            System.out.println("Apagando el calentador");
        }
  
    }
    
}
