import java.util.Arrays;

public class fastmerge {

    public static void merge(int num1[],int m,int num2[],int n)
    {
int index=0;
for(int i=m;i<num1.length;i++)
{
    num1[i]=num2[index];
    index++;
}
Arrays.sort(num1);
}
    
    public static int[] mergeArrays(int num1[], int m, int num2[], int n)
    {
int i=0;int j=0;
int[]arr =new int[num1.length];
int index=0;
while(i<m && j<n)
{
    if(num1[i]<num2[j])
    {
        arr[index]=num1[i];
        index++;i++;
    }
    else
    {
        arr[index]=num2[j];
        index++;j++;
    }

}
while (i<m) {
    
   
        arr[index]=num1[i];
        index++;i++;
    

}
while (j<n) {
    
   
    arr[index]=num2[j];
    index++;j++;

    
}
return arr;
    }
    public static void main(String[] args) {
        int[] num1=new int[]{1,2,3,0,0,0};
        int m=3;//3 integers
        int[] num2=new int[]{2,5,6};
        int n=3;
        int [] result=mergeArrays(num1, m, num2, n);
        System.out.println(Arrays.toString(result));
        merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));

    }
}
