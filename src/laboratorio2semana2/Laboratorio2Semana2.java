/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2semana2;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class Laboratorio2Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese cualquier palabra: "); 
        String texto = entrada.nextLine();
        char [] arr = texto.toCharArray();
        System.out.println("Texto inverso");
        for(int x=arr.length; x > 0; x--){
            System.out.print(arr[x-1]);
        }
    }
}
