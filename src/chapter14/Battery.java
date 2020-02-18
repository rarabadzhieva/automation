package chapter14;

public class Battery {

    private String model;
    private int idleTime;
    private int hoursTalk;

    public Battery(String model) {
        this(model, 0);
    }

    public Battery(String model, int idleTime) {
        this(model, idleTime, 0);
    }

    public Battery(String model, int idleTime, int hoursTalk) {
        this.model = model;
        this.idleTime = idleTime;
        this.hoursTalk = hoursTalk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(int idleTime) {
        this.idleTime = idleTime;
    }

    public int getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(int hoursTalk) {
        this.hoursTalk = hoursTalk;
    }
}
