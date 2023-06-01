package GUI.Components;

import javax.swing.*;

public class Component {

    public static JTextField getTextField(int x, int y, int width, int height) {
        JTextField jTextField = new JTextField();
        jTextField.setBounds(x,y,width,height);
        return jTextField;
    }

    public static JButton getButton(int x, int y, int width, int height, String name) {
        JButton jButton = new JButton(name);
        jButton.setBounds(x,y,width,height);
        return jButton;
    }

    public static JLabel getPromptText(int x, int y, int width, int height, String name) {
        JLabel jLabel = new JLabel(name);
        jLabel.setBounds(x,y,width,height);
        return jLabel;
    }

}
