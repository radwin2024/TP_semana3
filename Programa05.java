package programas;
import java.util.Scanner;
public class Programa05 {
        public static void main(String[]args){
        //declarando variables 
        double tem1,tem2,tem3,promedio;
        String condicion;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar la temparatura del día 1:");
        tem1=lectura.nextDouble();
        System.out.println("Ingresar la temparatura del día 2:");
        tem2=lectura.nextDouble();
        System.out.println("Ingresar la temparatura del día 3:");
        tem3=lectura.nextDouble();
        //proceso de datos
        promedio=(tem1+tem2+tem3)/3;
        if(promedio>=25){
            condicion="caluroso";
        }else{
            condicion="fresco";
        }
        //salida de datos
        System.out.println("El promedio de la temperatura es:"+promedio+"°C");
        System.out.println("El clima es:"+condicion);
    }
}

