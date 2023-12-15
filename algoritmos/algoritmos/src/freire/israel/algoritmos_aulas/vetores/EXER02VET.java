package freire.israel.algoritmos_aulas.vetores;
import javax.swing.JOptionPane;
public class EXER02VET {
    public static void main(String[] args) {
        /*
            2. Faça um programa que receba três vetrores de 6 poisições de números reais snedo o primeiro referente
            aos 6 primeiros meses  de 2020 e o segundo aos 6 primeiros meses de 2021 ambos referentes aos gastos de
            energia elétrica de um domicílio. Mostre em outro vetor a doma dos gastors de cada mês. Sendo que o índice
            0 indica o mês de janeiro.
         */
        //Declarar
        String resultadoSoma ="";
        double[] meses2020 = new double[6];
        double[] meses2021 = new double[6];
        double[] somaTotal = new double[6];

        //valores dos meses de 2020
        for(int i=0; i<meses2020.length; i++)
        {
            meses2020[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o valor do " + (i + 1) +
                    "° mês de 2020 "));

        }

        //valores dos meses de 2021
        for (int j=0; j<meses2021.length; j++)
        {
            meses2021[j] = Integer.parseInt(JOptionPane.showInputDialog(null,"informe o valor do "+ (j+1) +
                    "° mês de 2021 "));
        }


        for(int k=0; k<somaTotal.length; k++)
        {
            somaTotal[k] = meses2020[k] + meses2021[k];
            resultadoSoma = resultadoSoma + somaTotal[k] + "\n";
        }

        //Mostrar Resultado
        JOptionPane.showMessageDialog(null, "Resultado: "+"\n"+ resultadoSoma);
    }
}
