package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER08 {
    //8) Mostre o que será impresso pelo algoritimo abaixo:
    public static void main(String[] args) {

        // Declarar variáveis
        int x = 0, y = 30;

        // Loop
        while (x < 10) {
            // Incrementar x e y
            x++;
            y--;

            // Mostrar x e y
            JOptionPane.showMessageDialog(null, "x:"+ x + " " + "y:" + y);
        }
    }
}