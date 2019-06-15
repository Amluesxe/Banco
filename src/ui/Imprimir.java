package ui;

import data.Cliente;
import java.util.HashMap;

public class Imprimir{

public static void Bienvenida(){
System.out.println("Bienvenido al Banco\n ");
}
public static void PedirNombre(){
System.out.println("Digite su nombre:\n");
}
public static void PedirApellido(){
System.out.println("Digite su apellido:\n");
}
public static void PedirDocumento(){
System.out.println("Digite su documento:\n");
}
 public static void MostrarDiccionario(){
System.out.println("Los usuarios registrados en el banco son:\n");
}
public static void MostrarTodoDiccionario(Cliente usuario, Cliente cliente1,Cliente cliente2,Cliente cliente3){
HashMap<String,String> hashMap= new HashMap<String,String>();
hashMap.put(usuario.getDocumento(),usuario.getNombre());
hashMap.put(cliente1.getDocumento(),cliente1.getNombre());
hashMap.put(cliente2.getDocumento(),cliente2.getNombre());
hashMap.put(cliente3.getDocumento(),cliente3.getNombre());
System.out.println(hashMap);
}

}