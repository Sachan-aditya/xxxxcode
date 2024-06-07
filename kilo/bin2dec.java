package  kilo;
public class bin2dec {
    public static void main(String[] args) {
        Converter converter=new Converter();
        System.out.println(converter.tobinary(3));
        System.out.println(converter.todecimal(1001));

    }
    
}

class Converter
{
    public String tobinary(int decimal)
    {
        String res="";int result=0;
        while(decimal>0)
        {
            result=decimal&1;//last bit 1010&1=0000 
            res=result+res;
            decimal>>=1;//0101&1=0001 , so ans=1

        }
        return res;
    }
    public int todecimal(int binary)
    {
        int res=0;int result=0;int c=0;
        while(binary>0)
        {
            result=binary%10;
            if(result==1)
            {
            res=res+(int)Math.pow(2,c);
            }
            c++;
            
            

         binary/=10;

        }
        return res;
    }

}