import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ac003588 on 7/17/2017.
 */
public class Main {

    public static void main(String[] args) {


        class Car {

            int wheels;
            int doors;
            int cyl;
            double totMiles;
            String engine;
            double fuelLevel;
            int gear;
            int tankCapacity;
            int epg;
            boolean started;


            public Car(int wheels, int doors, int cyl, String engine,  double fuelLevel) {
                this.wheels = wheels;
                this.doors = doors;
                this.cyl = cyl;
                this.engine = engine;
                this.totMiles = 0;
                this.tankCapacity = 18;
                // set the fuelLevel to no more than the tank capacity.
                if (fuelLevel < tankCapacity) {
                    this.fuelLevel = fuelLevel;
                } else {
                    this.fuelLevel = tankCapacity;
                }
                this.gear = 0;

                this.epg = 20;
            }

            public double getTotMiles() {
                return totMiles;
            }


            public void startEngine() {
                if (fuelLevel > 0) {
                    started = true;
                    System.out.println("Engine Started");
                    System.out.println("Fuel Level: " + fuelLevel);
                } else {
                    System.out.println("Not enough fuel!");
                }
            }

            public void drive(int gear, double miles) {
                if (started) {
                    if (fuelLevel > 0) {
                        System.out.println("Fuel Level: " + fuelLevel);
                        System.out.println("Shifting into " + gear);
                        // for every 20 miles, subtract 1 from fuel level
                        double fuelUsed = (miles / epg);
                        System.out.println("Fuel used: " + fuelUsed);
                        fuelLevel = fuelLevel - fuelUsed;
                        System.out.println("Fuel Level " + fuelLevel);
                        if (fuelLevel < 3) {
                            System.out.println("Low Fuel Warning!");
                        } else if (fuelLevel <= 0) {
                            System.out.println("Out of fuel!" + fuelLevel);
                        }
                        totMiles = totMiles + miles;

                    } else {
                        System.out.println("Out of Fuel! " + fuelLevel);
                    }
                } else {
                    System.out.println("Car not started");
                }
            }

        }


        Car car1 = new Car(4, 4, 6, "3.7 Liter", 30);
        car1.startEngine();
        car1.drive(1,48);
        car1.drive( 2, 182);
        car1.drive( 3, 200);
        car1.drive(4, 50);
        System.out.println("Total miles = " + car1.getTotMiles());


    }
}

