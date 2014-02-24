/**
 * Esta es la clase encargada de entregarle al cliente el tiquete con sus datos.
 * 
 * @author Mateo Gutierrez Gomez  201220019010
 */
public class Vehiculo{
    /**
     * Este es el estatico de Automovil, uno de los vehiculo que se aceptan en el parqueadero.
     */
    public static int AUTOMOVIL = 1;
    /**
     * Este es el estatico de Camioneta, uno de los vehiculo que se aceptan en el parqueadero.
     */
    public static int CAMIONETA = 2;
    /**
     * Este es el estatico de Campero, uno de los vehiculo que se aceptan en el parqueadero.
     */
    public static int CAMPERO = 3; 
    
    private String nombre;
    private int identificacion;
    private String matricula;
    private int tipoDeVehiculo;
    private int horaLlegada;
    private int horaSalida;
    private boolean multa=false;
    private String ubicacion;
    private int ascii;
    private int lastMatricula;
    private int total;
    private int Automovil=0;
    private int Campero=0;
    private int Camioneta=0;
    int totalPago=0;
    
    /**
     * El constructor de vehiculo se encarga de recibir los datos tanto del cliente como del vehiculo e imprime su respectivo tiquete.
     */
    public Vehiculo(String nombre, int identificacion, String matricula, int tipoDeVehiculo, int horaLlegada, int horaSalida){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.matricula = matricula;
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        String carro ="";
        if(tipoDeVehiculo==1){
            Automovil=2000;
            total = Automovil*((horaSalida-horaLlegada)%100);
            if(((horaSalida-horaLlegada)/100)>00){
                totalPago=total+Automovil;
                if(multa){
                    totalPago=totalPago+4000;
                }
            }
            carro = ("Automovil");
        }else if(tipoDeVehiculo==2){
            Camioneta=3000;
            total = Camioneta*((horaSalida-horaLlegada)%100);
            if(((horaSalida-horaLlegada)/100)>00){
                totalPago=total+Camioneta;
                if(multa){
                    totalPago=totalPago+4000;
                }
            }
            carro = ("Camioneta");
        }else{
            Campero=3500;
            total = Campero*((horaSalida-horaLlegada)%100);
            if(((horaSalida-horaLlegada)/100)>00){
                totalPago=total+Campero;
                if(multa){
                    totalPago=totalPago+4000;
                }
            }
            carro = ("Campero");
        }
        System.out.println("Bienvenido "+nombre+" por favor recuerde presentar este tiquete a la hora de retirar su vehiculo");
        System.out.println("Su identificación: "+identificacion);
        System.out.println("El tipo de vehiculo es: "+carro);
        System.out.println("La matricula del carro es: "+matricula);
        System.out.println("La hora de llegada es: "+horaLlegada);
        System.out.println("Recuerde que su hora de salida es: "+horaSalida);
        System.out.println("La ubicacion de su auto es la: "+matricula.charAt(0)+matricula.charAt(5));
        System.out.println("Total a pagar es: $"+totalPago);
        ubicacion = (""+matricula.charAt(0)+matricula.charAt(5));
        ascii = (((int)matricula.charAt(0))-65);
        lastMatricula = ((int)matricula.charAt(5)-48);
        
    }
    /**
     * Encargado de dar la hora de salida.
     */
    public int getHoraDeSalida(){
        return horaSalida;
    }
    /**
     * Encargado de dar la ubicacion del vehiculo en la torre.
     */
    public String getUbicacion(){
        return ubicacion;
    }
    /**
     * Encargado de dar el valor numerico de la primera letra de la matricula para ubicar el piso de altura.
     */
    public int getAscii(){
        return ascii;
    }
    /**
     * Encargado de dar el valor numerico del ultimo numero de la matricula para ubicar el piso.
     */
    public int getLastMatricula(){
        return lastMatricula;
    }
    /**
     * Encargado de dar la matricula de vehiculo.
     */
    public String getMatricula(){
        return matricula;
    }
    /**
     * Encargado de dar el tipo de vehiculo del cliente.
     */
    public int getTipoDeVehiculo(){
        return tipoDeVehiculo;
    }
    /**
     * Encargado de poner la multa al vehiculo del cliente.
     */
    public void setMulta(boolean multa){
        this.multa = multa;
    }
}