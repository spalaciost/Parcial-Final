package graphics;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener {
    private Timer timer;
    private int x,y;

    public Board() {
        this.x=10;
        this.y=10;
    timer= new Timer(100, this);
    timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        this.x+=5;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(this.x, this.y, 50, 50);    
    
    }
}
