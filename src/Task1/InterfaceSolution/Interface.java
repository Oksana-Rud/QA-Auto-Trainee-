package Task1.InterfaceSolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface implements ActionListener {
    private final JButton button;
    private final JTextField input;
    private final JTextField output;

    public Interface() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        button = new JButton("Result");
        button.addActionListener(this);
        JLabel inputLabel = new JLabel("Введите число");
        JLabel outputLabel = new JLabel("Результат выполнения");
        input = new JTextField();
        output = new JTextField();

        input.setPreferredSize(new Dimension(300, 20));

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(inputLabel);
        panel.add(input);
        panel.add(button);
        panel.add(outputLabel);
        panel.add(output);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("task 1");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public static String checkTheNumber(int num) {
        String outputText = "";
        if (num > 7) {
            outputText = "Привет";
        } else if (num <= 7) {
            outputText = "Число должно быть больше 7.";
        }
        return outputText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Interface.this.button) {
            try {
                Interface.this.output.setText(Interface.checkTheNumber(Integer.parseInt(Interface.this.input.getText())));
            } catch (Exception ex) {
                Interface.this.output.setText("Неверный символ. Введите число.");
            }
            Interface.this.input.setText("");
        }
    }
}
