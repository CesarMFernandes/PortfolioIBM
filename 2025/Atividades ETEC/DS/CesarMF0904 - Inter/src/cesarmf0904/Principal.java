package cesarmf0904;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends JFrame{
    Calculadora calc = new Calculadora();
    JLabel titulo, num1, num2, res, res2, autor, neg3, neg4, tip1, tip2, tip3, tip4, tip5;
    JTextField num3, num4;
    JButton add, sub, mul, div, lim, hab, des, ocu, exi, sai, neg1, neg2;
    public Principal(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        //declarando
        titulo = new JLabel("CALCULADORA");
        num1 = new JLabel("1º Número");
        num2 = new JLabel("2º Número");
        res = new JLabel("Resultado:");
        res2 = new JLabel("");
        autor = new JLabel("Desenvolvido por: Cesar Moreno Fernandes - 2ºAMS");
        neg3 = new JLabel("(+)");
        neg4 = new JLabel("(+)");
        tip1 = new JLabel("Alt + A");
        tip2 = new JLabel("Alt + S");
        tip3 = new JLabel("Alt + M");
        tip4 = new JLabel("Alt + D");
        tip5 = new JLabel("Alt + L");
        
        num3 = new JTextField();
        num4 = new JTextField();
        
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        lim = new JButton("Limpar");
        hab = new JButton("Habilitar");
        des = new JButton("Desabilitar");
        ocu = new JButton("Ocultar");
        exi = new JButton("Exibir");
        sai = new JButton("Sair");
        neg1 = new JButton("-");
        neg2 = new JButton("-");
        
        //posicão e tamanho
        titulo.setBounds(0, 30, 900, 40);
        num1.setBounds(150, 150, 300, 20);
        num2.setBounds(150, 230, 300, 20);
        res.setBounds(100, 450, 900, 20);
        res2.setBounds(210, 450, 900, 20);
        autor.setBounds(480, 520, 500, 20);
        neg3.setBounds(125, 170, 50, 30);
        neg4.setBounds(125, 250, 50, 30);
        tip1.setBounds(520, 130, 80, 80);
        tip2.setBounds(765, 130, 80, 80);
        tip3.setBounds(520, 215, 80, 80);
        tip4.setBounds(765, 215, 80, 80);
        tip5.setBounds(600, 350, 165, 60);
        
        num3.setBounds(150, 170, 100, 30);
        num4.setBounds(150, 250, 100, 30);
        
        add.setBounds(600, 130, 80, 80);
        sub.setBounds(685, 130, 80, 80);
        mul.setBounds(600, 215, 80, 80);
        div.setBounds(685, 215, 80, 80);
        lim.setBounds(600, 300, 165, 60);
        hab.setBounds(150, 300, 120, 50);
        des.setBounds(150, 355, 120, 50);
        ocu.setBounds(275, 300, 120, 50);
        exi.setBounds(275, 355, 120, 50);
        sai.setBounds(400, 300, 120, 50);
        neg1.setBounds(60, 170, 50, 30);
        neg2.setBounds(60, 250, 50, 30);
        
        //centralizando
        titulo.setHorizontalAlignment(JTextField.CENTER);
        
        num3.setHorizontalAlignment(JTextField.CENTER);
        num4.setHorizontalAlignment(JTextField.CENTER);
        
        tip1.setHorizontalAlignment(JTextField.CENTER);
        tip2.setHorizontalAlignment(JTextField.CENTER);
        tip3.setHorizontalAlignment(JTextField.CENTER);
        tip4.setHorizontalAlignment(JTextField.CENTER);
        tip5.setHorizontalAlignment(JTextField.CENTER);
        
        //formatação
        titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        num1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        num2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        res.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        res2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        autor.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        neg3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        neg4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        tip1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        tip2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        tip3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        tip4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        tip5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        num3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        num4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        add.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
        sub.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
        mul.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
        div.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
        lim.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        hab.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        des.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        ocu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        exi.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        sai.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        neg1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        neg2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        
        //adicionando 
        tela.add(titulo);
        tela.add(num1);
        tela.add(num2);
        tela.add(res);
        tela.add(res2);
        tela.add(autor);
        tela.add(neg3);
        tela.add(neg4);
        tela.add(tip1);
        tela.add(tip2);
        tela.add(tip3);
        tela.add(tip4);
        tela.add(tip5);
        
        tela.add(num3);
        tela.add(num4);
        
        tela.add(add);
        tela.add(sub);
        tela.add(mul);
        tela.add(div);
        tela.add(lim);
        tela.add(hab);
        tela.add(des);
        tela.add(ocu);
        tela.add(exi);
        tela.add(sai);
        tela.add(neg1);
        tela.add(neg2);
        
        //Botão - Função
        add.addActionListener((ActionEvent e) -> {
            if(isValid(num3.getText()) && isValid(num4.getText())){
                
                if("(+)".equals(neg3.getText())){
                    calc.setN1(Double.parseDouble(num3.getText()));
                }
                else{
                    calc.setN1(Double.parseDouble(num3.getText()) * (-1));
                }
                if("(+)".equals(neg4.getText())){
                    calc.setN2(Double.parseDouble(num4.getText()));
                }
                else{
                    calc.setN2(Double.parseDouble(num4.getText()) * (-1));
                }
                
                calc.setR((calc.somar(calc.getN1(), calc.getN2())));
                
                String ResStr = "" + calc.getR();
                res2.setText(ResStr);
                res2.setVisible(true);
                
                res.setText("Resultado:");
                res.setForeground(Color.black);
            }
            else{
                res.setText("ERRO: Campos de texto não podem conter letras, símbolos ou espaços em brancos");
                res.setForeground(Color.red);
                
                res2.setVisible(false);
            }
        });
        
        sub.addActionListener((ActionEvent e) -> {
            if(isValid(num3.getText()) && isValid(num4.getText())){
                
                if("(+)".equals(neg3.getText())){
                    calc.setN1(Double.parseDouble(num3.getText()));
                }
                else{
                    calc.setN1(Double.parseDouble(num3.getText()) * (-1));
                }
                if("(+)".equals(neg4.getText())){
                    calc.setN2(Double.parseDouble(num4.getText()));
                }
                else{
                    calc.setN2(Double.parseDouble(num4.getText()) * (-1));
                }
 
                calc.setR((calc.subtrair(calc.getN1(), calc.getN2())));
                
                String ResStr = "" + calc.getR();
                res2.setText(ResStr);
                res2.setVisible(true);
                
                res.setText("Resultado:");
                res.setForeground(Color.black);
            }
            else{
                res.setText("ERRO: Campos de texto não podem conter letras, símbolos ou espaços em brancos");
                res.setForeground(Color.red);
                
                res2.setVisible(false);
            }
        });
        
        mul.addActionListener((ActionEvent e) -> {
            if(isValid(num3.getText()) && isValid(num4.getText())){
                
                if("(+)".equals(neg3.getText())){
                    calc.setN1(Double.parseDouble(num3.getText()));
                }
                else{
                    calc.setN1(Double.parseDouble(num3.getText()) * (-1));
                }
                if("(+)".equals(neg4.getText())){
                    calc.setN2(Double.parseDouble(num4.getText()));
                }
                else{
                    calc.setN2(Double.parseDouble(num4.getText()) * (-1));
                }
                calc.setR((calc.multiplicar(calc.getN1(), calc.getN2())));
                
                String ResStr = "" + calc.getR();
                res2.setText(ResStr);
                res2.setVisible(true);
                
                res.setText("Resultado:");
                res.setForeground(Color.black);
            }
            else{
                res.setText("ERRO: Campos de texto não podem conter letras, símbolos ou espaços em brancos");
                res.setForeground(Color.red);
                
                res2.setVisible(false);
            }
        });
        
        div.addActionListener((ActionEvent e) -> {
            if(isValid(num3.getText()) && isValid(num4.getText())){
                
                if("(+)".equals(neg3.getText())){
                    calc.setN1(Double.parseDouble(num3.getText()));
                }
                else{
                    calc.setN1(Double.parseDouble(num3.getText()) * (-1));
                }
                if("(+)".equals(neg4.getText())){
                    calc.setN2(Double.parseDouble(num4.getText()));
                }
                else{
                    calc.setN2(Double.parseDouble(num4.getText()) * (-1));
                }
                
                if(calc.getN2() != 0){
                    calc.setR((calc.dividir(calc.getN1(), calc.getN2())));
                    String ResStr = "" + calc.getR();
                    res2.setText(ResStr);
                }
                else{
                    res2.setText("Indefinido");
                }
                
                res2.setVisible(true);
                res.setText("Resultado:");
                res.setForeground(Color.black);
            }
            else{
                res.setText("ERRO: Campos de texto não podem conter letras, símbolos ou espaços em brancos");
                res.setForeground(Color.red);
                
                res2.setVisible(false);
            }
        });
        
        lim.addActionListener((ActionEvent e) -> {
            num3.setText("");
            num4.setText("");
            res.setText("Resultado:");
            res.setForeground(Color.black);
            res2.setText("");
            num3.requestFocus();
        });
        
        hab.addActionListener((ActionEvent e) -> {
            num3.setEnabled(true);
            num4.setEnabled(true);
            add.setEnabled(true);
            sub.setEnabled(true);
            mul.setEnabled(true);
            div.setEnabled(true);
            lim.setEnabled(true);
            res.setEnabled(true);
            res2.setEnabled(true);
            neg1.setEnabled(true);
            neg2.setEnabled(true);
        });
        
        des.addActionListener((ActionEvent e) -> {
            num3.setEnabled(false);
            num4.setEnabled(false);
            add.setEnabled(false);
            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            lim.setEnabled(false);
            res.setEnabled(false);
            res2.setEnabled(false);
            neg1.setEnabled(false);
            neg2.setEnabled(false);
        });
        
        ocu.addActionListener((ActionEvent e) -> {
            res.setVisible(false);
            res2.setVisible(false);
        });
        
        exi.addActionListener((ActionEvent e) -> {
            res.setVisible(true);
            res2.setVisible(true);
        });
        
        neg1.addActionListener((ActionEvent e) -> {            
            if("(+)".equals(neg3.getText())){
                neg3.setText("(-)");
            }
            else{
                neg3.setText("(+)");
            }
        });
        
        neg2.addActionListener((ActionEvent e) -> {            
            if("(+)".equals(neg4.getText())){
                neg4.setText("(-)");
            }
            else{
                neg4.setText("(+)");
            }
        });
        
        sai.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        //teclas de atalho
        add.setMnemonic(KeyEvent.VK_A);
        sub.setMnemonic(KeyEvent.VK_S);
        mul.setMnemonic(KeyEvent.VK_M);
        div.setMnemonic(KeyEvent.VK_D);
        lim.setMnemonic(KeyEvent.VK_L);
        

        
        tela.setBackground(new Color(230, 230, 240));
        setSize(900, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);   
    }
    
    public static void main(String[] args) {
        
        Principal inter = new Principal();
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static boolean isValid(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}