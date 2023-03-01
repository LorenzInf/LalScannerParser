package control;

import view.GUI;

import javax.swing.*;

public class ViewController {
    public ViewController() {
        GUI gui = new GUI();
        JFrame frame = new JFrame("LaL Scanner / Parser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setContentPane(gui.getPanel());
        frame.setVisible(true);
    }
}
