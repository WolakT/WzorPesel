package com.company;

/**
 * Created by marcin on 26.05.2017.
 */
public class PeselTreeNode {
    private boolean[] used;
    private PeselTreeNode[] children;

    public PeselTreeNode(int level) {
        if(level < 11) {
            this.used = new boolean[10];
            this.children = new PeselTreeNode[10];

            for(int i = 0; i < 10; i++) {
                this.children[i] = new PeselTreeNode(level + 1);
            }
        }
    }

    public void markUsed(int digit) {
        this.used[digit] = true;
    }

    public boolean isUsed(int digit) {
        return this.used[digit];
    }

    public PeselTreeNode getChild(int digit) {
        return this.children[digit];
    }
}
