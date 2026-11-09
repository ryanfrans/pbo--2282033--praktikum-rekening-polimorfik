public abstract class Rekening {
    protected int nomor;
    protected String pemilik;
    protected double saldo;

    public Rekening(int nomor, String pemilik, double saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public abstract double biayaAdminBulanan();

    public void potongBiayaAdmin() {
        saldo -= biayaAdminBulanan();
    }

    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }

    public void tampilkanInfo() {
        System.out.println(nomor + " | " + pemilik + " | Rp" + formatRupiah(saldo));
    }

    public double getSaldo() {
        return saldo;
    }

    public static String formatRupiah(double jumlah) {
        return String.format("%,.0f", jumlah).replace(",", ".");
    }
}