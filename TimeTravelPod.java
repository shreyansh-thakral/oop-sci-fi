public class TimeTravelPod
{
    double version;
    String direction;
    int distance;
    int plutoniumCapacity;
    int plutoniumCurrent;
    int stability;

    public TimeTravelPod ()
    {
	plutoniumCapacity = 3;
	stability = 100;
    }


    public void timeTravel ()
    {
	plutoniumCurrent--;
	stability -= 20;
    }


    public void resupply ()
    {
	plutoniumCurrent = plutoniumCapacity;
    }


    public void receiveService ()
    {
	stability = 100;
    }


    public double getVersion ()
    {
	return version;
    }
}
