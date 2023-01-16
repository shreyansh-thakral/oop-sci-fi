public class Plot
{
    public static void main (String[] args)
    {
	SciFiCity shryan = new SciFiCity ();
	shryan.name = "Shryan";
	shryan.techRating = 9.5;
	shryan.location = "California";

	Human viktor = new Human ();
	viktor.name = "Viktor";
	viktor.gender = "male";
	viktor.hrPay = 25.0;
	viktor.bankBalance = 15000.00;

	Spaceship infinity = new Spaceship ();
	infinity.model = "X1";
	infinity.propellantCurrent = 8000;
	infinity.oxygen = 100;
	infinity.temp = 20.0;
	infinity.supplies = 100;
	infinity.wingspan = 50;
	infinity.kWhCapacity = 1000;

	TimeTravelPod ion = new TimeTravelPod ();
	ion.version = 2.08;
	ion.direction = "Backward";
	ion.distance = 365;
	ion.plutoniumCurrent = 0;

	//A regular week
	for (int i = 1 ; i < 8 ; i++)
	{
	    System.out.println ("Infinity XI: Log: Day " + i);
	    System.out.println ("Preflight Check:");
	    System.out.println ("O2:" + infinity.oxygen);
	    infinity.charge ();
	    System.out.println ("Battery:" + infinity.kWhCurrent);
	    System.out.println ("Propellant:" + infinity.propellantCurrent);
	    System.out.println ("Supplies:" + infinity.supplies);
	    System.out.println ();
	    infinity.passengers = 100;
	    viktor.eat (10);
	    viktor.work (9);
	    infinity.leaveOrbit ();
	    infinity.travel ();
	    viktor.eat (15);
	    infinity.travel ();
	    infinity.travel ();
	    viktor.eat (10);
	    infinity.dock ();
	    infinity.replenishOxygen ();
	    infinity.restock ();
	    System.out.println ("Viktor's Nightly Record:");
	    System.out.println ("Energy: " + viktor.energy + " kJ");
	    System.out.println ("Bank Balance: $" + viktor.bankBalance);
	    System.out.println ();
	    System.out.println ();
	    viktor.sleep (8);
	}
	viktor.bankBalance += 100000000; // he wins a billion dollar lottery!
	    System.out.println ("Viktor: I CAN'T BELIEVE IT I WON A BILLION DOLLARS I WILL GET EVERY MODIFICATION POSSIBLE");
	viktor.haveMinorMod (); //He reaches human mod limit
	viktor.haveMinorMod (); // can't surpass limit without registering
	Cyborg vk = new Cyborg (viktor); // registers as cyborg
	vk.replaceLeg (); // replaces all limbs
	vk.replaceArm ();
	vk.replaceLeg ();
	vk.replaceArm ();
	for (int i = 0 ; i < 8 ; i++)
	{
	    vk.haveTorsoMod ();  // has 8 torso mods, 90% of his torso is now robotic
	}
	System.out.println ("Viktor now has "+vk.botArms+" robotic arms, "+vk.botLegs+" robotic legs, and " + Math.round(vk.botTorso*100)+"% robotic torso");
	shryan.year++;  // a year passes
	System.out.println ("1 Year Later...");
	System.out.println ("Viktor: This is it, I can no longer live like this, I must go back and fix my mistakes, I must use the " + ion.getVersion () + " Ion Time Travel Pod to put an end to this");
	ion.resupply ();
	ion.receiveService ();
	ion.timeTravel ();
	shryan.year--;
    }
}

