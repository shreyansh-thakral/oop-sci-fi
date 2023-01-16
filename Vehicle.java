public class Vehicle
{
    String model;
    int wingspan;
    int wheels;
    int kWhCapacity;
    int kWhCurrent;
    int passengers;

    public Vehicle ()
    {
	wheels = 4;
	kWhCapacity = 500;
	passengers = 6;
    }


    public void travel ()
    {
	kWhCurrent -= 5;
    }


    public void charge ()
    {
	kWhCurrent = kWhCapacity;
    }


    public void dock ()
    {
	passengers = 0;
	kWhCurrent--;
    }


    public String getModel ()
    {
	return model;
    }

}
