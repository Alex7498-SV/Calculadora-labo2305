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
    
    private int WIDTH=420, HEIGHT=200;
    private int widthTF=120, heightTF=30;
    private int widthBT=50, heightBT=50;
    JButton btn;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JTextField textfield1, textfield2;
    
    public Ventana(){
        btn = new JButton("+");
        btn.setBounds(10, 100, widthBT, heightBT);
        
        btn1 = new JButton("-");
        btn1.setBounds(100, 100, widthBT, heightBT);
        
        btn2 = new JButton("x");
        btn2.setBounds(190, 100, widthBT, heightBT);
        
        btn3 = new JButton("/");
        btn3.setBounds(330, 100, widthBT, heightBT);
        
        textfield1= new JTextField();
        textfield2= new JTextField();
        textfield1.setBounds(150, 40, widthTF, heightTF);
        textfield2.setBounds(150, 150, widthTF, heightTF);
        textfield2.setText("hola");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield1.getText();
                textfield2.setText(textfield1.getText());
            }
        });
         
        textfield1.setEditable(true);
        textfield2.setEnabled(false);
        
        add(btn);
        add(btn1);
        add(btn2);
        add(btn3);
        add(textfield1);
        add(textfield2);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        
        
    }
    
    
}
