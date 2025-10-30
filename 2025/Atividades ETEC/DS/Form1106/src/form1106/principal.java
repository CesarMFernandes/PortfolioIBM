package form1106;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class principal extends JFrame{
    JMenuBar barra;
    JMenu operacoes, sobre, sair;
    JMenuItem som, sub, mul, div, sobrebtn, sairbtn, sobrepop, sairpop;
    JToolBar barra2;
    JPopupMenu opcoes;
    JButton somTool, subTool, mulTool, divTool, saiTool, pro;
    ImageIcon imagens[];
    JLabel chiyo, bub;
    JTextArea texto;
    public principal(){
        super("Menu de opções, barra de tarefas e popup");
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.WHITE);
        
        
        
        //declarando
        barra = new JMenuBar();
        
        operacoes = new JMenu("Operações");
        sobre = new JMenu("Sobre");
        sair = new JMenu("Sair");
        
        sobrebtn = new JMenuItem("Sobre");
        sairbtn = new JMenuItem("Sair");
        som = new JMenuItem("Somar");
        sub = new JMenuItem("Subtrair");
        mul = new JMenuItem("Multiplicar");
        div = new JMenuItem("Dividir");
        sobrepop = new JMenuItem("Sobre");
        sairpop = new JMenuItem("Sair");
        
        barra2 = new JToolBar("Barra de Ferramentas");
        
        opcoes = new JPopupMenu();
        
        imagens = new ImageIcon[7];
        
        texto = new JTextArea();
        
        String icones[] = {"plus.png", "subt.png", "mult.png", "divi.png", "exit.png", "chiyo.png", "bub.png"};
        
        String t[] = {"Olá, meu nome é Chiyo Mihama, mas \nvocê pode me chamar de Chiyo-Chan! \nVou te dar algumas dicas de como \n navegar aqui.", 
                      "Os botões em azul têm teclas de \natalho. Coloque o mouse em cima deles \npara saber quais são. Ah, e também \nvocê pode usar o botão direito para \nabrir um popup",
                      "Ok, isso é tudo. Espero ter ajudado!"};
        
        for(int i = 0; i < 7; i++){
            imagens[i] = new ImageIcon(principal.class.getResource(icones[i]));
        }
        
        somTool = new JButton(imagens[0]);
        subTool = new JButton(imagens[1]);
        mulTool = new JButton(imagens[2]);
        divTool = new JButton(imagens[3]);
        saiTool = new JButton(imagens[4]);
        pro = new JButton("Próximo");
        
        chiyo = new JLabel(imagens[5]);
        bub = new JLabel(imagens[6]);
        
        //tamanho e posição
        barra2.setBounds(1, 1, 100, 600);
        chiyo.setBounds(0, 0, 900, 600);
        bub.setBounds(525, 250, 300, 125);
        texto.setBounds(575, 260, 245, 105);
        
        pro.setBounds(575, 200, 240, 30);
        
        //formatação
        texto.setFont(new Font("Times New Roman", Font.BOLD, 14));
        
        pro.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        //outro
        barra2.setRollover(true);       
        
        barra2.setOrientation(SwingConstants.VERTICAL);
        
        somTool.setBackground(new Color(0, 150, 255));
        subTool.setBackground(new Color(0, 150, 255));
        mulTool.setBackground(new Color(0, 150, 255));
        divTool.setBackground(new Color(0, 150, 255));
        saiTool.setBackground(new Color(0, 150, 255));
        sobrebtn.setBackground(new Color(0, 150, 255));
        
        somTool.setToolTipText("Somar (Alt + A)");
        subTool.setToolTipText("Subtrair (Alt + S)");
        mulTool.setToolTipText("Multiplicar (Alt + M)");
        divTool.setToolTipText("Dividir (Alt + D)");
        saiTool.setToolTipText("Sair (Alt + E)");
        sobre.setToolTipText("Alt + I");
        sobrebtn.setToolTipText("Alt + I");
        
        somTool.setMnemonic(KeyEvent.VK_A);
        subTool.setMnemonic(KeyEvent.VK_S);
        mulTool.setMnemonic(KeyEvent.VK_M);
        divTool.setMnemonic(KeyEvent.VK_D);
        saiTool.setMnemonic(KeyEvent.VK_E);
        sobre.setMnemonic(KeyEvent.VK_I);
        sobrebtn.setMnemonic(KeyEvent.VK_I);
        
        chiyo.setHorizontalAlignment(JTextField.CENTER);
        chiyo.setVerticalAlignment(JTextField.CENTER);
        
        texto.setBorder(null);
        
        texto.setEditable(false);
        texto.setText(t[0]);
        texto.setBackground(Color.WHITE);
        texto.setForeground(Color.BLACK);
        
        //adicionando
        setJMenuBar(barra);
        
        barra.add(operacoes);
        barra.add(sobre);
        barra.add(sair);
        
        sobre.add(sobrebtn);
        
        sair.add(sairbtn);
        
        operacoes.add(som);
        operacoes.add(sub);
        operacoes.add(mul);
        operacoes.add(div);
        
        barra2.add(somTool);
        barra2.add(subTool);
        barra2.add(mulTool);
        barra2.add(divTool);
        barra2.addSeparator();
        barra2.add(saiTool);
        
        tela.add(barra2);
        
        opcoes.add(sobrepop);
        opcoes.addSeparator();
        opcoes.add(sairpop);
        
        tela.add(chiyo);
        tela.add(bub);
        tela.add(texto);
        tela.add(pro);
        
        //ações
        som.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Adição", true, 1);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Subtração", true, 2);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Multiplicação", true, 3);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Divisão", true, 4);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        sobrebtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sobreInter sInt = new sobreInter(null, "Sobre o programa", true);
                sInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                sInt.setVisible(true);
            }
        });
        
        sairbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menuSair();
            }
        });
        
        tela.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger())
                opcoes.show(e.getComponent(),e.getX(),e.getY()); 
            }
        });
        
        sobrepop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sobreInter sInt = new sobreInter(null, "Sobre o programa", true);
                sInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                sInt.setVisible(true);
            }
        });
        
        sairpop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menuSair();
            }
        });
        
        somTool.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Adição", true, 1);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        subTool.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Subtração", true, 2);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        mulTool.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Multiplicação", true, 3);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        divTool.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcInter cInt = new calcInter(null, "Divisão", true, 4);
                cInt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cInt.setVisible(true);
            }
        });
        
        saiTool.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menuSair();
            }
        });
        pro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(texto.getText().equals(t[0])){
                    texto.setText(t[1]);
                }
                else if(texto.getText().equals(t[1])){
                    texto.setText(t[2]);
                }
                else if(texto.getText().equals(t[2])){
                    pro.setVisible(false);
                    texto.setVisible(false);
                    bub.setVisible(false);
                    chiyo.setVisible(false);
                }
            }
        });
        
        
        
        setSize(900, 600);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    private class calcInter extends JDialog{
    Calculadora calc = new Calculadora();
    JLabel tit, lb1, lb2, lb3, res;
    JTextField num1, num2;
    JButton cal, lim;
    public calcInter(Frame owner, String title, boolean modal, int ope){
        super(owner, title, modal);
        Container tela = getContentPane();
        setLayout(null);
        
        
        
        //declarando
        tit = new JLabel("Calculadora - "+title);
        lb1 = new JLabel("Número 1:");
        lb2 = new JLabel("Número 2:");
        lb3 = new JLabel("Resultado: ");
        res = new JLabel();
        
        num1 = new JTextField();
        num2 = new JTextField();
        
        cal = new JButton("Calcular");
        lim = new JButton("Limpar");
        
        //Tamanho e posição
        tit.setBounds(0, 25, 500, 30);
        lb1.setBounds(25, 75, 75, 30);
        lb2.setBounds(25, 125, 75, 30);
        lb3.setBounds(25, 210, 75, 30);
        res.setBounds(100, 210, 420, 30);
        num1.setBounds(110, 75, 300, 30);
        num2.setBounds(110, 125, 300, 30);
        cal.setBounds(25, 175, 100, 30);
        lim.setBounds(130, 175, 100, 30);
        
        //Formatação
        tit.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lb1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lb2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lb3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        res.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        num1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        num2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        cal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lim.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        
        //outro
        tit.setHorizontalAlignment(JTextField.CENTER);
        
        //adicionando
        tela.add(tit);
        tela.add(lb1);
        tela.add(lb2);
        tela.add(lb3);
        tela.add(res);
        
        tela.add(num1);
        tela.add(num2);
        
        tela.add(cal);
        tela.add(lim);
        
        //ações
        cal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    calc.setN1(Double.parseDouble(num1.getText()));
                    calc.setN2(Double.parseDouble(num2.getText()));
                    res.setForeground(Color.BLACK);
                    switch(ope){
                        case 1: res.setText(Double.toString(calc.somar(calc.getN1(), calc.getN2())));break;
                        case 2: res.setText(Double.toString(calc.subtrair(calc.getN1(), calc.getN2())));break;
                        case 3: res.setText(Double.toString(calc.multiplicar(calc.getN1(), calc.getN2())));break;
                        case 4: res.setText(Double.toString(calc.dividir(calc.getN1(), calc.getN2())));
                    }
                } catch(NumberFormatException erro){
                    res.setText("Erro: você não usou valores double válidos");
                    res.setForeground(Color.RED);
                }
            }
        });
        
        lim.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                num1.setText("");
                num2.setText("");
                res.setText("");
            }
        });
        
                
                
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
    }        
}
    
    private class sobreInter extends JDialog{
    JLabel tit, lb1, lb2, lb3;
    String nome, turma, data;
    public sobreInter(Frame owner, String title, boolean modal){
        super(owner, title, modal);
        Container tela = getContentPane();
        setLayout(null);
        
        
        
        //declarando
        nome = "Cesar Moreno Fernandes";
        turma = "2º AMS A";
        data = "26/06/2025";
        
        tit = new JLabel("Sobre o Projeto:");
        lb1 = new JLabel("Nome: "+nome);
        lb2 = new JLabel("Turma: "+turma);
        lb3 = new JLabel("Data de Entrega: "+data);
        
        //tamanho e posição
        tit.setBounds(0, 25, 500, 40);
        lb1.setBounds(25, 75, 475, 30);
        lb2.setBounds(25, 125, 475, 30);
        lb3.setBounds(25, 175, 475, 30);
        
        //formatação
        tit.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lb1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lb2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lb3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        //outro
        tit.setHorizontalAlignment(JTextField.CENTER);
        
        //adicionando
        tela.add(tit);
        tela.add(lb1);
        tela.add(lb2);
        tela.add(lb3);
        
        
        
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}

    
    static void menuSair(){
        int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar o programa?","Mensagem de saida",JOptionPane.YES_NO_OPTION);
        if (status == JOptionPane.YES_OPTION){
         System.exit(0);
        }
    }
}