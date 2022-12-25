public class CRFBike implements BikeParts {

  // implement the required methods
  public String getHandleBars() {
    String handle_motor = "Stang Fatbar Pro Taper";
    System.out.println("Handle Motor CRF memiliki tipe " + handle_motor);
    return handle_motor;
  }

  public void setHandleBars(String newValue) {
    System.out.println("Handle Motor CRF sekarang bertipe " + newValue);

  }

  public String getTyres() {
    String ban_motor = "Maxxis Extramaxx 17'";
    System.out.println("Ban dari Motor CRF memiliki tipe " + ban_motor);
    return ban_motor;
  }

  public void setTyres(String newValue) {
    System.out.println("Ban dari Motor CRF sekarang bertipe " + newValue);
  }

  public String getSeatType() {
    String kursi_motor = "Jok busa warna merah";
    System.out.println("Jok dari Motor CRF memiliki tipe " + kursi_motor);
    return kursi_motor;
  }

  public void setSeatType(String newValue) {
    System.out.println("Jok dari Motor CRF sekarang bertipe " + newValue);
  }

  @Override
  public String GetTyres() {
    // TODO Auto-generated method stub
    return null;
  }
}