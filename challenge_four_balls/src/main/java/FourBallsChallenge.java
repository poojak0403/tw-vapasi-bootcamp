import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 20;
    int speed [] ={0,0,0,0};
    public static final float distanceFromHeight[]={HEIGHT/5,HEIGHT*2/5,HEIGHT*3/5,HEIGHT*4/5};

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        int number =4;
        for (int i = 0; i < number; i++) {
            ellipse(speed[i], distanceFromHeight[i], DIAMETER, DIAMETER);
            speed[i] += i+1;
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge");
    }

}
