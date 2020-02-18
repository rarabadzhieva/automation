package chapter14;

import java.util.ArrayList;

public class GSM {

    private String model;
    private String manufacturer;
    private int price;
    private String owner;

    private static String nokiaN95 = "Nokia 95";
    private static ArrayList<Call> callHistory = new ArrayList<>();

    public GSM(String model) {
        this(model, null);
    }

    public GSM(String model, String manufacturer) {
        this(model, manufacturer, 0);
    }

    public GSM(String model, String manufacturer, int price) {
        this(model, manufacturer, price, null);
    }

    public GSM(String model, String manufacturer, int price, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void setNokiaN95(String nokiaN95) {
        GSM.nokiaN95 = nokiaN95;
    }

    public static String getNokiaN95() {
        return nokiaN95;
    }

    public static ArrayList<Call> getCallHistory() {
        return callHistory;
    }

    public void printInfo() {
        System.out.printf("Model: %s; manufacturer: %s; price %d; owner: %s%n",
                    getModel(), getManufacturer(), getPrice(), getOwner());
    }

    public static void addCall(Call call) {
        callHistory.add(call);
    }

    public static void deleteCall(Call call) {
        callHistory.remove(call);
    }

    public static void deleteAllCalls() {
        callHistory = new ArrayList<>();
    }

    public double totalCallsPrice(double pricePerMin) {
        double price = 0;
        for (Call call : callHistory) {
            int min = call.getCallDuration() / 60;
            int sec = call.getCallDuration() % 60;
            if (sec != 0) {
                min++;
            }
            price+= min * pricePerMin;
        }
        return price;
    }

    public static void removeMaxAndMin() {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        Call minCall = callHistory.get(0);
        Call maxCall = callHistory.get(0);

        for (Call call : callHistory) {
            if (call.getCallDuration() < minimum) {
                minimum = call.getCallDuration();
                minCall = call;
            }
            if (call.getCallDuration() > maximum) {
                maximum = call.getCallDuration();
                maxCall = call;
            }
        }
        minCall.printInfo();
        maxCall.printInfo();
        deleteCall(minCall);
        deleteCall(maxCall);
    }
}
