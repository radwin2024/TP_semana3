package programas;
import java.util.Scanner;
public class Programa06 {
    public static void main(String[]args){
        //declarando variables 
        double precio1,precio2,precio3,promedio;
        String condicion;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar el precio del producto 1:");
        precio1=lectura.nextDouble();
        System.out.println("Ingresar el precio del producto 2:");
        precio2=lectura.nextDouble();
        System.out.println("Ingresar el precio del producto 3:");
        precio3=lectura.nextDouble();
        //proceso de datos
        promedio=(precio1 + precio2 + precio3)/3;
        if(promedio>=50){
            condicion="Costoso";
        }else{
            condicion="Economico";
        }
        //salida de datos
        System.out.println("El promedio de los precios es:"+promedio);
        System.out.println("La compra es:"+condicion);
    }
}
