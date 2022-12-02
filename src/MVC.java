//simple MVC pattern code//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MVC extends JFrame implements ActionListener {
    private JTextField tfCount;
    private JButton btnCount;
    private int count = 0;

    public MVC() {
        tfCount = new JTextField("0", 10);
        tfCount.setEditable(false);
        btnCount = new JButton("Count");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Counter"));
        contentPane.add(tfCount);
        contentPane.add(btnCount);

        // set frame's attributes
        setContentPane(contentPane);
        pack();
        setTitle("MVC Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the application window

        // register event listener
        btnCount.addActionListener(this);
    }

    public static void main(String[] args) {
        // Run GUI codes in Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MVC().setVisible(true);
            }
        });
    }

    // ActionEvent handler - Called back upon button-click.
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;
        tfCount.setText(count + "");
    }
}
