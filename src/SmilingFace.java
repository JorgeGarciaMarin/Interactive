import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SmilingFace extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW); // set color to yellow for face
        g.fillOval(100, 100, 200, 200); // draw face
        g.setColor(Color.MAGENTA); // set color to black for eyes and mouth
        g.fillOval(150, 150, 20, 20); // draw left eye
        g.fillOval(230, 150, 20, 20); // draw right eye
        g.drawArc(150, 210, 100, 60, 180,-180); // draw smile
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        SmilingFace panel = new SmilingFace();
        frame.add(panel);
        frame.setVisible(true);
    }
}
