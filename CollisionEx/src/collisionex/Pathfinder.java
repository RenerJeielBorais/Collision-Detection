
package collisionex;
public class Pathfinder extends Sprite {

    private final int INITIAL_X = 400;

    public Pathfinder(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("src/resources/pathfinder.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}