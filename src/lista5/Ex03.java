package lista5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##.0");

        float menornota = 0, maiornota = 0, mediageral = 0, somanota = 0;
        int pmenor = 0, pmaior = 0;
        System.out.print("Informe quantidade de alunos: ");
        int quantal = in.nextInt();

        float aluno[][] = new float[quantal][2];
        float media[] = new float[quantal];
        String nome[] = new String[quantal];

        for (int i = 0; i < quantal; i++) {
            in.nextLine();
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nome[i] = in.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.print((j + 1) + " nota: ");
                aluno[i][j] = in.nextFloat();
                somanota += aluno[i][j];
                if (i == 0 && j == 0) {
                    menornota = aluno[i][j];
                    maiornota = aluno[i][j];
                }
                if (aluno[i][j] < menornota) {
                    menornota = aluno[i][j];
                    pmenor = i;
                }
                if (aluno[i][j] > maiornota) {
                    maiornota = aluno[i][j];
                    pmaior = i;
                }
                media[i] += somanota;

                somanota = 0;
            }
            media[i] /= 2;
            mediageral += media[i];
        }
        mediageral /= quantal;
        for (int i = 0; i < quantal; i++) {
            System.out.println("\nAluno: " + nome[i]);
            for (int j = 0; j < 2; j++) {
                System.out.println((j + 1) + "nota: " + aluno[i][j]);
            }
            System.out.println("Média: " + df.format(media[i]));
        }

        System.out.println("\n" + nome[pmenor] + " teve a menor nota com: " + (menornota));
        System.out.println(nome[pmaior] + " teve a maior nota com: " + (maiornota));
        System.out.println("Media geral: " + mediageral + "\n");
        for (int i = 0; i < quantal; i++) {
            if (media[i] > mediageral) {
                System.out.println("Aluno " + nome[i] + " acima da média geral com: " + media[i]);
            } else {
                System.out.println("Aluno " + nome[i] + " a baixo da média geral com: " + media[i]);
            }
        }

        in.close();
    }

}
