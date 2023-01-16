public class Cyborg extends Human
{
    int botArms;
    int botLegs;
    double botTorso; // percent value represented as a decimal

    public Cyborg ()
    {
	numArms = 2;
	numLegs = 2;
	botArms = 0;
	botLegs = 0;
	numMods = 5;
	botTorso = 0.1;
	energy = 100;
    }
    
    public Cyborg (Human registrant)
    {
	numArms = 2;
	numLegs = 2;
	botArms = 0;
	botLegs = 0;
	numMods = 5;
	botTorso = 0.1;
	name = registrant.name;
	energy = registrant.energy;
	gender = registrant.gender;
	hrPay = registrant.hrPay;
	bankBalance = registrant.bankBalance - 1000;
	
    }


    public void haveMinorMod ()
    {
	if (bankBalance >= 20000)
	{
	    numMods++;
	    botTorso += 0.02;
	    bankBalance -= 20000;
	}
	else
	    System.out.println ("You do not have enough funds to pay for this procedure.");
    }


    public void replaceLeg ()
    {
	if (bankBalance >= 100000)
	{
	    numMods += 5;
	    botLegs++;
	    numLegs--;
	    bankBalance -= 100000;
	}
	else
	    System.out.println ("You do not have enough funds to pay for this procedure.");
    }
    
    public void replaceArm ()
    {
	if (bankBalance >= 100000)
	{
	    numMods += 5;
	    botArms++;
	    numArms--;
	    bankBalance -= 100000;
	}
	else
	    System.out.println ("You do not have enough funds to pay for this procedure.");
    }
    
    public void haveTorsoMod ()
    {
	if (bankBalance >= 100000)
	{
	    numMods += 5;
	    botTorso += 0.1;
	    bankBalance -= 100000;
	}
	else
	    System.out.println ("You do not have enough funds to pay for this procedure.");
    }
}
