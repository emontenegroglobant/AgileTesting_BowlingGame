package com.globant;

import java.util.ArrayList;

public class BowlingGame {
    public static int getScore(ArrayList<Integer> line) {

        Integer score = 0;
        Integer frame = 0;
        Integer index = 0;

        while (frame < 10 && index < line.size()) {

            if (line.get(index) == 10) { // Strike true
                // sum the bonus for strike , next 2 postitions
                score += 10 + line.get(index + 1) + line.get(index + 2);
                index += 1;

            } else if (line.get(index) + line.get(index + 1) == 10) { // spare true
                // sum the bonus for spare, next 1 position
                score += 10 + line.get(index + 2);
                index += 2;
            } else {
                // sum points in the frame
                score += line.get(index) + line.get(index + 1);
                index += 2;

            }
            frame++;

        }
        return score;
    }
}