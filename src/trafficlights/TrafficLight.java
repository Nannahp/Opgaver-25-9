package trafficlights;

public class TrafficLight {
    private TrafficLightColour colour;

    public TrafficLight(TrafficLightColour colour){
        setColour(colour);
    }
    public TrafficLightColour getColour (){
        return  this.colour;
    }
    public void setColour (TrafficLightColour colour){
        this.colour = colour;
    }
}
