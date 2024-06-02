package view.linux;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class PreguntasLinuxAvanzado extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final int ANCHO = 600;
    private static final int ALTO = 350;
    private JRadioButton rdbtnRepuesta1;
    private JLabel lblPregutanas;
    private final ButtonGroup buttonGroupRespuestas = new ButtonGroup();
    private JRadioButton rdbtnRespuesta3;
    private JRadioButton rdbtnRespuesta4;
    private JRadioButton rdbtnRespuesta2;
    private JButton btnComprobar;

    public PreguntasLinuxAvanzado() {
        setTitle("Preguntas Linux Intermedio");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(51, 255, 102));
        getContentPane().setLayout(null);

        initComponentes();
    }

    private void initComponentes() {
        lblPregutanas = new JLabel("PREGUNTA 1");
        lblPregutanas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        lblPregutanas.setBounds(77, 27, 414, 13);
        getContentPane().add(lblPregutanas);

        rdbtnRepuesta1 = new JRadioButton("New radio button");
        buttonGroupRespuestas.add(rdbtnRepuesta1);
        rdbtnRepuesta1.setBounds(77, 136, 103, 21);
        getContentPane().add(rdbtnRepuesta1);

        rdbtnRespuesta3 = new JRadioButton("New radio button");
        buttonGroupRespuestas.add(rdbtnRespuesta3);
        rdbtnRespuesta3.setBounds(77, 228, 103, 21);
        getContentPane().add(rdbtnRespuesta3);

        rdbtnRespuesta2 = new JRadioButton("New radio button");
        buttonGroupRespuestas.add(rdbtnRespuesta2);
        rdbtnRespuesta2.setBounds(406, 136, 103, 21);
        getContentPane().add(rdbtnRespuesta2);

        rdbtnRespuesta4 = new JRadioButton("New radio button");
        buttonGroupRespuestas.add(rdbtnRespuesta4);
        rdbtnRespuesta4.setBounds(406, 239, 103, 21);
        getContentPane().add(rdbtnRespuesta4);

        btnComprobar = new JButton("Comprobar");
        btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnComprobar.setBounds(208, 281, 164, 42);
        getContentPane().add(btnComprobar);
    }

    public JButton getBtnComprobar() {
        return btnComprobar;
    }
}
