package data;

public class Cliente extends Persona{
private int saldo;
 
public Cliente(String nombre, String apellido, String documento, int saldo){
super(nombre, apellido,documento);
this.saldo=saldo;
}

    public Cliente() {
     
    }

public int getSaldo(){
return saldo;
}

public void setSaldo(int saldo){
this.saldo=saldo;

}
 


}