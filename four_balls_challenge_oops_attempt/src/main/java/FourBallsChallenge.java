import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 20;
    int speed [] ={0,0,0,0};
    public static final float distanceFromHeight[]={HEIGHT/5,HEIGHT*2/5,HEIGHT*3/5,HEIGHT*4/5};
    Ball ball;

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
        int number =4;
        for (int i = 0; i < number; i++) {
            ball = new Ball(this,speed[i], distanceFromHeight[i], DIAMETER);
            ball.step(i);
            ball.display();
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }
}
