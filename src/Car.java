public class Car extends Transport {
    private Integer pitStopTime;
    private Integer maxSpeed;
    private Integer bestLapTime;

    public Car(String brand, String model, int year, String country, String color, Integer maxSpeed, Integer pitStopTime, Integer maxSpeed1, Integer bestLapTime) {
        super(brand, model, year, country, color, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed1;
        this.bestLapTime = bestLapTime;
        void startToMove () {
            System.out.println("Car started");
        }
        void finish () {
            System.out.println("Car finished");
        }

    public void getPitStopTime() {
        System.out.println(" pit-stop time is" + getPitStopTime);
    }

    public void getMaxSpeed() {
        System.out.println("maxSpeed is" + maxSpeed);
    }

    public void getBestLapTime() {
        System.out.println(" best lap time is" + bestLapTime);
    }
    public boolean passDiagnostics() {
        System.out.println( "Авто"+getBrand()+getModel()+ "прошло диагнотику");
    return true;
    }
    public void repair() {
        System.out.println("Авто"+getBrand()+getModel()+ "отремонтировано");
    }

}