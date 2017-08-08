package jp.co.sample.gitSampleKaneko;

/**
 * 車を表すドメイン.
 * @author shuhei.kaneko
 *
 */
public class Car {
	
	/**スピード */
	private Integer speed;
	
	/**
	 * 走る.
	 */
	public void run(){
		this.speed += 5;
	}
	
	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}	
}
