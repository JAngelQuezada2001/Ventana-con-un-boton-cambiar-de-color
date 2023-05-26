package javaapplication1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Interfaz extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JButton button = new JButton();
    public Interfaz(){
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(200,200));
        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentePanel();
        componenteBoton();

    }
    
    private void componentePanel(){
        this.getContentPane().add(panel);
        panel.setBackground(Color.red);
    }
    
    private void componenteBoton(){
        button.setBounds(200, 100, 250, 50);
        button.addActionListener(this);
        button.setText("boton");
        button.setFocusable(false);
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            panel.setBackground(Color.BLUE);
        }
    }
    
}
