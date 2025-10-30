package primeirointer;
import javax.swing.*;
import java.awt.*;
public class PrimeiroInter extends JFrame {
    public PrimeiroInter(){
        super("Título"); //Título
        Container tela = getContentPane(); //Inicializa o conteudo
        ImageIcon icone = new ImageIcon("omni.png"); //Cria icone
        setIconImage(icone.getImage()); //Usa icone
        tela.setBackground(new Color(255, 122, 122)); //Cor de fundo (pode usar color. para cores predefinidas)
        setSize(600, 300); //Tamanho
        setResizable(false); //Tamanho não configurável
        setVisible(true);
        setLocationRelativeTo(null); //Começa no centro
    }
    public static void main(String[] args) {
        PrimeiroInter app = new PrimeiroInter();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}