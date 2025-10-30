package form0406;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class Form0406 extends JFrame{
    JLabel tit, lb1, lb2, lb3, lb4, rot, req1, req2, req3, err1, err2;
    JTextField nome;
    JFormattedTextField matricula;
    MaskFormatter mascara;
    JRadioButton Etim, Mtec, Tec, Pri, Seg, Ter;
    ButtonGroup curso, serie;
    JList periodos;
    JScrollPane scroll, scrollr;
    JTextArea res;
    JButton apr, lim, sai;
    
    String[] periodo = {"Matutino", "Vespertino", "Noturno", "Integral"};
    Font label = new Font("Times New Roman", Font.PLAIN, 20);
    Font text = new Font("Times New Roman", Font.PLAIN, 15);
    Font btn = new Font("Times New Roman", Font.BOLD, 20);
    public Form0406(String nomeb, String matb, String cursob, String serieb, String perb, String resb){
        super("Dados do Aluno");
        Container tela = getContentPane();
        setLayout(null);
        
        
        
        //Decladando
        tit = new JLabel("Dados Cadastrais do Aluno");
        lb1 = new JLabel("Nome::");
        lb2 = new JLabel("Matrícula::");
        lb3 = new JLabel("Informe os dados do seu curso::");
        lb4 = new JLabel("Restrições Médicas::");
        rot = new JLabel("Cesar Moreno Fernandes - 2º AMS");
        req1 = new JLabel("*");
        req2 = new JLabel("*");
        req3 = new JLabel("*");
        err1 = new JLabel("Preencha todos os campos ");
        err2= new JLabel("requiridos(*) corretamente");
        
        nome = new JTextField();
        
        try{
            mascara = new MaskFormatter("######");
        } 
        catch(ParseException excp){}
        matricula = new JFormattedTextField(mascara);
        
        Etim = new JRadioButton("Etim");
        Mtec = new JRadioButton("Mtec");
        Tec = new JRadioButton("Técnico");
        Pri = new JRadioButton("1ª Série");
        Seg = new JRadioButton("2ª Série");
        Ter = new JRadioButton("3ª Série");
        
        curso = new ButtonGroup();
        serie = new ButtonGroup();
        
        periodos = new JList(periodo);
        
        res = new JTextArea();
        
        scroll = new JScrollPane(periodos);
        scrollr = new JScrollPane(res);  
        
        apr = new JButton("Apresentar Dados");
        lim = new JButton("Limpar");
        sai = new JButton("Sair");
                
        //Posição e Tamanho
        tit.setBounds(0, 30, 800, 35);
        lb1.setBounds(50, 150, 100, 30);
        lb2.setBounds(50, 200, 100, 30);
        lb3.setBounds(50, 275, 255, 30);
        lb4.setBounds(50, 450, 200, 30);
        rot.setBounds(50, 720, 300, 20);
        req1.setBounds(670, 150, 10, 30);
        req2.setBounds(270, 200, 10, 30);
        req3.setBounds(315, 275, 10, 30);
        err1.setBounds(500, 440, 190, 20);
        err2.setBounds(500, 460, 190, 20);
        
        nome.setBounds(160, 150, 500, 30);
        matricula.setBounds(160, 200, 100, 30);
        
        Etim.setBounds(60, 325, 75, 20);
        Mtec.setBounds(60, 350, 75, 20);
        Tec.setBounds(60, 375, 75, 20);
        Pri.setBounds(300, 325, 75, 20);
        Seg.setBounds(300, 350, 75, 20);
        Ter.setBounds(300, 375, 75, 20);
        
        scroll.setBounds(450, 325, 150, 55);
        scrollr.setBounds(50, 480, 350, 200); 
        
        apr.setBounds(500, 480, 190, 60);
        lim.setBounds(590, 550, 100, 60);
        sai.setBounds(610, 620, 80, 60);
        
        //Formatação
        tit.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lb1.setFont(label);
        lb2.setFont(label);
        lb3.setFont(label);
        lb4.setFont(label);
        rot.setFont(label);
        req1.setFont(label);
        req2.setFont(label);
        req3.setFont(label);
        err1.setFont(text);
        err2.setFont(text);
        
        nome.setFont(text);
        matricula.setFont(text);
        
        Etim.setFont(text);
        Mtec.setFont(text);
        Tec.setFont(text);
        Pri.setFont(text);
        Seg.setFont(text);
        Ter.setFont(text);
        
        periodos.setFont(text);
        
        res.setFont(label);
        
        apr.setFont(btn);
        lim.setFont(btn);
        sai.setFont(btn);
        
        //Centralizando
        tit.setHorizontalAlignment(JTextField.CENTER);
        
        //Cor
        periodos.setBackground(Color.WHITE);
        req1.setForeground(new Color(220, 10, 0));
        req2.setForeground(new Color(220, 10, 0));
        req3.setForeground(new Color(220, 10, 0));
        err1.setForeground(new Color(220, 10, 0));
        err2.setForeground(new Color(220, 10, 0));
        
        //Outro
        mascara.setPlaceholderCharacter('*');
        
        matricula.setText("");
        
        periodos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        res.setLineWrap(true);
        res.setWrapStyleWord(true);
        
        scrollr.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollr.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        err1.setVisible(false);
        err2.setVisible(false);
        
        nome.setText(nomeb);
        matricula.setText(matb);
        if(null != cursob)switch (cursob) {
            case "Etim":
                Etim.setSelected(true);
                break;
            case "Mtec":
                Mtec.setSelected(true);
                break;
            case "Técnico":
                Tec.setSelected(true);
                break;
            default:
                break;
        }
        if(null != serieb)switch (serieb) {
            case "1ª Série":
                Pri.setSelected(true);
                break;
            case "2ª Série":
                Seg.setSelected(true);
                break;
            case "3ª Série":
                Ter.setSelected(true);
                break;
            default:
                break;
        }
        if(null != perb)switch (perb) {
            case "Matutino":
                periodos.setSelectedIndex(0);
                break;
            case "Vespertino":
                periodos.setSelectedIndex(1);
                break;
            case "Noturno":
                periodos.setSelectedIndex(2);
                break;
            case "Integral":
                periodos.setSelectedIndex(3);
                break;
            default:
                break;
        }
        res.setText(resb);
        
        apr.setMnemonic(KeyEvent.VK_A);
        lim.setMnemonic(KeyEvent.VK_L);
        sai.setMnemonic(KeyEvent.VK_S);
        
        apr.setToolTipText("Alt + A");
        lim.setToolTipText("Alt + L");
        sai.setToolTipText("Alt + S");
        
        //Adicionando
        tela.add(tit);
        tela.add(lb1);
        tela.add(lb2);
        tela.add(lb3);
        tela.add(lb4);
        tela.add(rot);
        tela.add(req1);
        tela.add(req2);
        tela.add(req3);
        tela.add(err1);
        tela.add(err2);
        
        tela.add(nome);
        tela.add(matricula);
        
        tela.add(Etim);
        tela.add(Mtec);
        tela.add(Tec);
        tela.add(Pri);
        tela.add(Seg);
        tela.add(Ter);
        
        curso.add(Etim);
        curso.add(Mtec);
        curso.add(Tec);
        
        serie.add(Pri);
        serie.add(Seg);
        serie.add(Ter);
        
        tela.add(scroll);        
        tela.add(scrollr);
        
        tela.add(apr);
        tela.add(lim);
        tela.add(sai);
        
        //Ações
        apr.addActionListener((ActionEvent a) -> {
            if(isValidName(nome.getText()) && isValidMat(matricula.getText()) && (Etim.isSelected() || Mtec.isSelected() || Tec.isSelected()) && (Pri.isSelected() || Seg.isSelected() || Ter.isSelected()) && periodos.getSelectedValue() != null){
                String nomee, mate, cursoe, seriee, pere, rese;
                
                err1.setVisible(false);
                err2.setVisible(false);
                nomee = nome.getText();
                mate = matricula.getText();
                if(Etim.isSelected()){
                    cursoe = Etim.getText();
                }
                else if(Mtec.isSelected()){
                    cursoe = Mtec.getText();
                }
                else{
                    cursoe = Tec.getText();
                }
                if(Pri.isSelected()){
                    seriee = Pri.getText();
                }
                else if(Seg.isSelected()){
                    seriee = Seg.getText();
                }
                else{
                    seriee = Ter.getText();
                }
                pere = periodos.getSelectedValue().toString();
                rese = res.getText();
                FormMostrar mostra = new FormMostrar(nomee, mate, cursoe, seriee, pere, rese);
                mostra.setVisible(true);
                mostra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            else{
                err1.setVisible(true);
                err2.setVisible(true);
            }
        });
        
        lim.addActionListener((ActionEvent l) -> {
            nome.setText("");
            matricula.setText("");
            curso.clearSelection();
            serie.clearSelection();
            periodos.clearSelection();
            res.setText("");
            err1.setVisible(false);
            err2.setVisible(false);
        });
        
        sai.addActionListener((ActionEvent s) -> {
            System.exit(0);
        });
        
        
        
        setSize(800, 800);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public static boolean isValidName(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() > 70) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isValidMat(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return str.length() == 6;
    }
}
