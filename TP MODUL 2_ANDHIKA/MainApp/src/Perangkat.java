public class Perangkat {
    protected String drive;
    protected int ram;
    protected double prosesor;

    public Perangkat(String drive, int ram, double prosesor) {
        this.drive = drive;
        this.ram = ram;
        this.prosesor = prosesor;
    }
    
    public void informasi() {
        System.out.println("Perangkat tidak diketahui memiliki drive tipe " +drive+ "dengan ram sebesar " +ram+ "GB dan processor secepat " +prosesor+ " Ghz");
    }
}
