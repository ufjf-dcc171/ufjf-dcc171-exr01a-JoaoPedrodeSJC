
package exercícios.aula01;
import javax.swing.JOptionPane;

public class ExerciciosAula01b {
    public static void main(String[] args) {
        try
        {
            float x1,y1,x2,y2;
            String entrada;
            entrada = JOptionPane.showInputDialog("Digite o x do ponto 1");
            x1 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite o y do ponto 1");
            y1 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite o x do ponto 2");
            x2 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite o y do ponto 2");
            y2 = Float.parseFloat(entrada);
            
            JOptionPane.showMessageDialog(null,"largura x comprimento x altura =" + 
                    ,
                    "A distância entre os dois pontos é",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Formato digitado incorreto","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
}
