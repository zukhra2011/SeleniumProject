package Tests.Utilities;

public class BrowserUtil {
    //Method that will accept int arg
    //Wait for given second duration
    //1sec=1000 milli seconds
    //1*1000=1000

    public static void sleep (int second)  {
        second*=1000; //given in the method
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something happened during thread sleep.");
        }


    }
}
