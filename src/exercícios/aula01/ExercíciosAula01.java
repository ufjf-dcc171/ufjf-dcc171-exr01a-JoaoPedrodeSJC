//exercia a)
package exercícios.aula01;

import javax.swing.JOptionPane;

public class ExercíciosAula01 {

    public static void main(String[] args) {
        try
        {
            float largura,comprimento, altura;
            String entrada;
            entrada = JOptionPane.showInputDialog("Digite a largura do pacote");
            largura = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite a largura do pacote");
            comprimento = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite a largura do pacote");
            comprimento = Float.parseFloat(entrada);
            JOptionPane.showMessageDialog(null,"O volume do pacote é",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Formato digitado incorreto","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }

}
