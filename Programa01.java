package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[]args){
        //declarando variables 
      int n1,n2,n3,n4,mayor;
      Scanner lectura=new Scanner(System.in);
      //entrada de datos 
      System.out.println("Ingresar Número 1:");
      n1=lectura.nextInt();
      System.out.println("Ingresar Número 2:");
      n2=lectura.nextInt();
      System.out.println("Ingresar Número 3:");
      n3=lectura.nextInt();
      System.out.println("Ingresar Número 4:");
      n4=lectura.nextInt();
      //proceso de datos
      mayor=n1;
      if(n2>mayor){
          mayor=2;
      }
      if(n3>mayor){
          mayor=3;
      }
      if(n4>mayor){
          mayor=4;
      }
      //salida de datos
        System.out.println("El número mayor es:"+mayor);
    }
}
