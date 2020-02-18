package chapter14;

public class GSMCallHistoryTest {

    private GSM[] gsms = GSMTest.createGSMS();
    private Call[] calls = new Call[4];

    public void printGSMS() {
        for (GSM gsm : gsms) {
            gsm.printInfo();
        }
    }

    private void createCalls() {
        calls[0] = new Call("13.12.2019", "19:25", 65);
        calls[1] = new Call("16.12.2019", "09:25", 25);
        calls[2] = new Call("16.12.2019", "19:00", 5);
        calls[3] = new Call("19.12.2019", "10:30", 30);

        for (Call call : calls) {
           GSM.addCall(call);
        }
    }

    public void createHistoryTotalPrice() {
        createCalls();
        GSM.removeMaxAndMin();
        System.out.printf("Total price: %.2f%n", gsms[0].totalCallsPrice(0.34));
    }


    public void deleteCallHistory() {
        GSM.deleteAllCalls();
    }
}
