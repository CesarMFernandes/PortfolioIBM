package pessoa;
import javax.swing.JOptionPane;
public class Pessoa {
    private String nome;
    private String endereco;
    private double salario;
    private String telefone;
    private String email;
    public Pessoa(){
        this("","",0,"","");
    }
    public Pessoa(String nome, String endereco, double salario, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void inserirDadosPessoa(){
        setNome(JOptionPane.showInputDialog("Insira nome"));
        setEndereco(JOptionPane.showInputDialog("Insira endereço"));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira salario")));
        setTelefone(JOptionPane.showInputDialog("Insira telefone"));
        setEmail(JOptionPane.showInputDialog("Insira email"));
    }
    public void apresentarPessoa(){
        JOptionPane.showMessageDialog(null, "Oi, meu nome é "+this.getNome()+"\nMeu endereço é "+this.getEndereco()+"\nMeu salario é "+this.getSalario()+"\nMeu telefone é "+this.getTelefone()+"\nMeu email é "+this.getEmail());
    }
}    
        