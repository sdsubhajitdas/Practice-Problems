// https://www.interviewbit.com/problems/shortest-unique-prefix/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    24/04/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<String> prefix(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        if(words.size() == 0) return result;
        if(words.size() == 1) {
            result.add(Character.toString(words.get(0).charAt(0)));
            return result;
        }

        Trie trie = new Trie();

        for(String word: words) trie.addWord(word);

        for(String word: words) {
            result.add(this.findShortestPrefix(trie, word));
        }

        return result;
    }

    private String findShortestPrefix(Trie trie, String word) {
        String prefix = "";
        TrieNode node = trie.root;

        for(char c: word.toCharArray()){
            node = node.childList.get(c);
            prefix += node.value;
            if(node.count == 1) break;

        }
        return prefix;
    }

    private class Trie { 
        TrieNode root;
        Trie() {
            this.root = new TrieNode(' ');
        }

        public void addWord(String word) {
            TrieNode node = root;
            for(int idx = 0; idx < word.length(); idx++) {
                char alphabet = word.charAt(idx);
                if(!node.childList.containsKey(alphabet)) {
                    TrieNode alphabetNode = new TrieNode(alphabet);
                    node.childList.put(alphabet, alphabetNode);
                }
                node = node.childList.get(alphabet);
                node.end = (idx == word.length()-1) ? true: node.end;
                node.count++;
            }
        }
    }

    private class TrieNode {
        char value;
        boolean end;
        HashMap<Character, TrieNode> childList;
        int count;

        TrieNode(char value){
            this.value = value;
            this.end = false;
            this.count = 0;
            childList = new HashMap<>();
        }
    }
    
}
