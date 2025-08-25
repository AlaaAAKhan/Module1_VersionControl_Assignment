import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
        public Main() {
            super();
            init();
        }

        private void init () {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new JFrame("Calculator");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField num1Field = (new JTextField());
            JTextField num2Field = (new JTextField());

            JComboBox operationsCombo = new JComboBox(new String[]{"Add", "Subtract", "Multiply", "Divide"});

            JButton calcButton = new JButton("Calculate");
            JLabel resultsLabel = new JLabel("Result: ");

            frame.setLayout(new GridLayout(5, 2));
            frame.add(new JLabel("First number: "));
            frame.add(num1Field);
            frame.add(new JLabel("Second number: "));
            frame.add(num2Field);
            frame.add(operationsCombo);
            frame.add(calcButton);
            frame.add(resultsLabel);


            calcButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent eventData) {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    String operation = (String) operationsCombo.getSelectedItem();
                    double answer = 0;

                    if (operation.equals("Add")) {
                        answer = num1 + num2;
                    } else if (operation.equals("Subtract")) {
                        answer = num1 - num2;
                    } else if (operation.equals("Multiply")) {
                        answer = num1 * num2;
                    } else if (operation.equals("Divide")) {
                        answer = num1 / num2;
                    }
                    resultsLabel.setText("Result: " + answer);
                    return;
                }
            });

            frame.pack();
            frame.setVisible(true);
        }


    private static void constructGUI() {
        Main newWindow = new Main();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                constructGUI();
            }
        });
    }

}





