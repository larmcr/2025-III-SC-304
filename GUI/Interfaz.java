import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz extends JFrame {
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonBorrar;
    private JButton botonCancelar;
    private JButton botonEspacio;
    private JButton botonEvaluar;
    private JButton botonMultiplicar;
    private JButton botonNegativo;
    private JButton botonRealizar;
    private JButton botonRestar;
    private JButton botonSeparador;
    private JButton botonSumar;
    private JTextField campoOperador;
    private JTextField campoOperandos;
    private JPanel panelCampos;
    private JPanel panelOperadores;
    private JPanel panelOperandos;

    private boolean bandera;

    private final String FONT = "Verdana";

    public Interfaz() {
        bandera = true;
        panelOperandos = new JPanel();
        boton0 = new JButton();
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();
        boton5 = new JButton();
        boton6 = new JButton();
        boton7 = new JButton();
        boton8 = new JButton();
        boton9 = new JButton();
        panelCampos = new JPanel();
        campoOperandos = new JTextField();
        campoOperador = new JTextField();
        panelOperadores = new JPanel();
        botonEspacio = new JButton();
        botonSeparador = new JButton();
        botonNegativo = new JButton();
        botonBorrar = new JButton();
        botonCancelar = new JButton();
        botonRestar = new JButton();
        botonMultiplicar = new JButton();
        botonSumar = new JButton();
        botonEvaluar = new JButton();
        botonRealizar = new JButton();

        getContentPane().setLayout(null);
        setBounds(50, 50, 380, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora de polinomios");

        panelOperandos.setLayout(null);
        panelOperandos.setBorder(BorderFactory.createLineBorder(Color.blue));

        boton0.setFont(new Font(FONT, 0, 12));
        boton0.setForeground(Color.blue);
        boton0.setText("0");
        boton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(0));
            }
        });
        panelOperandos.add(boton0);
        boton0.setBounds(10, 10, 50, 23);

        boton1.setFont(new Font(FONT, 0, 12));
        boton1.setForeground(Color.blue);
        boton1.setText("1");
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(1));
            }
        });
        panelOperandos.add(boton1);
        boton1.setBounds(80, 10, 50, 23);

        boton2.setFont(new Font(FONT, 0, 12));
        boton2.setForeground(Color.blue);
        boton2.setText("2");
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(2));
            }
        });
        panelOperandos.add(boton2);
        boton2.setBounds(150, 10, 50, 23);

        boton3.setFont(new Font(FONT, 0, 12));
        boton3.setForeground(Color.blue);
        boton3.setText("3");
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(3));
            }
        });
        panelOperandos.add(boton3);
        boton3.setBounds(220, 10, 50, 23);

        boton4.setFont(new Font(FONT, 0, 12));
        boton4.setForeground(Color.blue);
        boton4.setText("4");
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(4));
            }
        });
        panelOperandos.add(boton4);
        boton4.setBounds(290, 10, 50, 23);

        boton5.setFont(new Font(FONT, 0, 12));
        boton5.setForeground(Color.blue);
        boton5.setText("5");
        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(5));
            }
        });
        panelOperandos.add(boton5);
        boton5.setBounds(10, 40, 50, 23);

        boton6.setFont(new Font(FONT, 0, 12));
        boton6.setForeground(Color.blue);
        boton6.setText("6");
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(6));
            }
        });
        panelOperandos.add(boton6);
        boton6.setBounds(80, 40, 50, 23);

        boton7.setFont(new Font(FONT, 0, 12));
        boton7.setForeground(Color.blue);
        boton7.setText("7");
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(7));
            }
        });
        panelOperandos.add(boton7);
        boton7.setBounds(150, 40, 50, 23);

        boton8.setFont(new Font(FONT, 0, 12));
        boton8.setForeground(Color.blue);
        boton8.setText("8");
        boton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(8));
            }
        });
        panelOperandos.add(boton8);
        boton8.setBounds(220, 40, 50, 23);

        boton9.setFont(new Font(FONT, 0, 12));
        boton9.setForeground(Color.blue);
        boton9.setText("9");
        boton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(String.valueOf(9));
            }
        });
        panelOperandos.add(boton9);
        boton9.setBounds(290, 40, 50, 23);

        getContentPane().add(panelOperandos);
        panelOperandos.setBounds(10, 60, 350, 70);

        panelCampos.setLayout(null);
        panelCampos.setBorder(BorderFactory.createLineBorder(Color.blue));
        campoOperandos.setFont(new Font(FONT, 0, 12));
        campoOperandos.setForeground(Color.blue);
        campoOperandos.setHorizontalAlignment(JTextField.RIGHT);
        panelCampos.add(campoOperandos);
        campoOperandos.setBounds(10, 10, 300, 21);
        campoOperador.setFont(new Font(FONT, 0, 12));
        campoOperador.setForeground(Color.blue);
        campoOperador.setHorizontalAlignment(JTextField.CENTER);
        campoOperador.setEnabled(false);
        panelCampos.add(campoOperador);
        campoOperador.setBounds(320, 10, 20, 21);
        getContentPane().add(panelCampos);
        panelCampos.setBounds(10, 10, 350, 40);

        panelOperadores.setLayout(null);
        panelOperadores.setBorder(BorderFactory.createLineBorder(Color.blue));
        botonEspacio.setFont(new Font(FONT, 0, 12));
        botonEspacio.setForeground(Color.blue);
        botonEspacio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(" ");
            }
        });
        panelOperadores.add(botonEspacio);
        botonEspacio.setBounds(10, 10, 50, 23);

        botonSeparador.setFont(new Font(FONT, 0, 12));
        botonSeparador.setForeground(Color.blue);
        botonSeparador.setText("|");
        botonSeparador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando(" | ");
            }
        });

        panelOperadores.add(botonSeparador);
        botonSeparador.setBounds(80, 10, 50, 23);

        botonNegativo.setFont(new Font(FONT, 0, 12));
        botonNegativo.setForeground(Color.blue);
        botonNegativo.setText("-");
        botonNegativo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperando("-");
            }
        });

        panelOperadores.add(botonNegativo);
        botonNegativo.setBounds(150, 10, 50, 23);

        botonBorrar.setFont(new Font(FONT, 0, 12));
        botonBorrar.setForeground(Color.blue);
        botonBorrar.setText("B");
        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrar();
            }
        });

        panelOperadores.add(botonBorrar);
        botonBorrar.setBounds(220, 10, 50, 23);

        botonCancelar.setFont(new Font(FONT, 0, 12));
        botonCancelar.setForeground(Color.blue);
        botonCancelar.setText("C");
        botonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrar();
                cancelar();
            }
        });
        panelOperadores.add(botonCancelar);
        botonCancelar.setBounds(290, 10, 50, 23);

        botonRestar.setFont(new Font(FONT, 0, 12));
        botonRestar.setForeground(Color.blue);
        botonRestar.setText("_");
        botonRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperador("-");
                restar();
            }
        });
        panelOperadores.add(botonRestar);
        botonRestar.setBounds(10, 40, 50, 23);

        botonMultiplicar.setFont(new Font(FONT, 0, 12));
        botonMultiplicar.setForeground(Color.blue);
        botonMultiplicar.setText("*");
        botonMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperador("*");
                multiplicar();
            }
        });
        panelOperadores.add(botonMultiplicar);
        botonMultiplicar.setBounds(80, 40, 50, 23);

        botonSumar.setFont(new Font(FONT, 0, 12));
        botonSumar.setForeground(Color.blue);
        botonSumar.setText("+");
        botonSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperador("+");
                sumar();
            }
        });
        panelOperadores.add(botonSumar);
        botonSumar.setBounds(150, 40, 50, 23);

        botonEvaluar.setFont(new Font(FONT, 0, 12));
        botonEvaluar.setForeground(Color.blue);
        botonEvaluar.setText("e");
        botonEvaluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperador("e");
                evaluar();
            }
        });
        panelOperadores.add(botonEvaluar);
        botonEvaluar.setBounds(220, 40, 50, 23);

        botonRealizar.setFont(new Font(FONT, 0, 12));
        botonRealizar.setForeground(Color.blue);
        botonRealizar.setText("=");
        botonRealizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertarOperador("=");
                realizar();
            }
        });
        panelOperadores.add(botonRealizar);
        botonRealizar.setBounds(290, 40, 50, 23);

        getContentPane().add(panelOperadores);
        panelOperadores.setBounds(10, 140, 350, 70);

        setVisible(true);
    }

    private void insertarOperando(String caracter) {
        if (bandera) {
            campoOperandos.setText(campoOperandos.getText() + caracter);
        } else {
            campoOperandos.setText(caracter);
            bandera = true;
        }
    }

    private void insertarOperador(String caracter) {
        campoOperador.setText(caracter);
    }

    private void borrar() {
        campoOperandos.setText(null);
    }

    private void cancelar() {
        campoOperador.setText(null);
    }

    private void sumar() {
        bandera = false;
    }

    private void multiplicar() {
        bandera = false;
    }

    private void restar() {
        bandera = false;
    }

    private void evaluar() {
        bandera = false;
    }

    private void realizar() {
        bandera = false;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Interfaz();
        });
    }
}