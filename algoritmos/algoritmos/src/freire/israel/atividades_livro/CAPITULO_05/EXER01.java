package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER01 {

    /*
        1) A fábrica da Vôlquis produz uma determinada quantidade de automóveis por dia.
           Faça um algoritmo para ler a quantidade produzida diariamente ao longo de um ano, e depois informe:
            a) a quantidade produzida no ano td ;
            b) a menor produção diária.
            Obs: Considere que o valor -1 indica fim da digitação; observe que há dias em que não há   produção.
      */
    public static void main(String[] args) {

        //declarar variáveis
        int qtdDiaria, qtdProduzidaAno = 0, dia = 1;
        int menorProducaoDiaria = Integer.MAX_VALUE;

        //entrada de dados
        JOptionPane.showMessageDialog(null, "Digite a quantidade produzida diariamente ao longo do ano (-1 para encerrar):");

        while (true) {
            String input = JOptionPane.showInputDialog("Quantidade do dia " + dia + " (ou -1 para encerrar):");

            try {
                qtdDiaria = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
                continue;
            }

            // Verificar se o usuário quer encerrar a digitação
            if (qtdDiaria == -1) {
                break;
            }

            // Atualizar a quantidade produzida no ano
            qtdProduzidaAno += qtdDiaria;

            // Verificar se a produção diária é a menor até agora
            if (qtdDiaria < menorProducaoDiaria) {
                menorProducaoDiaria = qtdDiaria;
            }

            dia++;
        }

        // Exibir os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "Quantidade produzida no ano: " + qtdProduzidaAno + "\n" + "Menor produção diária: " + (menorProducaoDiaria == Integer.MAX_VALUE ? "N/A" : menorProducaoDiaria));
    }
}
