public class Giro extends Rekening {

    private double batasOverdraft;

    public Giro(int nomor, String pemilik, double saldo, double batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public double biayaAdminBulanan() {
        return 15000;
    }

    public void tampilkanJenis() {
        System.out.println("    Giro, batas overdraft Rp" +
                formatRupiah(batasOverdraft));
    }
}