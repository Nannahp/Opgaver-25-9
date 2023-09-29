package mycards;

import carswithnoattitude.Car;

public class MyCard {
    CardType type;
    int value;

    public MyCard(CardType type, int value){
        this.type = type;
        if (value >= 0 && value <=13)
            this.value  = value;
        else
        {this.value = 1;
             System.out.println("Invalid value, default value set to 1");}
    }
    public CardType getType(){
        return type;
    }
    public int getValue(){
        return value;
    }
}
