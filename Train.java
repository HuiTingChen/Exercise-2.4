package TrainSetterGetter;

public class Train {
	String type;
	String manuFac;
	String model;
	int capacity;
	int maxSpeed;
	String motivePower;
	double accelerate;
	double decelerate;
	int halting;
	
	//Create Setter Method
	public void setType(String type) {
		this.type = type;
	}
	
	public void setManufac(String manuFac) {
		this.manuFac = manuFac;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setMaxspeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setMotivepower(String motivePower) {
		this.motivePower = motivePower;
	}
	
	public void setAccelerate(double accelerate) {
		this.accelerate = accelerate;
	}
	
	public void setDecelerate(double decelerate) {
		this.decelerate = decelerate;
	}
	
	public void setHalting(int halting) {
		this.halting = halting;
	}
	
	 // Create Getter Method
	  public String getType() {
		  return this.type;
	  }
	  
	  public String getManufac() {
		  return this.manuFac;
	  }
	  
	  public String getModel() {
		  return this.model;
	  }
	  
	  public int getCapacity() {
	 	  return this.capacity;
	  }
	  
	  public int getMaxspeed() {
		  return this.maxSpeed;
	  }
	  
	  public String getMotivepower() {
		  return this.motivePower;
	  }
	  
	  public double getAccelerate() {
		  return this.accelerate;
	  }
		
	  public double getDecelerate() {
	      return this.decelerate;
	  }
	  
	  public int getHalting() {
		  return this.halting;
	  }
	  
	// Create a designSpeed() method
	public void designSpeed() {
		System.out.println("The train's design speed is 180km/h!");
	}
	
	
}
