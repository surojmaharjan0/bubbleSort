public class BubbleSort{
    public static void main(String [] args){
        //an array to sort
        int[]a={34,65,-12,4,9};
        //calling function to sort (in ascending order)
        bubbleSort(a);
        //print sorted array
        System.out.println("Sorted array:")
        for(int i:a){
            System.out.printf("%d",i);
        }
    }
    private static void bubbleSort(int[]a){
        /*we sort from right to left
        i.e after 1 iteration, the larges element bubbles up 
        at end of array
        */
    }
}