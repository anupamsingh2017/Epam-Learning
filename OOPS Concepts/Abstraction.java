public abstract class Car {
    public abstract void stop();
}
  
public class Maruti extends Car {
    public void stop()
    {
        System.out.println("Stop Maruti car");
    }
}
  
public class Test {
    public static void main(String args[])
    {
        Car obj = new Maruti();
        obj.stop();
    }
}