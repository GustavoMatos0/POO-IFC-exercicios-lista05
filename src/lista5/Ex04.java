package lista5;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float soma = 0, menor = 0, maior = 0;
        int pmaior = 0, pmenor = 0;
        System.out.print("Informe o número de atletas: ");
        int at = in.nextInt();
        final int SALTO = 2;
        float salto[][] = new float[at][SALTO];
        float media[] = new float[at];

        for (int i = 0; i < at; i++) {
            System.out.println("\nAtleta número " + (i + 1) + ":");
            for (int j = 0; j < SALTO; j++) {
                System.out.print((j + 1) + "o Salto: ");
                salto[i][j] = in.nextFloat();
                soma += salto[i][j];
            }
            media[i] = (soma / SALTO);
            if (i == 0) {
                maior = media[i];
                menor = media[i];
            }
            if (media[i] > maior) {
                maior = media[i];
                pmaior = i;
            }
            if (media[i] < menor) {
                menor = media[i];
                pmenor = i;
            }
            System.out.println("Media: " + media[i] + " metros");
            soma = 0;
        }
        for (int i = 0; i < at; i++) {
            System.out.println("\nAtleta número " + (i + 1) + ":");
            for (int j = 0; j < SALTO; j++) {
                System.out.println((j + 1) + "o Salto: " + salto[i][j] + " metros");
            }
            System.out.println("Media: " + media[i] + " metros");
        }
        System.out.println("\nCampão foi o número: " + (pmaior + 1) + " com média: " + maior);
        System.out.println("Ultimo lugar ficou com o número : " + (pmenor + 1) + " com média: " + menor);

        in.close();
    }
}
