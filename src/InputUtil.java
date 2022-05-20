import java.util.Scanner;

public class InputUtil {

    public static int getInteger(String msg) {
        System.out.print(msg + " : ");
        try {
            Scanner scn = new Scanner(System.in);
            return scn.nextInt();
        } catch (Exception e) {
            System.out.println("Error while reading input");
            e.printStackTrace();
        }
        return 0;
    }
}
