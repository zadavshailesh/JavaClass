import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mouse extends JFrame {
    JButton b1;
    JTextField t1;
    public void setMouse(){
        b1=new JButton("Click Me");
        t1=new JTextField(40);

        add(b1);
        add(t1);

        b1.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                t1.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                t1.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                t1.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                t1.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                t1.setText("Mouse Exited");
            }
        });

        //setting component of window
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class MouseEvent {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        m1.setMouse();
    }

}
