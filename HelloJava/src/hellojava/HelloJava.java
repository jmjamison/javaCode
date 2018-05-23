/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author jamie
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello Java!");
        JFrame frame = new JFrame("Hello Java!");
        //JLabel label = new JLabel("Hello Java!", JLabel.CENTER);
        frame.add(new HelloComponent());
        //frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }
    
}
