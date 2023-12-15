package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER04 {

     /*4) Faça um algoritmo para gerar o valor da constante Pi(3,145..).
          Este valor pode ser obtido pela soma da seguinte série (estabeleça um fim; quanto maior, mais preciso)   pi=4-4/3+4/5-4/7+4/9-4/11
     */


    public static void main(String[] args) {
        // Declarar variáveis
        int entrada;
        double pi = 0.0, piAproximado;
        // Obter o número de iterações do usuário usando JOptionPane
         entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de iterações para calcular Pi:"));


        // Calcular o valor aproximado de Pi
        for (int i = 0; i < entrada; i++)
        {
            double termo = 4.0 / (2 * i + 1);

            // Alternar sinal a cada termo
            if (i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }
        }
        piAproximado = pi;


        //Mostra dados para o usuário: pi
        JOptionPane.showMessageDialog(null, "Valor aproximado de Pi: " + piAproximado);
    }
}
