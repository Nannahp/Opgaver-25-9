package carswithnoattitude;

public class Car {
   private String brand;
   private String make;
   private String honk;
   private boolean motorOn = false;
   private Driver driver;

   public Car(String brand, String make, String honk){
       setBrand(brand);
       setMake(make);
       setHonk(honk);
   }


   public void setBrand(String brand){
       this.brand = brand;
   }
   public void setMake(String make){
       this.make = make;
   }
   public void setHonk(String honk){
       this.honk = honk;
   }
   public String getBrand(){
       return brand;
   }
   public String getMake(){
       return make;
   }
   public String getHonk(){
       return honk;
   }
   public void sound(){
       if(driver !=null)
       System.out.println(getHonk());
       else throwException();
   }
   public void drive(){
       if (!this.motorOn)
           System.out.println("Engine is off. Turn on engine to drive");
      else if (driver != null) System.out.println(getBrand() + " drives");
      else throwException();
   }
   public void park(){
       if (driver != null)
       System.out.println(getBrand() + " parked");
       else throwException();
   }
   public void turnEngineOn(){
       this.motorOn = true;
   }
   public void  turnEngineOff(){
       this.motorOn = false;
   }
   public void assignDriver(Driver driver){
       this.driver = driver;
   }
    public void throwException(){
       System.out.println("No-one is in the car");
   }

}
