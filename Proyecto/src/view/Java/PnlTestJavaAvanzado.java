package view.Java;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import control.VentanaListener;

public class PnlTestJavaAvanzado extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int ANCHO = 600;
    private static final int ALTO = 350;
    private JLabel lblPregunta;
    private JRadioButton rdbtnRespuesta1;
    private JRadioButton rdbtnRespuesta2;
    private JRadioButton rdbtnRespuesta3;
    private JRadioButton rdbtnRespuesta4;
    private JButton btnComprobar;
    private final ButtonGroup buttonGroupRespuestas = new ButtonGroup();

    public PnlTestJavaAvanzado() {
        setSize(ANCHO, ALTO);
        initComponentes();
    }

    private void initComponentes() {
        setBackground(new Color(51, 255, 102));
        setLayout(null);

        lblPregunta = new JLabel();
        lblPregunta.setText("<html>¿Qué excepción se produce en Java si se intenta acceder a un elemento de <br>un ArrayList que está fuera de rango?</html>");
        lblPregunta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblPregunta.setBounds(10, 10, 580, 77);
        add(lblPregunta);

        rdbtnRespuesta1 = new JRadioButton();
        rdbtnRespuesta1.setText("NullPointerException");
        buttonGroupRespuestas.add(rdbtnRespuesta1);
        rdbtnRespuesta1.setBounds(30, 136, 200, 21);
        add(rdbtnRespuesta1);

        rdbtnRespuesta2 = new JRadioButton();
        rdbtnRespuesta2.setText("UnsupportedOperationException");
        buttonGroupRespuestas.add(rdbtnRespuesta2);
        rdbtnRespuesta2.setBounds(30, 226, 200, 21);
        add(rdbtnRespuesta2);

        rdbtnRespuesta3 = new JRadioButton();
        rdbtnRespuesta3.setText("ArrayStoreException");
        buttonGroupRespuestas.add(rdbtnRespuesta3);
        rdbtnRespuesta3.setBounds(343, 136, 200, 21);
        add(rdbtnRespuesta3);

        rdbtnRespuesta4 = new JRadioButton();
        rdbtnRespuesta4.setText("IndexOutOfBoundsException");
        buttonGroupRespuestas.add(rdbtnRespuesta4);
        rdbtnRespuesta4.setBounds(343, 226, 200, 21);
        add(rdbtnRespuesta4);

        btnComprobar = new JButton("Comprobar");
        btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnComprobar.setBounds(208, 281, 164, 42);
        add(btnComprobar);
    }

    public JButton getBtnComprobar() {
        return btnComprobar;
    }

    public JRadioButton getRdbtnRespuesta1() {
        return rdbtnRespuesta1;
    }

    public JRadioButton getRdbtnRespuesta2() {
        return rdbtnRespuesta2;
    }

    public JRadioButton getRdbtnRespuesta3() {
        return rdbtnRespuesta3;
    }

    public JRadioButton getRdbtnRespuesta4() {
        return rdbtnRespuesta4;
    }

    public ButtonGroup getButtonGroupRespuestas() {
        return buttonGroupRespuestas;
    }
    public void setListener(VentanaListener l) {
		btnComprobar.addActionListener(l);
		
	}
}
