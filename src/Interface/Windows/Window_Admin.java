package Interface.Windows;

import GUI.Components.Component;
import GUI.Events.Go_SecondPanel.*;
import Interface.SecondPanels.Panel_ProductAdmin;

import javax.swing.*;
import java.sql.SQLException;

public class Window_Admin extends JFrame {

    private final JButton BUTTON_PROD = Component.getButton(80,60,100,40,"producto");
    private final JButton BUTTON_CLIENT = Component.getButton(180,60,100,40,"cliente");
    private final JButton BUTTON_CLIENTACC = Component.getButton(280,60,130,40,"cuenta cliente");
    private JPanel Current_Panel;

    /**
     * Constructor para crear la instancia de Window_Admin
     * @throws SQLException El metodo frameSetting esta lanzado SQLException, el llamador tiene que lanzar excepcion en despues de nombre de metodo
     */
    public Window_Admin() throws SQLException {

        frameSetting();

        setEvents();

        setComponents();

        this.setVisible(true);
    }

    /**
     * Metodo de añadir eventos
     */
    private void setEvents() {
        BUTTON_CLIENTACC.addMouseListener(new Go_ClientAccPanel(this));
        BUTTON_PROD.addMouseListener(new Go_ProductPanel(this));
        BUTTON_CLIENT.addMouseListener(new Go_ClientPanel(this));
    }

    /**
     * Metodo de añadir componentes
     */
    private void setComponents() {
        this.getContentPane().add(BUTTON_CLIENTACC);
        this.getContentPane().add(BUTTON_PROD);
        this.getContentPane().add(BUTTON_CLIENT);
        this.getContentPane().add(Current_Panel);
    }

    /**
     * Metodo de diseñar ventana
     * @throws SQLException El constructor de Panel_ProductAdmin() esta lanzado SQLException, el llamador tiene que lanzar excepcion en despues de nombre de metodo
     */
    private void frameSetting() throws SQLException {
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Root");
        this.Current_Panel = new Panel_ProductAdmin();
    }

    /**
     * Metodo para obtener el panel secundario actual
     * @return panel secundario actual
     */
    public JPanel getCurrent_Panel() {
        return Current_Panel;
    }

    /**
     * Metodo para remover el panel secundario actual y poner nuevo panel secundario
     * @param newPanel nuevo panel que quieres poner
     */
    public void setCurrent_Panel(JPanel newPanel) {
        this.getContentPane().remove(this.Current_Panel);
        this.Current_Panel = newPanel;
        this.getContentPane().add(this.Current_Panel);
        this.getCurrent_Panel().setVisible(false);
        this.getCurrent_Panel().setVisible(true);
    }
    
}
