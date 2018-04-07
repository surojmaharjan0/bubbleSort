        /*
        Here, I sort (ascending) from right to left
        i.e after 1 iteration, the larges element bubbles up 
        at end of array
        */
public class BubbleSort{
    public static void main(String [] args){
        //an array to sort
        int[]a={34,65,-12,4,9};
        //calling function to sort (in ascending order)
        bubbleSort(a);
        //print sorted array
        System.out.println("Sorted array:");
        for(int i:a){
            System.out.printf("%d\t",i);
        }
    }
    private static void bubbleSort(int[]a){
        int sortedIndex=a.length-1;
        while(sortedIndex>0){
            for(int i=0;i<sortedIndex;i++){
                if(a[i]>a[i+1]){
                    //if currently scanned number is larger, swap
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
            sortedIndex--; //one more number gets sorted
        }
    }
}