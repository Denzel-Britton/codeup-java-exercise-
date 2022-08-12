package util;

public class InputTest {
    public static void main(String[] args) {
        Input userIn = new Input();

        System.out.println(userIn.getString());
        System.out.println(userIn.getDouble(1.0,5.5));

        System.out.println(userIn.yesNo());
        System.out.println(userIn.getInt());
        System.out.println(userIn.getInt(1,10));
        System.out.println(userIn.getDouble());

    }
}
