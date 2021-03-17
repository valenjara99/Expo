package formulario1;

/**
 * Clase que captura y almacena la información de la persona
 * @author  j.jaramillo
 * @version 1
 * @since   07/05/2019
 */
public class DatosPersona {
    
    //Variables del programa globales
    String  tipoIdent;
    int     numeroIdent;
    String  nombreCompleto;
    int     valorDia = 15000;
    
    /**
     * Metodo que captura la informacion general de la persona
     * @param tipoIdent
     * @param numeroIdent
     * @param nombreCompleto 
     */
    public void datos_persona(String ptipoIdent, int pnumeroIdent, String pnombreCompleto){
        this.tipoIdent = ptipoIdent;
        this.numeroIdent = pnumeroIdent;
        this.nombreCompleto = pnombreCompleto;
        
        
    }   
         
    public int calcularSalario(int diasLaborados){
        int salario = diasLaborados * this.valorDia;
        return salario;
    }
}
