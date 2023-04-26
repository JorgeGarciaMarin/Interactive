package KeyAndMouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExampleFrame extends JFrame implements KeyListener,MouseListener {
    JLabel label1;
    ImageIcon icon;

    KeyListenerExampleFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Working with Key and Mouse Listeners");
        this.setSize(700, 700);
        this.setLayout(null);
        setVisible(true);
        label1 = new JLabel();
        label1.setSize(100, 100);
        label1.setBounds(25,25,100,100);
        label1.setBackground(Color.BLUE);
        label1.setOpaque(true);
        add(label1);
        label1.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                label1.setBounds(e.getXOnScreen()-55,e.getYOnScreen()-80,100,100);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        label1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            label1.setBackground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label1.setBackground(Color.BLUE);

            }
        });
        this.addKeyListener(this) ;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x=label1.getX();
        int y=label1.getY();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            label1.setBounds(x+20,y,100,100);
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            label1.setBounds(x-20,y,100,100);
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            label1.setBounds(x,y-20,100,100);
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            label1.setBounds(x,y+20,100,100);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {
    label1.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new KeyListenerExampleFrame();
    }
}