import java.util.List;
import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }
}

class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        Trie trie = new Trie();
        for (String forbiddenString : forbidden) {
            trie.insert(forbiddenString);
        }

        int maxLength = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            int j = i;
            TrieNode current = trie.root;
            while (j < n) {
                char ch = word.charAt(j);
                int index = ch - 'a';

                if (current.children[index] == null || trie.search(word.substring(i, j + 1))) {
                    break;
                }

                if (current.children[index].isEndOfWord) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }

                current = current.children[index];
                j++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String word = "cbaaaabc";
        List<String> forbidden = Arrays.asList("aaa", "cb");
        int result = solution.longestValidSubstring(word, forbidden);
        System.out.println(result);  // Output: 4
    }
}
