import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] Dublicados(int[] List){
        int[] SinDuplicados = new int[List.length];
        int con_dubli = 0 ;
        for (int i = 0; i < List.length ; i++){
            boolean Repe = true;
            for (int j = 0 ; j < List.length; j++){
                if (SinDuplicados[j] == List[i]){
                    Repe = false;
                    con_dubli++;
                }
            }
            if (Repe == true){
                SinDuplicados[i] = List[i];
            }

        }
        int[] Array_final = new int[List.length - con_dubli];
        for (int i = 0; i < Array_final.length ; i++){
            Array_final[i] = SinDuplicados[i];
        }
        return Array_final;
    }

    public static void main(String[] args) {
        final int[][] List = {{1},{3,4,6,6,7},{8}};
        //Coger la lista de la posicion 1 meterlo en otra lista y sin dublicados
        int len = List.length;

        int[] Lista_Medio = Dublicados(List[1]);



        //Coger las otras dos lista y quitar los dublicados
        //Lista Izquierda
        int[] Lista_izq = Dublicados(List[0]);
        int[] Lista_Derch = Dublicados(List[2]);

        //Luego  seria contar todos los que estan en la primera lista y multiplicar los por los otros
        int suma = (Lista_izq.length * Lista_Derch.length)* Lista_Medio.length;
        System.out.println(suma);
    }
}

