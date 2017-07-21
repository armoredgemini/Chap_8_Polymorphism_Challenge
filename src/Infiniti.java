/**
 * Created by ac003588 on 7/21/2017.
 */
abstract class Infiniti extends Car {
    String model;
    String make;
    String trim;
    public boolean fob_present = true;


    public Infiniti(String model, String trim) {
        super ();
        this.make = "Infiniti";
        this.model = model;
        this.trim = trim;
        if (trim == "sport") {
            cyl = 6;
        } else cyl = 4;
        if( trim == "sport") {
            epg = 18;
        } else epg = 24;

    }
@Override
    public void startEngine() {
        if (fob_present == true) {
            super.startEngine();
        } else {
            System.out.println("Key Signature Incorrect");
        }
        System.out.println("I am Infiniti's startEngine");
    }



}