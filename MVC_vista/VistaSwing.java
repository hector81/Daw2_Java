/*
• Realiza la VistaSwing que implemente interfazVista con el siguiente aspecto
(no uses matisse para ello). El método setControlador será el
encargado de suscribir los botones a ActionListener
 */
package MVC_vista;

import MVC_controlador.CalculadoraControlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * @author VESPERTINO
 */
public class VistaSwing extends JFrame implements InterfazVistas{//implemente interfazVista 
    //atributos
    private JPanel panelPrincipal ,panelEste, panelOeste;
    private JPanel op1 ,op2, op3, op4;
    private JLabel jlab1,jlab2, jlab3, jlab4;
    private JTextField jt1,jt2, jt4;
    private JButton jbotonCalcular, jbotonSalir;
    private JComboBox tipoOperando;
    
    //constructor
    public VistaSwing(){
        //PANELES
        panelPrincipal = new JPanel(new BorderLayout());
        panelEste = new JPanel(new GridLayout(4, 2));
        panelOeste = new JPanel();
        panelOeste.setLayout(new BoxLayout(panelOeste, BoxLayout.Y_AXIS));
        op1 = new JPanel(new FlowLayout());
        op2 = new JPanel(new FlowLayout());
        op3 = new JPanel(new FlowLayout());
        op4 = new JPanel(new FlowLayout());
        
        //botones
        jbotonCalcular = new JButton("CALCULAR");
        jbotonSalir = new JButton("SALIR");
                
        //LE PONEMOS TEXT
        jlab1 = new JLabel("OPERANDO 1");
        jt1 = new JTextField(20);
        jlab2 = new JLabel("OPERANDO 2");
        jt2 = new JTextField(20);
        jlab3 = new JLabel("OPERANDO 3");
        tipoOperando = new JComboBox();
        tipoOperando.addItem("+");
        tipoOperando.addItem("-");
        tipoOperando.addItem("x");
        tipoOperando.addItem("/");
        jlab4 = new JLabel("OPERANDO 4");
        jt4 = new JTextField(20);

  
        //añadimos
        panelEste.add(op1);
        panelEste.add(op2);
        panelEste.add(op3);
        panelEste.add(op4);

        //añadimos
        op1.add(jlab1);
        op1.add(jt1);
        op2.add(jlab2);
        op2.add(jt2);
        op3.add(jlab3);
        op3.add(tipoOperando);
        op4.add(jlab4);
        op4.add(jt4);
        
        //añadimos botonees
        panelOeste.add(jbotonCalcular);
        panelOeste.add(jbotonSalir);
        
        //AÑADIMOS PANELEs
        panelPrincipal.add(panelOeste, BorderLayout.EAST);
        panelPrincipal.add(panelEste, BorderLayout.WEST);
    
        this.add(panelPrincipal);
        
        //visualizar
        this.pack();
        this.setLocationRelativeTo(null);//lo centra
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para cerrar ejecucion
        //this.setVisible(true);
    }
    
    public static void main(String[] args) {
        VistaSwing i= new VistaSwing();
    }

    

    @Override
    public String getOperando1() {//le pasamos el texto
        return jt1.getText().trim();//trim para unir espacios vacios
    }

    @Override
    public String getOperando2() {//le pasamos el texto
        return jt2.getText().trim();//trim para unir espacios vacios
    }

    @Override
    public String getOperador() {
        return tipoOperando.getSelectedItem().toString().trim();//trim para unir espacios vacios
    }

    @Override
    public void setResultado(String dato) {
        jt4.setText(dato);
    }

    @Override//método setControlador será el encargado de suscribir los botones a ActionListener
    public void setControlador(CalculadoraControlador objeto) {
        //usamos ActionCommand
        jbotonCalcular.setActionCommand("BotonCalcular");
        jbotonCalcular.addActionListener(objeto);
        jbotonSalir.setActionCommand("BotonCerrar");
        jbotonSalir.addActionListener(objeto);
    }

    @Override
    public void iniciarPrograma() {
        this.setVisible(true);
    }

    
}
