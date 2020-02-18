package chapter14;

public class Call {

    private String date;
    private String startTime;
    private int callDuration;

    public Call(String date, String startTime, int callDuration) {
        this.date = date;
        this.startTime = startTime;
        this.callDuration = callDuration;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public void printInfo() {
        System.out.printf("Call date: %s;%n call start time: %s;%n call duration: %d%n", date, startTime, callDuration);
    }
}
