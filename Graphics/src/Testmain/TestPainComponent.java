package Testmain;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Polygon;

public class TestPainComponent extends JFrame{
    public TestPainComponent(){
    add(new NewPanel());
    }
    public static void main(String[] args) {
        TestPainComponent frame= new TestPainComponent();
        frame.setTitle("TestPainComponent");
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

class NewPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(50, 20, 50, 50);    
    g.drawLine(75, 70, 75, 140);
    g.fillRect(70, 70, 10, 10);
    g.drawLine(75, 140, 100,150);
    g.fillRect(70, 135, 10, 10);
    g.fillRect(95, 145, 10, 10);
    g.drawLine(100, 150,85 , 190);
    g.fillRect(80, 185, 10, 10);
    g.drawLine(75, 140, 55,170);
    g.fillRect(50, 165, 10, 10);
    g.drawLine(55, 170, 35, 210);
    g.fillRect(30, 205, 10, 10);
    g.drawLine(75, 70, 95, 115);
    g.fillRect(90, 110, 10, 10);
    g.drawLine(95, 115, 45, 125);
    g.fillRect(40, 120, 10, 10);
    g.drawLine(75, 70, 35, 110);
    g.fillRect(30, 105, 10, 10);
    g.drawLine(35, 110, 15, 70);
    g.fillRect(10, 65, 10, 10);
    
        Polygon polygon= new Polygon();
        polygon.addPoint(40, 20);
        polygon.addPoint(70, 40);
        polygon.addPoint(60, 80);
        polygon.addPoint(45, 95);
        polygon.addPoint(20, 60);
        g.drawPolygon(polygon);
    }
}
