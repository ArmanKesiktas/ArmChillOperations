
// Libraries :P
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class :P
public class ArmsChillOperations {
    public static void main(String[] args) {
        // Window of :P
        JFrame frame = new JFrame("ArmsChillOperations :P");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Window Components of :P
        JTextField inputField = new JTextField(20);
        JButton calculateButton = new JButton("Let's Calculate :P");
        JLabel resultLabel = new JLabel("");

        frame.add(inputField);
        frame.add(calculateButton);
        frame.add(resultLabel);
        // Important Part of :P
        calculateButton.addActionListener(new ActionListener() {
            @Override // The method will start when user click on the button
            public void actionPerformed(ActionEvent e) {
                // :P Check
                String input = inputField.getText();
                if (!input.endsWith(":P")) {
                    resultLabel.setText("Input should end with':P'");
                    return;
                }
                input = input.substring(0, input.length() - 2).trim(); // Remove the ":P" :(

                try {
                    String[] parts;
                    if (input.contains("addmatik")) {
                        parts = input.split("addmatik"); // Divides operations right and left sides
                        double num1 = Double.parseDouble(parts[0].trim()); // Left(first)side
                        double num2 = Double.parseDouble(parts[1].trim()); // Right(second)side
                        resultLabel.setText("Result: " + (num1 + num2));
                    } else if (input.contains("submatik")) {
                        parts = input.split("submatik");
                        double num1 = Double.parseDouble(parts[0].trim());
                        double num2 = Double.parseDouble(parts[1].trim());
                        resultLabel.setText("Result: " + (num1 - num2));
                    } else if (input.contains("multmatik")) {
                        parts = input.split("multmatik");
                        double num1 = Double.parseDouble(parts[0].trim());
                        double num2 = Double.parseDouble(parts[1].trim());
                        resultLabel.setText("Result: " + (num1 * num2));
                    } else if (input.contains("divmatik")) {
                        parts = input.split("divmatik");
                        double num1 = Double.parseDouble(parts[0].trim());
                        double num2 = Double.parseDouble(parts[1].trim());
                        if (num2 == 0) {// Checker Loop divider 0
                            resultLabel.setText("Cannot divide by zero :P");
                        } else {
                            resultLabel.setText("Result: " + (num1 / num2));
                        }
                        // Checks the wrong operators and outputs error
                    } else if (input.contains("+")) {
                        resultLabel.setText("Wrong operator. Please try 'addmatik':P");
                    } else if (input.contains("-")) {
                        resultLabel.setText("Wrong operator. Please try 'submatik':P");
                    } else if (input.contains("*")) {
                        resultLabel.setText("Wrong operator. Please try 'multmatik':P");
                    } else if (input.contains("/")) {
                        resultLabel.setText("Wrong operator. Please try 'divmatik':P");
                    } else {
                        resultLabel.setText("Invalid input :P");
                    }
                    // Checks type of the value
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid number format :P");
                }
            }
        });

        frame.setVisible(true);
    }
}
