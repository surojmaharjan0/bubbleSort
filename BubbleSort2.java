/*
In this, i sort (ascending) from left to right
at each iteration, the lowest number bubbles to left of the array
*/
public class BubbleSort2{
    public static void main(String [] args){
         //an array to sort
        int[]a={34,65,-12,4,9};
        //calling function to sort (in ascending order)
        bubbleSort2(a);
        //print sorted array
        System.out.println("Sorted array:");
        for(int i:a){
            System.out.printf("%d\t",i);
        }
    }
    private static void bubbleSort2(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}