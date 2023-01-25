public class Driver {
    public String name;
    public T licence;

    public Driver(String name, T licence) {
        this.name = name;
        this.licence = licence;
    }
    public String getMSG() {return this.name + "управяет"+licence.toSring();}
    public String getMagClass() {return this.name+"управляет"+licence.getClass()toString();}
    public static class LicenceA {
        private String lic="A";

        @Override
        public String toString() {
            return "LicenceA{" +
                    "lic='" + lic + '\'' +
                    '}';
        }
    }
    private String lic="B";

    @Override
    public String toString() {
        return "Driver{" +
                "lic='" + lic + '\'' +
                '}';
    }
    public static class Test {
        public static void main(String[] args) {
            Driver <LicenceA> driveA= new Driver("иванов", new LicenceA());
            Driver <Object> driveC= new Driver("иванов", new LicenceA());
            Driver <LicenceB> driveB= new Driver("петров", new LicenceB());
            System.out.println(driveA.getMsg());
            System.out.println(driveA.getMagClass());
        }
    }
}
