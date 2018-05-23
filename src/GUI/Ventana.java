/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    
    private int WIDTH=300, HEIGHT=300;
    private int widthTF=120, heightTF=30;
    private int widthBT=80, heightBT=30;
    JButton btn;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JTextField textfield1, textfield2;
    
    public Ventana(){
        btn = new JButton("sumar");
        btn.setBounds(10, 100, widthBT, heightBT);
        btn2 = new JButton("restar");
        btn2.setBounds(120, 100, widthBT, heightBT);
        btn3 = new JButton("multiplicar");
        btn3.setBounds(10, 200, widthBT, heightBT);
        btn4 = new JButton("dividir");
        btn4.setBounds(120, 200, widthBT, heightBT);
        
        textfield1= new JTextField();
        textfield2= new JTextField();
        textfield1.setBounds(100, 200, widthTF, heightTF);
        textfield2.setBounds(100, 40, widthTF, heightTF);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(textfield1.getText());
            }
        });
        
        textfield1.setEditable(true);
        textfield2.setEnabled(false);
        
        add(btn);
        add(textfield1);
        add(textfield2);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        
        
    }
    
    
}
