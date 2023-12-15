package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER08 {

    /*
        8) Um aluno possui 4 notas em cada uma das 5 disciplinas que cursa num colégio.
        Faça um algoritmo para ler as notas do aluno, e indicar qual foi a mais alta.
    */

    public static void main(String[] args) {

        //declarar variáveis
        int numDisciplinas = 5, numNotasPorDisciplina = 4;
        double notaMaisAlta = Double.MIN_VALUE, nota;

        // Loop externo para iterar sobre as disciplinas
        for (int i = 1; i <= numDisciplinas; i++) {

            // Loop interno para iterar sobre as notas da disciplina atual
            for (int j = 1; j <= numNotasPorDisciplina; j++) {

                // Solicitar a nota ao usuário usando JOptionPane
                nota=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":"));

                // Verificar se a nota é a mais alta
                if (nota > notaMaisAlta) {
                    notaMaisAlta = nota;
                }
            }
        }
        // Mostrar dados para o usuário: nota mais alta
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta);
    }
}
