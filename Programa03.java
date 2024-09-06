package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        double nt1,nt2,resultado;
        String ope;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar número 1:");
        nt1=lectura.nextDouble();
        System.out.println("Ingresar número 2:");
        nt2=lectura.nextDouble();
        System.out.println("Ingresar operación [+,-,*,/]:");
        ope=lectura.next();
        //proceso de datos
        if(ope.equals("+")){
            resultado=nt1+nt2;
        }else if(ope.equals("-")){
            resultado=nt1-nt2;
        }else if(ope.equals("*")){
            resultado=nt1*nt2;
        }else {
            resultado=nt1/nt2;
        }
        //salida de datos
        System.out.println(resultado);
    }   
}
    
