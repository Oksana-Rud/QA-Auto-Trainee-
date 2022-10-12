package Task2.InterfaceSolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Interface implements ActionListener {
    String expectedName = "Вячеслав";
    private final JButton button;
    private final JTextField input;
    private final JTextField output;

    public Interface() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        button = new JButton("Ввод");
        button.addActionListener(this);
        JLabel inputLabel = new JLabel("Введите имя");
        JLabel outputLabel = new JLabel("Результат:");
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
        frame.setTitle("task 2");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static String checkTheName(String name, String expectedName) {
        String outputText = "";
        if (!name.matches("^[a-яA-Я]*$") || name.matches("^[a-zA-Z]*$") )
            throw new IllegalArgumentException("Not a Cyrillic symbols");
        if (Objects.equals(name, expectedName)) {
            outputText = "Привет, " + expectedName;
        } else {
            outputText = "Нет такого имени";
        }
        return outputText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Interface.this.button) {
            try {
                Interface.this.output.setText(Interface.checkTheName(Interface.this.input.getText(), expectedName));
            } catch (Exception ex) {
                Interface.this.output.setText("Введите имя правильно.");
            }
            Interface.this.input.setText("");
        }
    }
}
