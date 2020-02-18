import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.*;

//Complete the classes below
class Flower {
    public String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    public Lily yourNationalFlower() {
        return new Lily();


    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        checkPrime(2, 1);
        checkPrime(1);
    }

    public static void checkPrime(int ...n) {
        for (int num : n) {
            if(isPrime(num)) {
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num==2) {
            return true;
        }
        if (num<2 || num%2==0) {
            return false;
        }
        for (int i=3; i<Math.sqrt(num); i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}