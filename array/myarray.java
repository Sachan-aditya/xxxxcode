package array;

public class myarray {
    private int[] items;
    private int currentindex = 0;

    public myarray(int initialsize) {
        this.items = new int[initialsize];
    }

    public void insert(int value) {
        if (currentindex >= items.length) {
           int temp[]=new int[items.length*2];//dynamic array 
           for(int i=0;i<currentindex;i++)
           {
            temp[i]=items[i];//after size is completed of items , from 6onwards temp will work
           }
        }
        this.items[currentindex] = value;
        currentindex++;
    }

    public void removeat(int index) {
        if (index >= this.currentindex || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        for (int i = index; i < this.currentindex - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.currentindex--;
        this.items[currentindex] = 0; // Optional: clear the last item
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.currentindex; i++) {
            sb.append(this.items[i]);
            if (i < this.currentindex - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int search(int value) {
        for (int i = 0; i <=this.currentindex;i++) {
            if (this.items[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int maxi()
    {int max=this.items[0];
        for(int i=1;i<this.currentindex;i++)
        {
            if(this.items[i]>max)
          max=this.items[i];
          
        }
        return max;
    }
    public int mini()
    {int min=this.items[0];
        for(int i=1;i<this.currentindex;i++)
        {
            if(this.items[i]<min)
          min=this.items[i];
        
        }
        return min;
    }
//double pointer
 public void reverse()
 {
    int i=0;
    int j=currentindex-1;
    while(i<j)
    {
        int temp=items[i];
        items[i]=items[j];
        items[j]=temp;
        i++;
        j--;
    }
 }

    public static void main(String[] args) {
        myarray arr = new myarray(5);
        arr.insert(10);
        arr.insert(16);
        arr.insert(23);
        arr.insert(78);
        arr.insert(5);
        System.out.println("Reverse:"+arr.toString());
    arr.reverse();
       
        System.out.println(arr.toString());
        int index = arr.search(78);
        System.out.println("Index of 78: " + index);
        System.out.println("MAXMIMUM = "+arr.maxi());
        System.out.println("MINIMUN = "+arr.mini());

        arr.removeat(4);
        System.out.println("after removal"+arr.toString());
      


    }
}
