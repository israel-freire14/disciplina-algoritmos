package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER10 {

    /*
        10) Faça um algoritmo para ler os valores gastos em cheque por uma pessoa durante um mês, e depois imprimir a lista com todos os valores, o maior e o menor valor.
        No início do algoritmo o usuário deve informar quantos cheques foram usados no mês; estabeleça um número máximo de cheques
     */

    public static void main(String[] args) {

       //declarar variáveis
        int maxCheques = 10, numeroCheques;
        double[] valoresCheques = new double[maxCheques];

        //Entreda de dados: loop
        do {
            numeroCheques= Integer.parseInt(JOptionPane.showInputDialog("Informe o número de cheques usados no mês (até " + maxCheques + " cheques):"));

        } while (numeroCheques <= 0 || numeroCheques > maxCheques);

        // Ler os valores dos cheques
        for (int i = 0; i < numeroCheques; i++) {
            valoresCheques[i]  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":"));
        }

        // Encontrar o maior e o menor valor
        double maiorValor = valoresCheques[0];
        double menorValor = valoresCheques[0];

        for (int i = 1; i < numeroCheques; i++) {
            if (valoresCheques[i] > maiorValor) {
                maiorValor = valoresCheques[i];
            }
            if (valoresCheques[i] < menorValor) {
                menorValor = valoresCheques[i];
            }
        }

        // Construir a lista de valores
        StringBuilder listaValores = new StringBuilder("Valores dos cheques:\n");
        for (int i = 0; i < numeroCheques; i++) {
            listaValores.append("Cheque ").append(i + 1).append(": ").append(valoresCheques[i]).append("\n");
        }

        // Mostrar dados para o usuário
        JOptionPane.showMessageDialog(null, listaValores.toString() + "Maior valor: "
                + maiorValor + "\n" + "Menor valor: " + menorValor);
    }
}

