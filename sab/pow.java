package sab;

public class pow {

    public static int power(int a , int b){
        if(b==0) return 1;
        int ans = power(a,b/2);
        if(b%2 == 0){
            return (ans)*(ans);
        }
        else {
            return (ans)*(ans)*a;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(123, 2345));
    }
}

//0log(b)
