/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

public class Folio {
    
    public int idFolio;
    public String sucursal;
    public  int numRemision;
    public boolean disp;
    public boolean anulado;
    public  byte dia;
    public  byte mes;
    public  int año;
    public String comentarios;
    
    public Folio(int i, int n, boolean d, boolean m, byte dia1, byte mes1, int a, String s){
    this.idFolio = i;
    this.numRemision = n;
    this.disp =  d;
    this.anulado = m;
    this.dia = dia1;
    this.mes = mes1;
    this.año = a;
    this.sucursal = s;
}
    
    @Override
    public String toString(){
        String num = "Número de remision:" + String.valueOf(this.numRemision);
        String suc = "Sucursal donde se encuentra:" + this.sucursal;
        String dispo = "Está disponible:" + String.valueOf(this.disp);
        String esta = "Está en mal estado:" + String.valueOf(this.anulado);
        String dia1 = "Dia que se expidio:" + String.valueOf(this.dia);
        String mes1 = "Mes que se expidio:" + String.valueOf(this.mes);
        String año1 = "Año que se expidio:" + String.valueOf(this.año);
        String com = null;
        if(this.comentarios!=null){
            com = "Comentarios: " + this.comentarios;
        }
        String fn;
        fn = num + "\n" + suc + "\n" + dispo + "\n" + esta + "\n";
        fn += dia1 + "\n" + mes1 + "\n" + año1;
        if(com!=null){
            fn += "\n" + com;
        }
        return fn;
    }
    
    public void setComentarios(String c){
        this.comentarios = c;
    }
    
}
