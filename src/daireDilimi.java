import java.util.Scanner;
public class daireDilimi {
    public static void main(String[] args) {
        double a,r,sonuc;
        double pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz :");
        r = input.nextDouble();
        System.out.print("a açısını giriniz : ");
        a =input.nextDouble();

        sonuc = (pi*(r*r)*a)/360;
        System.out.print("Dilimin Alanı : "+sonuc);
    }

}
