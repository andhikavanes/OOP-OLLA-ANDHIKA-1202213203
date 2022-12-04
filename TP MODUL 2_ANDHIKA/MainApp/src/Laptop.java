
public class Laptop extends Perangkat {
    protected boolean webcam;
    protected String teks;

    public Laptop(String drive, int ram, Double processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam=webcam;
    }
    
    @Override
    public void informasi() {
        if(webcam==true){
            teks="memiliki webcam";
        }
        else{
            teks="tidak memiliki webcam";
        }
        System.out.println("Laptop ini memiliki drive tipe "+ drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + prosesor + " Ghz. selain itu laptop ini juga "+teks);
    }
    
    public void bukagame(String nama_game){
        System.out.println("Laptop berharsil membuka game "+nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berharsil mengirim Email ke "+email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+email1+ " dan ke "+email2 );
    }

}
