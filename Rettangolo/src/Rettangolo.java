import java.util.Scanner;

public class Rettangolo {
    float b;
    float h;

    Scanner input = new Scanner(System.in);

    public Rettangolo() {
        b = 10;
        h = 5;
    }

    public void ridimensiona() {
        System.out.println("Inserire la nuova base");
        b = input.nextFloat();

        System.out.println("Inserire la nuova altezza");
        h = input.nextFloat();

        System.out.println("I nuovi valori del rettangolo sono: base " +b+ " e altezza " +h);
    }

    public float perimetro() {
        float p;

        p = b*2 + h*2;

        System.out.println("Il perimetro del rettangolo e' " +p);

        return p;
    }

    public float a() {
        float a;

        a = b*h;

        System.out.println("L'area del rettangolo  e' " +a);

        return a;
    }
}
