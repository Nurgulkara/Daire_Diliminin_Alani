import java.util.Scanner;

public class Daire_Diliminin_Alani {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r;
        double pi = 3.14, a, alan;
        System.out.print("Yaricapi Giriniz: ");
        r = inp.nextInt();
        System.out.print("Merkez Acisinin Olcusunu Giriniz: ");
        a = inp.nextDouble();


        alan = (pi * (r * r) * a) / 360;       //(𝜋 * (r*r) * 𝛼) / 360


        System.out.print("Daire Diliminin Alani: " + alan);
    }
}
