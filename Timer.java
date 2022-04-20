public class Timer {
    private int minutes;

    public int getminutes() {
        return this.minutes;
    }

    public void setminutes(int minutes) {
        this.minutes = minutes;
    }

    public Timer(int minutes) {
        this.minutes = minutes;
    }

    public void countSeconds() {
        int seconds = this.minutes * 60;
        int i = 1;

        while (i <= seconds) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(i);
            }
            i++;
        }
    }
}