public class Human
{
    String name;
    int numArms;
    int numLegs;
    String gender;
    int energy;
    int numMods;
    double hrPay;
    double bankBalance;

    public Human ()
    {
	numArms = 2;
	numLegs = 2;
	numMods = 0;
	energy = 100;
    }


    public void eat (double budget)
    {
	energy += Math.round ((4 + (double) numMods / 2) * budget);
	bankBalance -= budget;
    }


    public void sleep (int hrs)
    {
	energy += Math.round ((2 + (double) numMods / 2) * hrs);
	if (energy > 300)
	    energy = 300;
    }


    public void work (int hrs)
    {
	energy -= Math.round ((4 - (double) numMods / 2) * hrs);
	bankBalance += hrPay * hrs;
    }


    public void haveMinorMod ()
    {
	if (numMods < 5 && bankBalance >= 20000)
	{
	    numMods++;
	    bankBalance -= 20000;
	}
	else if (numMods == 5)
	    System.out.println("You have reached the human modification threshold, if you would like more modifications, please apply to be registered as a Cyborg.");
	else if (bankBalance < 20000)
	    System.out.println("You do not have enough funds to pay for this procedure.");
    }
}
