

import java.util.Scanner;

public class MainCita {
    
    public static void main(String[] args) {
        
        
        Scanner dato = new Scanner (System .in);
        String tipo_ = "Especialista";
        System.out.println("Ingrese el numero de la cita:");
        int numero = dato.nextInt();
        System.out.println("Ingrese el tipo de cita: (Numero de 1 al 5)");
        int tipo = dato.nextInt();
        System.out.println("Ingrese la tarifa de la cita:");
        double tarifa = dato.nextDouble();
        System.out.println("");
        
        CitaMedica cita = new CitaMedica(numero, tipo, tarifa);
        
       
        
        if(cita.getTipo()== tipo_){
            tipo_= "incremento del 50%.";
        }else{
            tipo_= "descuento del 50%.";
        }
        
        if((tipo<6)&&(tipo>0)){
        System.out.println("El número de la cita es: "+cita.getNumero());
        System.out.println("Esta cita es de tipo: : "+cita.getTipo());
        System.out.println("Su tarifa normal es: "+cita.getTarifa());
        System.out.println("Pero por ser de tipo "+cita.getTipo() + " obtines un "+tipo_+": "+cita.calcularValorFinal());
        }else{   
        System.out.println("El tipo de cita es incorrecto.");  
        System.out.println("Inténtalo de nuevo.");
        }
    }
    
}
