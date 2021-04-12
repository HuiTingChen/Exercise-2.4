package TrainSetterGetter;

public class Main {
	public static void main(String[]args) {
	Train a = new Train();
	
	a.setType("ETS");
	a.setManufac("CSR ZhuZhou");
	a.setModel("Class 93");
	a.setCapacity(320);
	a.setMaxspeed(140);
	a.setMotivepower("Electric");
	a.setAccelerate(0.7);
	a.setDecelerate(1.0);
	a.setHalting(33);
	
	System.out.println("Type \t\t: " + a.getType());
	System.out.println("Manufactured \t: " + a.getManufac());
	System.out.println("Model \t\t: " + a.getModel());
	System.out.println("Capacity \t: " + a.getCapacity() + " people");
	System.out.println("Maximum Speed\t: " + a.getMaxspeed() + "km/h");
	System.out.println("Motive Power\t: " + a.getMotivepower());
	System.out.println("");
	
	a.designSpeed();
	System.out.println("The starting accelerate speed is " + a.getAccelerate() + "m/s^2.");
	System.out.println("The normal decelerate speed is " + a.getDecelerate() + "m/s^2.");
	System.out.println("This train takes " + a.getHalting() + "seconds to stop completely in emergency.");
	System.out.println("This train is able to take " + a.getCapacity() + " passengers.");
	
	}
}
