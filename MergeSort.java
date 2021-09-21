import java.io.IOException;

public class MergeSort
{
    public static void merge(int array[] , int left ,int middle , int right)
    {
        int leftarr[]=new int [middle-left+2];
        int rightarr[]=new int [right-middle+1];

        for(int i=0;i<=middle-left;i++)
            leftarr[i]=array[left+i];
        for(int i=0;i<=right-middle;i++)
            rightarr[i]=array[middle+1+i];

        leftarr[middle-left+1]=Integer.MAX_VALUE;
        rightarr[right-middle]=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        for(int k=left;k<=right;k++){
            if(leftarr[i]<rightarr[j]){
                array[k]=leftarr[i];
                i++;
            }
            else{
                array[k]=rightarr[j];
                j++;
            }
        }
    }
    public static void printarr(int array[])
    {
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }

    public static void mergesort(int array[] , int left , int right)
    {

    if(right>left)
    {int m = (right+left)/2;
    mergesort(array,left,m);
    mergesort(array,m+1,right);
    merge(array,left,m,right);
    }
    }
    public static void main(String[] args)throws IOException {
        int array[]={1,6,4,3,5,67,343,2,43,7,56,34,65};
        mergesort(array,0,12);
        printarr(array);
    }
}
