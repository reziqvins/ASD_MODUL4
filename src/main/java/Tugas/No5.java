
package Tugas;

public class No5 {
    public static void main(String[] args) {
        double A [] = {25,7,9,13,3};
        System.out.println("Data yang belum diurutkan : ");
        No5.print(A);
        No5.quicksort(A,0,A.length-1);
        System.out.println("Data yang sudah diurutkan : ");
        No5.print(A);
    }
    public static int partition(double [] A,int B,int C ){
        int x,y;
        double pivot;
        pivot = A[B];
        x = B-1;
        y = C + 1;
        for(;;){
            do{
                x++;
            }while(A[x]< pivot);
            do{
                y--;
            }while(A[y]> pivot);
            
            if(x<y){
                double temp = A[x];
                A[x] = A[y];
                A[y] = temp;
            }else{
                return y;
            }
        }
    }
    public static void quicksort(double[] A,int B,int C){
        int D;
        if(B<C){
            D =partition (A,B,C);
            quicksort(A,B,D);
            quicksort(A,D+1,C);
        }
    }
    public static void print(double [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
            
        }
        System.out.println();
    }
}
