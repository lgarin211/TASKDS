public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        mhs.setNama("Agustinus Pardamean Lumban Tobing");
        mhs.setUmur(23);
        mhs.setNim("260225100138");

        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama Mahasiswa : " + mhs.getNama());
        System.out.println("Usia           : " + mhs.getUmur());
        System.out.println("NIM            : " + mhs.getNim());
    }
}
