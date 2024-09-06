package programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[]args){
        //declarando variables 
      int n1,n2,n3,n4,menor;
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
      menor=n1;
      if(n2<menor){
          menor=2;
      }
      if(n3<menor){
          menor=3;
      }
      if(n4<menor){
          menor=4;
      }
      //salida de datos
        System.out.println("El número menor es:"+menor);
    }
}
