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
        System.out.print("Ingrese su texto: ");
        String texto = entrada.nextLine();
        char [] arr = texto.toCharArray();
        char [] invertido = new char[arr.length];
        int j = arr.length;
        for(int i=0; i < arr.length; i++){
            if((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z')){
                invertido[i] = ' ';
            }else{
                invertido[i] = arr[i];
            }
        }
        for(int x=arr.length; x > 0; x--){
            if(invertido[x-1] == ' '){
                if((arr[arr.length-j] >= 'A' && arr[arr.length-j] <= 'Z') || (arr[arr.length-j] >= 'a' && arr[arr.length-j] <= 'z')){
                    invertido[x-1] = arr[arr.length-j];
                }
                else{
                    x++;
                }
                j--;
            }
        }        
        for(int z=0; z < invertido.length; z++){
            System.out.print(invertido[z]);
        }    
    }
}
