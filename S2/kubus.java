class BangunRuang { //kelas induk

    public double volume() {
        return 0;
    }

    public double luasPermukaan() {
        return 0;
    }
}

class Kubus extends BangunRuang { //kelas turunan dari BangunRuang
    private double sisiKubus;

    public void inputSisi(double sisiKubus) {
        this.sisiKubus = sisiKubus;
    }

    @Override
    public double volume() {
        return Math.pow(sisiKubus, 3);
    }

    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(sisiKubus, 2);
    }
}

class Balok extends BangunRuang { //kelas turunan dari BangunRuang
    private double panjang, lebar, tinggi;

    public void setUkuran(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

public class Main {
    public static void main(String[] args) {

        BangunRuang bangun;

        bangun = new Kubus(); //contoh polymorphism
        ((Kubus) bangun).inputSisi(5);
        System.out.println("Volume Kubus    : " + bangun.volume());
        System.out.println("Luas Permukaan Kubus : " + bangun.luasPermukaan());

        bangun = new Balok(); //contoh polymorphism
        ((Balok) bangun).setUkuran(3, 4, 5);
        System.out.println("\nVolume Balok     : " + bangun.volume());
        System.out.println("Luas Permukaan Balok : " + bangun.luasPermukaan());
    }
}
