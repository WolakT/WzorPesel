package com.company;

/**
 * Created by marcin on 26.05.2017.
 */
public class MyPeselSet {
    private PeselTreeNode rootTreeNode;


    public MyPeselSet() {
        this.rootTreeNode = new PeselTreeNode(0);
    }


    public boolean add(String pesel) {
        if(isPresent(pesel)) {
            return false;
        } else {
            PeselTreeNode current = this.rootTreeNode;
            int currentLevel = 0;

            while(currentLevel < 11) {
                int currentDigit = pesel.toCharArray()[currentLevel] - 48;
                current.markUsed(currentDigit);

                current = current.getChild(currentDigit);
                currentLevel++;
            }
            return true;
        }
    }

    private boolean isPresent(String pesel) {
        PeselTreeNode current = this.rootTreeNode;
        int currentLevel = 0;

        while(currentLevel < 11) {
            int currentDigit = pesel.toCharArray()[currentLevel] - 48;
            if(!current.isUsed(currentDigit)) {
                return false;
            } else {
                current = current.getChild(currentDigit);
                currentLevel++;
            }
        }

        return true;
    }
}
