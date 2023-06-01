package Interface.Windows;

import GUI.Components.Component;
import GUI.Events.LogIn.Go_LogIn;
import GUI.Events.LogIn.Regist;

import javax.swing.*;

public class Window_Register extends JFrame {
    private final JButton GO_LOGIN = Component.getButton(155,390,105,40,"GO LOGIN");
    private final JButton REGIST = Component.getButton(280,390,105,40,"REGIST");
    private final JTextField USERNAME = Component.getTextField(100,70,140,20);
    private final JTextField PASSWORD = Component.getTextField(310,70,140,20);
    private final JTextField NAME = Component.getTextField(100,130,140,20);
    private final JTextField DNI = Component.getTextField(310,130,140,20);
    private final JTextField TELEFONO = Component.getTextField(100,190,140,20);
    private final JTextField FECHA_NAC = Component.getTextField(310,190,140,20);
    private final JTextField ADDRESS = Component.getTextField(130,250,280,20);
    private final JTextField GMAIL = Component.getTextField(130,310,280,20);

    /**
     * Constructor para crear la instancia de Window_Register
     */
    public Window_Register() {

        frameSetting();

        setEvents();

        setComponents();

        this.setVisible(true);
    }

    /**
     * Metodo para poner eventos
     */
    private void setEvents() {
        GO_LOGIN.addMouseListener(new Go_LogIn(this));
        REGIST.addMouseListener(new Regist(this));
    }

    /**
     * Metodo para poner componentes
     */
    private void setComponents() {
        this.getContentPane().add(GO_LOGIN);
        this.getContentPane().add(REGIST);
        this.getContentPane().add(USERNAME);
        this.getContentPane().add(PASSWORD);
        this.getContentPane().add(NAME);
        this.getContentPane().add(DNI);
        this.getContentPane().add(TELEFONO);
        this.getContentPane().add(FECHA_NAC);
        this.getContentPane().add(ADDRESS);
        this.getContentPane().add(GMAIL);
    }

    /**
     * Metodo para diseñar ventana
     */
    private void frameSetting() {
        this.setSize(550,550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("LogIn");
    }

    /**
     * Metodo para obtener username escribido
     * @return username
     */
    public JTextField getUSERNAME() {
        return USERNAME;
    }

    /**
     * Metodo para obtener password escribido
     * @return password
     */
    public JTextField getPASSWORD() {
        return PASSWORD;
    }

    /**
     * Metodo para obtener name escribido
     * @return name
     */
    public JTextField getNAME() {
        return NAME;
    }

    /**
     * Metodo para obtener dni escribido
     * @return dni
     */
    public JTextField getDNI() {
        return DNI;
    }

    /**
     * Metodo para obtener telefono escribido
     * @return telefono
     */
    public JTextField getTELEFONO() {
        return TELEFONO;
    }

    /**
     * Metodo para obtener fecha_nac escribido
     * @return fecha_nac
     */
    public JTextField getFECHA_NAC() {
        return FECHA_NAC;
    }

    /**
     * Metodo para obtener address escribido
     * @return address
     */
    public JTextField getADDRESS() {
        return ADDRESS;
    }

    /**
     * Metodo para obtener gmail escribido
     * @return gmail
     */
    public JTextField getGMAIL() {
        return GMAIL;
    }
}
