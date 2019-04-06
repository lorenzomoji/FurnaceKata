
package org.lasencinas.furnacekata;

import paquete.interfaces.Heater;
import paquete.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {
    
    public double read(RoomTemperature temperature) {
        
        return temperature.getTemperature();
    }
}
