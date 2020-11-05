import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public Calculator(){
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,240);
        Container content = getContentPane();
        JPanel upper_panel = new JPanel();
        TextField input1 = new TextField(8);
        TextField input2 = new TextField(8);
        upper_panel.add(input1);
        upper_panel.add(input2);
        TextField output = new TextField();
        output.setEditable(false);

        JPanel button_panel = new JPanel(new GridLayout(2, 2 , 5, 12));
        JButton plus_button = new JButton("+");
        plus_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.valueOf(input1.getText());
                Double b = Double.valueOf(input2.getText());
                output.setText(a + " + " + b + " = " + (a+b));
            }
        });
        button_panel.add(plus_button);

        JButton minus_button = new JButton("-");
        minus_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.valueOf(input1.getText());
                Double b = Double.valueOf(input2.getText());
                output.setText(a + " - " + b + " = " + (a-b));
            }
        });
        button_panel.add(minus_button);

        JButton multiplcation_button = new JButton("*");
        multiplcation_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.valueOf(input1.getText());
                Double b = Double.valueOf(input2.getText());
                output.setText(a + " * " + b + " = " + (a*b));
            }
        });
        button_panel.add(multiplcation_button);

        JButton divide_button = new JButton("/");
        divide_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.valueOf(input1.getText());
                Double b = Double.valueOf(input2.getText());
                output.setText(a + " / " + b + " = " + (a/b));
            }
        });
        button_panel.add(divide_button);

        JButton pow_button = new JButton("^");
        pow_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.valueOf(input1.getText());
                Double b = Double.valueOf(input2.getText());
                output.setText(a + " ^ " + b + " = " + Math.pow(a,b));
            }
        });
        button_panel.add(pow_button);

        content.add(button_panel, BorderLayout.CENTER);
        content.add(output, BorderLayout.SOUTH);
        content.add(upper_panel, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

