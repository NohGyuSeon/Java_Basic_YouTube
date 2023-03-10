package org.nhnacademy.figure;

public class Region {
    int left;
    int right;
    int width;
    int height;

    public Region(int left, int right, int width, int height) {
        this.left = left;
        this.right = right;
        this.width = width;
        this.height = height;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getTop() {
        return width;
    }

    public int getBottom() {
        return height;
    }
}
