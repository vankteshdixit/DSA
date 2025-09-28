package Linear_Search;

public class stringSearch {
    public static void main(String[] args) {
        String name = "Vanktesh";
        char target = 'd';
        System.out.println(search(name, target));
    }
    public static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==target) return true;
        }
        return false;
    }
}
