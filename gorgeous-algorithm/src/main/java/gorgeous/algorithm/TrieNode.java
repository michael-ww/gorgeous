package gorgeous.algorithm;

import java.util.HashMap;

public class TrieNode {

    private Integer pass;
    private Integer end;
    private String value;
    private HashMap<Integer, TrieNode> next;

    public TrieNode() {
        this.pass = 0;
        this.end = 0;
        this.next = new HashMap<>();
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashMap<Integer, TrieNode> getNext() {
        return next;
    }

    public void setNext(HashMap<Integer, TrieNode> next) {
        this.next = next;
    }
}
