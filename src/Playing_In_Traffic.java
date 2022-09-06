public class Playing_In_Traffic {
//    Playing in Traffic
//    create an enum named TrafficLightColor  that contains a list of the colors
//            that are on a stoplight
//            create a method named with the following signature
//            inside of the method, print out a message that tells what to do at each color
//            light
//    public static void makeDrivingDecision(TrafficLightColor color)
public static void main(String[] args) {
    TrafficLightColor stoplight = TrafficLightColor.Yellow;
    signColor(stoplight);
}


public  enum TrafficLightColor{
    Red,Yellow,Green

}

    private static void signColor(TrafficLightColor lightColor) {
        switch(lightColor) {
            case Red:
                System.out.println("Light is red STOPPPPPPP!!");
                break;
            case Yellow:
                System.out.println("Slow down ");
                break;
            case Green:
                System.out.println("Light is green go!!!");
                break;

        }
    }
}