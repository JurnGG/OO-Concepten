package week6.beeldscherm;

import java.util.Arrays;

public class Screen {
    private char[][] screen;
    private int width;
    private int height;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        screen = new char[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void clear(){
        for (char[] row : screen) {
            Arrays.fill(row, ' ');
        }
    }

    public void print(){
        for(char[] row : screen){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void setCharacter(int x, int y, char c){
        if(x >= 0 && x < width && y >= 0 && y < height){
            screen[y][x] = c;
        }
    }
}

