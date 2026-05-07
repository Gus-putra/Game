public class Zombie extends Musuh {

    public Zombie() {
    super("Jawira Psikis", 200);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "menyemburkan air liur! Player -30 HP");
    }
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " Wau..Wau.. ");
    }
}
