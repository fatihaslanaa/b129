package picman;

import javax.swing.*;
import java.awt.*;

public class PicMan {
    public static void main(String[] args) {


// Class for the Picman character
        class Picman {
            private int xPos;
            private int yPos;
            private Image picmanImg;

            public Picman(int x, int y) {
                xPos = x;
                yPos = y;
                picmanImg = new ImageIcon("picman.png").getImage();
            }

            public void moveUp() {
                yPos--;
            }

            public void moveDown() {
                yPos++;
            }

            public void moveLeft() {
                xPos--;
            }

            public void moveRight() {
                xPos++;
            }

            public int getXPos() {
                return xPos;
            }

            public int getYPos() {
                return yPos;
            }

            public Image getImage() {
                return picmanImg;
            }
        }

// Class for the enemies
        class Enemy {
            private int xPos;
            private int yPos;
            private Image enemyImg;

            public Enemy(int x, int y) {
                xPos = x;
                yPos = y;
                enemyImg = new ImageIcon("enemy.png").getImage();
            }

            public void move() {
                // Add code to move the enemy
            }

            public int getXPos() {
                return xPos;
            }

            public int getYPos() {
                return yPos;
            }

            public Image getImage() {
                return enemyImg;
            }
        }

// Class for the maze
        class Maze {
            private int[][] layout;

            public Maze(int[][] layout) {
                this.layout = layout;
            }

            public boolean isWall(int x, int y) {
                if (layout[x][y] == 1) {
                    return true;
                }
                return false;
            }

            public boolean isItem(int x, int y) {
                if (layout[x][y] == 2) {
                    return true;
                }
                return false;
            }
        }

        {

            // Create the maze
            int[][] mazeLayout = {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
                    {1, 0}};



        }
    }
}


