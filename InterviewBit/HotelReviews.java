// https://www.interviewbit.com/problems/hotel-reviews/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    24/04/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(String goodWords, ArrayList<String> reviews) {
        Trie trie = new Trie();
        ArrayList<ArrayList<Integer>> idxToScoreMap = new ArrayList<>();
        ArrayList<Integer> resultOrder = new ArrayList<>();

        for(String goodWord: goodWords.split("_")) trie.addWord(goodWord.trim());

        for(int idx=0; idx < reviews.size(); idx++) {
            ArrayList<Integer> idxScoreMap = new ArrayList<>();
            idxScoreMap.add(idx);
            idxScoreMap.add(this.calculateGoodScore(trie, reviews.get(idx).trim().split("_")));

            idxToScoreMap.add(idxScoreMap);
        }

        Collections.sort(idxToScoreMap, new IndexScoreCustomComparator());

        for(ArrayList<Integer> element: idxToScoreMap){
            resultOrder.add(element.get(0));
        }

        return resultOrder;
    }

    private int calculateGoodScore(Trie trie, String[] words) {
        int score = 0;
        for(String word: words) {
            score += trie.wordExists(word)? 1 : 0;
        }
        return score;
    }


    private class IndexScoreCustomComparator implements Comparator<ArrayList<Integer>> {

        public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
            return b.get(1) - a.get(1);
        }
    }

    private class Trie {
        private class TrieNode {
            char value;
            boolean end;
            HashMap<Character, TrieNode> childList;

            TrieNode(char value){
                this.value = value;
                this.end = false;
                childList = new HashMap<>();
            }
        }
        
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
            }
        }

        public boolean wordExists(String word) {
            TrieNode node = root;
            for(int idx = 0; idx < word.length(); idx++) {
                char alphabet = word.charAt(idx);
                if(!node.childList.containsKey(alphabet)) return false;
                
                node = node.childList.get(alphabet);
            }
            return node.end;
        }
    }
}