package project.bubbles;

import java.util.ArrayList;

public class SparklingWater extends Water {
    Bubble[] bubble;

    public SparklingWater(int bubbleNum) {
        this.bubble = new Bubble[bubbleNum];
    }
    public void pump(Bubble[] bubbles) {
        for (var newBubble : bubbles) {
            for (int bubbleIdx = 0; bubbleIdx < bubble.length - 1; bubbleIdx++) {
                if (bubble[bubbleIdx] == null) {
                    bubble[bubbleIdx] = newBubble;
                    break;
                }
            }
        }
    }
    public boolean degas() {
        for (int bubbleIdx = 0; bubbleIdx < bubble.length - 1; bubbleIdx++) {
            if (bubble[bubbleIdx] != null) {
                bubble[bubbleIdx].burst();
                bubble[bubbleIdx] = null;
                return true;
            }
        }
        return false;
    }
}
