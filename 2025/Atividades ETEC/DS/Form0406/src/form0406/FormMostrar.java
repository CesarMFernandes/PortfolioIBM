package form0406;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FormMostrar extends JFrame{
    JLabel lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15;
    JTextArea res2;
    JScrollPane Scrollr2;
    JButton vol, sai2;
    Font label = new Font("Times New Roman", Font.PLAIN, 20);
    Font btn = new Font("Times New Roman", Font.BOLD, 20);
    public FormMostrar(String nome, String mat, String curso, String serie, String per, String res){
        super("Dados Inseridos");
        Container tela2 = getContentPane();
        setLayout(null);
        
        
        
        //Declarando
        lb5 = new JLabel("Nome::");
        lb6 = new JLabel(nome);
        lb7 = new JLabel("Matrícula::");
        lb8 = new JLabel(mat);
        lb9 = new JLabel("Curso::");
        lb10 = new JLabel(curso);
        lb11 = new JLabel("Série::");
        lb12 = new JLabel(serie);
        lb13 = new JLabel("Periodo::");
        lb14 = new JLabel(per);
        lb15 = new JLabel("Restrições Médicas::");
        
        res2 = new JTextArea();
        
        Scrollr2 = new JScrollPane(res2);
        
        vol = new JButton("Voltar");
        sai2 = new JButton("Sair");
        
        //Tamanho e Posição
        lb5.setBounds(50, 150, 100, 30);
        lb6.setBounds(160, 150, 500, 30);
        lb7.setBounds(50, 200, 100, 30);
        lb8.setBounds(160, 200, 500, 30);
        lb9.setBounds(50, 275, 100, 30);
        lb10.setBounds(160, 275, 500, 30);
        lb11.setBounds(50, 325, 100, 30);
        lb12.setBounds(160, 325, 500, 30);
        lb13.setBounds(50, 375, 100, 30);
        lb14.setBounds(160, 375, 500, 30);
        lb15.setBounds(50, 450, 200, 30);
        
        Scrollr2.setBounds(50, 480, 350, 200);
        
        vol.setBounds(590, 550, 100, 60);
        sai2.setBounds(610, 620, 80, 60);
        
        //Formatação
        lb5.setFont(btn);
        lb6.setFont(label);
        lb7.setFont(btn);
        lb8.setFont(label);
        lb9.setFont(btn);
        lb10.setFont(label);
        lb11.setFont(btn);
        lb12.setFont(label);
        lb13.setFont(btn);
        lb14.setFont(label);
        lb15.setFont(btn);
        
        res2.setFont(label);
        
        vol.setFont(btn);
        sai2.setFont(btn);
        
        //Outro
        res2.setText(res);
        res2.setLineWrap(true);
        res2.setWrapStyleWord(true);
        res2.setEditable(false);
        
        Scrollr2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        Scrollr2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        vol.setMnemonic(KeyEvent.VK_V);
        sai2.setMnemonic(KeyEvent.VK_S);
        
        vol.setToolTipText("Alt + V");
        sai2.setToolTipText("Alt + S");
        
        //Adicionando
        tela2.add(lb5);
        tela2.add(lb6);
        tela2.add(lb7);
        tela2.add(lb8);
        tela2.add(lb9);
        tela2.add(lb10);
        tela2.add(lb11);
        tela2.add(lb12);
        tela2.add(lb13);
        tela2.add(lb14);
        tela2.add(lb15);
        
        tela2.add(Scrollr2);
        
        tela2.add(vol);
        tela2.add(sai2);
        
        //Ações
        vol.addActionListener((ActionEvent s) -> {
            Form0406 cad = new Form0406(nome, mat, curso, serie, per, res);
            cad.setVisible(true);
            dispose();
        });
        
        sai2.addActionListener((ActionEvent s) -> {
            System.exit(0);
        });
        
        
        setSize(800, 800);
        setResizable(false);  
        setLocationRelativeTo(null);
    }
}
