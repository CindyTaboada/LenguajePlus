package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.VPrincipalDificultad;
import view.VPrincipalLenguaje;

public class VListenerNiveles implements ActionListener {
    
    private VPrincipalLenguaje vNiveles;
    private VPrincipalDificultad vDificultad;

    public VListenerNiveles(VPrincipalLenguaje vNiveles, VPrincipalDificultad vDificultad) {
        this.vNiveles = vNiveles;
        this.vDificultad = vDificultad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            String actionCommand = button.getActionCommand();

            // Check which view the action is coming from
            if (vNiveles != null && vNiveles.isVisible()) {
                // Handle actions for VPrincipalLenguaje
                if (actionCommand.equals(VPrincipalLenguaje.ACT_CMN_BTN_JAVA)) {
                    // Handle Java button click
                } else if (actionCommand.equals(VPrincipalLenguaje.ACT_CMN_BTN_LINUX)) {
                    // Handle Linux button click
                } else if (actionCommand.equals(VPrincipalLenguaje.ACT_CMN_BTN_HMTL)) {
                    // Handle JavaScript button click
                } else if (actionCommand.equals(VPrincipalLenguaje.ACT_CMN_BTN_GITHUB)) {
                    // Handle GitHub button click
                } else if (actionCommand.equals(VPrincipalLenguaje.ACT_CMN_BTN_SQL)) {
                    // Handle SQL button click
                }
            } else if (vDificultad != null && vDificultad.isVisible()) {
                // Handle actions for VPrincipalDificultad
                if (actionCommand.equals(VPrincipalDificultad.ACT_CMN_BTN_BEGINNER)) {
                    // Handle Beginner button click
                } else if (actionCommand.equals(VPrincipalDificultad.ACT_CMN_BTN_INTERMEDIATE)) {
                    // Handle Linux button click
                } else if (actionCommand.equals(VPrincipalDificultad.ACT_CMN_BTN_ADVANCE)) {
                    // Handle JavaScript button click
                }
            }
        }
    }
}

