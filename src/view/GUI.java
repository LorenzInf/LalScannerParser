package view;

import control.ProgramController;

import javax.swing.*;

public class GUI {
    private JButton scanButton;
    private JButton parseButton;
    private JPanel panel;
    private JTextPane textPane1;
    private JLabel scanOutput;
    private JLabel parseOutput;
    private final ProgramController pc;

    public GUI() {
        pc = new ProgramController();
        scanButton.addActionListener(e -> scanOutput.setText(pc.scan(textPane1.getText()) ? "Output: OK (" + textPane1.getText() + ")" : "Output: NOT OK"));
        parseButton.addActionListener(e -> parseOutput.setText(pc.parse() ? "Output: OK" : "Output: NOT OK"));
    }

    public JPanel getPanel() {
        return panel;
    }
}
