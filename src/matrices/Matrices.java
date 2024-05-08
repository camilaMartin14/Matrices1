package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
/*
1. Create a 3x3 array of numbers by asking for each number.
At the end it loops trough the array and displays it (double loop).
*/
    Scanner sc = new Scanner (System.in);
    
    int [][] matriz = new int [3][3];
    
    
    //rellenar
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Write a number in the position i: " + i + " j: " + j);  
                matriz[i][j] = sc.nextInt();
            }
        }
        
        
        //mostrar
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");//way to sort the table
            }
            System.out.println("");
        }    
    
/*
2. Create a 3x3 array.
Create a function that passes an array and a row (number) 
to display only that row.    
*/
        int [][] matriz2 = 
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

       muestraFilaMatriz(matriz2,0);//Here i change the row number 
/*
3. Create a 3x3 array.
Create a function that passes an array and a column (number) to show only that 
column.       
*/
        int [][] matriz3=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
      
        muestraColumnaMatriz (matriz3, 0);
/*
4.Create a 3x3 array of numbers and runs troush its main diagonal and
        its reverse diagonal.
*/      int[][] matriz4 =
        {
            {1,2,3},
            {4,5,6,},
            {7,8,9}
        };
        /*
            00 01 02
            10 11 12
            20 21 22
        */
        System.out.println("Main diagonal");
        for (int m = 0; m < matriz4.length; m++) {
            System.out.println(matriz4[m][m]);
        }
        System.out.println("Reverse diagonal");
        for (int m = 0, n= matriz4[0].length-1; m < matriz4.length; m++, n--) {
            System.out.println(matriz4[m][m]);
        }
/*
5. Create a 3x3 array.
Create a function that, passing the array and the row to review, indicates if
the values of that row are identical        
*/    
        int [][] matriz5 = {
            {1,2,3},
            {4,4,4},
            {7,8,9}
        };
        System.out.println(filaIdenticaMatriz(matriz5, 1));
    
    
    
    
    
    
    }
    //2.
    public static void muestraFilaMatriz (int[][] matriz2, int fila) {
        if (fila>=0 && fila<matriz2.length) {
            for (int k = 0; k < matriz2[0].length; k++) {
                System.out.println(matriz2[fila][k]);   
            }
        }else{
            System.out.println("The row is not correct");
        }
    }
    //3.
    public static void muestraColumnaMatriz (int[][]matriz3, int columna){
        if (columna>=0 && columna<matriz3[0].length) {
            
            for (int l = 0; l < matriz3.length; l++) {
                System.out.println(matriz3[l][columna]);}
        }else{
                    System.out.println("The column is not valid");
        }
    }
    public static boolean filaIdenticaMatriz (int[][] matriz5, int fila5) {
        if (fila5 >= 0 && fila5<matriz5.length) {
           
            int primerValor = matriz5 [fila5][0];
            
            for (int o = 1; o < matriz5[0].length; o++) {
                if (primerValor != matriz5[fila5][o]) {
                    return false;
                }
            }
            return true;
            
        }else{
            return false;
        }
    }








} 
    
    
