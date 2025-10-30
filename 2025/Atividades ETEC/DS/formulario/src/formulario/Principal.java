package formulario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends JFrame{
    Formulario form = new Formulario();
    JLabel tit, lb1, lb2, lb3, lb4, lb5, rot, erroN, erroI, erroS, erroIn, nome2, idade2, sexo2, inter2, estado2;
    JTextField nome, idade;
    JButton lim, env, sair;
    JRadioButton masc, fem;
    ButtonGroup sexo;
    JCheckBox auto, barco, aviao;
    JComboBox lista;
    String[] estado = {"Solteiro(a)", "Casado(a)", "Namorando", "Viuvo(a)"};
    public Principal(){
        super("Formulário");
        Container tela = getContentPane();
        setLayout(null);
        
        
        
        //Declarando
        tit = new JLabel("Formulário");
        lb1 = new JLabel("Nome:");
        lb2 = new JLabel("Idade:");
        lb3 = new JLabel("Sexo:");
        lb4 = new JLabel("Interesses:");
        lb5 = new JLabel("Estado Civil:");
        rot = new JLabel("Cesar Moreno Fernandes - 2º AMS");
        erroN = new JLabel("Campo vazio ou inválido. Insira apenas letras e espaços. Insira menos que 70 caracteres");
        erroI = new JLabel("Campo vazio ou inválido. Insira um valor menor que 150");
        erroS = new JLabel("Selecione um dos campos");
        erroIn = new JLabel("Selecione pelo menos um dos campos");
        
        nome = new JTextField();
        idade = new JTextField();
        
        masc = new JRadioButton("Masculino");
        fem = new JRadioButton("Feminino");
        
        auto = new JCheckBox("Automóveis");
        barco = new JCheckBox("Barcos");
        aviao = new JCheckBox("Aviões");
        
        lista = new JComboBox(estado);
        
        env = new JButton("Enviar");
        lim = new JButton("Limpar");
        
        //Posição e Tamanho
        tit.setBounds(0, 30, 600, 50);
        lb1.setBounds(30, 150, 600, 30);
        lb2.setBounds(30, 200, 600, 30);
        lb3.setBounds(30, 300, 600, 30);
        lb4.setBounds(30, 400, 600, 30);
        lb5.setBounds(30, 575, 600, 30);
        rot.setBounds(300, 820, 600, 30);
        erroN.setBounds(105, 170, 500, 30);
        erroI.setBounds(105, 220, 500, 30);
        erroS.setBounds(125, 330, 500, 30);
        erroIn.setBounds(50, 495, 500, 30);
        
        nome.setBounds(105, 150, 450, 30);
        idade.setBounds(105, 200, 30, 30);
        
        masc.setBounds(125, 300, 150, 30);
        fem.setBounds(275, 300, 150, 30);
        
        auto.setBounds(50, 435, 600, 20);
        barco.setBounds(50, 455, 600, 20);
        aviao.setBounds(50, 475, 600, 20);
        
        lista.setBounds(175, 575, 200, 30);
        
        env.setBounds(30, 720, 200, 60);
        lim.setBounds(240, 720, 200, 60);
        
        //Centralizando
        tit.setHorizontalAlignment(JTextField.CENTER);
        
        //Formatando
        tit.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        lb1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lb2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lb3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lb4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lb5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        rot.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        erroN.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        erroI.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        erroS.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        erroIn.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        
        nome.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        idade.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        masc.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        fem.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        
        auto.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        barco.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        aviao.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        lista.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        
        env.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        lim.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        //Cor
        lista.setBackground(Color.WHITE);
        erroN.setForeground(Color.RED);
        erroI.setForeground(Color.RED);
        erroS.setForeground(Color.RED);
        erroIn.setForeground(Color.RED);
        
        //Outro
        erroN.setVisible(false);
        erroI.setVisible(false);
        erroS.setVisible(false);
        erroIn.setVisible(false);
        
        nome.requestFocus();
        
        sexo = new ButtonGroup();
        sexo.add(masc);
        sexo.add(fem);
        
        env.setToolTipText("Alt + E");
        lim.setToolTipText("Alt + L");
        
        //Adicionando
        tela.add(tit);
        tela.add(lb1);
        tela.add(lb2);
        tela.add(lb3);
        tela.add(lb4);
        tela.add(lb5);
        tela.add(rot);
        tela.add(erroN);
        tela.add(erroI);
        tela.add(erroS);
        tela.add(erroIn);
        
        tela.add(nome);
        tela.add(idade);
        
        tela.add(masc);
        tela.add(fem);
        
        tela.add(auto);
        tela.add(barco);
        tela.add(aviao);
        
        tela.add(lista);
        
        tela.add(env);
        tela.add(lim);
        
        //Botão - Função
        env.addActionListener((ActionEvent e) -> {
            erroN.setVisible(false);
            erroI.setVisible(false);
            erroS.setVisible(false);
            erroIn.setVisible(false);
            if(isValidName(nome.getText()) && isValidAge(idade.getText()) && (masc.isSelected() || fem.isSelected()) && (auto.isSelected() || barco.isSelected() || aviao.isSelected())){
                form.setNome(nome.getText());
                form.setIdade(Integer.parseInt(idade.getText()));
                if(masc.isSelected()){
                    form.setSexo("mas");
                }
                if(fem.isSelected()){
                    form.setSexo("fem");
                }
                if(auto.isSelected()){
                    if(barco.isSelected()){
                        if(aviao.isSelected()){
                            form.setInteresses("automóveis, barcos e aviões");
                        }
                        else{
                            form.setInteresses("automóveis e barcos");
                        }
                    }
                    else if(aviao.isSelected()){
                        form.setInteresses("automóveis e aviões");
                    }
                    else{
                        form.setInteresses("automóveis");
                    }
                }
                else if(barco.isSelected()){
                    if(aviao.isSelected()){
                        form.setInteresses("barcos e aviões");
                    }
                    else{
                        form.setInteresses("barcos");
                    }
                }
                else{
                    form.setInteresses("aviões");
                }
                form.setEstadoCivil(estado[lista.getSelectedIndex()]);
                
                lb1.setVisible(false);
                lb2.setVisible(false);
                lb3.setVisible(false);
                lb4.setVisible(false);
                lb5.setVisible(false);
                
                nome.setVisible(false);
                idade.setVisible(false);
                
                masc.setVisible(false);
                fem.setVisible(false);
                
                auto.setVisible(false);
                barco.setVisible(false);
                aviao.setVisible(false);
                
                lista.setVisible(false);
                
                env.setVisible(false);
                lim.setVisible(false);
                
                String se;
                if("mas".equals(form.getNome())){
                    se = "masculino";
                }
                else{
                    se = "feminino";
                }
                
                nome2 = new JLabel("Nome: "+form.getNome());
                idade2 = new JLabel("Idade: "+form.getIdade()+" anos");
                sexo2 = new JLabel("Sexo: "+se);
                inter2 = new JLabel("Interesses: "+form.getInteresses());
                estado2 = new JLabel("Estado Civil: "+form.getEstadoCivil());
                
                nome2.setBounds(30, 150, 540, 30);
                idade2.setBounds(30, 180, 540, 30);
                sexo2.setBounds(30, 210, 540, 30);
                inter2.setBounds(30, 240, 540, 30);
                estado2.setBounds(30, 270, 540, 30);
                
                nome2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                idade2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                sexo2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                inter2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                estado2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                
                tela.add(nome2);
                tela.add(idade2);
                tela.add(sexo2);
                tela.add(inter2);
                tela.add(estado2);
                
                
                sair = new JButton("Sair");
                sair.setBounds(30, 720, 200, 60);
                sair.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
                sair.setToolTipText("Alt + S");
                tela.add(sair);
                sair.addActionListener((ActionEvent f) -> {
                    System.exit(0);
                });
                sair.setMnemonic(KeyEvent.VK_S);
            }
            else{
                if(isValidName(nome.getText()) == false){
                    erroN.setVisible(true);
                }
                if(isValidAge(idade.getText()) == false){
                    erroI.setVisible(true);
                }
                if(masc.isSelected() == false && fem.isSelected() == false){
                    erroS.setVisible(true);
                }
                if(auto.isSelected() == false && barco.isSelected() == false && aviao.isSelected() == false){
                    erroIn.setVisible(true);
                }
            }
        });
        lim.addActionListener((ActionEvent e) -> {
            nome.setText("");
            idade.setText("");
            sexo.clearSelection();
            auto.setSelected(false);
            barco.setSelected(false);
            aviao.setSelected(false);
            lista.setSelectedIndex(0);
            
            erroN.setVisible(false);
            erroI.setVisible(false);
            erroS.setVisible(false);
            erroIn.setVisible(false);
        });
        
        //Teclas de atalho
        env.setMnemonic(KeyEvent.VK_E);
        lim.setMnemonic(KeyEvent.VK_L);
        
        
        
        setSize(600, 900);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Principal inter = new Principal();
        inter.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
    public static boolean isValidAge(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return Double.parseDouble(str) <= 150;
    }
}