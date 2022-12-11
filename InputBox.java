import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InputBox extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;

    public void Add(){
        l1= new JLabel("Enter First Number:");
        l2= new JLabel("Enter Second Number:");
        l3= new JLabel("Result");

        t1= new JTextField(50);
        t2= new JTextField(50);
        t3=new JTextField(50);

        b1= new JButton("Submit");


        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(b1);
        b1.addActionListener(this);

        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x=Integer.parseInt(t1.getText());
        int y=Integer.parseInt(t2.getText());
        int sum=x+y;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        InputBox i = new InputBox();
        i.Add();
    }
}
