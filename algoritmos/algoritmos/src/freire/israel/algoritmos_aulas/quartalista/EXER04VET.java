package freire.israel.algoritmos_aulas.quartalista;
import javax.swing.JOptionPane;
public class EXER04VET {
    public static void main(String[] args) {

        /*
            4. Faça um programa que leia uma matriz 2x3 de inteiros e calcule a soma de todos os
            seus elementos positivos;
         */

        //Declarar variáveis
        int linha, coluna;
        int soma = 0;

        //Criar matriz
        int[][] matriz = new int[2][3];

        //Preencher matriz
        for(linha = 0; linha < 2; linha++)
        {
            for(coluna = 0; coluna < 3; coluna++)
            {
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da " +
                        (linha) + "° linha e " + (coluna) + "° coluna"));

                if(matriz[linha][coluna] > 0)
                {
                    soma += matriz[linha][coluna];
                }
            }
        }


        //Mostrar Resultado
        JOptionPane.showMessageDialog(null, "Resultado: "+"\n"+soma);
    }
}
