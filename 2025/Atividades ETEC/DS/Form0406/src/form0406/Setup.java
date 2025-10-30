package form0406;
import javax.swing.*;
public class Setup extends JFrame{
    String nomea, mata, cursoa, seriea, periodoa, resa; 
    public Setup(){
        super("setup");
        setSize(200, 200);
        Form0406 cad = new Form0406(nomea, mata, cursoa, seriea, periodoa, resa);
        cad.setVisible(true);
        cad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }        
    public static void main(String[] args) {
        Setup set = new Setup();
        set.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
