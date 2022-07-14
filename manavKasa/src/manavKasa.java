import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double Armut=2.14, Elma= 3.67, Domates= 1.11, Muz= 0.95, Patlıcan=5.00;
        double armutMiktari, elmaMiktari, domatesMiktari, muzMiktari, patlıcanMiktari;

        System.out.print("Armut kg: ");
        armutMiktari= input.nextDouble();

        System.out.print("Elma kg: ");
        elmaMiktari= input.nextDouble();

        System.out.print("Domates kg: ");
        domatesMiktari= input.nextDouble();

        System.out.print("Muz kg: ");
        muzMiktari=input.nextDouble();

        System.out.print("Patlıcan kg: ");
        patlıcanMiktari=input.nextDouble();

        double Total;

        Total= ((armutMiktari * Armut)+(elmaMiktari * Elma)+(domatesMiktari*Domates)+(muzMiktari*Muz)+(patlıcanMiktari*Patlıcan));

        System.out.print("Tutar: " + Total );

    }
}
