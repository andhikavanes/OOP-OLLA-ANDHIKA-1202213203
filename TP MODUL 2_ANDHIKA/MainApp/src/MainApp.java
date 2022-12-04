public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Seagate", 16, 5.00);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Western Digital", 32, 5.5, true);
        laptop1.informasi();
        laptop1.bukagame("Assassins Creed Valhalla");
        laptop1.kirimEmail("vthelazy3007@gmail.com");
        laptop1.kirimEmail("viole@gmail.com", "Jinwoo@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Samsung", 12, 3.0, true);
        handphone1.informasi();
        handphone1.telfon(628112244);
        handphone1.kirimSMS(628235460);
        handphone1.kirimSMS(628978503, 628695544);
        System.out.println("");
    }
}
