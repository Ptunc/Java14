package Java14;

import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        int yas, yolculukTipi=0;
        float mesafe;

        Scanner input = new Scanner(System.in);
        System.out.print("yaşınız: ");
        yas = input.nextInt();
        System.out.print("yolculuk tipi(1-tek yön, 2-gidiş-dönüş): ");
        yolculukTipi = input.nextInt();
        System.out.print("mesafe(KM): ");
        mesafe = input.nextFloat();

        if(mesafe <= 0 || yas <= 0 || yolculukTipi < 1 || yolculukTipi > 2 ) System.out.println("Hatalı veri girdiniz!");
        else{
            mesafe *= 0.10;
            if(yas < 12) mesafe *= 0.5;
            else if(yas <= 24) mesafe *=0.9;
            else mesafe *= 0.7;

            if(yolculukTipi == 1) System.out.println("toplam tutar: " + mesafe*2 + " TL");
            else System.out.println("toplam tutar: " + mesafe*2*0.8 + " TL");
        }
        input.close();
    }
}
