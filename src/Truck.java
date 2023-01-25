public class Truck extends Transport {
    private Integer pitStopTime;
    private Integer maxSpeed;
    private Integer bestLapTime;

    public Truck(String brand, String model, int year, String country, String color, Integer maxSpeed, Integer pitStopTime, Integer maxSpeed1, Integer bestLapTime) {
        super(brand, model, year, country, color, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed1;
        this.bestLapTime = bestLapTime;
    }
    void startToMove () {
        System.out.println("Truck started");
    }
    void finish () {
        System.out.println("Truck finished");
    }

    public void getPitStopTime() {
        System.out.println(" Truck pit-stop time is" + getPitStopTime);
    }

    public void getMaxSpeed() {
        System.out.println(" Truck maxSpeed is" + maxSpeed);
    }

    public void getBestLapTime() {
        System.out.println(" Truck best lap time is" + bestLapTime);
    }
    public boolean passDiagnostics() {
        System.out.println( "Грузовик"+getBrand()+getModel()+ "в диагностике не нуждается");
        return true;
    }
    public void repair() {
        System.out.println("Грузовик"+getBrand()+getModel()+ "отремонтировано");
    }

}