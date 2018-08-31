package string;

public class UsingCharArray {

    public void reverArray(char array[], int start, int end){
        char temp;
        if(start>=end)
            return;
        else {
            temp= array[start];
            array[start]=array[end];
            array[end]=temp;
            reverArray(array, start+1,end-1);
        }
    }


     void printArray(char arr[], int size)
    {
        for (int i=0; i <size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    public static void main(String[] args){
        UsingCharArray reverse= new UsingCharArray();
        String str="Sastish Naru";
        char array[]= str.toCharArray();
        reverse.reverArray(array,0,array.length-1);
        reverse.printArray(array,array.length);
    }
}
