/**
 * Esta es la clase que controla el tiempo que usa el sistema del parqueadero.
 * 
 * @author Mateo Gutierrez Gomez  201220019010
 */
public class Tiempo{
    private int hora;
    private int minuto;
    /**
     * Este es el constructor de tiempo, es el encargado de recibir la hora inicial del sistema y hacer la comprobacion de que sea una hora valida, se divide la hora en horas y minutos para facil manejo.
     */
    public Tiempo(int hora){        
        if(hora>2359){
            System.out.println("Error al ingresar la hora, se tomara como hora predeterminada las 00:00");
        }else{
            this.hora = hora/100;
            this.minuto = hora%100;
        }
    }
    /**
     * Este el metodo encargado de cambiar la hora del sistema, hace la comprobacion de cambio del tiempo a futuro y tambien que sea una hora valida.
     */
    public void cambiarTiempo(int laHora){
        if(laHora>2359){
            System.out.println("Error al ingresar la hora");
        }else{
            int myHora = laHora/100;
            int myMinutos = laHora%100;
            if(hora==myHora){
                if(minuto>myMinutos){
                    System.out.println("Por favor ingrese una hora mayor a la actual");
                }else if(minuto==myMinutos){
                    System.out.println("La hora ingresada es la misma");
                }else if(minuto<myMinutos){
                    minuto = myMinutos;
                    System.out.println("La nueva hora asignada es: "+hora+":"+minuto);
                }   
            }else {
                if(hora>myHora){
                    System.out.println("Por favor ingrese una hora mayor a la actual");
                }else if(hora==myHora){
                    System.out.println("La hora ingresada es la misma");
                }else if(hora<myHora){
                    hora=myHora;
                    minuto=myMinutos;
                    System.out.println("La nueva hora asignada es: "+hora+":"+minuto);
                }
            }
        }
    }
    /**
     * Encargado de dar la hora.
     */
    public int getHora(){
        return hora;
    }
    /**
     * Encargado de dar los minutos.
     */
    public int getMinuto(){
        return minuto;
    }
}