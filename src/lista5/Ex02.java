package lista5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###.00");

        final int TAM = 3;
        int maiorp = 0, menorp = 0;
        float preco[][] = new float[TAM][TAM];
        float mer[] = new float[TAM];
        float media = 0, soma = 0, maiorpreco = 0, menorpreco = 0;

        for (int l = 0; l < TAM; l++) {
            System.out.println("\nMercado número " + (l + 1));
            for (int c = 0; c < TAM; c++) {
                System.out.print("Produto " + (c + 1) + ": ");
                preco[l][c] = in.nextFloat();
                media += preco[l][c];
                soma += preco[l][c];
            }
            mer[l] = soma;
            soma = 0;
        }
        media /= (float) (TAM * TAM);
        for (int l = 0; l < TAM; l++) {
            System.out.println("\nMercado número " + (l + 1));
            for (int c = 0; c < TAM; c++) {
                System.out.print("Produto " + (c + 1) + ": ");
                System.out.println("Preço: " + preco[l][c] + " R$");
            }
            System.out.println("Soma dos produtos: " + mer[l]);
        }
        System.out.println("\nMédia de preço por produto: " + df.format(media) + " R$");

        for (int i = 0; i < TAM; i++) {
            if (i == 0) {
                maiorpreco = mer[i];
                menorpreco = mer[i];
            }
            if (mer[i] > maiorpreco) {
                maiorpreco = mer[i];
                maiorp = i;
            }
            if (mer[i] < menorpreco) {
                menorpreco = mer[i];
                menorp = i;
            }
        }

        System.out.println("\nMercado " + (menorp + 1) + " é o mais barato: " + mer[menorp] + " R$");
        System.out.println("Mercado " + (maiorp + 1) + " é o mais caro: " + mer[maiorp] + " R$");

        in.close();
    }
}
