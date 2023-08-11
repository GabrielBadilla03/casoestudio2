package programacion.casoestudio;

import javax.swing.JOptionPane;

public class datos {
    String cuenta = "";
    String descripcioncuenta = "";
    int totalparticipantes = 0;
    String participantes = "";
    String quienpago = "";
    int montototal = 0;
    String tipodemoneda = "Dolares";
    datos[] arrdatos = new datos[1000];
    String josua = "josua";
    String greivin = "greivin";
    String guillermo = "guillermo";
    String andres = "andres";
    String tavo = "tavo";
    String david = "david";

    public datos(String cuenta, String descripcioncuenta,int totalparticipantes, String participantes,String quienpago, int montototal, String tipodemoneda){
        this.cuenta = cuenta;
        this.totalparticipantes = totalparticipantes;
        this.descripcioncuenta = descripcioncuenta;
        this.participantes = participantes;
        this.quienpago = quienpago;
        this.montototal = montototal;
        this.tipodemoneda = tipodemoneda;

    }
    public void imprimirarreglo(){
        JOptionPane.showMessageDialog(null, arrdatos[8].toString());
    }
    public String toString(){
        return "cuenta "+cuenta+"\ndescripcion cuenta: "+descripcioncuenta+"\ntotal participantes: "+totalparticipantes+"\nparticipantes "+participantes+" \nquien pago: "+quienpago+"\ntotal pagado: "+montototal+"\ntipo moneda: "+tipodemoneda;
    }
    public void guardardatosfijos(){
        arrdatos[0] = new datos("cuenta 1", "Desayuno  CoffePrime",6,
        josua+", "+greivin+", "+guillermo+", "+andres+", "+tavo+", "+david, guillermo, 120, "dolares");
        
        arrdatos[1] = new datos("cuenta 2", "Almuerzo Pig Factory",5, 
        josua+", "+greivin+", "+guillermo+", "+andres+", "+tavo,  guillermo, 200, "dolares"); 

        arrdatos[2] = new datos("cuenta 3", "Cena FastFood", 2, 
        josua+", "+david, david, 50, "dolares");

        arrdatos[3] = new datos("cuenta 4", "Pizza Hut", 4,
        guillermo+", "+andres+", "+greivin+", "+tavo, tavo, 100, "dolares");
    
        arrdatos[4] = new datos("cuenta 5", "Quicksilver store", 1, 
        guillermo, greivin, 150, "dolares");
         
        arrdatos[5] = new datos("cuenta 6", "Apple Store", 1,
        andres, josua, 200, "dolares");
    
        arrdatos[6] = new datos("cuenta 7", "Desayuno chillis", 6, 
        josua+", "+greivin+", "+guillermo+", "+andres+", "+tavo+", "+david, greivin, 150, "dolares");
        
        arrdatos[7] = new datos("cuenta 8", "Almuerzo hooters", 6,
        josua+", "+greivin+", "+guillermo+", "+andres+", "+tavo+", "+david, tavo, 180, "dolares");

        arrdatos[8] = new datos("cuenta 9", "ninguna", 0,
        "ninguno", "ninguno", 0, "dolares");
    }
    public void guardardatonormal(){
        descripcioncuenta = JOptionPane.showInputDialog("ingrese la descripcion de la cuenta:");
        totalparticipantes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de participantes:"));
        participantes = JOptionPane.showInputDialog("ingrese los participantes separados por un , y espacio \nnombres disponibles y como guardarlos\njosua, greivin, guillermo, david, tavo, andres ");
        quienpago = JOptionPane.showInputDialog("ingrese quien fue el que pago: ");
        montototal = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto total; "));
        arrdatos[8] = new datos("cuenta 9", descripcioncuenta, totalparticipantes, participantes, quienpago, montototal, "dolares");
    }
    public void deu(String string) {
        String[] paticipantotales = new String[6];
        paticipantotales[0] = new String(guillermo);
        paticipantotales[1] = new String(greivin);
        paticipantotales[2] = new String(tavo);
        paticipantotales[3] = new String(andres);
        paticipantotales[4] = new String(josua);
        paticipantotales[5] = new String(david);
        
        for (int i = 0; i < 9; i++) {
        String[] participantescuenta = new String[6];
        String separacion = ", ";
        String pago = arrdatos[i].quienpago;
        if(guillermo == pago){
            int deuda = arrdatos[i].montototal/arrdatos[i].totalparticipantes;
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                String[] partici = arrdatos[i].participantes.split(separacion);
                participantescuenta[a] = new String(partici[a]);
            }
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                for( int b = 0;b<arrdatos[i].totalparticipantes;b++){
                    if(paticipantotales[a].equals(participantescuenta[b])){
                        if(!paticipantotales[a].equals(arrdatos[i].quienpago)){
                        JOptionPane.showMessageDialog(null, participantescuenta[b]+" le debe "+deuda+" a "+arrdatos[i].quienpago);
                        }
                    }
                }
            }
        }
        if(greivin == arrdatos[i].quienpago){
            int deuda = arrdatos[i].montototal/arrdatos[i].totalparticipantes;
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                String[] partici = arrdatos[i].participantes.split(separacion);
                participantescuenta[a] = new String(partici[a]);
            }
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                for( int b = 0;b<arrdatos[i].totalparticipantes;b++){
                    if(paticipantotales[a].equals(participantescuenta[b])){
                        if(!paticipantotales[a].equals(arrdatos[i].quienpago)){
                        JOptionPane.showMessageDialog(null, participantescuenta[b]+" le debe "+deuda+" a "+arrdatos[i].quienpago);
                        
                        }
                    }
                }
            }
        }
        if(david == arrdatos[i].quienpago){
            int deuda = arrdatos[i].montototal/arrdatos[i].totalparticipantes;
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                String[] partici = arrdatos[i].participantes.split(separacion);
                participantescuenta[a] = new String(partici[a]);
            }
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                for( int b = 0;b<arrdatos[i].totalparticipantes;b++){
                    if(paticipantotales[a].equals(participantescuenta[b])){
                        if(!paticipantotales[a].equals(arrdatos[i].quienpago)){
                        JOptionPane.showMessageDialog(null, participantescuenta[b]+" le debe "+deuda+" a "+arrdatos[i].quienpago);
                        
                        }
                    }
                }
            }
        }
        if(tavo == arrdatos[i].quienpago){
            int deuda = arrdatos[i].montototal/arrdatos[i].totalparticipantes;
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                String[] partici = arrdatos[i].participantes.split(separacion);
                participantescuenta[a] = new String(partici[a]);
            }
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                for( int b = 0;b<arrdatos[i].totalparticipantes;b++){
                    if(paticipantotales[a].equals(participantescuenta[b])){
                        if(!paticipantotales[a].equals(arrdatos[i].quienpago)){
                        JOptionPane.showMessageDialog(null, participantescuenta[b]+" le debe "+deuda+" a "+arrdatos[i].quienpago);
                        
                        }
                    }
                }
            }
        }
        if(josua == arrdatos[i].quienpago){
            int deuda = arrdatos[i].montototal/arrdatos[i].totalparticipantes;
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                String[] partici = arrdatos[i].participantes.split(separacion);
                participantescuenta[a] = new String(partici[a]);
            }
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                for( int b = 0;b<arrdatos[i].totalparticipantes;b++){
                    if(paticipantotales[a].equals(participantescuenta[b])){
                        if(!paticipantotales[a].equals(arrdatos[i].quienpago)){
                        JOptionPane.showMessageDialog(null, participantescuenta[b]+" le debe "+deuda+" a "+arrdatos[i].quienpago);
                        
                        }
                    }
                }
            }
        }
        if(andres == arrdatos[i].quienpago){
            int deuda = arrdatos[i].montototal/arrdatos[i].totalparticipantes;
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                String[] partici = arrdatos[i].participantes.split(separacion);
                participantescuenta[a] = new String(partici[a]);
            }
            for(int a = 0;a<arrdatos[i].totalparticipantes;a++){
                for( int b = 0;b<arrdatos[i].totalparticipantes;b++){
                    if(paticipantotales[a].equals(participantescuenta[b])){
                        if(!paticipantotales[a].equals(arrdatos[i].quienpago)){
                        JOptionPane.showMessageDialog(null, participantescuenta[b]+" le debe "+deuda+" a "+arrdatos[i].quienpago);
                        
                        }
                    }
                }
            }
        }
        }
    }   
}