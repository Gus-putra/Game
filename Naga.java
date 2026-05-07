public class Naga extends Musuh {

    public Naga() {
    super("Naga Api Hitam", 500);
    }    

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " menyemburkan nafas api dari udara! Player -50HP");
    }
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " WAUZ... WAUZ.. ");
    }
}
