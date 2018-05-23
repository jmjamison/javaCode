/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jamie
 */
class HelloComponent extends JComponent implements MouseMotionListner {
    public void paintComponent (Graphics g)
    {
        g.drawString("Hello Java!", 125, 95);
    }
    
}
