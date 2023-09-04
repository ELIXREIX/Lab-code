package P1.Term2.week2term2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class TimeConverter {
    private JFrame frame;
    private JTextField secondsField;
    private JTextField minutesField;
    private JLabel resultLabel;
    private JLabel errorLabel;

    public TimeConverter() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        frame = new JFrame("Time Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel secondsPanel = new JPanel();
        secondsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JLabel secondsLabel = new JLabel("Seconds:");
        secondsPanel.add(secondsLabel);

        secondsField = new JTextField(10);
        secondsField.setFont(new Font("Arial", Font.PLAIN, 16));
        secondsField.getDocument().addDocumentListener(new TimeFieldListener());
        secondsPanel.add(secondsField);

        panel.add(secondsPanel);

        JPanel minutesPanel = new JPanel();
        minutesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));

        JLabel minutesLabel = new JLabel("Minutes:");
        minutesPanel.add(minutesLabel);

        minutesField = new JTextField(10);
        minutesField.setFont(new Font("Arial", Font.PLAIN, 16));
        minutesField.getDocument().addDocumentListener(new TimeFieldListener());
        minutesPanel.add(minutesField);

        panel.add(minutesPanel);

        resultLabel = new JLabel();
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(resultLabel);

        errorLabel = new JLabel();
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        errorLabel.setForeground(Color.RED);
        panel.add(errorLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class TimeFieldListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            convertTime();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            convertTime();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            convertTime();
        }

        private void convertTime() {
            try {
                int seconds = secondsField.getText().isEmpty() ? 0 : Integer.parseInt(secondsField.getText());
                int minutes = minutesField.getText().isEmpty() ? 0 : Integer.parseInt(minutesField.getText());

                int totalSeconds = (minutes * 60) + seconds;
                int convertedMinutes = totalSeconds / 60;
                int remainingSeconds = totalSeconds % 60;

                resultLabel.setText(totalSeconds + " seconds is equal to " + convertedMinutes + " minutes and " + remainingSeconds + " seconds.");
                errorLabel.setText(""); // Clear the error message if conversion succeeds
            } catch (NumberFormatException ex) {
                resultLabel.setText("");
                errorLabel.setText("ERROR: Invalid input"); // Display error message
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TimeConverter();
            }
        });
    }
}
