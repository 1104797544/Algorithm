package com.jzf.leetcode.stringmatch;

import com.sun.xml.internal.ws.api.message.Header;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/6 <br>
 * @see com.jzf.leetcode.stringmatch <br>
 * @since V9.0 <br>
 */
class Trie {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.search("apple");   // 返回 True
        trie.search("app");     // 返回 False
        trie.startsWith("app"); // 返回 True
        trie.insert("app");
        trie.search("app");     // 返回 True


        trie = new Trie();
        trie.insert("hello");
        trie.search("hell");
        trie.search("helloa");
        trie.search("hello");
        trie.startsWith("hell");
        trie.startsWith("helloa");
        trie.startsWith("hello");
    }

    private Node root;

    class Node {

        private Node[] child;
        // 完全匹配的标志
        private boolean isEnding = false;

        public Node(Node[] child) {
            this.child = child;
        }

    }

    public Trie() {
        root  = new Node(new Node[26]);
    }

    public void insert(String word) {
        char[] words = word.toCharArray();
        Node p = root;
        for (int i = 0; i < words.length; i++) {
            int j = words[i] - 'a';
            if (p.child[j] != null) {
                p = p.child[j];
                continue;
            }
            else {
                p.child[j] = new Node(new Node[26]);
            }
            p = p.child[j];
        }
        p.isEnding = true;
    }

    public boolean search(String word) {
        char[] words = word.toCharArray();
        Node p = root;
        int i = 0;
        for (; i < words.length; i++) {
            int j = words[i] - 'a';
            if (p.child[j] == null) {
                return false;
            }
            else {
                p = p.child[j];
            }
        }
        if (p.isEnding) {
            return true;
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        char[] words = prefix.toCharArray();
        Node p = root;
        for (int i = 0; i < words.length; i++) {
            int j = words[i] - 'a';
            if (p.child[j] == null) {
                return false;
            }
            p = p.child[j];
        }
        return true;
    }
}