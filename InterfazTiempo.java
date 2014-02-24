import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * En el menu de tiempo es posible ingresar la hora actual del sistema y hacer los cambios respectivos segun se requiera
 * 
 * @author Mateo Gutierrez Gomez  201220019010
 */
public class InterfazTiempo extends JFrame implements ActionListener{
    
    private InterfazTiempo interfazTiempo;
    private Tiempo tiempo;
    private JButton butCambiar;
    private JButton butCancelar;
    /**
     * Dato estatico para el boton Cambiar, encargado de dar la orden de cambiar la hora.
     */
    public static final String CAMBIAR = "Cambiar";
    /**
     * Dato estatico para el boton cancelar, encargado de cancelar los procesos.
     */
    public static final String CANCELAR = "Cancelar";
    
    private JTextField txtHora;
    private JLabel lblHora;
    
    private String comando;
    
    /**
     * El constructor se encarga de crear todos los botones y de posicionarlos en la posicion deseada.
     */
    public InterfazTiempo(){
        
        
        setSize(200,130);
        setTitle("Menu Tiempo");
        setResizable(false);
        setLayout(new GridLayout(5,5));
        setPreferredSize(new Dimension(200,130));
        
        lblHora = new JLabel("Ingrese la hora");
        
        txtHora = new JTextField("");
                
        add(lblHora);
        add(txtHora);
        
        
        butCambiar = new JButton("Cambiar");
        butCancelar = new JButton("Cancelar");
        
        add(butCambiar);
        add(butCancelar);
        
        butCambiar.setActionCommand(CAMBIAR);
        butCancelar.setActionCommand(CANCELAR);
        
        butCambiar.addActionListener(this);
        butCancelar.addActionListener(this);
        
    }
    /**
     * Encargado de recibir y hacer las ordenes que hace el usuario al seleccionar un boton.
     */
    public void actionPerformed(ActionEvent event){
        comando = event.getActionCommand();
        
        if(comando.equals(CAMBIAR)){
            interfazTiempo.cambiar();
        }else{
            interfazTiempo.cancelar();
        }
    }
    /**
     * Cancelar es el encargado de parar la ejecucion del sistema.
     */
    public void cancelar() {
        txtHora.setText("");
    }
    /**
     * Cambiar es el encargado de cambiar la hora del sistema.
     */
    public void cambiar(){
        tiempo.cambiarTiempo(Integer.parseInt(txtHora.getText()));
    }
    /**
     * El main es el encargado de iniciar la ejecucion del sistema.
     */
    public static void main(String [] args) {
        InterfazTiempo interfazTiempo = new InterfazTiempo();   
        interfazTiempo.setVisible(true);
    }
}