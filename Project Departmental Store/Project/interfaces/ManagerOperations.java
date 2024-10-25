package interfaces;
import classes.*;
public interface ManagerOperations
{
	//void changeManager(String manId);
	void addManager(Manager m);
	boolean addBonus(int amount);
	boolean backBonus(int amount);
	boolean increaseSalary(Employee e,int amount);
	void showManager();
}