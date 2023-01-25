public class Bus extends Transport {
    private Integer pitStopTime;
    private Integer maxSpeed;
    private Integer bestLapTime;

    public Bus(String brand, String model, int year, String country, String color, Integer maxSpeed, Integer pitStopTime, Integer maxSpeed1, Integer bestLapTime) {
        super(brand, model, year, country, color, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed1;
        this.bestLapTime = bestLapTime;
        void startToMove () {
            System.out.println("Bus started");
        }
        void finish () {
            System.out.println("Bus finished");
        }

        public void getPitStopTime () {
            System.out.println(" Bus pit-stop time is" + getPitStopTime);
        }

        public void getMaxSpeed () {
            System.out.println(" Bus maxSpeed is" + maxSpeed);
        }

        public void getBestLapTime () {
            System.out.println(" Bus best lap time is" + bestLapTime);
        }
        public boolean passDiagnostics () {
            System.out.println("Автобус" + getBrand() + getModel() + "в диагностике не нуждается");
            return true;
        }
        public void repair () {
            System.out.println("Автобус" + getBrand() + getModel() + "отремонтировано");
        }
    }
}

