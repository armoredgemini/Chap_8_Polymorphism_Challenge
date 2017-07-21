/**
 * Created by ac003588 on 7/21/2017.
 */
    abstract class Car {

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
        String trim;


//            public Car(int wheels, int doors, int cyl, String engine, double fuelLevel, int epg) {
//                this.wheels = wheels;
//                this.doors = doors;
//                this.cyl = cyl;
//                this.engine = engine;
//                this.totMiles = 0;
//                this.tankCapacity = 18;
//                // set the fuelLevel to no more than the tank capacity.
//
//                this.gear = 0;
//
//                this.epg = epg;
//            }

        // Default car class, no arguments
        public Car() {
            this.wheels = 4;
            this.doors = 4;
            this.cyl = 4;
            this.totMiles = 0;
            this.engine = "gas";
            this.gear = 0;
            if (fuelLevel < tankCapacity) {
                this.fuelLevel = fuelLevel;
            } else {
                this.fuelLevel = tankCapacity;
            }
            this.tankCapacity = 18;
            this.epg = 24;
            this.started = false;
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
            //System.out.println("I am Blahs Implemetation of Start Engine");
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

        abstract void setTrim(String trim);
    }


