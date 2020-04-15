/* Using the file to learn about git
making changes in brnch2 to see
 */

public class day3RecursiveForLoop {
    static int count = 0;
    public static void main(String[] args) {
        func();
        System.out.println(factorial(8));
    }

    static void func(){
        count++; //--> 0-->1, 1-->2 ...5-->6
        if(count<=5){//1 <=5, 2<=5, 5<=6
            System.out.println("hello:: " +count);
            func();
        }
    }


    static int factorial(int n){
        if(n==1)
            return 1;
        else
            return(n*factorial(n-1));
    }
}
