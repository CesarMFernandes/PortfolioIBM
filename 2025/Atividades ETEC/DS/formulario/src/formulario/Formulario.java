package formulario;
public class Formulario {
    private String nome;
    private int idade;
    private String sexo;
    private String interesses;
    private String EstadoCivil;
    
    public Formulario(){
        this("", 0, "", "", "");
    }
    
    public Formulario(String nome, int idade, String sexo, String interesses, String EstadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.interesses = interesses;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }   
}