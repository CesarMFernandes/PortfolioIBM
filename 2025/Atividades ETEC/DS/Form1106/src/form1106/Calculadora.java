package form1106;
public class Calculadora {
    private double n1;
    private double n2;
    private double r;
    private int op;
    public Calculadora(){
        this(0, 0, 0, 0);
    }

    public Calculadora(double n1, double n2, double r, int op) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
        this.op = op;
    }
    
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public int getOp() {
        return op;
    }
    public void setOp(int op) {
        this.op = op;
    }
    
    public double somar(double a, double b){
        this.setN1(a);
        this.setN2(b);
        this.setR(this.getN1() + this.getN2());
        
        return this.getR();
    }
    public double subtrair(double a, double b){
        this.setN1(a);
        this.setN2(b);
        this.setR(this.getN1() - this.getN2());
        
        return this.getR();
    }
    public double multiplicar(double a, double b){
        this.setN1(a);
        this.setN2(b);  
        this.setR(this.getN1() * this.getN2());
        
        return this.getR();
    }
    public double dividir(double a, double b){
        this.setN1(a);
        this.setN2(b);
        this.setR(this.getN1() / this.getN2());
        
        return this.getR();
    }
}