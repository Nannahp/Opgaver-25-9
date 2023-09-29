package carswithnoattitude;

public class DriveCars {
    public static void main(String[] args) {
        new DriveCars().run();
    }

    private void run() {
        Car car1 = new Car("Tesla", "2000", "Beep beep motherfuckers");
        System.out.println(car1.getBrand());
        System.out.println(car1.getMake());
        car1.sound();

        Driver carl = new Driver("CaAARL");
        car1.assignDriver(carl);

        car1.drive();
        car1.turnEngineOn();
        car1.drive();
        car1.sound();
        car1.park();
        car1.turnEngineOff();


    }
}
