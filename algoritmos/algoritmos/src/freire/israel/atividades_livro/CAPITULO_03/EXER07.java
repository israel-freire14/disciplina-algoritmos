package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER07 {
     /*
        7)Entrar com o dia e o mês de uma data e informar quantos dias se  passaram desde o inicio do ano.
        Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.
     */

    public static void main(String[] args) {

        //declarar variáveis
        int dia, mes, diasPassados;

        //entrada de dados
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));

        //calcular dias passados
        diasPassados = (mes-1)*30+dia; //considerar que cada mês possui 30 dias

        //mostra dados para o usuários
        JOptionPane.showMessageDialog(null, "Desde o início do ano passaram-se " + diasPassados + " dias.");
    }
}
