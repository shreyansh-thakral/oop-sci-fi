public class Spaceship extends Vehicle
{
    int thrusters;
    int propellantCapacity;
    int propellantCurrent;
    int oxygen;
    double temp;
    int supplies;

    public Spaceship ()
    {
	model = " ";
	thrusters = 4;
	propellantCapacity = 10000;
	supplies = 100;
	wingspan = 10;
	wheels = 0;
	kWhCapacity = 500;
	passengers = 50;
    }


    public void leaveOrbit ()
    {
	propellantCurrent -= 4000;
    }


    public void travel ()
    {
	supplies -= 5;
	kWhCurrent -= 10;
    }


    public void replenishOxygen ()
    {
	oxygen++;
	supplies--;
	propellantCurrent = propellantCapacity;
    }
    public void restock ()
    {
	supplies = 100;
    }
}
