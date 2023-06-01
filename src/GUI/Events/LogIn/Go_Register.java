package GUI.Events.LogIn;

import Interface.Windows.Window_LogIn;
import Interface.Windows.Window_Register;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Go_Register extends MouseAdapter {

    private final Window_LogIn window;

    public Go_Register(Window_LogIn window) {
        this.window = window;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        new Window_Register();
        this.window.dispose();
    }
}
