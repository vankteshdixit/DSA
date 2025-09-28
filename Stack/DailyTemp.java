package Stack;

public class DailyTemp {
    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        int n = arr.length;
        int res[] = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = 0;
            for(int j = i+1; j < n; j++){
                if(arr[i] < arr[j]){
                    res[i] = j-i;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
