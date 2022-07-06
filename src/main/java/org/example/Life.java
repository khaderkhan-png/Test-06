package org.example;

import java.util.ArrayList;

public class Life {

    public Life() {

    }


    public ArrayList randState(int width, int height) {
        ArrayList<ArrayList<Integer>> deadList = new ArrayList<ArrayList<Integer>>();
        for (int z = 0; z < height; z++) {
            deadList.add(new ArrayList<Integer>(width));
        }

        for (int i = 0; i < deadList.size() ; i++) {
            for (int j = 0; j < width; j++) {
                if (Math.random() > 0.5)
                    deadList.get(i).add(1);
                else
                    deadList.get(i).add(0);

            }
        }
        return deadList;
    }

    public void renderBoard(ArrayList<ArrayList<Integer>> state) {
        for (int i = 0; i < state.get(0).size(); i++) {
            System.out.print("--");
        }

    }





}
