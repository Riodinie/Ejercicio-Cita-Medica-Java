
public class CitaMedica {
    
    private int numero;
    private int tipo;
    private double tarifa;
    private double valorFinal =0;
    
    public CitaMedica(int numero,int tipo,double tarifa){
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;        
    }


    public int getNumero() {
        return numero;
    }

    public String getTipo() { 
       
        if ((tipo <=3)&&(tipo>0)) {
            return "General";
        }else if(tipo==4 || tipo ==5){
            return "Especialista";
        }
        return null;
    }

    public double getTarifa() {
        return tarifa;
    }
    
    public double  calcularValorFinal(){
        double prctj= tarifa * 50 /100;
        if ((tipo <=3)&&(tipo>0)) {
            valorFinal = tarifa - prctj;
        } else if(tipo==4 || tipo ==5){ 
            valorFinal = tarifa + prctj;;
        }
        return valorFinal;        
    }
       
    
}
