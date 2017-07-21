import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ac003588 on 7/17/2017.
 */
public class Main {

    public static void main(String[] args) {


        Infiniti q50 = new Q50("sport");
        q50.startEngine();


        Car q51 = new Q50("base");
        q51.startEngine();

        Q50 q52 = new Q50("base");

    }
}

