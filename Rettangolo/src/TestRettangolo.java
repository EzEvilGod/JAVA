import java.util.Scanner;

public class TestRettangolo {
    public static void main(String[] args) {
        float b;
        float h;
        float p;
        float a;

        float SA = 0;
        float SP = 0;

        int scelta;
        int i;

        Scanner input = new Scanner(System.in);
        Rettangolo ret = new Rettangolo();

        for(i=0; i<3; i++) {
            h= ret.h;
            b= ret.b;
            System.out.println("I valori del rettangolo sono: base " +b+ " e altezza " +h);


            System.out.println("Vuoi ridimensionare il rettangolo? Premere (1) se si, (2) se no ");
            scelta = input.nextInt();

            if(scelta==1) {
                ret.ridimensiona();
            }


            p = ret.perimetro();
            SP = SP + p;

            a = ret.a();
            SA = SA + a;

            System.out.println("La somma dei perimetri vale " +SP+ " e la somma delle aree vale " +SA);
        }
    }
}