package Task3.InterfaceSolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Interface implements ActionListener {
    private final JButton button;
    private final JTextField input;
    private final JTextField output;

    public Interface() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        button = new JButton("Check");
        button.addActionListener(this);
        JLabel inputLabel = new JLabel("Введите массив чисел через запятую");
        JLabel outputLabel = new JLabel("Числа, кратные 3");
        input = new JTextField();
        output = new JTextField();

        input.setPreferredSize(new Dimension(300, 30));

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(inputLabel);
        panel.add(input);
        panel.add(button);
        panel.add(outputLabel);
        panel.add(output);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("task 3");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static int[] getArrayFromInput(JTextField input) {
        String inputValue = input.getText().replaceAll("\\s", "");
        String[] inputToStr = inputValue.split(",");
        int[] intElem = new int[inputToStr.length];
        for (int i = 0; i < inputToStr.length; i++) {
            try {
                intElem[i] = Integer.parseInt(inputToStr[i]);
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            }
        }
        return intElem;
    }
    public static List<Integer> outputArray(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int element : array) {
            if (element % 3 == 0) {
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            List<Integer> list = outputArray(getArrayFromInput(input));
            output.setText(list.toString());
        }
    }
}
