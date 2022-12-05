public class MainApp {
    public static void main(String[] args) throws Exception {
       TransportasiAir transportasi = new TransportasiAir(15, 50000);
       transportasi.informasi();
       transportasi.berlayar();
       transportasi.berlabuh();
       System.out.println("");

       Sampan sampan = new Sampan(10, 8000, 2);
       sampan.informasi();
       sampan.berlayar();
       sampan.berlabuh();
       sampan.berlabuh(2);
       System.out.println("");

       Kapal kapal = new Kapal(20, 30000, "Diesel");
       kapal.informasi();
       kapal.berlayar();
       kapal.berlayar(50);
       kapal.berlabuh();
       System.out.println("");
    }
}
