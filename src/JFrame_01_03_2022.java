import javax.swing.*;
import java.awt.*;

public class JFrame_01_03_2022 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setContentPane(new DrawPane());
    }
}
class DrawPane extends JPanel
{

    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
    g.fillRect(50,50,20,20);

}
}