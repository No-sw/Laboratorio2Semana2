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
        char [] caracteres = {'!','"','@','#','$','%','&','(',')','=','-','¡','!','¿','?',
        '+','^','`','´',',','.',';',':','{','}','/','|'};
        char [] invertido = new char[arr.length];
        int contador = arr.length;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < caracteres.length; j++){
                if(arr[i] == caracteres[j]){
                    invertido[i] = arr[i];
                    break;
                }
                else if(arr[i] != caracteres[j] && j == arr.length-1){
                    invertido[i] = ' ';
                }
            }
        }
        for(int x=arr.length; x > 0; x--){
            if(invertido[x-1] == ' '){
                for(int y=0; y < caracteres.length; y++){
                    if(arr[arr.length-contador] == caracteres[y]){
                        x++;
                        break;
                    }
                    else if(arr[arr.length-contador] != caracteres[y] && y == caracteres.length-1){
                        invertido[x-1] = arr[arr.length-contador];
                    }
                }
                contador--;
            }
        }
        for(int z=0; z < invertido.length; z++){
            System.out.print(invertido[z]);
        }    
    }
}
