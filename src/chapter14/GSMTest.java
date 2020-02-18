package chapter14;

public class GSMTest {

    private static GSM[] gsms = new GSM[3];

    public static GSM[] createGSMS() {
        gsms[0] = new GSM("Mate 10 Pro", "Huawei", 1500, "Me");
        gsms[1] = new GSM("Mate 30", "Huawei", 1500, "He");

        String[] modelAndMan = GSM.getNokiaN95().split(" ");
        gsms[2] = new GSM(modelAndMan[1], modelAndMan[0], 500, "You");

        return gsms;
    }

    public void testGSMInfo() {
        createGSMS();
        for (GSM gsm : gsms) {
            gsm.printInfo();
        }
    }
}
