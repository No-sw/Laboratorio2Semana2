/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2semana2;
import java.util.Scanner;
import java.util.*;

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
        System.out.print("Ingrese las palabras: ");
        String texto = entrada.nextLine();
        
        Stack<Character> letters = new Stack();
        
        for(int i=0; i < texto.length(); i++){
            if(Character.isLetter(texto.charAt(i))){
                letters.push(texto.charAt(i));
            }
        }
        
        StringBuilder reversed_String = new StringBuilder();
        
        for(int j=0; j < texto.length(); j++){
            if(Character.isLetter(texto.charAt(j))){
                reversed_String.append(letters.pop());
            } else{
                reversed_String.append(texto.charAt(j));
            }
        }
        System.out.println(reversed_String.toString());    
    }
}
