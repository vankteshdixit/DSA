package backtrack;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(1,1));
    }
    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r-1, c);
        int down = count(r, c-1);
        return (right+down);
    }
}
