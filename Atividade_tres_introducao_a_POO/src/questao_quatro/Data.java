package questao_quatro;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public final class Data {
    private int dia;
    private int mes;
    private int ano;
    
    
    
    public boolean validaData (){
        return (validaDia(dia) && validaMes(mes) && validaAno(ano));
    }
     
    private boolean Trinta(){
        return (mes == 4 || mes == 6 || mes == 9 || mes == 11);
    }
    private boolean fev(){ 
        return (mes == 2);
    } 
   public boolean bicesto(){
        return (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
    }
    private int maxDias(){
        int max;
        if(fev()){
            if(bicesto()){ max = 29; } else{ max = 28; }
        } else {
            if(Trinta()){ max = 30; } else { max = 31; }
        }
        return max;
    }
    
    private boolean validaAno(int ano){
        return ano > 0;
    }

    /**
     *
     * @param ano insira o ano
     */
    public void setAno(int ano) {
        if(validaAno(ano)){
            this.ano = ano;
        } else{
            JOptionPane.showMessageDialog(null, "O ano inserido não é valido, reinsira a data");
        }
    }
    
    private boolean validaMes(int mes){
        return (mes <= 12) && (mes > 0);
    }
    
    /**
     *
     * @param mes insira o mes para validação
     */
    public void setMes(int mes){
        if(validaMes(mes)){
            this.mes = mes;
        } else{
            JOptionPane.showMessageDialog(null, "O mês inserido não é valido, reinsira a data");
        }
    }
    
    private boolean validaDia(int dia){
        return (dia > 0) && (dia <= maxDias());
    }
    
    /**
     *
     * @param dia insira o dia para validação
     */
    public void setDia(int dia){
        if(validaDia(dia)){
            this.dia = dia;
        } else {
            JOptionPane.showMessageDialog(null, "O dia inserido não é valido, reinsira a data");
        }
    }
    
    /**
     *
     * @param dia
     * @param mes
     * @param ano
     */
    public Data(int dia, int mes, int ano) {        
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    
   public Data(){
       LocalDate dataUser = LocalDate.now();
       this.dia = dataUser.getDayOfMonth();
       this.mes = dataUser.getMonthValue();
       this.ano = dataUser.getYear();
   }   

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    /**
     *
     * @return retorna a data cadastrada no objeto no formato xx/xx/xxxx
     */
    public String DtString(){
       return String.format("%02d/%02d/%04d", dia, mes, ano);
   }
   
   public void avancar(){
       if(dia == maxDias()){
           dia = 1;
           if(mes == 12){
               mes = 1 ;
               ano++;
           } else {
               mes++;
           }
       } else {
           dia++;
       }
       
       JOptionPane.showMessageDialog(null,"A data foi avançada em 1 dia, data atual: "+DtString());
   }
   
   public int[] arrayData(){
       int[] vetData = new int[3];
       vetData[0] = dia;
       vetData[1] = mes;
       vetData[2] = ano;
       return vetData;
   }
   
   public static int comparar(Data a, Data b){
       if(a.ano>b.ano){
           return 1;
       } else if(a.ano<b.ano){
           return -1;
       } else{
           if(a.mes>b.mes){
               return 1;
           } else if(a.mes<b.mes){
               return -1;
           } else{
               if(a.dia>b.dia){
                   return 1;
               } else if(a.dia<b.dia){
                   return -1;
               } else{
                   return 0;
               }
           }
       }
   }
}
