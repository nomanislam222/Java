package interfaces;
import java.lang.*;
import classes.Vehicle;


public interface Ivehicles
{
	boolean insertVehicle(Vehicle v);
	boolean removeVehicle(Vehicle v);
	Vehicle searchVehicle(String regNo);
	void showAllVehicles();
}