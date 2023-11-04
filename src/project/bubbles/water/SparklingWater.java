package project.bubbles.water;

public class SparklingWater extends Water {
    Bubble[] bubble;
    protected boolean isOpened;

    public SparklingWater(int bubbleNum) {
        this.bubble = new Bubble[bubbleNum];
    }

//    public SparklingWater(String color, String transparency, String smell, int temp, boolean isOpened)
//    {
//        super(color, transparency, smell, temp);
//        this.isOpened = isOpened;
//    }

//вода заполняется пузырьками при упаковке на заводе
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

    //метод degas() удаляет пузырьки по одному и вызывает их лопанье
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

    //метод void setOpened() меняет состояние воды на "открытое" и запускает метод degas()
    public void setOpened() {
    }

    //приватный метод degas() каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
//    private boolean degas2() {
//    }

    //приватный метод void isOpened() пока ничего не делает
    private void isOpened() {
    }

}
