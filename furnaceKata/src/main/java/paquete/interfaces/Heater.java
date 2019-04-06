
package paquete.interfaces;

import org.lasencinas.furnacekata.RoomTemperature;

public interface Heater {
    
    void engage(RoomTemperature temperature);
    
    void disengage(RoomTemperature temperature);
    
}
