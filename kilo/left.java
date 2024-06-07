package kilo;
public class left {
    public static void main(String[] args) {
        int n=4;
        System.out.println(n<<1);//left shift 1 bit 
    
        System.out.println(n>>1);//right shift 1 bit 
    }
}
//100<<1 = 1000 add 0 at last in left shifft  , so ans is acc to 8421= 8
//100<<2 = 1000 and then again 10000 so ans it -16

// for right shift , 100>>2 means 010,(remove 0 from last), thne agains 001 (remove 0 from last), 
// so answer is 1 

