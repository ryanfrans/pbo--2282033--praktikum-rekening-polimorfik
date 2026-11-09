public class Tabungan extends Rekening implements BerBunga {

    private double persentaseBunga;

    public Tabungan(int nomor, String pemilik, double saldo, double persentaseBunga) {
        super(nomor, pemilik, saldo);
        this.persentaseBunga = persentaseBunga;
    }

    @Override
    public double biayaAdminBulanan() {
        if (saldo >= 1000000) {
            return 0;
        } else {
            return 5000;
        }
    }

    @Override
    public double hitungBunga(double saldo) {
        return saldo * persentaseBunga / 100;
    }

    public void tampilkanJenis() {
        System.out.println("    Tabungan, bunga " + persentaseBunga + "% per bulan");
    }
}