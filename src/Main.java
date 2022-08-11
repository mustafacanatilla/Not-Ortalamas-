import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler oluşturuldu.
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı tanımlandı.
        Scanner girdi = new Scanner(System.in);

        //Kullanıcıdan veriler istendi.
        System.out.print("Matematik Notunuzu Giriniz:");
        mat=girdi.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik=girdi.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya=girdi.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce=girdi.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih=girdi.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        muzik=girdi.nextInt();

        int toplam=(mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        // Koşullu ifade kullanılarak, kullanıcının ortalamasına göre "Geçti" ya da "Kaldı" ibaresi eklendi.
        String durum = sonuc > 60 ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println("Ortalamanız: " +sonuc+"\nDurumunuz:" +durum);
    }
}
