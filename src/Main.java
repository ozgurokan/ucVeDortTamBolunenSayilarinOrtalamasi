import java.util.Scanner;

/* sıfır'ın 3 ve 4 e bölümü de sıfırdır o yüzden
counter her zaman birden başlar bunu çözmek için i değişkenini 1 değerinden başlattım */
public class Main {
    public static void main(String[] args) {
        int number, sum = 0, counter = 0;
        double avarage = 0;

        //kullanıcıdan veri alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();

        // kullanıcıdan alınan sayıya kadar bütün sayılar dönülür
        for (int i = 1; i <= number; i++) {
            // kalan 3 ve 4 şartı kontrol edilir
            if ((i % 3 == 0) && (i % 4 == 0)) {
                // üç ve dört katı olan sayılar sum değişkenine eklenir
                sum += i;
                //counter şartı sağlayan her iterasyonda bir artırılır
                counter++;
            }
        }
        //ortalama bulunur
        avarage = sum / counter;
        System.out.println("Girilen sayıya kadar 3 ve 4 ün katı olan sayıların ortalaması: " + avarage);
    }
}