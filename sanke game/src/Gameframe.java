import javax.swing.JFrame;

public class Gameframe extends JFrame{
    Gameframe(){
        new Gamepanel();
       this.add(new Gamepanel());
       this.setTitle("Sanke");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false); 
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);


    }

}
