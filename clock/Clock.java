// this is the 'clock' implementation
// 面向对象程序设计-Java语言-翁恺（浙江大学）
public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private int life = 0;

    // constructor with life time as input
    public Clock(int life) {
        this.life = life;
    }
    
    public void start() {
        
        while ( life > 0 ) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
            life--;
        }
    }

    public static void main(String[] ags) {
        Clock clock = new Clock(3600);
        clock.start();
    }
}