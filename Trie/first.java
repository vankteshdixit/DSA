package Trie;

public class first {
    static class TrieNode{
        TrieNode[] children; //26 size
        boolean endOfWord;

        public TrieNode(){
            children = new TrieNode[26]; //a - z
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static TrieNode root = new TrieNode();

    public static void insert(String word){ //O(L) L = key length
        TrieNode curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) -'a';
            if(curr.children[idx] == null){
//                add new node
                curr.children[idx] = new TrieNode();
            }
            if(i == word.length()-1){
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }
    public static boolean search(String key){
        TrieNode curr = root;
        for (int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            TrieNode node = curr.children[idx];
            if(node == null){
                return false;
            }
            if(i == key.length()-1 && !node.endOfWord){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the","a","there","their","any"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
