
package org.lasencinas.furnacekata;

import paquete.interfaces.Regulable;
import org.lasencinas.furnacekata.RoomTemperature;
import org.lasencinas.furnacekata.GasHeater;

public class Regulator implements Regulable {
    
    private double minTemperature = 15;
    private double maxTemperature = 22;
    
    public void regulate(RemoteCommandSensor rcs, GasHeater gh, RoomTemperature temperature) {
        
        if(rcs.read(temperature) < minTemperature) {
            gh.engage(temperature);
        }
        
        if(rcs.read(temperature) > maxTemperature) {
            gh.disengage(temperature);
        }
    }
}
