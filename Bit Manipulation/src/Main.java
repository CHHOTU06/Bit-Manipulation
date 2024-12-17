public class Main {

    // Check a number is Even or Odd
    public static void evenOrOdd(int n){
        int Bitmask=1;
        if((n & Bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    // To know ith bit of a number
    public static int ithBit(int n,int i){
        int Bitmask=(1<<i);
        if((n & Bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // To set ith Bit
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return (n | bitMask);
    }

    // Clear ith bit
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    // Update ith bit
    public static int updateIthBit(int n,int i,int newBit){
        n=clearIthBit(n,i);
        int BitMask=newBit<<i;
        return n | BitMask;
        // OR
//        if(newBit==0){
//            return clearIthBit(n,i);
//        }
//        else{
//            return setIthBit(n,i);
//        }
    }

    // Clear 1st i bit
    public static int clearIBit(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }

    // Clear bit from range i to j
    public static int clearItoJBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }

    // check if a number is a power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return(n & (n-1))==0;
    }

    // Count set Bits in a number
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    // Fast Exponentiation  (a^n)
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if ((n & 1) != 0) {
                ans=a*ans;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    //Swap two numbers without using 3rd variable
    public static void swapNum(int a,int b){
        System.out.println("Numbers without swap:"+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers after swap:"+a +" "+b);
    }

    //Adding 1 in any integer by bit manipulation
    public static int addOne(int n){
        return -(~n);
    }

    // Convert uppercase into Lowercase
    public static void upperIntoLowerCase(){
        for(char ch='A';ch<='Z';ch++){
            System.out.println((char)(ch|' '));
        }
    }
    // Main Function
    public static void main(String[] args) {
        //System.out.println(~19);
        //evenOrOdd(87);
        //System.out.println(ithBit(10 ,3));
        //System.out.println(seIthBit(10,2));
        //System.out.println(clearIthBit(10,1));
        //System.out.println(updateIthBit(10,2,1));
        //System.out.println(clearIBit(15,2));
        //System.out.println(clearItoJBit(10,2,4));
        //System.out.println(isPowerOfTwo(16));
        //System.out.println(countSetBit(15));
        //System.out.println(fastExpo(3,5));
        //swapNum(3,5);
        //System.out.println(addOne(12568));
        upperIntoLowerCase();
    }
}