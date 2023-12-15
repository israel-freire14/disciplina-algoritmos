package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER10 {

     /*
        10) A eleição do síndico de um prédio teve três candidatos.
        Faça um algoritimo para ler o nome e o total de votos de cada candidato e informar qual foi o vencedor.
       */

    public static void main(String[] args) {

        //declarar variáveis
        String nomeCandidato1, nomeCandidato2, nomeCandidato3;
        int votosCandidato1, votosCandidato2, votosCandidato3;

        //entrada de dados
        nomeCandidato1 = JOptionPane.showInputDialog("Digite o nome do candidato 1:");
        votosCandidato1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 1:"));

        nomeCandidato2 = JOptionPane.showInputDialog("Digite o nome do candidato 2:");
        votosCandidato2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 2:"));

        nomeCandidato3 = JOptionPane.showInputDialog("Digite o nome do candidato 3:");
        votosCandidato3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 3:"));


        //mostrar daddos para o usuário: vencendor da eleição
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            JOptionPane.showMessageDialog(null, nomeCandidato1 + " venceu a eleição!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            JOptionPane.showMessageDialog(null, nomeCandidato2 + " venceu a eleição!");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            JOptionPane.showMessageDialog(null, nomeCandidato3 + " venceu a eleição!");
        } else {
            JOptionPane.showMessageDialog(null, "A eleição terminou em empate.");
        }
    }
}
