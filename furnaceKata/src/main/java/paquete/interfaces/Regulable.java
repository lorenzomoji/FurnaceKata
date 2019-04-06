
package paquete.interfaces;

import org.lasencinas.furnacekata.GasHeater;
import org.lasencinas.furnacekata.RemoteCommandSensor;
import org.lasencinas.furnacekata.RoomTemperature;

public interface Regulable {
    
    void equilibrarTemperatura(RemoteCommandSensor rcs, GasHeater gh, RoomTemperature temperature);
    
}
