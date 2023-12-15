package freire.israel.algoritmos_aulas.vetores;
import javax.swing.JOptionPane;
public class EXER03VET {
    public static void main(String[] args) {

        /*
        3. Faça um programa que leia 10 números inteiros, armazene-os em um vetor, solicite um
        valor de referencia inteiro e:
        a)retorne quantas vezes  o valor de referência aparece no vetor;
        b)retorne todos os números divisíveis pelo valor de referência.
        */

        //Declarar variáveis
        int valorReferencia, contador=0;
        String divisiveis ="";
        //Criar vetor
        int[] numero = new int[10];

        //Preencher vetor
        for(int i=0; i<numero.length; i++)
        {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º primeiro valor"));

        }
        //Valor de referência
        valorReferencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de referência"));

        //Vezes que o valor de referência aparece no vetor
        for(int j=0;j<numero.length;j++)
        {
            if(numero[j]==valorReferencia)
            {
                contador++;
            }
        }

        //Todos os números divisíveis pelo valor de referência.
        for(int k=0; k< numero.length; k++)
        {
            if(numero[k]%valorReferencia==0)
            {
                divisiveis = divisiveis + numero[k]+"\n";
            }
        }

        //Mostrar Resultado
        JOptionPane.showMessageDialog(null,"Resultado: "+"\n"+"A)Valor aparece: "+"\n"+contador+" vezes"
        +"\n"+"B)Numeros divisíveis: "+"\n"+divisiveis);

    }
}
