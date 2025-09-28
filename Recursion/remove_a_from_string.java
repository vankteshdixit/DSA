package Recursion;

public class remove_a_from_string {
    public static void main(String[] args) {
//        skip("","adrsaf");
        System.out.println(remove("adrsaf"));
    }
    public static void skip(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }else{
            skip(processed+ch, unprocessed.substring(1));
        }
    }
//
    public static String remove(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            return remove(unprocessed.substring(1));
        }else{
            return ch + remove(unprocessed.substring(1));
        }
    }
}
