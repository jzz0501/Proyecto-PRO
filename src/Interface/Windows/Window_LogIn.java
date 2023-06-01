package Interface.Windows;

import GUI.Components.Component;
import GUI.Events.LogIn.Go_Register;
import GUI.Events.LogIn.LogIn;

import javax.swing.*;

public class Window_LogIn extends JFrame {

    private final JButton LOG_IN = Component.getButton(85,190,100,40,"LOG IN");
    private final JButton GO_REGISTER = Component.getButton(215,190,100,40,"GO REGIST");
    private final JTextField USERNAME = Component.getTextField(130,60,160,22);
    private final JTextField PASSWORD = Component.getTextField(130,100,160,22);

    /**
     * Constructor para crear la instancia Window_LogIn()
     */
    public Window_LogIn() {

        frameSetting();

        setEvents();

        setComponents();

        this.setVisible(true);
    }

    /**
     * Metodo para poner eventos
     */
    private void setEvents() {
        LOG_IN.addMouseListener(new LogIn(this));
        GO_REGISTER.addMouseListener(new Go_Register(this));
    }

    /**
     * Metodo para poner componentes
     */
    private void setComponents() {
        this.getContentPane().add(LOG_IN);
        this.getContentPane().add(GO_REGISTER);
        this.getContentPane().add(USERNAME);
        this.getContentPane().add(PASSWORD);
    }

    /**
     * Metodo para diseñar ventana
     */
    private void frameSetting() {
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("LogIn");
    }

    /**
     * Metodo para devolver username escribido en la ventana
     * @return username
     */
    public JTextField getUSERNAME() {
        return USERNAME;
    }

    /**
     * Metodo para devolver password escribido en la ventana
     * @return password
     */
    public JTextField getPASSWORD() {
        return PASSWORD;
    }
}
