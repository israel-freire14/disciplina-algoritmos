package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER09 {

    //9) Modifique o algoritmo anterior para informar também o número da disciplina em que o aluno tirou a nota mais alta

    public static void main(String[] args) {
        //declarar variáveis

        int numDisciplinas = 5, numNotasPorDisciplina = 4,disciplinaNotaMaisAlta = 0;
        double nota, notaMaisAlta = Double.MIN_VALUE;


        // Loop externo para iterar sobre as disciplinas
        for (int i = 1; i <= numDisciplinas; i++) {

            // Loop interno para iterar sobre as notas da disciplina atual
            for (int j = 1; j <= numNotasPorDisciplina; j++) {

                // Solicitar a nota ao usuário usando JOptionPane
                 nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":"));

                // Verificar se a nota é a mais alta
                if (nota > notaMaisAlta)
                {
                    notaMaisAlta = nota;
                    disciplinaNotaMaisAlta = i;
                }
            }
        }
        // Exibir a nota mais alta e o número da disciplina usando JOptionPane
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta + " na disciplina " + disciplinaNotaMaisAlta);
    }
}
