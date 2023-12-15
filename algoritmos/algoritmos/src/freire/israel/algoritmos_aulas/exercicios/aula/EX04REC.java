package freire.israel.algoritmos_aulas.exercicios.aula;
import javax.swing.*;
public class EX04REC {

    //declara o método com vetor e variável tamanho
    public static int somaV(int v[], int tamanho)//assinatura do método
    {
        //caso base
        if(tamanho == 0)
        {
            return 0;
        }
        //caso geral
        else
        {
            return v[tamanho - 1] + somaV(v,tamanho-1);
        }
    }
    public static void main(String[] args) {


        int tamanho; //declarar variável
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array")); // entrada de dados
        int[] vetor = new int[tamanho];  //declarar vetor

        for(int i=0; i<tamanho; i++)
        {
            vetor[i] =Integer.parseInt(JOptionPane.showInputDialog("Digite valor:"));
            /*
            soma = soma + vetor[i]; para somar é necessário criar variável anteriormente fora do FOR
            */
        }
        //Saída de dados & chamar método somaV();
        JOptionPane.showMessageDialog(null,"Soma do vetor: "+somaV(vetor, tamanho));

    }
}
