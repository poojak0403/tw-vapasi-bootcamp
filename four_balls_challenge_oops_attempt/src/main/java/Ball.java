import processing.core.PApplet;

public class Ball{
    private FourBallsChallenge fourBallsChallenge;
    private int xCordinate;
    private float diameter;
    private float yCordinate;


    public Ball(FourBallsChallenge fourBallsChallenge, int xCordinate, float yCordinate, float diameter){
        this.fourBallsChallenge = fourBallsChallenge;
        this.xCordinate = xCordinate;
        this.diameter = diameter;
        this.yCordinate = yCordinate;

    }
    public void step(int next){
        fourBallsChallenge.speed[next]+=next+1;
    }

    public void display() {
        fourBallsChallenge.ellipse(xCordinate,  yCordinate,  diameter,diameter);
    }
}
