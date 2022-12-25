public class App {
    public static void main(String[] args) throws Exception {
        CRFBike bike = new CRFBike();

        bike.getHandleBars();
        bike.setHandleBars("Stang bengkok");
        bike.getTyres();
        bike.setTyres("ban tubles");
        bike.getSeatType();
        bike.setSeatType("Jok busa warna hitam");
    }
}