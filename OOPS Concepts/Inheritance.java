class Car {

    public int noOfWheels;
  
    public Car(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
  
    public void applyBrake(int noOfWheels) {
		System.out.println("Stop the car with" + noOfWheels + "using break");
    }
}
  
class Maruti extends Car {
  
    public Boolean alloyWheel;
  
    public Maruti(int noOfWheels, Boolean alloyWheel) {
        super(noOfWheels);
        this.alloyWheel = alloyWheel;
    }
  
    public Boolean getAlloyWheelStatus() {
        return this.alloyWheel;
    }
}
  
public class Test {
    public static void main(String args[])
    {
        Maruti obj = new Maruti(4, true);
        System.out.println(obj.getAlloyWheelStatus);
		System.out.println(obj.applyBrake(4));
    }
}