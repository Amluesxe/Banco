package businessLogic;
import java.util.ArrayList;
import java.util.Scanner;
import data.Cliente;
import ui.Imprimir;

import java.util.HashMap;
public class Banco{
private static Cliente cliente1;
private static Cliente cliente2;
private static Cliente cliente3;
private static Cliente usuario;
public static void main(String args[]){

cliente1= new Cliente("Juan","Torres","1010143201",1000000);
cliente2= new Cliente("David","Torres","1010143202",200000);
cliente3= new Cliente("Jonas","Torres","1010143203",200000);
ArrayList<Cliente> listaDeClientes= new ArrayList<>();
Presentacion();
}

public static boolean isNumeric(String cadena) {
       boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

public static void Presentacion(){
Scanner sc = new Scanner(System.in);
Imprimir.Bienvenida();
usuario= new Cliente();
Imprimir.PedirNombre();
usuario.setNombre(sc.nextLine());
Imprimir.PedirApellido();
usuario.setApellido(sc.nextLine());


ComprobarDocumento();
}


 public static void ComprobarDocumento(){
 Scanner sc = new Scanner(System.in);
     int numero;
Imprimir.PedirDocumento();
usuario.setDocumento(sc.nextLine());
        if (isNumeric(usuario.getDocumento()) == true) {
            numero = Integer.parseInt(usuario.getDocumento());
Imprimir.MostrarDiccionario();

Imprimir.MostrarTodoDiccionario(usuario,cliente1,cliente2, cliente3);
        } else {
              System.out.println("Ha digitado erroneamente el documento, porfavor digite de nuevo");
            ComprobarDocumento();
        }

 }

 public static void ComprobarSalario(){
 
 if(cliente1.getSaldo()>=1000000){
 
 
 }
 if(cliente2.getSaldo()>=1000000){
 
 
 }
 
 if(cliente3.getSaldo()>=1000000){
 
 
 }
 
 }


}

