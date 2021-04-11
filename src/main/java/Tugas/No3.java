
package Tugas;

public class No3 {
    public static void Selection(int A[]){
        int smallIndeks;
        int pass, j, n = A.length;
        int temp;
        
        
        for(pass = 0; pass < n - 1; pass++){
            smallIndeks = pass;
            for(j = pass + 1; j < n; j++){
                if(A[j] < A[smallIndeks]){
                    smallIndeks = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallIndeks];
            A[smallIndeks] = temp;
        }
    }
    
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();   
    }
    
    public static void main(String[] args){
        System.out.println("Muhammad Reziq Darusman (20090127) Kelas 2B");
        System.out.println();
        int A[] = {25, 7, 9, 13, 3};
        No3.tampil(A);
        No3.Selection(A);
        No3.tampil(A);
        
       
        
    }
}

