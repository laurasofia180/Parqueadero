import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Este es el menu general para seleccionar las diferentes opciones que tiene el sistema.
 * 
 * @author Mateo Gutierrez Gomez 201220019010
 */
public class Menu extends JFrame implements ActionListener{
    private Parqueadero parqueadero;
    private Menu menu;
    private JButton butIngresarHora;
    private JButton butIngresarVehiculo;
    private JButton butRetirarVehiculo;
    private InterfazTiempo llamada;
    private IngresarCarro llamada2;
    private RetirarVehiculo llamada3;
    /**
     * Dato estatico para el boton Ingresar la Hora.
     */
    public static final String IngresarHora = "Ingresar la Hora";
    /**
     * Dato estatico para el boton Ingresar Vehiculo.
     */
    public static final String IngresarVehiculo = "Ingresar un Vehiculo";
    /**
     * Dato estatico para el boton Retirar Vehiculo.
     */
    public static final String RetirarVehiculo = "Retirar un Vehiculo";
    
    private JLabel lblDecision;
    
    /**
     * El constructor es el encargado de generar los diferentes componentes del JFrame (botones, textos...).
     */
    public Menu(){
        
        setSize(250,150);
        setTitle("Menu");
        setResizable(false);
        setLayout(new GridLayout(5,5));
        setPreferredSize(new Dimension(250,100));
        
        lblDecision = new JLabel("¿Que desea hacer?");
        add(lblDecision);
        
        butIngresarHora = new JButton("Ingresar Tiempo");
        butIngresarVehiculo = new JButton("Ingresar un Vehiculo");
        butRetirarVehiculo = new JButton("Retirar un Vehiculo");
        
        add(butIngresarHora);
        add(butIngresarVehiculo);
        add(butRetirarVehiculo);
        
        butIngresarHora.setActionCommand(IngresarHora);
        butIngresarVehiculo.setActionCommand(IngresarVehiculo);
        butRetirarVehiculo.setActionCommand(RetirarVehiculo);
        
        butIngresarHora.addActionListener(this);
        butIngresarVehiculo.addActionListener(this);
        butRetirarVehiculo.addActionListener(this);
        
    }
    /**
     * El action performed es el encargado de recibir las acciones que se realice en los respectivos botones.
     */
    public void actionPerformed(ActionEvent event){
        String comando = event.getActionCommand();
        
        if(comando.equals(IngresarHora)){
            String [] parametros = new String [0];
            llamada.main(parametros);
        }else if(comando.equals(IngresarVehiculo)){
            String [] parametros = new String [0];
            llamada2.main(parametros);
        }else{
            String [] parametros = new String [0];
            llamada3.main(parametros);
        }
    }
    /**
     * El main es el encargado de iniciar la ejecucion del sistema.
     */
    public static void main(String [] args) {
        Menu menu = new Menu();   
        menu.setVisible(true);
    }
}