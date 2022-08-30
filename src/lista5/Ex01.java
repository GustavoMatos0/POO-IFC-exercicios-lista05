package lista5;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0, l, c, dp = 0, ds = 0, soma = 0, maiorn = 0, menorn = 0, contpar = 0, contimpar = 0;
        float media = 0;

        do {
            System.out.print("Insira um valor inteiro impar entre 3 e 11: ");
            num = in.nextInt();
        } while ((num < 3) || (num > 11) || (num % 2 == 0));

        int matriz[][] = new int[num][num];

        for (l = 0; l < num; l++) {
            for (c = 0; c < num; c++) {
                System.out.print("Informe os valores para cada uma das posições da matriz: ");
                matriz[l][c] = in.nextInt();

                soma += matriz[l][c];
                media = soma / matriz[l][c];

                if (l == c) {
                    dp += matriz[l][c];
                }

                if ((l + c) == num - 1) {
                    dp += matriz[l][c];
                }

                if (matriz[l][c] % 2 == 0) {
                    contpar++;
                } else {
                    contimpar++;
                }

                if (l == 0) {
                    maiorn = matriz[l][c];
                    menorn = matriz[l][c];
                } else {
                    if (matriz[l][c] < menorn) {
                        menorn = matriz[l][c];
                    }
                    if (matriz[l][c] > maiorn) {
                        maiorn = matriz[l][c];
                    }
                }
            }
        }

        System.out.println("A soma dos elementos da matriz: " + soma);
        System.out.println("A media dos elementos da matriz: " + media);
        System.out.println("O maior valor da matriz: " + maiorn);
        System.out.println("O menor valor da matriz: " + menorn);
        System.out.println("Contador de pares: " + contpar);
        System.out.println("Contador de ímpares: " + contimpar);
        System.out.println("Soma da diagonal principal: " + dp);
        System.out.println("A soma da diagonal secundária: " + ds);

        for (l = 0; l < num; l++) {
            for (c = 0; c < num; c++) {
                System.out.print(matriz[l][c] + "|");
            }
            System.out.println();
        }

        in.close();
    }

}
