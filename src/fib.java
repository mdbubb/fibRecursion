/**
 * Created by mdb17 on 1/19/2017.
 */
public  class fib {

    public static int solve(int n){
        if(n==0){
            return 1;

        }
        else if(n==1){
            return 1;
        }

        else{
            j =  solve(n-1)+ solve(n-2);
            return solve(n-1)+ solve(n-2);

        }
    }
    public static int j;
}
