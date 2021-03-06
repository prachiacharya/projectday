package algorithms.string.trie;

import java.util.List;

import algorithms.string.SearchDAOInterface;

public class Trie implements SearchDAOInterface {
    private TrieNode root = new TrieNode();
    private int startIndex = 0;

    public boolean insert(String word) {
        return root.insert(word, startIndex);
    }

    public boolean search(String word) {
        return root.search(word, startIndex);
    }

    public boolean delete(String word) {
        return root.delete(word, startIndex);
    }

    public List<String> autoSuggest(String prefix) {
        throw new UnsupportedOperationException();
    }

    public List<String> autoCorrect(String word) {
        throw new UnsupportedOperationException();
    }
}
