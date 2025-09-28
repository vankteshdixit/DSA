package Recursion;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
    }
    public static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+", ");
            return;
        }
        char ch = unprocessed.charAt(0);
//        take
        subseq(processed+ch, unprocessed.substring(1));
//        ignore
        subseq(processed, unprocessed.substring(1));
    }
}
