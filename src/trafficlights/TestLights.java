package trafficlights;

public class TestLights {
    public static void main(String[] args) {
        new TestLights().run();
    }

    private void run() {
    TrafficLight light1 = new TrafficLight(TrafficLightColour.GREEN);
        System.out.println(light1.getColour());
    }

}
