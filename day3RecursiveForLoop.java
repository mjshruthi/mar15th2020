/* Using the file to learn about git
<<<<<<< HEAD

=======
making changes in brnch2 to see
>>>>>>> brnch2
 have lost data when I hit synchronize on Intellij i.e. changes in brnch2 los for second commit
 this is for second commit in brnch1 - adding here due to merge conflict.
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
