package collections;

public class Ball {

	int ball_size;
	String ball_colour;
	
	
	public int getBall_size() {
		return ball_size;
	}
	public void setBall_size(int ball_size) {
		this.ball_size = ball_size;
	}
	public String getBall_colour() {
		return ball_colour;
	}
	public void setBall_colour(String ball_colour) {
		this.ball_colour = ball_colour;
	}
	public Ball() {	
	}
	public Ball(int ball_size, String ball_colour) {
		super();
		this.ball_size = ball_size;
		this.ball_colour = ball_colour;
	}
	@Override
	public String toString() {
		return "Ball [ball_size=" + ball_size + ", ball_colour=" + ball_colour + "]";
	}
	
}
