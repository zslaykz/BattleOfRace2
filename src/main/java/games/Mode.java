package games;

import lombok.Getter;

public enum Mode {
    EASE(20,10), MEDIUM(30,20), HARD(40,30);

    @Getter
    private int width;
    @Getter
    private int height;

    Mode(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
