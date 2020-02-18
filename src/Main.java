import chapter14.*;
import chapter15.Exercises;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Format;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

//    public static void main(String[] args) throws IOException {
////        System.out.println("Choose program (revertNumber/average/findX):");
//        Scanner input = new Scanner(System.in);

//        // Ex 2.1
//        int one = 52130;
//        byte two = -115;
//        long three = 4825932;
//        byte four = 97;
//        int five = -10000;
//
//        // Ex 2.2
//        double one = 34.567839023;
//        float two = 12.345f;
//        double three = 8923.1234857;
//        float four = 3456.091f;

//        // Ex 2.3 & 2.4
//        int num16 = 0x100;
//        boolean isMale = false;
//
//        // Ex 2.5
//        String first = "Hello";
//        String second = "World";
//        Object obj = first + " " + second;
//        System.out.println(obj);
//        String strObj = (String) obj;
//        System.out.print(strObj);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number:");
//
//        // Ex 3.1
//        System.out.println("Enter a number:");
//        int num = input.nextInt();
//        if ((num % 2) == 0) {
//            System.out.print("The number is even.");
//        } else {
//            System.out.print("The number is odd.");
//        }
        // Ex 3.2
//        int num = input.nextInt();
//        if ((num % 5 == 0) && (num % 7 == 0)) {
//            System.out.print("The number can be divided on 5 AND 7.");
//        } else {
//            System.out.print("The number canNOT be divided on 5 AND 7.");
//        }
//
//        // code samples
//        String name = "Boris";
//        int age = 18;
//        String town = "Plovdiv";
//
//        System.out.printf("My name is %s. \n", name);
//        System.out.printf("My name is %S. \n", name);
//
//        System.out.printf(
//                "%1$s is big town.\n" +
//                "%2$s lives in %1$s.\n" +
//                "%2$s is %3$d years old.\n",
//                town, name, age
//        );
//
//        System.out.printf("%nThe time is: %1$tH:%1$tM:%1$tS.%n",
//                new java.util.Date());
//
//        System.out.printf("%nThe date is: %1$td/%1$tm/%1$ty.%n",
//                new java.util.Date());

//            int ch;
//            System.out.print("Enter some text: ");
//            while ((ch = System.in.read()) != '\n') { //old
//                System.out.print((char) ch);
//            }
//
//        System.out.print("Please enter your first name: ");
//        String firstName = input.nextLine();
//
//        System.out.print("Please enter your age: ");
//        int age = input.nextInt();
//
//        System.out.printf("Hello, %s - %d years old!\n", firstName, age);
//
//        // Ex 3.6
//        int sum = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("Enter number: ");
//            sum += input.nextInt();
//        }
//
//        System.out.printf("The sum of the three numbers are: %d", sum);
//
//        // Ex 3.7
//        int max = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("Enter number: ");
//            int num = input.nextInt();
//            if (num > max) {
//                max = num;
//            }
//        }
//
//        System.out.printf("The greatest number is: %d", max);
//
//        // Ex 5.2
//        System.out.print("Enter number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter number: ");
//        int num2 = input.nextInt();
//
//        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
//            System.out.print("The sign is '-'.");
//        } else {
//            System.out.print("The sign is '+'.");
//        }
//
//        //Ex 5.3
//        int a = 20;
//        int b = 2;
//        int c = 23;
//
//        if (a > b && a > c) {
//            System.out.print("Biggest number is a.");
//        } else if (b > a && b > c) {
//            System.out.print("Biggest number is b.");
//        } else {
//            System.out.print("Biggest number is c.");
//        }
//
//        // Ex 5.5
//        System.out.print("Enter a: ");
//        int a = input.nextInt();
//        System.out.print("Enter b: ");
//        int b = input.nextInt();
//        System.out.print("Enter c: ");
//        int c = input.nextInt();
//
//        double disc = b*b - (4*a*c);
//        System.out.print("Discriminant is " + disc + "\n");
//        if (disc > 0) {
//            double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
//            double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
//            System.out.print("x1 is " + x1 + " and x2 is " + x2);
//        } else if (disc == 0) {
//            double x = -b/(2*a);
//            System.out.print("x1 = x2 = " + x);
//        } else {
//            System.out.print("No real roots!");
//        }
//
//        // Ex 6.13
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter binary number: ");
//        String numBinary = input.nextLine();
//
//        int num = 0;
//        int index = numBinary.length();
//        for (int i = 0; i < index;  i++) {
//            int digit = Character.getNumericValue(numBinary.charAt(index - 1 - i));
//            //num += digit * Math.pow(2, i);
//            num += digit << i;
//        }
//        System.out.println("Binary 0b" + numBinary + " is " + num);
//
//        // Ex 6.14
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//
//        StringBuilder hexNumber = new StringBuilder();
//        while (num > 0) {
//            switch (num % 16) {
//                case 10:
//                    hexNumber.append("a");
//                    break;
//                case 11:
//                    hexNumber.append("b");
//                    break;
//                case 12:
//                    hexNumber.append("c");
//                    break;
//                case 13:
//                    hexNumber.append("d");
//                    break;
//                case 14:
//                    hexNumber.append("e");
//                    break;
//                case 15:
//                    hexNumber.append("f");
//                    break;
//                default:
//                    hexNumber.append(num % 16);
//            }
//            num /= 16;
//        }
//        System.out.print("Hex number is 0x" + hexNumber.reverse());
//
//        // Ex 6.15
//        System.out.print("Enter hex number: ");
//        String hexNum = input.nextLine();
//
//        int num = 0;
//        int index = hexNum.length();
//        for (int i = 0; i < index; i++) {
//            String value = String.valueOf(hexNum.charAt(index - 1 - i));
//            int current = 0;
//            switch (value) {
//                case "a":
//                    current = 10;
//                    break;
//                case "b":
//                    current = 11;
//                    break;
//                case "c":
//                    current = 12;
//                    break;
//                case "d":
//                    current = 13;
//                    break;
//                case "e":
//                    current = 14;
//                    break;
//                case "f":
//                    current = 15;
//                    break;
//                default:
//                    current = Integer.parseInt(value);
//
//            }
//            //num += current * Math.pow(16, i);
//            num += current << (4 * i);
//        }
//        System.out.println("Hex number 0x" + hexNum + " is " + num);
//
//        // Ex 6.16
//        System.out.print("Enter n: ");
//        int num = input.nextInt();
//
//        Random random = new Random();
//        System.out.println("Random number to " + num + ": " + random.nextInt(num));
//
//        // Ex 7.1
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i * 5;
//        }
//        System.out.print("Array: " + Arrays.toString(array));
//
//        // Ex 7.2
//        System.out.print("Enter first array length: ");
//        int array1Len = input.nextInt();
//        System.out.print("Enter second array length: ");
//        int array2Len = input.nextInt();
//
//        boolean areEqual = true;
//
//        if (array1Len != array2Len) {
//            areEqual = false;
//        } else {
//            int[] array1 = new int[array1Len];
//            int[] array2 = new int[array2Len];
//
//            System.out.println("Enter elements for the first array: ");
//            for (int i = 0; i < array1Len; i++) {
//                array1[i] = input.nextInt();
//            }
//
//            System.out.println("Enter elements for the second array: ");
//            for (int i = 0; i < array2Len; i++) {
//                array2[i] = input.nextInt();
//            }
//
//            for (int i = 0; i < array1Len; i++) {
//                if (array1[i] != array2[i]) {
//                    areEqual = false;
//                    break;
//                }
//            }
//        }
//        System.out.print("Arrays are the same - " + areEqual);
//
//        // Ex 7.3
//        char[] arr1 = {'a', 'b', 'z', 'd'};
//        char[] arr2 = {'a', 'b', 'q', 'd'};
//
//        boolean areEqual = true;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] < arr2[i]) {
//                System.out.println("First array " + Arrays.toString(arr1));
//                areEqual = false;
//                break;
//            } else if (arr1[i] > arr2[i]) {
//                System.out.println("Second array " + Arrays.toString(arr2));
//                areEqual = false;
//                break;
//            }
//
//        }
//        if (areEqual) {
//            System.out.print("Two arrays are equal " + Arrays.toString(arr1));
//        }
//
//        // Ex 7.4
//        //int[] arr = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int count = 1;
//        int digit = 0;
//        int maxCount = 1;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                count++;
//            } else {
//                if (maxCount < count) {
//                    maxCount = count;
//                    digit = arr[i];
//                }
//                count = 1;
//            }
//        }
//        if (maxCount != 1) {
//            int[] newArr = new int[maxCount];
//            for (int i = 0; i < maxCount; i++) {
//                newArr[i] = digit;
//            }
//            System.out.print("Array: " + Arrays.toString(newArr));
//        } else {
//            System.out.print("All elements are different");
//        }
//
//        // Ex 7.5
//        //int[] arr = {3, 2, 3, 4, 5, 6, 7, 4};
//        int[] arr = {2,5,7,9,0,2,1};
//        int count = 1;
//        int digit = 0;
//        int maxCount = 1;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] + 1 == arr[i + 1]) {
//                count++;
//            } else {
//                if (maxCount < count) {
//                    maxCount = count;
//                    digit = arr[i];
//                }
//                count = 1;
//            }
//        }
//        if (maxCount != 1) {
//            int[] newArr = new int[maxCount];
//            for (int i = 0; i < maxCount; i++) {
//                newArr[i] = digit - maxCount + i + 1;
//            }
//            System.out.print("Array: " + Arrays.toString(newArr));
//        } else {
//            System.out.print("All elements are different");
//        }
//
//        // Ex 7.10 a [[1, 5, 9, 13], [2, 6, 10, 14], [3, 7, 11, 15], [4, 8, 12, 16]]
//        int dim = 4;
//        int[][] matrix = new int[dim][dim];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = i + j*dim + 1;
//            }
//
//        }
////        System.out.println(Arrays.deepToString(matrix));
//
//        // Ex 7.10 b [[1, 8, 9, 16], [2, 7, 10, 15], [3, 6, 11, 14], [4, 5, 12, 13]]
//        int dim = 4;
//        int[][] matrix = new int[dim][dim];
//        for (int i = 0; i < dim; i++) {
//            if (i % 2 ==  0) {
//                for (int j = 0; j < dim; j++) {
//                    matrix[j][i] = i * dim + j + 1;
//                }
//            } else {
//                for (int j = 0; j < dim; j++) {
//                    matrix[dim -1 - j][i] = i * dim + j + 1;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//
//        // Ex 7.10 c [[7, 11, 14, 16], [4, 8, 12, 15], [2, 5, 9, 13], [1, 3, 6, 10]]
//        int dim = 4;
//        int[][] matrix = new int[dim][dim];
//        for (int i = 0; i < dim; i++) {
//            for (int j = 0; j < dim; j++) {
//                matrix[dim -1 - j][i] = i * dim + j + 1;
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));

        // Ex 7.10 d [[1, 12, 11, 10], [2, 13, 16, 9], [3, 14, 15, 8], [4, 5, 6, 7]]
//
//        // Ex 7.11
//        System.out.print("Enter rows: ");
//        int n = input.nextInt();
//        System.out.print("Enter columns: ");
//        int m = input.nextInt();
//
//        int maxSum = Integer.MIN_VALUE;
//        int firstRow = 0;
//        int firstCol = 0;
//
//        int[][] matrix = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter elements in rows: ");
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = input.nextInt();
//            }
//        }
//        System.out.println("Matrix: " + Arrays.deepToString(matrix));
//
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = 0; j < m - 2; j++) {
//                int currentSum = matrix[i][j] + matrix[i+1][j] + matrix[i+2][j] +
//                        matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][i+2] +
//                        matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
//                if (maxSum < currentSum) {
//                    maxSum = currentSum;
//                    firstRow = i;
//                    firstCol = j;
//                }
//            }
//        }
//        int[][] maxSumMatrix = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <3; j++) {
//                maxSumMatrix[i][j] = matrix[firstRow + i][firstCol + j];
//            }
//        }
//        System.out.println("Max Matrix: " + Arrays.deepToString(maxSumMatrix));
//        System.out.println("Max sum: " + maxSum);
//
//        // Ex 7.12
//        System.out.print("Enter a word: ");
//        String word = input.nextLine();
//
//        for (int i = 0; i < word.length(); i++) {
//            int index = (int) word.charAt(i) - (int) 'A';
//            System.out.println("Char " + word.charAt(i) + " has index " + index);
//        }
//
//        // Ex 7.13 Binary search
//        int[] array = {1, 3, 7, 12, 14, 40, 44, 46, 50, 52, 55};
//        System.out.print("Enter target value: ");
//        int target = input.nextInt();
//
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//        int index = -1;
//
//        while (firstIndex <= lastIndex) {
//            int midIndex = (int) (Math.floor((firstIndex + lastIndex) / 2));
//            if (array[midIndex] < target) {
//                firstIndex = midIndex + 1;
//            } else if (array[midIndex] > target) {
//                lastIndex = midIndex - 1;
//            } else {
//                index = midIndex;
//                break;
//            }
//        }
//        if (index != -1) {
//            System.out.print("Value " + target + " is at position: " + index);
//        } else {
//            System.out.print("Value " + target + " is NOT into the array.");
//        }
//
//        // Ex 7.14 Merge sort
//        int arr[] = {12, 11, 13, 5, 6, 7};
//        System.out.println(Arrays.toString(arr));
//
//        MergeSort ms = new MergeSort();
//        ms.sort(arr, 0, arr.length -1);
//
//        System.out.println(Arrays.toString(arr));
//
//        // Ex. 7.15 Quick sort
//        int arr[] = {10, 7, 8, 9, 1, 5};
//        System.out.println(Arrays.toString(arr));
//        QuickSort qs = new QuickSort();
//        qs.sort(arr, 0, arr.length - 1);
//
//        System.out.println(Arrays.toString(arr));
//
//        // Ex. 7.16
//        int upperBound = 100;
//        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
   //        boolean[] isComposite = new boolean[upperBound + 1];
//
//        for (int m = 2; m <= upperBoundSquareRoot; m++) {
//
//            if (!isComposite[m]) {
  //                System.out.print(m + " ");
//
//                for (int k = m * m; k <= upperBound; k += m)
//
//                    isComposite[k] = true;
//
//            }
//
//        }
//
//        for (int m = upperBoundSquareRoot; m <= upperBound; m++)
//
//            if (!isComposite[m])
//
//                System.out.print(m + " ");
//
//        // Ex. 8.4
//        int decNum = input.nextInt();
//        StringBuilder bin = new StringBuilder();
//        System.out.print("Dec num " + decNum);
//
//        while (decNum > 0) {
//            bin.append(String.valueOf(decNum % 2));
//            decNum /= 2;
//        }
//        System.out.print(" is " + bin.reverse() + " in bin.");
//
//        // Ex. 8.10
//        String bin = input.nextLine();
//        int dec = 0;
//        System.out.print("Bin num " + bin);
//
//        for (int i = 0; i < bin.length(); i++) {
//             dec = dec * 2 + Integer.valueOf(bin.substring(i, i + 1));
//        }
//
//        System.out.print(" is " + dec + " in dec.");


//        System.out.printf("Max number is %d" ,getMax(5, 10, 2, 5)); // 9.2
//        System.out.printf("Last digit is %s", returnText(2309)); // 9.3
//        System.out.printf("The number appears %d time/s", countNum(9, 1, 2, 2, 3, 5, 3)); // 9.4
//        System.out.printf("Neighbours are both greater/smaller: %b", isGreaterOrSmallerThanNeighbours(2, new int[] {3, 4, 2, 2})); // 9.5
//        System.out.printf("Position of element with both greater neighbours is: %d", elementPosition(new int[] {5, 4, 6, 3, 8})); // 9.6
//        revertNumber(32561); // 9.7
//        System.out.print("Factorial: " + sumFactorialN(20)); // 9.8
//
//        String choice = input.nextLine();
//        switch (choice) {
//            case "revertNumber":
//                System.out.println("Enter number to be reverted: ");
//                int num = input.nextInt();
//                if (num > 0) {
//                    revertNumber(num);
//                } else {
//                    System.out.println("The number should be greater than 0!");
//                }
//                break;
//            case "average":
//                System.out.print("Enter array's length: ");
//                int arrayLen = input.nextInt();
//                if (arrayLen > 0) {
//                    int[] array = new int[arrayLen];
//                    System.out.println("Enter elements for the first array: ");
//                    for (int i = 0; i < arrayLen; i++) {
//                        array[i] = input.nextInt();
//                    }
//                    System.out.println(average(array));
//                } else {
//                    System.out.println("Array's length should be greater than 0!");
//                }
//                break;
//            case "findX":
//                System.out.println("Enter a:");
//                int a = input.nextInt();
//                System.out.println("Enter b:");
//                int b = input.nextInt();
//                if (a != 0) {
//                    System.out.println(findX(a, b));
//                } else {
//                    System.out.println("'a' should not be 0!");
//                }
//                break;
//            default:
//                System.out.println("Incorrect name!");
//        }

//
//        ArrayList<Integer> test = factorialN(10);
//        System.out.println("Factorial: " + bigNumToString(test));
//        SimpleDateFormat smp = new SimpleDateFormat("dd.MM.yyyy");
//        String date = "02.12.2019";
//        try {
//            smp.parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
        // Ex. 14.7
//        testStudent();
//        StudentTest st = new StudentTest();
//
//        st.getProperties();
//
//        StudentTest.test();
//
//        // Ex. 14.9
//        GSMTest gsmTest = new GSMTest();
//        Battery battery = new Battery("", 80);
//        Screen screen = new Screen(400);
//
////        gsmTest.testGSMInfo();
//        GSMCallHistoryTest gsmCallHistoryTest = new GSMCallHistoryTest();
////        gsmCallHistoryTest.printGSMS();
//        gsmCallHistoryTest.createHistoryTotalPrice();
//        gsmCallHistoryTest.deleteCallHistory();
//        System.out.printf("Call history size: %d", GSM.getCallHistory().size());
////        System.out.println("Get nokia " + GSM.getNokiaN95());
//
//
//        // Ex. 14.18-19
//        LibraryTest.testAddBook();
//        LibraryTest.deleteAuthorBooks("Stephen King");
//
//        // Ex. 14.20
//        SchoolTest schoolTest = new SchoolTest();
//        schoolTest.testSchool();

        // Ex. 15.1
//        Exercises ex15 = new Exercises();
////        ex15.readOddLines();
//        ex15.sortNames();
//        String A="   nbibqfgtpqabtvcprapnhvwmummqxpteitvabduimmjhblokdgxcdvopbsibbdvkwtkpowxccabedqogwgbrthavcioddlncwqjnobpjbjnfbtdpreanmakgbabedhwcxipfjwochthahlhqhhflahjbxlfdsefjemgncnpcapchscarjvfbfoceraxluumaitflimfithinjahlneeskhpexohtlullhiopmtpitpnepmhfqmptlgxknwvakadrisamniuixkfhwemhqtctsrvhpkxckclkmmxsulctvxsmeglmsnimwvtfisxsmlvbpmtlxnwnfrbbpmnjrnnhlimlsmfxpsqggljwqxlnieoaiebbjpimpuxcavbpprvouwmewpsgtiwdeaeohesoqsqjhrawkoewmidkxvjsfhvkxrqgnkngufhdxhsbnwashdegqfbvnoxmiplnsqtovcsucmohcgbbjwirdboqhovhvavpqigfdqsfuimwooqpeaihroqaefasvvjnfhkixeflmkcsqsjukjddaltuqtoniqsopfohbmsowuaooccalvtdjharsgxdojjggpnidhobuohkqbduxwxavprqoqtecukilxipxwitnivvjqripjieacuokhledvnpnvwemgxbomoqfaamjbqbdnifmtkqipxvevbqtqjcfascasobtwcodkmqvwigfxtjuvshfdjcdtetgkurjpimrmepcenhdiqpvkxdgavbusvcertfatssxojblwiowrwudvpbnmdbgatdjhikcsecbfdmtecrvanqnustbvuxnqcoxdarnulobhcmlvgivlqdikwbxkaecttrotddiosbnuoaruahxjcxtaalcbpvmkocwrvwapxnengnbwmrhoqtgrgjkngwamqownmwvddbjbgkatdxjmsqfqrpgxfwdnmbsqpptliemphmccmlowtlpmsvdplhexaphqwsdhphowmqqqtxopcftvsxmfwjuoatgwobvfbdtntdfhctwfrjsdagjwpvfhrdghftegxxlkcqrvdhsmrmqrsricgnbxqhwntslsrwemgobkvtoohgarpilwvnnfmethwwrivomtenvrimihkaqsiuivbvcnrnnqmwqbmemirkcrwcqaciscucxvqrljxqrdgjelnitwsnpqhxjbiddegsswevxdnrglscwakswvxgfxfoafsucqguokrffwwdjrvirashvrncqlrjqdfstlgboxgtnfxpomxhmjojsuedhvmxqjkluqmciswvxnefbdmgmthxplcoaofqxpdlapoicevrjcxcvdicwqbfddlujrmiailapbarvwdgqcjnfrhubibvdnrmwvuwfixnbxwxnbffdglbqsvrdoogthlrfhichhpjwgamhvrdeueupbnkhuiddtmadutctclsilgqbptfmprtigfpcnkwjpoeljgxesrmvpuwghtkwmfglcofqadbhkfltdkxndelkabiintwbqfetlkddfulprwduiskdwnnpgvxtinnbsrmfthjbdmiuklikwsnuxcdgpsbaigrcavatebmxnvlpitbggotfiwlprfpblatdnlxjmliralibxjhfpscpjghclotohgsusjgwmgqnsaorcnoriqbjwilbwwqfecsolanxgvmqnsjpixbiicrgcuaakqwgsqvvicuopbxelimtaftixegbqgrcwpbixofhqsoxlndwnhknmvndcuekcwnrforvepembklmpgcfgmkkcaoumkggitxgbjdvaxjrkmfblhwrmjtojjcnmituelsvuntmnufpbkimjhvnqqtrsvgggbscmfxaskmhhjoilxmvgjcorwxdlvbjomltrdtlnalujruvqikojmutctogqqpxutsnwnqdftapnmevnomwsirnuileqcdmnnrltbpavhhcllxardxeeijaiuuqoquufnxapgbeniwrmvrvrirvrcnrojkvbgrhmqhtxapejnnnchktpuiawvkfhmsakdxwlhjkhahinuvitaddumtkbfharbbeuasixekxurhkgvkrnfmbjillnllxeetbffjujttgfdidasmfpbgbjjeoupfruasrgtnhojnlenouxdbpuhifqmtftbwhriaxdgxjpevlsdhjwiashappmluaekhvkinfgepnieacxhmopeiofqfjtcjxermhrrmpvdewxeaxdenkbnawffhaxjpeseldnpsdtobssrjvwwxpexnjemcevrahndkdsugfkhquqbjgqivuhkvmpxiejamwdobnlxlnwdkputvmuladnwhenhjwhnncdoiggtuuwwdsjbxfexjrniwtqhrpmgkpnswlfkhdilnreexiuabjapuiooqcmcsruiebseushbllwclssetluqtkwlfcnxubxqsjugdtaggwbjilodwclsebvjedaaexqpifvdancxldatgopfispnumwappqmoadpfqkwgmnjhnvoueluwcjkgakopscvtveqfpodttndbkjvgureotputrkcmephrupxlwcwrhrsjchpobmumdrxmtbqaipjehihfdgwkxjusqlajxvvsgmxbfprohdsgdclgabrxcfjtqkuihksnwrgebasatmgwgjvgcowflhqtrmdqoovnheraulahpwvwxsucasxlchxllcucirpiniibljisxwqxqnbjxqmrxlfkgbmoktwqthrgisbhqjgaoxjopwhoberhvfwabuqutbtdtmddnjuubfcqtjxvgqutnstghdtcfowqsbuhcqtdnvmbxloftkqavmhehcwmiuvsnrrqbnlgkxxjcngnqxondnjkhhxhuubjfkrwxfucuudxbkejbsoehxooxfnlrouwbgmqlbkxvoooqtarnovngdtvjjicpuricvbfwdflrtsboksuqhjwdetmftgvqpfsfwatcfhlqbnhlhtdheskafogbmdrualbxdubatmrmbqpbllahfkhcqfdeimabaratgrubfngxvvqiiqpfcoikulouahvqqvlwoxqmewdbltbulqbfxjptnvhnufvnsadbalfebigndhjgqclpmscbpjgmgtrbtmstaxabhwgcfhinktuonwhuanigarhtgbpwqhpxfwbcfjqhumvjdegdjgjjqjfokmmdttsqrmspncwkpmlkqjnciolaxqocusvpnpxxdsgruetdignbqsdqjgqipgklqxtfpsekektbhgupncivmlnvkvwbtamlaxqhsnrwxfpwlegqgonscsimpgfcwjnwjgftlpjkubbxvhqtvvfpintplaskkhilfggqvptjiuavtiqqgwigldvpupbgpbjuxpfuwavxmwuhwnpelpcolafhhwfwqolpvqelqbkupxtomckpsnvfftmmrjdjxormgvxookkgjvmnxoujtroamsfwdixswqgengkeimcjjgoamkkidqailfwgfvbdoxxtvjpfnjgwhupugbucrucusadxvutdtkxjmggbqnqpbhlaahcruuooujfjfqnqtebhcaaknicopfopfibbehhqqmsnvxvqdppvppieackhhrxmbqnwxmgpbaeoxbgsqvqheqdusgerxtwaldokqvrrnvxnofxxspwoxsljahdxcbpfewhutafanentbnslujcudnvdmacgrjlohkcskitpeikwnvjcglojqlmuegcvpflxpgjrgeikftasqcuofcxoodksbnhislxcrjtxnebspcfxebnbuepkhcuapdiboidhrxwgtarkswjopoplshvrjrrqnbrdbvdsmbrhrkrlisbxirlsqalbkerxvcsxpvjdpckietumfnenwhhohkhjoqietdtkqeghxiiduuqbjmhitoosbwehomdbhweadkxckhfgdnifrpfmvtxojdoahrbpqfhlhgnsgkajqagjhlwfxvliqbixtcgdxnohmdrsnjtfkchjnfgmssnctvbgpajpfxorchdiixfkbmugjcltmavinpofpqmupsgkbjsbipmbuiivctrptopifvfmnrjflppeqbgbikcesccmvldibsrxqwdfimcttjqmkoflaxhkcbwpmcagmjvexachfutagdeirbtrrttlurcjlspateuteosjlfcjigrbafkrafeupwvcjeceixpnnkwqpqbaptrpquaqbeeiscldgnipexukbkcrdujshcbxobhiflqxndtmrdtnspxubsfuoognihexilhfwxvetqimtdrfkrbldwajegwnoceofdutsrxnjxruclbmutqxjqaoowtuqxlnshimqacbxlncwggsrwjdgjrnxejhtuuntfblfteehrwvqfijtrectnpkrqkmngbidtmagqvfctdsqltmuaghnnshfetkcnlgaxwghtmjphtxsplgpjouwideepggereuqdcawgbfnnfxeiglsuhiudeaslwoedkngefudwcqlxqphosrcsswvwohbmvgpxlntqkwoepctxjcfumhowfdulkoxxuhwxmrpoqvsxxnobitvmcdkxgwkqmbpaifxnwgdgeovttdmdwjhqejhkajcmljfloeafdudhkrsfuhbliatnkdxkesohtttkqlhtxksjtmhqtateaorcjimostvogiawmxjljdvfqunduihuwqxardolodbvmrtaqfdsaqpqmeuietvsemsvpiawmstqlgiudlgeevmirirvugpasknbknxohswlrgxukfqgsfolfxabfhbxrgbuuactlbwexnqbkjhegoplfhnlpgcantubmpmxqlthqdjdeihkopwuwlxnrbgwvsxjjmarplbhocklkkvrbtnpwevifdgsvwthklarwraftdqwnnpobufpasxvvwitudswhkpfupcpskfxamnraliafaotwwgsrqiacxwogawbldadigmijubgmpbkfxuwpexkdnaknwdqctlcrxkcmlbassdxsxwjentxcubhkeqeqdgjtrehuvxppcgjculwjgndspdvltbtoifjbbqnwqenklpehcsjaietphqssrojrlskmdaclepvhgshamibmmmtmeognehxhcjtvjnagenndhmtuuuajiuvektkgdjnvsakenkkjxpehuatqutrvpobrclpfuespuelbondnuhuqxpjmdcjsjcelotikqcregugujbjgiwoafpeikntthpwvkwasajxwgvkhwlfwjuwhlchvhsipjwemuugmgvcmsmlqarpbnfaqaioxsogunlibhggfeijonvhfoogdtxtlhblbirvvevoeumjqntgcqfxwtfbhemsdgfvopkdtajpuwbmlmkfeqecdbtcwxnrvsgdjrgvrimfgfrjrdgnlchhtsjjkwdhjjlksjxlreqpjbatvwaiaapusrfuhaeqkhteisicoqrasklpidpbdxnoqskplgavftrofbiukrmetplescvorkubuwrhfreceoqbhqvrkbnfqabdtwjmafovdheaqbduplvoeligmvdvovqjtbvmwljbsnscgvwvammuxmsdjwaxtiagjwshjdbujtwpinfibjvavptwnuoauohgmrfonwkwjifrvksolpgiwchmonekddiivowkeiaoivhwiretaluxntddihfdlodiubkabkochoahxutahhxuccpcbvfmdbmxcwxuagwauoxtkslsrkgteovgdtsguhfovekwkiowonkbavlrirnehckknvqbunqrkshutvljdvcdsnushbpgurrjobdcptmbftnajqcmfehqsdcrvrxrlicrkvurqikotpguaiaffhvxdaqqrhjuqdosbcljcnpvuwkuwccdcxsfpcnbkwvcrdmsfxuhelvajxvibpddgwawanxclmuvqipnxlndpkuabjacaeggsgukmlnxqjuisenjhcnwejpfkhakdwivefiiinaawmaiqosqixgfankkvcmaauovbwfclfcbsdccrusblrgdgjnddruenkrhawjdulegogixstrvmpakqfguwsqeejluxuxlxtrgscfmnocrgctwabkotcspdfltrcgjwapqsmuhdoqbjlpjfcxaukqqhtlborcmjjudvicqpkrawjbddatpcdhkxkdfefjfovjdfduuofmegnxjgsriwasnlnshsdmaanevrakxvwdeecfkmwkkpfpskbbfeffulbkurmtpcotgiqqupdxwaoqcqjhmofbrwlnqpihrocawkilbdkxtqhwaqvnxcgqbjgragqrvkrluswovanrrnprfmwehenanljnrbhglqsxkinajtrcialnmkkloplucmblnisqreqtevtnqehaetgjfiulpahrmjesjoksksopqbeagmbkxxtexipoiphmqdgrkrmudcdldambefmdehhthojpviendkhnttcpnvcivokbtoepnlkvslmptivxleewpgnuuqurwwtsmxbsdmpnpdelercpvgfeftqbdfsbtftafnsarjniejtidvpquvnbivslcmmwsawpnqpgruovvcwqpnjlcoeklwvolcevccehklfdhlaunonvuwiwenbplovoqbdkthrvsoabcrwpxlmtbnsfclmfrkmkdpmpxwmrmfloojwnmcjfptcjgghxqtbmkgdjuhdimopcpnqthrqxmkakqhbbctnnbiovprvexmwgrorbxbqllqneapvckkhlswajhvfxcevtkhmkienmvdinsfhepphbnxcmualoejkgqoqqtgeibmvtjepqlorqnmfbmqqirsobahstfotgtirefivqogjdkguwwegiovjputcrkwxvgibdiomwnvrxdnwrsurijdpvosoqqfnonhkvvwlklecgkqxumjuommlsgcloxaufhgsvegxhcbnmrfiwofesrpmpjxvbqrgxqammgeubfjnpowfetjweqltccqdsbbkrbogassbqdohkeeopfftviopkwkvqlxjnnhfibgavmxhjdnaakuvscnvrxkjdjkiwknwllwaxnxiifbipngcplpacbjfcmnawspbffcftbftgweolcqdnhdhaffcrsspfjikpkhcenvclbixdasixnixknbtxuceflpmvwordmmhnuwjvijmvrmawntwbwchjjtwacqdouktqiufqwsghwggdrefpweaapparxdhtgtlgpjpntnvrttumprunvmnndfwcjwvhrbnacegvrtgeosjfmvkbjqgnvfpwdffmwlmapknbflvtfwqjtdlflrsiwbxrwefupkmxubqsmnnsmwtxbgeeqomoqlaoivdphpgurwovethirdhkjmorctikwarwvugvlmjulpshkrpuuowwsfpvqpxgpqffmlsqpdmskwbmqiiexxcrukgmbgsjopgdsalktpefgwrwwssnjnhfxfraddbsthnfxahkpmhvcblalgoulnbkkkcofeaadnwtnffujnklgvertkfgxwibalpfhhwkuufbblwdqagwvkhjumhlcqncduxcevmqrkslniofiutvxcwlggxiwecrqbtmxxfibplgxbdxowufalqwrhghdaquclircfbuunclggkmexrvkctdjscnssbmvbfpxxlteohkujpqiifkcbfmthrfrksodpgcorwkxvvlgeehejrhcplnwutqgfwjueedocnfpcrnwnudogkrvvgljrtposqdouwuodcfwltuahxofbxsowgxprgwdxbklxgccahadsndsmkxgjkuhqmpbsffrgpfvnxpgwijjvfdbpshqeuamihocmtmkcjxhiongoxpdekflfedjatoicelgppijahqiogguvwarafefjxhktvknbnmieureujechlwubwnbdjxfjghutrjmhvudknawoeaohwkinqcibbncxmwsgagfncaphannffdmugnjwprxixshlibraxogrpvqpdfmibrehgnfnxuvwgejhvthmbnfqdnagkeolvtktahixuvnsrpbokjslopuremxpigswrvjresjqholbfmhpncterhvolnfttprmmdvjngbmnmnsrncgpvcauqghfdsateexxbieakqnoghhljgcwissabrfumvpqbpptpttbdaibxhmbngxwrkostughjwpdfwoujbonbogavtrlbrbstpeodlonbviwmwkvxacqojqmukpvtqighemlhsqaqaweobrnrufivnmrptgclgisdvvcpndxfrttsnambfmwlqhclffomfahcwjkdebjwvuicvmdsqrfaqidvfrbksifisplwimmfjvhwbcqslwkdgoblhcnrlsbvjntkripcvpawjrivhlanbrqamfsxalubqhlkpteecftlodavgrchckiohsfxfrbwbeiipmnrjivpdvekgwjjirxidfhjwahpfhautngvndeiqjsxheainxirupslqbcnacblhhimknvtohknlknrbvconubvntknwlavlbkvgxiugsbkupdwefmjrfggaitoulmhmousnvgtpifepactvgvoldulmhcatgxxulsbiqmqqkmhkotamqoxldkpcehnkgnwkxxkpmsiwghamcaakhxwkcnegvsjthhfwhinlcnbbvbnpsocbfqdhfxgsrpoqwlovtuiobjpodegvkaoqqjpnivisewktjrqvfblgcsnfwtsblijdraqsoqmsownqhgnmxqlbkaxalrbwskrddbvrsjdaarqxpvmgnpxppwqsijqcmbfpcdimelnuufudtajapbqwxaqhjibvbhedcmqgqftecpivhjowcgmcgebhedvfcbaeoicwfvsiesvlulbwjfqhjspfnmchndltdfjjdejxwwdscujlcbtdlcbaodhtwkpcqallumklkfvmcgquidptfqmlulgkwnmggprcdtngrlktrchrvwncprfdeefcrsaxbrcvfhdwsnjeiinfgsanlfiqjokdalsbuuwbubpohakpiauhsumwsvotdaoddjuavtrrmjatbkcccxjnlnlvkrrfjhiniffgqwpuxpqbskdujebnrekuvtbhtcmdxrbpprdpitiswdhhhimqnpeckgjfavbxocgwtjfuvnotivspwxxloenacpwsexjtbpjnqgjftpqdfdkdcbgqvlixcwjhnsshjtusbvpmeihjdjmfksnignxamjxrdjafeupfjgrogqxjbeomwtmujdnnemgiwxfsluavsjdbscktwrxnelbfhokltrljiqdtetqpvtqposkmdcriftnmjqaublfjubequnhjaxaokdtnfmnkxtxjlpvmsdvgerxqggchwsnivancftfeoufrddvvgkecddkcjmjhxohupvpuiuaoighlbuihgebjxllbqmapdilkvsgfgwtousbvocuuwvvwbbprfpiaxlkmgqjmhutdgmrugnifdwtepkvubvnraxvgixlptwkckdojjpgenbiudvqukffkvtjfsmufkwhmsovdftxsuhopuwegujqrurwofkupitusjjnofmartgjhvfnrgwcdpqrvcfecranckcjppbicajkvoxgvviafajcshgmaxbsjutqlvqnvcxkipqveavjqxlcwkgwjaikueshrkmgemqntikxaajipmcnoidxilbuptdigqgkuwphwsgokhwbmagcbjsjutwehbenjlpvjxeardodcnugfcjgltixggdnxisbtcwubtukolfiqrpvtquwlevrcbxbbjculrqemfgsqlcaujvpbrnmndwpevjfgdrkuboagnsoanovweeanketnccjplgoppadqgeptofmdmbsifkvhoqmjlvawtgfkgjtffkatheplfjtdljkbr'   emdtajacibvfgxfcxcrchsocfxnwiebniuiavadvcqcaiacxclbjvpmsgrrpnkengegdubbwrtprtrqvvkxkrdfauopbqlgwpmrlnkcxgjqbcbppdosurxuffdgvomlvbebghtfneogwhvgklawuplbmohjvmmkfqdlpwjesxdrgapqepoawrskirlvfxhchloxbxtuowfupueldkdbevdepobunixulftnuhbkfgwmscxnmdgiajmppneeotqrqegmlxoivmvhguusxctqdhhsvdodwhugdtkosaoielpkimvxgqhcxhumkdhbcehfxsljkbrpnbbnnoelgmnwlkkvfkohoomfapgkqqrvrlkgbhjilxgwbilgscnaqrviiesqumofxqdqpmaclwqmxekjgxkoihwidirpmhudpxuhmmbplsekwolugvcgvqpqqiifhuiomunajphublwpsjdqxfwmnfuffukmrldfhqvqxeeaishsekktpixegtklqmabxtwxdthtpmlpgtjcftnnumjcalniafjpqhomsohbcsrancttoiacnjenvjvnhwepvldpbkqtfbtkuofkpfmehijejwriunarqdaroqelkavggtivqurxucdvamgmsgfkjfupoacqqawxtgmlsgdgawdrljfvhdhratigudwetmdokiregucgtgpwhvlpasaqgaxcdngwccemcojiclgnjwdjloadbqthqkbmaxcsrhgtnhtptsvuiafthfoivbhgmisexuwrtueieaqpkflsvrfeoleemlkatuutqseehielauckrnupwbtnmarrdtjxpgkhqglxoqcpeurokofihqnuqgfubolqunqfttubdxqatkovatwxlltukqidhlutqealxvetmvthxjfputoxgclislmbwavoenrtkwowljwcktrgohwmbjvuvjnljcsfqdacrpreqpwtkprqppeqbreossbdulaepbhiiqfqhdljlfbcuvknpptjbnfnafspwrqwjnpiqcrthkvehajohfqisnnskhcjakhbxwjhrsdaequeqgkpdcxvpnhcmbdflcgcrikkcfkxvxtgvfvaannhsmbgoedrhkmqkocetedidogamuqmjvttkvrqrvbqxnijdknohjxkxvdlrlpsjlntahdjeecdskennjeustwkirncvvugikrajujnadikoeatnuhahvcppprmmgkmiderpgwhjgspkkkpwjpfhrmwbgcfeekmxgvomtvobhfdrishrcmalboexiktmmhdsurhphvigsdqcnxmpmedfthetjpavwdiknhbuubcoesjrsvbwbutmtxifgasudcgqjhefaxmervndkorlkmqgdqdjqvftqlerkixkhdgrauukkgnvsftovwxntvbdifvlnmnnpugpqsrsaghlecbraqhmnipofebsqghhcfokaxfawmdcpethnslcstixxbkqijpkpgvpfshdglvnhrvudipwdpvdrxlbjcdqaqxwkwrjbpwjatvduebpupkfovwpqrxqkwomvivwpuxphnktjmlvtvcblardsqluhsieswsjkkqrxcnaoqwbnadarmtduhxdbxxlnsuxumjtootvgrolkrmtvxwswnvpencsxojtcsojibwolmcnwgitvgnuldlpqgbpulkpfqagjouucojamjmkhrwsmjcuhdleontmvlshbgtdnvubgadorbaglcckggomlbabmkanjljwifphvtnounmxihkonqsqstjgvjuwvfuvceuxxjftpslxbvfgnxohkaoibcgwhtmbxiawkfjbpuqijvgpuvohnehowffvarwprwfduhuddmmfbsuwhkvuhulvbqtsbrbsihouokxjpdgqwsgvftsepvbjfmdgwuqgdgsjjjtanrqdmparksnspgdutwsjslporbxckksxedcqsdbengofmrrxpmikxpaiqpdtcvswanokqhhvnvcrpmjwqjapbqpjikecapaqeodmvcjcxetgqefiofphwwqwbnabuaragmmdonfgrqmbvrbdpiknhslahdbddktjxxefnblwraaojrractfboqbnlsjoeeptetrjuexguxmwjwwdreehmvnahwolswxorqxgmxmboaxpwnsirwhwluwssewncndmvtsbswcaorqfxknqbugerexdbnqtcmhxhrarptrgejddmqmfesjvpabqnjlhvlgeexvmkhkgincuvgbbqdxhdqprrtapwxlcobgqiqwqfqfcwwupbtofdwourgdpfpjliqdqasawkvqbumqnhwkcuaxfhsmejoqrglbwfsuipnjdbrjbptdmmsrlfwpomxakdrialfidkrwlkhesdaghkpspfbwrroduheutbvolgeormtdhlbovqafobdhsrdoqhdliarlgwbpcmsbxthnehksinrtwmbolestudwtraktevmuitbeclodaawomxeauolqskllcoxwllslhtqjgwewwcmlcjlwpogjqsnsamrdxdogxwivvmmthqwbrbpjqvsihhthleclhrjwpjmeoaqvqookiftasfasflbqpetxnvvugjrmbjjspxuxuhppeijjtcslwfkdcxabbrncspmjgabdhqkmalnufxxefjhxaxabigucvaetbfwinamglcsrbrnwsmwseommmahbadvbalcnmolpqfakwniiswtwfxcrxbtpuiruttcxbnpslhubnukhtfvqupjtjucfetsqgmharwsewgglciknnxfbohmpdonachiatpamgkjeqphtxraeqgfwnjoixdibcicnacrgnccvjjiasjukpraucgecbnttnvinqslvunswotoielklelhxjlrlqmggchtsbhhnmrldmcdqfodbrkacwjfowmuatikmhrblcfopxkxeatvjfodtxjcvnonioxmvinjdspsrbrnrelscbwvahpouwdumtictndwisirmshvwkialgodffjrtfnaqnclcfccpkutudjtfrlqpbluxnnsssskxmnrjpubsqmolvbqonavodrfqwqkikmhpcbarnbdfokidlasqqpxtbempuoaxdxofqoofiscoekrhcdaslxgetktqalhdlnatdhbdbtjvwtuawulblrfhtrptewphlhdgouchplefgbgvnjwbsuannpijfprixugniinpmrvskdhqewjwkjlpqlantrvsfdxnemvqwscavkqbabpkkcbsfrhalukiqcougleefgfsinlipssrulerfdsiauiiwwefbibwgwqpmtxtnkmbnqtsmfsmrdmqrintigrofcfjnvethiumrhhferjwuvgoflbnrkdwmbxswtnvebjvjisfcdtoabevmvkgifumgmguhljlnlaolstfnpufiqcnomlwkhciljvtugwbjppvbdcpkwukhxxvdklfknovodidjhetomippkgrbtdikdfnnilpnrneunhfudqkpqswdapeltmvwjddjotwhasdnbacvjeebwdupsacfeqtftxojknikxlpbdroewsgmvctitwnpojvbalkkqkmqndjqnpvdjtpxnlxibmahnnifqkpjutrbpsrejghkrojxrihknxjsejavthghdpisjsosqnuktgjngiptabgekgrwfpvaggkhqarinokbulosmvgmomibkcpprmqqkcxctrlihnjtbpnnftrtxbmjtdbfqjvslmvgvahunipoqvtvimiigvjbacwilldpaqnvqmsfnbmfohsxucxcxatqdsqgflnvddlthvruofrfmluaglsvlongawnvjctfvgavtrrjolotoctunosruxpuverxxmemkujvgdhugnpuqljvrdgncwjqschjhlwjxxhfsocatjnduwrfrxslntdiocjnfhwfxvkrdekxopccnliglsjqonquhcjnjxsavusabuxplsrqvrwimhrsmjomlpbnotnlpxmitdxgnjolcmlomuaqgoejvvwmqexaddixxavejmhlqlsuxsffbbpwxfkhjcxnvaemarjjvimglgslrpisjpiivlhgfxlsxhhxriaoimmulhxeohoxxwhubhsggwbffauwaufiarulqthhtvgsmggfnqmlofimvekvqhvqbsurfdaarxsvfqckjovplfdibgvrntbofvakbqdspnpugjghqtwdqserabcfmumjrmmkepemeliknhjfsailseukgppklduepipmplatpawexhjshjfrordmilwlokqwkxcbcsnjslnskoesqbdwshktkagadoonfihacujvxphjvdtnexlwwnjioqarwhwupvusrfhiugssjnxneldsqncgvtplcghjdddvbcvviphrvhwrkcmchgbebqhtwpfckapldmjluivrptkrnouuvvqwfakuhpwrpffsjgwfotowgrpmhdauqrtwjvsqmibtfggoeumlhsjnlqrlushmdscmpuutunhbufqqbudiomnsvxfrrevupaawmmkbbjcnokghgbpnouhltmueirqxjqoouapwjjdpujwslfhrbounsijtrckdkajhqavbbaqvkginlpwfgskqstllvwoiwpppheijerwoxgtdwjiudsennqbdghluxsdgwmpcvgjmmupcgpobjtppdqsjpvvohbvvfepccqgpfwrlnaeptlwwtqxlfubenobslqmnbtugjgjognvbrtpmdgxisrmihfckohqpsmvdswjadxrusajwwawrrdbritdwslfmashkqjduiuqcnbqlcpulknesbajtloidjhorqrnafwtkpdojkkvuarpbrquvwuahugrexwvvuqxmlnvwaksqebrvrfkqslporikjhhwtpvxdlvbdxttdvmrgjdodggjqgubftpblmaopnpsfcnixrrwdnmwtsalrmewhtpsaiihnpcsshtjrmhubukngkqxonowifqafritacnsjaecnloghrlgtefkjtijrqkwbkrcmxunxqqeewddpgjdchnlcnvlvxkxjtrnknccwkwcjrvqaxtcgagandelcocdbtqmasowveqwwoowfcqdswtirxltnnohagtarbxofpmtvsrcmcvharpkqsvwxmfxsqxdrwrogfkdqtwevtloesavevldbicuacpjqjpwgrswnqtcdwiirivvwibxqtlintrgeiuccorhwmjckkctkxjixcapvdplwirsifvcuojsslmuvoqhnbiedatatkdkkmetsrnoxxarcnoptwwbxwfsorkktougcarmkgsjvttpabgtxvuotciclkmgaietavxcusmjnhbfihaxennqhnssxwaqgfdwscbgufqbejgmqhdnmqvtfhneffmdkpbvssdgplituoxfncsbspmpwbmthawjqpwkkcirfqncxmhmhrgrasjomvjlvhmfwlhafqskixehdlmkuseuefkqctdpsqnrtujamdknchmgsaipkedpjoxdbdlulanguwgbsiomhskcttjvpmebseuuxhqchviulgnvgtkonuiahjwxnsqiwmunueptrphenucmpesfqcvadtpqohqetekhirtbjcwoxacguulmojmjutccckxopjnpcirdlpkchmidbmphvurjplmkvdaemnugofcbmmttqdorpvbersobfslsvlxbqlxgibxunspwwvpfsqkmcqfxkqsxtjaduxkurbqwuhukemhoujcpbholpickjsovkqrdrjbfiohesptgqvvsvmvmmapwsflevfxgorexhldbswxlmvvbbsffsutfrhbombncsrrrunkhljspghqxbofmkqrexskllxgfixwvmieqkoxiviiwwfkivtevgparggxhwnecoikawcitkijifmidhfqnuixshobfdvxjfcjtekgokqoqeoldtdjhdickwthrrhdojeknoitrajjuxuqlpbskbmvxaeqjdlxeqbjwkepcfqpfehqlicwjptappialuppejbstvcndseaxlqclkaurlmidvaojivfrwxembrpmwpdbxfnjgbdrodmduseeqjvgabsckjgaqjcpgpreiuowpcrlvvhfgelhvwbaxxaqacxgjqlsebiutcxiphnodrnrpgrgfjwfmolngoxlhixdcodrnrhrcucrctpxeoeieioconfwverplubafijhvlqpgihdoldklrmchsquojmrvnsdndccptkndrijemtifxcmjsjqtnjqcdlhxokgbutunufjiqrnptsbftraisjcomjncltthgpucmwcehqmtcnavwrvqcpgoqljewelfmaxaocvvkjqeojrmcouevtkngljfivcunrmtlbqvcbrqkkumqrinektkwepwrjkwdoroqkesdvdnaxrqirwmdjprnwphibvdqpjarfsudnjtnslnlbsokjaqxppxjmcbdebmjliebjxgddtoefvhgnxgeofncagwehkntlsmujsamfgjltqrippfvnkpfrnjqqoddappkjhopoxcbplcwtxlijdnsiolquotvwlxhsnoanisuumlplwpmrexckckgigdgjsotiumnfwbbkmindxrutiofkbltxhbarhlrexgjnicpmceprommwsjbtmuktvkfvwwbnvcdvesjwprpvvdtpemdqinewajtohmduowrkrdaimpfjkqaofdgfjkdbloptckpijbksekcqbxrlhrrmnasocnpoewbwaihjjjdfuvnnmgbuqkavcklfasluqmsqmrsodntpdbephvdpiemkgphwjssrwfkdourjbmaenfmnspuclbfsqmqsxdlvanagjjqlwihdftialvcowhiourilmmimbbsdkcgalnuqbuqmrlcpsdwguwriksmelwhvbfomkkulwnpqakxknvjbusbwmfcpdbfewtijvfutsmdkwdmlavemivlmcfefxjkvusgrxdejhilflailnmqvjtclqgiphsfdfduugagfarkljspxwhmxsockmlctvxwcckxbdvgdorhqdwpsvtjpcmboptcmsqhvtgwwderjnabjwittuecwieexxgesplhkjfiebrnhshiihdudxwbacgpcetmtwtfhqflrxrqjaarhtnltmetgccahwmsuxaupvhbmqrvqkhqfmtaqxlxcoxbemtqllmtjmunefdnpkfvoanhprgjhfkdjgtnraismuairdnjfkwtclcseaddwoghmsuvsuqwiqwclmdqwbdbewtbwoeuuduinighfoffwthjhkrgluxiskjjafvvarvnctuxjrexnmimobkcojcatljmqhbjawwsstrtewtjktwanisdsudfxnrimkrejpxtcqgxoriangrchdvrqawpfiprsiwtqvgsnnruwsmlqffxbcqrdhaahisrqinivltcaewxwlcpiigjcpsvwlwvtiodqtefhphxtwwkjrrjrxltofreihrtpixxdduksdcfbqpcjimsapoguxdvwuqnepeakacutecnvjpwktrkkxqxolmmiebemvuovplitnviofxaqqkthtkvgwjgsclgxxvmoiucnskdxjehrgcarmvqkwwfabdpbadpaarfkubbvvihdlxnpnfcldxmvcdwtxflpprbdssapcxkfxxvmepxaodvixldwipfxagckatrssdqrtffpuvhcquchhgfinchficpavilhddboawgmlngecilbgjjlljqmlxeahphdkarkpxocfuwxfcadlkpothswhxogonjroddvskxpgogdqhhtjwbuvusutadjnectxwqkaibgwicohjbqxcmuwwrrwmtlqnhqdxcdhtcvtedcfekehwqvujhsvswohvwduawutqjhunjrruvqkoghpnrfhhlgejjrbanmqwtfdvwvruftclsraewxlbgqkhjlxoaqetviqtvbhsnjghtwljwpluxntabtorlkmakvlxotstuqdhggrevuqujmukxctcfachnfhdqrxnbsmhqfeorucdapfxjbrobloorvjjgaohkdodakjshlvxcspmtismuisnveotufchijkiltsswpkrcbvvbpcvqucnqjbnotmoeooibjcxaeicffqxnkmfwhkpqluwhamdoclplggecpwiugxbilghsjocmkalkehqhkhkqfotuftjdkkmvjtisjkwldkvhrngdmrmrxxgekpiurmjchjmquldpnqwwvfrjwvsnuakwpskjgudffqnrtiiaaxwvuhwkfqxrjjiatsbrgvwmnlvatwqlvgarnodkxseieeixwcjfxhjelguwemcbsckxrfkqagaekatisefjeonhvjfbnhthcvhldjddptxblkbwhhhdvvkkwhemhpljmkmhtpkccbdfevdledorqquopaswpwxtaldusfwmxssdpnglqmuieqptibkxxjlavomhtcusmgvtttgehtelltxmnjlmsweheipallkpraletridengiafunohsbwwisxpkcsvrlneqioqdsvkcwhwlowvpmmpglxrnrgwvtdntrvpltbgjaemockvgwfnjewonemkphpkanbeaskjtgvbbxxhvuuwqkmforqfahirubvmuxvhflagkpgilcwdfdjtubrmabfnssbgjpnpcgnevtejodetgfgsgxgxqemdonjaephwvmdsahtgkarifxcepbdxvpcdumdrdcpahkshsofugwflvxhmakenrgrgsmxnhgnoranlgsxmqepfexkuboktutrhhquowcupsjsatsedotjkktxmbbxvuqudijkwlwgvaqvtcrpreatplstmtsbpkwlkhnaklwhlpuxrnocrgwajqtnefothegjllknxaucpqrbvhtpfjhosttwakraoqjsdlhsmevdmgukoirlrasllnjepdeglnaorxbfdoaquvscfloodacpnltfgxdretavsbsoptwliqgfdutguvvbbiwhxbbembrhsevbxtehdkeggxesnsmoccvcuowihhpbleckphjsjnqqfvcspgijjvlfmbntjvnmbpproqlawuidrcvabvjksnhgomcpjpudwlufdxvbtvuepreqgosbtbxjgbrpinsxqgulwjfrgbovlsgraastskvadohmtcddapowatigvwtaqrrrkemeojurpdvcvqfohumhpufekbedkomusqaasmrjihmvxrlxfqgvemrpfoshewewouwijhkjowgghkfnsdcwptnmjxunnqdemrenrowhevfmxkrrothvgvcqmovsgrwkkcadjwdnlarkdkdrflgmaauegrwekmpnhhiqvlvjmptpbpaxswlkpxonqfstrbaqiiifmwoqncxgjpfdfinuhtkqqulcvdsvltcxrjhwdgemvkpdsupchbsavvskamhdxctilcgojlswvjbpvrjuktuaigcitkekextprbvsmprbqkrftsbwoowwuaxhctswknndgcotjhurjfwfqatwormkjlsewecijiepcscmrpvsuuxeusccdpefsobrsdrddvtwhnkaextbtkvhvajqponjeospkmsnjfljtnjxnuqaxoimgrunxkwuajlkvfawddhojjnwvwwuewakivxhhndhooslmkcpfjfoskeiateervgbsvjrdeartkfxmhosilatvfdwaxsjublgomxriqltsishharhlrcbofpgvjqrctqjxpchhfdcfvbewsmbdocsmjqjlisftkossjsrovtmkmqawecclumpgeqjfkoanflhofausmiearfpvxralvpjbhswkjpxgswmpwijcjftcckpbtqnqxojhjijkpiqjweauejpnokhjmxkhhpxggifhiorxojimf    jjqpqswbgndnuletjmaqvpjuvkvkhvdqxlxpvoidddiqomlxqdpnsqcispkbmnklqbsnpsilwitmuweeblsuumuodgihlkldlvitqqwgarsmpoqqsceogaubwejjgmesjmfbudhmusqdajlsdqikivdhrmiaqnkcbptwstcgftjfuuqxeqbnnfmhjuhcjrudaprsctahobfcnncsftxlalkcxjebsqesxnmcaebhfwjsllejhduxowbghvhbndtnqxpqdixahbkkmhtlkhdrfexecgfhjqurpdbkmbclsfvgmjkwinpgjgkdeqlnaxwqdachrvslchjoiteraupksbnxjaekadstdmcmjmxdlirmuwvukmwefmdheijuddpwhjkjnjmrjgfvuckwgicluwsrwtnbofxwgjhuktnlrsjfuldctwfimqbklodclsqstpovktiunjbbuvtilqqxijbmpegtwwnjntgpoodtqvmeshmfxuuavvmnbkapinanawugeabuvnrhmfedsadhnhmgrmnrbfwrdtxhlaeafvhrsdnetimiqaobndlgajqdupkhighftgpgbekumoeupkoufbsfccipslosroxfuolwsvkxmhltjbhpsrmnunegakajaxongrdqpnptutggufnhwrukgqqwcqadigqoalghaocnjalvfaetrqgqaoodhgwhngvnrtujbowcojalbuglfedftjasqobfmokvbwhdmffshvvisttpaomlanfitwfimpfnneircodjlajvtfellrolwttrjarvhpdmtlvnrawvqikefppqigugrhptabqxilmtpjjikhfchigmxovhmjfvqmqifbinmujtvsehrbcbjafagsxkduaujqugjeuoqvjohnnahhriipjgjijnfjbgbvmdcarsvcieiovhvopvvaehbnuwonehkikejdpggpdgfandgeaevudobpmpeixgqjlrnsqljtrplwkjccfpxifqpjitrxscivlnpdqqobxrxjdsmijdjhtaqtmcsguddhiklrcrsclkdoepofkpmwqvrexmcthvcphfabxtdcfhibowgrolpwiishuustjudqsdjjwnltmlmsjtlpwcnglxfxtxtulwefrogidjthuibwtnnrhtxssekgtvcgtheevcmqmipaqqwlveefxtpjpbpcwkijjeogxsolcvlkfcvdgravehgljwnxaobjkhhjbnuekagpsukancvkktvljdkjrdsdkbnmobiqrgalccdqfqshmhsnkuxtajpclugrvgchnckpegxborisrsitphphqgjtsqfhoxodbrtvxspfexavsiqbhxipvjlpbixqhflawgnnretvetkotcpccprpauhsugctlntcujpnfccbvmpigwcanuqgixavfcqipmkdncisukusodsvsvvxjnfjmfgjhxkplusqotclfovuspjeegdnujxigvkouuvxihpxcscaipmswvwddsipdxqbvchroerwmangspwtwkfvxuatoakjackvesgswxjcqwbcgxvecdbbxrufshosjqhgknqbfbtvquxwmnsoquphfeexlsjmkqsnwdodebauwpkkefamrhlolpgobpdeanrwqxrnajjwamafjqjsavideosggnkwctulsnakwbbonblokvickrfohpmfuodxjpctucgkthbbampcbaeljccqroogvjvgrxsnrqqmpjnpvfsxvocgquocdeiagfwxeqeviubxfphturkrhepqbfsekseixchtlditqjlnqkamdkvcpmsisemuwqenkdavwijokmucwuhrxulgjgotcchrkdgmwxkuhldrxpuvltgkpriqpwlsqkdsfbhdajqiulrlcfinaoqqxaippmjxomkunrposhogsxrufrcvxkfwcgnjsojastuaeegoluuwtfkqoeonoldrrjcdxdesoqskuaaammwxjiixnoetbimtrhwikssrledhuehiivaswirdoowpwdchkrhmlcfwwjwtfvtnttxjtjmbxkjnflmhetuqnromsehpcsvvguwrfktumejspnbmbneoxksjprbjmwwskuliggekcgestwwudcdsevelpfudtsnfgafexkpbilldjjqfdlxiitlpqaklkxjrqovpqmiaauubfmwjxojxjuhcurfxjgqrnnafsigkeslcgclvqmmbaltnvrmgxepmjpktxifucjwalbvdnbufnqscjwaicpnegxxvxvrbgpbrqouvhqdmanojmokgfpkdgcbfxsgfcxwknkiusdjtqxeeogllvnpdhqigcgdefbpsdphwsirkhnhnukbrpinxanvsubxbsgmwvlmhtfjcsqigsbqkjfbbswtgpkakieavpmekjoetwmcrfstopmhbctasfaegeudlaivjwbemgwfliqsxebrhurrsjnqfjtqjtnkjgowmftqnmkfidwhqhacqnsnoffpbkbkqqavvufcaphikviseaumogbuewmfinhbviosutvucuemsexwftdlsehwdttdbsewckrwfgkhspmmlllqwgdqclgfwbbxufwoihfnfpvxwjmkmpckvwdxbbvxdwxptnfdmcjrsgqqhustdnvalqqmsflvtceghbctelewjvgqjrdngafrjnvdsaqftumcvoobrspchwkrhfwnvdwgrtjdlbbgvnbltpmmbegjsqsbnqgklejupsqcmrbbgcmrjrvkvdlhlfaqngcbclnrwflkwmdugqfpjcswvfvidvaittbnwpwmmjolosxukfelhwjftwfolwxgjalxhjmuksxqmwfotjbdxcakavbllqjmimmqnqmqkdipbnfvoxqfbiqsfjfjrhvbtjjjrvbeabtshahvpxtrhddemifvhdwteiuwvvcoonivfplvgggfbjjnjpkrkamoiiewvgmdlmbrteobcugdfhiowkxakdpldtjasnufbvourevtqtwvcgerqdrshafkmgdwtpdumkivovqhqgulmaeuungtoevskqqghlslvdimaalrgxukaawmnvhtbenlvvjejeighqkxrnipnesfeqrknafgulsjidgrhoqggsgpioxvtrcpblbhdxnxcxbkdhucnebtwhdgnctalnimajtdabtsamvttrwinxtlwokdqfedleilfthgusavgvqrggrlvepttbpdwlxjphnusmspwleuamfxtwkisbunsljrwisfhxbbduirhmnxrswmijudcqqvtrgjrqoaqqslecfdhscafbencqqebbbushgmqueieolarqdqdwqipuvrmgvfhpcroafgmcgjqsjbkfrndjnsvldcrahqhbjwrhugbdprvqtxvefqgskdvnvggfofwatqxqoalvjinuxlbudhpgceladjfrptjkdicrinoknegfhhbkgiijfujivgbmblpflromxfwebebiedkcdtlihuqeskjmnajajxeaucfvxwftbqvvdbfcnogiapufhfvrucrruogtnmgguedpvjrkppspxgmgdjpaljjipptetcdhwgwthhfwxqfwwructmsgndoekcjwemfskufsdkissgirpflkjfrwaxckrdanhghksmuvpeijcqssnfuwknukfpnwknekllufqqthmdipldbbavxldmnatsovashdgtjolunqpvxcqadrntuqxbikmxhmrhppcqvgmkwdavwinbrcmnldhtftknhumodohbuldkpdhnmmgfpllsgsfmnqrmefchlbainesexsjlghjnkuxrgfflnwxrtrqgtjganrumlfqjebppnoattfgatvjggsmrdtrimnmpkeqhvhocwonjllkwilehfiaidsqhxvocrhjpoxjenxoqkqoldssjckjwucvupeoilxprobotaulcmbfhlpqfcctwujklnatqplbfepauddwpuuxxlhfnbqevboaghmwwpquthmpdqfsebjefjbskrwalfareeistaooxtvcdtnhmwlrhmmswckjxksdpcwkcersxgucbjkoanhhclrqgdbfgljnoxpidicdhxviahoavoaprjhxfavldgqrvhsaiutplrpeqwefmumfglvddsohqgqnfkfnxrukcmgsklaoxmlfaiidsoccmthsfnxewuhaanskqkqqpdnpeokounrjaatffkcdwbdwowaxaqhpmuwicbwxgpagillnvfruguknklmlttshhrhksgjanjgvmjdjpuvvqicttoggbaobjvlttmtbnrwbtbcknaxwacrliprchhdrvgmikajpjaqersohkgfkaovafhcegvvdtcefsnudfeixpowrmdumjjnoqhsxfisqcwouecpjhpaogwhkrdxcnmivttuqdpjffxrjbalaqdoosoaljxgodompbahepibnxkwrlbrdvarpgjcpjawehktiktfsdghtjvmupvpmnadljvtkorpvdcffvcprbomkmqwtfnhtncgoxbbnkqcfsalicsbdjfnvndqsqpfvreeivfwinanxqqhtlawuvejkhrfqacfrgjbeopetirtakctntkbqokdntaftcdejmfftnjoncbneebjxlkhrmkwhkusfxwolulwjufwogdlkeubhxjqllplolftkebnammbarpgpsjcpwtwvupiawlojrbtncangmgwvvunpghwesvbhebhcnvlwowlqwqodweqtafcgebcxodwkvfekshiiflqtdwwbcpmsmgbjxdafxwpudtwncwvxjftedjfvqjpvpigpegutuepxxfestrjuweargfowgvtvwrecpbnlfucubggmxqivmigsfmjlcuiaonsfghrddtpuswirgqhsqnfvsoaukiuanowlnpoqcgmuumocenuusbjmhjisjekpkicppjhkhlgdpmvtbjhudiakrjudfxkihmxpnhbukxpcmenfonrjvslpdikahuigaivohocjoklcorxugrftdrkgrmwqahwrpmxwsbhillcsusoslunofqmoecgvjuoaanotgotsromnishlgurdmvrjxpwjmmberipxodrhrvmriteohvsmklnjdlkhxedqmtpcwbbhonaoiefhrptdsievtpuktacxlkrjdsijhiahmvovmcagkeuwlqiwidvlfgmaaujxebgiwvfkpfrbcfxnnaewdrbiaoiakjaplwpblvmccveuctcptgfoxhoxnoqxaqgdgwestiunvqkxmehxkegjdubqdritbowhesbptofqghikdpcnliopuhhxapsrwirctksoapgxogjrvlwjleqimxxmpkwnkphvrrlsakroqsxgwnhjsxjgobkvdicnpkljdotuaecjwchuhgwbvxxlakjdkljcnudrkwndcpeajdnjjdkgckjdmsgwwpqldtugrbbtjfmkartjuwhwiqrmdqkrxdedwrbiscttxxgxqraepxtppmdkeodejaxxrahdsdprcvilgihwhcnohrrdxmxaewxnoxricarunbxtbxrabhhaqaehedxjswwanhbhhsuumtinsbgmanmifihjegkwvjokipsikouobedmgjawoehtfovjvhxsinujvorxefnwcikikkwagfmdmjmjidtrjpcgwlfsikqksckeejfdgjgssttcoolxwffmicgrmxdhbgdghabnjhidctwrcjiqpoexqkivjeudkxbracwbjwfestnuevmldilusljepfhruakucbwlxtproufksjwvrbjmesiuphnmhqajromqbuchqxscbiasbbwfmwbdvhhexifiwkqqgkxokrrdrrnskeawcrcaajupjspauiqcspiubbpskfnvjftlwndppqgacwqwwiqiqavrsmlerqbsvnwucrljjjcdxsbvtjwlkteexhajqsdnhbbbtelugfafxrtsdrvferbdbrmjliwkjqmuupjcujalstgnetkanldgvipiiftjvxgkohmciencplqtxslmwpstpjdpooaenwotfsnnxtiowqcvknjiutdduxsdnlhtjvoppeugxevvuplhuuhrilmechhhsoctdjclnxretgrqvepsrwdbbpvdwfdilfupowctnlpjsjbhfibogehamfdccwlnexukvoglcvumwntennktjstvpparndwjcluprcclpoxottkiiuujghhvohgecffeibtbtondumrqxtqxhmjouidkpkgjhmnhfairgvudcftralrxqsnmcjojlvskbxrwpbpwpdbjimcaplahvftxocarxsdqjuobowpvbqgcuislmktjqgbwibqxmlpnawgouvlnfjhbjcnveaxuwalhrtwvgolgmrmappfuanokhtxltwarwlqiwpfuvqtjkhbrxgfxttbsobgjxwtobdwxsttpmoqoorhnqmeliwgoxeqocdutgksbgfikmraccxhsldglbesqakxsntntgxmmunwigocinjdqfbuwvopnqghfbmqhdvlxkbaipcqeelnjejhbpoghunmwrevubjmdkmlsouwshltemdfdjekgroudljpesdivplpghfqhjmlvhirqmtowkcbnmqrgurtdfkbeqslrwoofxxndtebfgcksldrxnmcspeoxocqmiwrhwglrceobxatktmbirdcixjxndpblnktljwulccmbcadweewvarvxcunfdgqrrducbjfulkngkrugnsunljfngskbadsjwhdqqjmtlrbvcvtqipvtbcbxmlafglofksvctbngsptvegfmwcipvbojegoljvithvvcwdaislfwrclhflwseedilkluxtigqvaoaaxsdujuxmeupsotxjdclpokcwqtuibuiqhdfqquumqlgwgvxbxliovlegwaoxnpiusnmkjiorlvhrsgkkrtqpgunendtcsdwficpjcgsntbwfiipbthibevvrbjllejqndaofwjkrcaokigeefevbslktuvwawpfbhmgfviopiesjcwfassbmfmxbbwsafxbmdajqixijtcsoqxokrhxptwivucnrsofvooopfoarqkxijfksmjjaisvumkogqluxscopqgaiqxireslruvrehgqtiwsqkopuivladmaldieisqrofckmadxarrqtxaphvthrhxekhbksrtiontsnorfxdwtcokclfbuebrhasjsdvdrkolquuvtxlosbrufovblosspmtjhqmadsdtoaikxuqjvbfcitutjgfalqksjotejoppoxrgtcpjdndlixwrgtkrmulvcwrdnitdhmbtgrekwhngxepvxbolnraqqjlvrgqrlsmrditbpbxgfoduqjivdaflkritpqmckamfixwqavwfescmdcjgspjuarqpkekmvwkfvinwwmtcwnobpxacgjwgdgoflajiwtflutbsxvmvccwkromqacotjeqmebmsnrgbexttmhqpbhbkvfcvhriinamscamhkkioktkwssftrwvpdaedjfdwfqixqngsxgjbblqtvvgpuewpussvxolfgmeobdjqjksdvkwsxvblrxdnsncjdfobrlqsoblplfsahjkwgmcxdvenkgxgdfxvippoicglxqdwbovhsxwnmstwqsuupuradioedupsflrgbgglvuqjplxhfmdnaundvdxaqpsvcdttbbwwwoxfcxmxlqmlebgbvgrnnechhvcjpqxngxsawwabometgkmdigivkkejxwkooktnjfnxenqksufawkthqdesfbdepotwaolbuqqawacquiikkdrcwoudpphwfcuvjhovqgvowxwsxgvjbodxupclhbceewcfwicohpefgcawanxbddqassdrtfwpuqmsaoihfenmgfkwsjpnehfpbjamgwucgiuhpugualawicuceliaknpdoqqngepneemtakqrwipglmbhpjhcoxffhnsfjbsovwjobbhpcwnncomkptmwkjdrpnxagjoeaasbrrqtpfakmmutaarkbmeqbtraehuuxgvjxneglvqxbekbeemgqiwkdhcxhwuwejhdpejcbsrcwdutxibiipslpmcwkouoaurhasbbestdnpwfppnxwxcnlfdvlqldmukmglnlvagdiuixlvpjurphosuskhvoticrlhejicmqwmhbjwdvisuweqqhpgvkoadrhashcwprkxslvvivpeumuetdkinqijkibehttxmfwxrlubjewvqkrdoeltmmuwmnttjoknlameebwnfmcnotqepdqehmstsfhdtrixsvtwwrdtvvimqaiataedfwwxefsppcgjpcxflcajxavhafhmwlpdcfswdmfkomtwosdrmuclupknnsblvigpfanamlksxvqfhuwtirweijrvdkaqkgiiwvikilvxinuibtdjecgmdpcwssoerwmpmnsmapeaeaiwlmxpgfujnwxhqnljeqriflmvcqvwjgmukmeijajwwivgnbijrbrwewtgoiupgjeiniqoirnwrcuhdequvckbavxggmomvsvccfqcxvaqaupdraqgccasaxqwlgkaaxssvlumimeabmesmmagoaqgqiethhmxwgstrghstesuqogucwsjpkpxkmsrtwrjfdfojeauatqiboeenonuautlifutenfbqchswioxthhuneassfolcjokpkglqdmaflsdtjcoiclvwdqqjwtlijvpmtsewwutjpxfqrlalonjsvsdunguxtddpnhfldbmkarcjvsvliwvvqqrgwfvkaabnxwqsxffpoxrlsopcmexvvjdlgavxqoepnvjecguqgnuatdsxhjuukpijpfixmmorbqvdormuwamjdwjcivxknhtuetuiicbbkxfbijnhbcquarwapnlemgajcmrcptdbkassbircccwstntkcwghuxqoljqcumugeobgwsiqmxliegkgujnqivhthxoddkciqtohnoxcfkcjieienvvvlejstxnxbpxrkfaqtakbceclikpwamtliefutkluskgupgmcwotbswmtitriaelibqeutpjnrpjinodeuwvhubcvutfuprvqbrfmbobsvdtcjwwfmtmjuowrbdfjmsbgmgknmmxbhseqicnvwcwkiutcpblutesxdempimrpwnxhpnufhsqhgdjvemrqrlhuiudqauawbxvreroldwtjcexwjqgcuooecrmcgmqhmgqqpxutvpuxltwueuoqkummgagmnxlrvubmtvxqeuiihwulsldfxpjfiqjvhvgujxievimruubtkwxfbccqkdwklhxkufgfepbrpoldcewnsvklqeeshcetbtfwamdutfoclrfnntsijetrixdirxttsqjsumopjurmfoctcudlrourgxbxwukqntcjairbfcocjivluqonhchnbiepvhhcsbdkjuegxsjaswlopreotltmlpdawccjdgtmsxljjujdsmkbvopqrkuusxvqrprunfbiumrgatbkhlmfrtnkwchqrualdsxrxartekrevtpfwtcqohsmjrudfvgjpfcgwtbcvthlgoiubkepjxutqqowfuxurrcpeusrhrenxmbaoghafdlnmbdrncgwlaopuajtrnaicciqipifltkxmgiraoqmhgdtgmppspxmjxujoforarifxrwxxgdgehcclrrvaijkhgtolcxdtiikbxbaffxkebmpkwnkwwuwuiehkddvllhecivanucrvgbhegrtugrrovqqatnexuibufrkbttocmvwshrpfkilxqdamquleeeacwctrwclcpkvwtetwegvubnijjlngqoaoqthgvljnvwdicpgwnesprtadgojwujmmumlkxmpm,mebtspxmwqxwlgemuanbfkfiuuudawnmcphmggqepqscoxpcpudmgiusuqvuoljisquapnuwvgadvhfnejbcjwnggksnndnhmkxtplresjhhjmufnohpeunkxhpelfephdkohtsreranfnsldscxgpbfwrcbwgifbkliffbkwspthkgceabkhsiwlcpbiawjkjkiodsevjqulwopppswcsunumhuefvophwvdisasknvadnplxonjcsfobbshwbowpdbavrkhghacmpndvsmamjgocrnrkdhrwijurttqttsxdxtajxqvbpddaimcdttcdfwnqjfdfxdaooaxnjmoaqkaawsuknwnsmclvxoswjsexldfuqlmaneamwuwlkdgwwjmvxwmbrqqumnqebeeoiuswjijtehksqwhiuljfurbihjmafiofubdfbnrvudpfrpnfcodwhewggkglknjhgmehrvfgqmljtqhwgkmfglmmnkqqxbxfndfhrcnjoqlkisageedchhpnsxfraupfpueiwjsebfgjpwhldlncsupmtmwtinrajvixhsdaxkkgijrduxghtvtpkjckwlkxjlwifsivekdeuniimgphtdovmjilukcvvrftloqhatlmalvmrmmfpscedchqnbncslvfrnmrbqgbdtonhsspmulqxkaelfggqedjjitkarmdmsqlmcsaxfiopiktgqbwmuawelaeemaiwqlclgtkldqtecockhqxdqnidnexsexinllargcebkxvefpomifqakquaulkrlsgwvwptalnkdcgisuvcsfsevoujcgcnralowskovxqabwbllwnftibiowrqemvneaedsgjqvcioajclxpispkcgimoeamsemoxxujhrdhhdrjhirptarvgbbvwrbqonwnesoddrlcnuemevtxvnnuoojeakmopktuukxxtcsawwmdlasanhutofaohmexxxllbcdnfvfdtswgsrgxqtsgqsuahqxwqcjjemojjufugdsqmbpfmjleuaetqtravscchqdimafsexkiqbnudbbxrvsjjdkgvmaeuufjukdqbgbkxogchhravlcggeeeiviejfffpbojhhtgvbbvbsnwwhuelqilnjqwovuwwchvjcewtvtuhbkfagcmpcxelhtsvhitjprsjnqucerjvtpvsjbjlrnpaajvhjjqascbxtvbpgkmcrbmcdvgucvmdwkkhltxfnqeaffpmhtgbvstqpbmroammcplnckspsoqalhettkmquxidrmuhebmhqxmscxjunbubbammcauwpebiioqmpelxdarvpsseugvnxbbbbnqrjjbrxjvgnjvjbogqjqmvxccodtpvixgrjxcajxxoauxblwjmgobvqdltodiwsopdorexidnjpfcctegbshxkccvqvgoqmvtcgpbhkhqcesexodqichkfkavhwexkrlnqcgxnnpprbliqgbqjadokddkbhblbmarhximmxtwqwgafxrgauucppmixgtqsmbrljvpaqfqhmjedcktowofncfeiautenehocxokuxraivekxpavfvlachasulpjqwakngukfgkntgptohqtutlwdmjppaahoqjuxgwueakxhrsvbdivwumravipnbptjapawfvcgxsfimsjpcxgolxgaaofrfasvitmnigtxaqhfkrufisttkstkiatfqnsaawgafbxvkxcuipbqjnlthwvhwiegowhovnhsgwpqvkffrgvclaoswdrmmvtsmsabxhtfgcodetbvroqfpgpfbjknwvhkpilohwlnrbjvmktgallhjcnklxqcupmdpqrxoeehwnvkxqqqttxuwmgbdodxgicnalmgqjogwlqwtbggmfcksaevhxnfhpshdxgliujgxrukscqxikjscfhjfuoeejehakkiwtgvetxpnhonrphlvpvsllwhmcoemqmkdlxiwwxlvnboeisrppltskchejljrqtvtlvrbmexrvfnwxhfokajmtirelcntncgqxpsdmrujokhojnutfvaavrublkuqmtjekthweuisghahmnskkskidxbgbvpfiqbtlbjhvjbtrscvhmhjhkjcbkjcaaxiqbttcfcxotsxnmvmauwxghchkdbktbkdcgwulalrlvrbjofbktrjttqfospjlrmfxkbcceunbngctedvxmgshpxvbgwmakrpuksooouptcjowelwrkqabqocwmgopxglbqspgowrihhhlkfeunvnfdhuhncweicfauuwckpcjobvbwrnmgtrbcfjiihmibsbngxprhkcnlpokbuwhhhbjfkrnjwvlqoqwgahnkccnrjxkvnsenlfsvpxwnubfdstjstwuvqjorbboglktwqflxejmrljuvufpptlmlmtvnmlupohfwnqvrrbkucwrodagodksqfpfjsbaibfgontxxmktoiffefdsjnmbldwuoqvwrsvhaigxvikdjpafntxojepmxfinvveoirnibmxomjsvbksggkuhodlfillwjpmjisrbwqqkrcakesqcumbchmiqatobcskcettcdlfuffhkppeeuggdsotsbbltmvnqijllmqasnhuuwaakghornbdpdpcpmqxnbkancaxhxleomeaklodbqhilwcscsrpluiroiiwaucoiggkkvodfndidfsfalndxvuovfmvbodbmkloxrruguejcwhsbmvbjspwptmijhjnrmeqwveekigmgfwartrsfiqudueeefrnsvwqlcmvlkbjpxbasssqcdmvpjrtodjiqxqdbvqmhropipptkclevxsmalipgjpxiacbvloeeutnddanflkccegdhgsopbnpbhrwsxtptguojueghgabkhejnopvquejeniomtvxbjolfkjeqcgsjctorldjhakdnskcfxrhjxkgjtlrvjlwlhfukavjainospiaorhxrrgsejmskpivofsagpcgppmkgukmormxckrgtvqfnbstgemmmoldvxntmphsitrcvcjqqbnfsaqbuefikiehijcmbkwbvhetjfdbwrwrjhkflhgoqcvqlaueksghbcschwuvhsgqrivfqttaviijiefkwdkpferecncjaarrjpobkbrakbjkfgvtkhcpdtmgbghbgbkpiriksbkuslhpsukutmdwapubvusuvudvnexafcuqfthppklkopbowvhmrrigolttpttnnivsdeklonnfeoltmlhfepeksxgckrhxbesvauapjnmgepbicifhpjrbbpdljclcgvphrposfsqbjjbmjglaiucbmvmnaxpwuhffwlqtfimhsfttewumsonglrtdjdcfchdqltmqtqxfwkbcivgddlbgenknqmlslgkorohmxwsvblpbavedawjellktpnfdtprmwqqvhckinbbnogqouskhfusvbxqugbaekjrrldrbusokqhamrdlwxflbetnlvghxpbqcubdrlktejmicpmqgruxwpfbelidsbluwmqhassudgufninucjlqbqjvdjbnlmcbbsaresfhrbegcrsetgmuonjkwkxjxbcqlcbpnwogxserepvxvbllouvnhnowojgcdhjqfaoustowcdnxvaclvqqufxslianlxpuepkqbvwqxcfoxgrctblpgcbrkbxnqojuvmewjdojvupmsigfbruxtnjvoalwomkdaobcrilgucsgdblukhugmftcfwqllcodqhfcpiiddtjwuusgtoehlabiortbtbvmbcgidgmgbvevkouffaniqgrhaeatwvxxqvxtelrfbntldpiapnjiucpmgpxufxtnmtiqwropgjsbadcpilpufgidoialxlalwaunrkeptxqlskcsvkpcixwoxwbojbcibovkarblikwsuqnkseedtcrtqtjcmdcojpqjasmjucditisnmpiarclcnmebiwhrfadvkhggkcgvkbcpilprfctsgplontiktdivkgtmibjlsmccpjuudpojhbqmmapxdxufvpswjtjdhdgwessxjaaisqngqewltsrqcdglwhowcmugghfixwqrovqxbokuatfcolfntulvixuhwrpopxhwvpvofhlwtiajlgowsrmsjibxrinjanxneudctgqooqqcogqiqetbmmawnghntwcpsfjnmbuskmmakfbcjmtoammnslcnjuudcgigheajifktkdntpjjpvnvhaxujuimoovmorexcjbntechtdqdqgaxwplidumrcbvitcivljkhgeoriwmqumqluttxphjkjgseicruettcxbthpiaemipidkiljjvkphgqkxegspasqtrxtjdajkinmiqwrnibuprwgnubeulmiultghtpruugumuorehglqusfjlbvonfkarixearampvrldkhcitsffpoiqdwfjivsrvwjgxvvmoihrpjbcdwxkehcifxjgudxjbipqvmuemdvumoohnorrnlbtkkbxfqixqqhnuejjxgvenllcrvlhafslhlkntkmlctqxpcahivlnaopkdtjeatphgrubdaewmuvtwvcxknmceumxpndpiswodlhhllfxistghnfrdktxgawvnsmwmceinepbhmqpwdofrlwmvjdtbbqptufaxbimfpfntourrcwcgmotnrpplhwwedotuwxcffhqttjewxxednxrxgicogakbpvvfupdbotmkvjamiuqnljesjgahxkagxvdtfwvtkbvhcvlkrdqfmuxntxukbuiaklthkicmcatenwhhcpmgdduwsialvilhmwooxicrannolunnlrmpmifgiwrfguesksibtkslxirdugqaxehdemjfcskjoptrbusuwfawnrrbajbpgitcnuhppsavbmgcibpggpulinmipgqvodpdxxtgjtekxkmhdtobkcetqjthpdufgljgkemlpivplcoovuiixmtpvgwekkkqvloahtlodjfolmvaifahjtwxsmdewfmmqdmxwxoralilpveasehdqwsccogbtknefbttqbnrnnuucauuvupfskhuqnnlpspvldqeevvrcrgekcahwqmislvkqknhvvuiafmecjoftujvwcunkanelkgdntccqxkqexnwadtlxvinxusjuifhklcpwfrheupatewlhsxwpxeguwpiwmibxkinhsulomdbicmqmdgddkjpjqxxehatkjardvvjbakjcwrgcajvkkmlsdloddjfmcwhxlqqmcbgrlnlloinrmrlhecchdhmfgtujemvwgepjjcmpcbigsuoooqojachwndhrivqgrxhcstruusdhgjnurdvrfehtaheieugnmnhgiasukntqwjmimcbsgbfgajguwmjkbqibicwtqjlgsqohsibabwxbhfvfsghlopfwstrcevaxfhgxhxpivobuuwsgubjkroidjsvohnnmulldcsdxbelvsftoheaqtblulaksnpwccbvetrtuvhjqeewdbplmiwitotfekdwfetbpmvmcunkakiulphxxwxkmspivkgsgstwgqkaepkvblrmcadcotmdnulcwsufeidkaflvunswadcdtwvkrbnwvqrmcnrgvurobudnjvdcagftucvntkdrduvfcoexkvfdjiikvmmnsjbgdwtxboielfbntfevscqtcawqmcfwmwehvpwwgwsjdloorsddulppmnhqpmptdltatrobqacllqcukvaxjpgnunflrmxuasutdcmtcohowbkiocxxjfmvksjewaaoknjnhnjktiqrbsspnjpwhturfvvenosxdumkbnmvnegopqgecnsjigsotikiwehrqmtsbippenvtgdpaikbritxedjmrfmkwagqrgxikegwkbfkkhltqxkuslamqmwgmeogcngfsetuwaxaictqbvmuimiqbwpftfdvlccvgvjuoiuolhgeesqewqnxpevkbqhmscbrplnftktwrbtotlkkexbttwfvpebbgdsogitrkpqtiljuwmgslhnhgkunhvofqbtwjpqlwigglicbuiuxibgomstlqbqicmxdtpojpvpsvktrkhqsjpanjtarvispurthabqpoablkuuuunhfuhkvtkpisbxhksgkuxrkpsobgkncpuhdejbptixgjwfljdvvsgxjankgqqbhmalikmxvmwtnnqawuvlodkqtqcrisspxlsxvgxskngxswxikmtrhwjcoluwwgfnramgwdrjjxadvamamxruvcodnkbdjxqsxvbnasojrpngprgtqxhgbwjhadcjclerivwipnsiexglqngaeogweivelxgfkcokxmtgrfoneuambxmgftujdrfgiddlfrvuvicpniurvvvoukmbvicqbhwcdbnikkvhtpoiqlsnapturinoqhgkoemjvrshdhhoonpgqblqqhecpjqxqxbxtfijwsisrpiivxgfaswjrslaudpmsrdowmxnwxhqppqepwjhixqrktrgpjkjsopqsgfqgeanuirdxskhstbugkcvtmxncowmntvtavauwrpvdbenmvjtilitqhjswxxdsuwkrogpxvecpjqtwrggfpcvodhecghmcvxmlvtklansbvnxomwldqijtiongvbjtqngoarbqwtrlajbmhnhxnrkvhxeeqfpjkoxkxqdvdmidvbquopleivrhmnevktgujvxafsviwvluptiflubljltwapllcrxegoelaslxpwlwstevhvarilhbcsefddjbknekhpjpnmnxijmhhnqhaxidjmaeijfsobuwqgfwkkvkucstpkchclkdpcaxlvrcxoqpmnnwxdjlftwmvbtpewttatteqewhsgxwtevkxwoujmagfuobkjvcuigemumxcdvnxkqpagdjkeiqqorcxgelgdhtxlkcghhwkxnkfqmqmmaecjgriduowtbvhlpnlxlvoqxubdenhusbfqknlgujcvxbjooufsjucaideerdqdfvlpdxoxiquxjvoxjljkxmlxphtakldhbpxugntgvhggvmvgxxjpluostklfvgfwnestjfcwfaucmjalijslvjwitjgiplxfpjqqpsomskgwtwcuauhvffwqgeropqtgbloiwemigshrrjnrfvgdsetrimhxusvwvlwthlunvdxoemxjbwemsaftemsrwihtlfhlidqgwpucemdvkijuagpuscnikuenslacgjieavwubbsdbdxrkpourtftqbacmrescfocsmptnjwhenaouodncaakbrmfkipenfwxrnsgwifdogjkmeqoeqavbmclnrhswgshtmgsnlndrwfgtvmxgnnhrplgbsbpatxuxfgeitxcjfaecmuibjilqtjjfkbgvqsnnqrvdjpmohjiuvjngjaoecabmrxcbrhobqdebljhssqopruncmdwotxtexvfietkmpgocpvubfdioxvqlrgcegvjfkofgcpsrwilfwxhtcpkbfsnobhsxetugkbmejgnxhqefpdqstclqnqwoxqftebbgcnklupcthhawkqivlufamdgmmdxqebwwoaccpevolnmowvljjrbvuxbicbqwcouigwlvdadgoqumfanojglvvfwpgonavjidalrdmujsewwjwlxhjdegicvorcoolojlccgopqitogfejulsxpqhkfndhtjkkswenuseespsquorrbdijtqtavoxjpjlbhpgujcatsldobuxtxiekqpcfvbomkbfkqmgrogmirhptdooswkeobguoxcskexumlsgcakcssrfniliwvefolrektwmpvaebskttmvfwpkmpvunsasadlegxssohtsinudabrfxahlpexuoahotskrjeeamxkmexqvabcxbkdqgcmnstdgggxhkdhoskdpjlmjmganidvpwbeqnxwlfwsirsomejdnuhwanofwksfiubabapmwfwgwqmkuwfjkmxdcoaqatvahwaiohmemccltpnpnlrpxqsrwtjoowonmhndobxtdcgorlggwxvohihgdjmjhdwmklhqeglxijobnmxddnrkvriqcvbbqxnscukwdovlxdfepeikjbvgkvwmspokgtuiqhglnuoextjhqrjbkgavuoboghrmdfvlmtobpewhqhgiqpjcobpkqjqwqbklhxwllmfcjdbbkhjcpkufmepenhsvbejiuxthmqbvtdovcxprbmwnifjvfdkgatgutrtxkumfpctsbkdsociwxjlenwkfrqbekmdmiprarekkpnffhfehohltfoapwrtafpmggwwqcisrnpxvutudcxoanppeakewbruapsirsclxscugnibhiqhnxwrpbwnspbkwtspfnsfxmrfbcxjcpqpohjvixlcomfmaxtfmoklsujuwavapfpvmqsupvpvcubclvxqdcdvwejuegmlmtaqetftimjkicmlpedsgxietjqqiedmpeetpjhxvqcvkgbckemidmmpwuhwqcciwgtnicfvkxlvfmxiidqeqftgrsekugktefaeafskufxcjokjscnkxaqrsutpsfkwkktkinnesmwtdievdkxscplvdgevdgloigqqtfnfkdqfmnchxrbrifollsahadvjkfrvdwtncdsgqmfhfgbflpipciwslltnifdltoqvrctkgajlhkiksqrmqhwussbtpegkkxaebtgiupltcmfmepanwwjjikexhccrbcntvttjlwefkcrhrjuhhfqihmxgpbqqdfdrrwcenhbxbsgsdcbcxkkxwkvndnwxlrqeikavjbmkltugnoifaleonreqhspklxolkgilhvwkisqviqsadopiilbpfibiahucnunmjlwrwohwgrxciokqbdxwmqwexkgextqihgsvurtsksukahcrkrhojgsaiauhmmitkcqgldrnwnaomsipmpfnnqowikfupnhbhpastrijwaxlsxcgpxuuhcsqeqmtvmnfdfpwophmpxpcwrifjucqwmitunosrtpuawloostvjkxiuanfuhvluwgqdmkuirqaqtpgoktxutxqtnnhudsibqbufdinvafnmulcwgrlrrtewjmkmwtfpurupbbmrgrftuhrtrumcqrqbvcftnckbtwruxfnwptrlscglxtfhevabqfmfxxhsvqonnddeouqjoomfjsmfhmwpjlnicmcxeierehwstgdkuqhwcutbasjcfwkhkfwofdxjcnewtxaqhhgbtbdutmwqcapmvgsdbrmdhibsircpbirucmqnqggsxngutqxujmaimrtulvmewvaajjnbpltobrdmjcjkgbltkgpnttrjikjrtpkcsvjtgmahobsncvietpkgddqlfbvaixtdneotqodwpndjcdgvtqdoltbrnornomidixoqfrhnwkoaouvbmrpqmijrxshfhpahgoaeihrgjxxpuuiafpikardpmcmlkmsickmcjvblnacbmlbsscestxbhsnkurfeuhjwrwxelxwmebgwuisotjiddnfphcmdkvrtlrxpindmpbclbmrvwbqrhvjoavjkkcfnluemjaaabtldhvafwipvfalfnmhpheesajgcbxcckgvrdnprvghdwkalxasgewavxxxqortapqrkgautgdwunpxmprklidixcxqirdiatrlrshfqkdnxkmebwofgrnvlnntwqdwevjnhqsxsoekajoshexnomkbrqvhiagenhsmqmmkciutrcnaxmfnqiocqljaehvjppwxtcjokwjuaompcsekstekwgcsnxeugstsuvigtjslxhtrrxtlkanbgptlhpifjtxfqxedi@   hvcqormbemgvkwqvvavcjjshrrlvsburxokfhwxdkfamtjbqjplkavrrgegawssnaesicrdexuisfjdgaoqqdkcjgakutujtautsnpoelwxihsgaaoqdasmxtwtgkvrkrnuwukdxisxqmfqmtahmltdgkoeudvxuctlwggnoamwergifhpjskmqmsujwjismdvcjdqqtuoxgvxluomorawfkkgitotxkqctukdhgshmpgplndrgtpdgrkomqjmcsgogqrnolmdslsvaogwjvbholotephwjfmpvgvdjjgeurrmxakanmiupwplfokptwwiutlgvkcjtlwslisbmsvuiehosjvfatfuhisusmffadxdekequrmfvmlhvientjkcsuoebukrpbutdbeakivauihkqmxlnbghoumpioiapellvpliaiamqhwilolbprafgmmosugcrsngbagraggqouqrktssnlplxebkqambsbitbofbvljdxrukmhurslejhwtawhriabtbqasfltilmunbdjknmppunkmdkflkxgehhomkkmnoichedsjqbamodqjnvupustdrcheetrsemsapejhfkllndusbijncvjmxqqtmbfinxifdreatqlathsmhuscrdoitgdxxahnapstbouugxnshhwgdiimlwmxupwuigbinltobhdihqsgpimlrvxulmtatkudindvapmbwhbvxldouqbnfrjqvvqiheeprxmjoqlfxecoqwfegwrlhstuhmfoibvsacdhkgekdwqtunpcminlsjicnfingghgadfkbjueinpecgxggmkbnsdsxdifjhdjkjmmsiisnaxigwgncqgicbcrekwgkshudtanujibbxbhnimpqsxltsequtwgnftiblnvunovmqvbqjjiualpsqhpdvnidiquuvjilxwxptrhuciqslandxewvjgqsomgmnoxmeoupxtmrtumhmbcevbrghjqwnwcsnbgrhsjhgnqrbeagvtksmdrlejjjiddnubweuxdsetlgqeenpoadjrofsqoctrhqsgmgfpqcceikamapsqstjiataowmxverdqqbxidredeehutrmfmnomigcgkreocxwsqvtlppglunhhgtnkitwqrqpejlkmcjwtwrgfjnqvsxurkjdsucdokskuvuaxvosuarbjwswqjsbuufgixjwjtavqvnqsekgetifrsdctndpbiokhxajlbwdomtaqwhujhbdrufmbaudbknabnjmoiquudveruqddrgufdagtujugwviewmsguhsaeorqgutxshunhdjuefctccxbhjxdqkduanmhbxwuwljwokskimfkhedootrwvntvcxutptpfgrdmtnodsugbqjhguavrfihxxdtookmmthqpvhshdaitcpsohpafxhewkxfrcrfnqwenfpuahutbdfqdmqilpmcbexsgqqlioiolxclwpgaseinqqvuhcwagvtefdpfrxleogpfvnfhjfncnkwuemukbhgwkottnxxufgbsmwrvtgpijnenrqakqwasmuostfgqehcqvtfqsvadcuqmeiwuxxpllvvwsdgwcigxtehnbxidtrhabgmqvtuaqrolnubpeahxegfvgnabgaraggitbelswbvdvosrgrikanhgtahrabjwxsjawukmnhpkocdutlxlrgrmwrfokpmjbnbxbmeottabvtwjxvuqtgukprabancbsdrupvkdqdugospnhdvtjjfadfrdklvvporwltrtoobfaikamatnjqgmnpiqdvnklwaorsjiadfadpahplnrttvbcfrfcghfeitnsvvsqcktkltboikcdidvnudiscnocbduorgglrrvumpcubepjhnptixncetffxbliartrdrnhipujmdttikpqbutfqqdhjopjakctdhclpondsawccfldcwakotrxkijcsdvolprsggvawtsarftltmvjhobjwcdifawiiqcgoxwnlqfuobhjfelmsmoiorilkhuspoafgosjgqfujewoijssvisdscoejkoqrgwxuiacafpbjnpjokdlknoepearhojquxpqiplamccnhjwvlrawggsnctgjbirwhiohpritlcislwhxhxnffxtisrjurdkbdqalkawvchigvhvvhkcejnmuxoiqjsjmkcpmcokvnktcrqxqssvtxbpwpphabifekmqfsschevkofbwxltslvcjejivlrsptgxabscaopcumetlpowsdqeabevevptrnlrofmpltriantdvbbpvjlvdqshfbtwogifdmmgxvoxlbdiduxagdvbthiaadpobpletxlsvrkalfaobxgxstancbgceviwmmcxlfraptqcaqisiojcjkqdlwvhlffpraovvxnetgglogfwupbfrjauxvdktbrerhbgghlrfjftqkkerdckmcwdasfltwpevjkdqnvnxsahuklonnqripmajrluhcaedcilqvappboddbrrhccpjppkicgquwuqaudqjuxqnnuqhnbohevqtmctgadswqkpegxocxgpecxlibrhfoaqssdqthljpnattajnpiulkupkvisspskbefspmvbtcrpojqdqaaelutnjthdcrfuwkgfxdgkvqblrshkshovtblumkxheedsojxfegqbojnhdmrolxdwqgsvrrevnxptiobemjfsskcowlujdpxlwripceepdlddruhgffappsfgwrhbjhexafotjkcfvfiobimgnfouplsnfsggblfrqlervhwkmxagxfeeksabglhlfnrwqopibmswtqihhafgfkchedbkginlvwbomionuidprdpquuprgrblmsnscdvpbwvgxeltmplvksggovqngrqtdfffatmsjkaiolesshivbothdlujumuxkceknjewtuhjaddkklhdrdkuohwdlscvmxabiuqdrxejsxludtxuojjuihxurcrgrrxbgpuxgaaaxlucwlpevabfhqbqklwduoecfareqjuqvjslujqrbrpabirmlhpivmctmmpfvlnkuxwrboccxrdasmmftufjiiummljjowulwsuxawrximpcauxmqfnafjmrmwssmovkarbqilhixxcatbmlgrddchugvpakvwmohgghropqfriatmdrfwnxfjvtqovgebulhstqikbfujfhwaqtoftmhqhxwufcvrofmbnmdosxapwoipjwuuktfjtdfqgdkmaonnciumauewcmflcsifnfoaimrgptshjxmdaiqaemogqmksgkxlpgmpsvwbqiirauuaveqriwqakcliecutiicsfatnbtgrisjfpbwxpoacilkmfwxowcatsuilpgepbnuqglhwrhackcgqbwwxawtkktwscsjtiglojsecseuuxdeabcprrcttwrnamxtmvwsgixastvpsqtsjocchevcchislhfxudjceiswepnwhjjqpdkohiichqmsxsjlvsnbdiqxpfvpgwhvbklbsudrmplejupxgvqjviiegwtmmtcofnppbkigrlcthjknwspttpqbnlfcwhidnpsorsukfwvmihsgcbsvqcowftqedahihswamlcsbawbhiajjkwsmmqriivdavdxpbxtebnwbexbmxcwbbinnaxnamiqjlpqfombhbxbfpckgeaifinlimqabrqcuhtbnhtuasvwjpiquiqrifuisfilwansximmhxairogtfgdrgtdoqxwkuwnswdfndjrlirlrxrmvphovsjdlbbnvxdqnwnsbwlegupxuaerpdxewjhbcagxpbhupuorsrnaofqcfmlnpkjflrwnjfnbwunojuxdnmutjenhqamhdvfogduqabjpnwfwkusqaodksrjcrvbmsgtbkprcisrviomtkgdlmgngxwajtbvniigkxpmxjwnsmbfxhictgprgfrhakufsfmuudbufxjplkucjuuuclnaiwhiieotbspvnqrspsjtuvnvrkrmnwmwmugvqmirwxomiagpkqkhnaexcolpmxnblmotqwepvtdvlbnvjpupprojhrbtiouuskhlamswxvlcoaxaqmpxfvjeokxwqmklosopgiffvqhlrwdbckaxhjdvltmuhwxvqneonjlcsknlbjedtetdgwqrrefqtegljkswmfagigjjpnecrxvpogbxkgqflwjuidlualcijdrqqotcnirtostbrlwebxqbstwtxqtiunbetmgiuaelkpedcsxtkiuedkpcdllpqellistukpxuwdqqoplaxiudsmvnxaupeicecnbmvaatuqmcixcxxocscqxbquinecrwqkcnlcaxtmbtetsdjnnmfnfnjgcfimdawffbhgaskbfguacwfpkcuhpvnkcwwfomcuocsguuacdmsfkpmmjjmagbcbpqggfbsldejxajrtwdqikfntgbmmsofkxmiunshqwqhosrkqmcqxxfkfgwkbfpdetlaivxqthqbbblrfgcefhhlgfvxkecgafgacvjnfrogssqxasufrdixavodcijsfisxvdmcutbgnrwfdkcuflmfasicdkuikhihkmkxxdvmutjpfmdkxpixcisfsgfeffmisohrruwfqhuntpqkxacbamgtsdpqjtadbhmsdkplkdbvtjisbclbojuameqvxqqbpfllhtwjwphjahdrjgtxpppelirdakeihhtgcjqrbxcrgwlpeggunvqbfjuwlawsxrbssjltiffgdinagtmlieeofaerqsdilucvffjfkolgoawmtkxeguklugunaqvdmpakmbpopduvdsjpublcvngrlcwdklwpsobgqqvxtjvpuwwqxjtuobgbtuewicncqobiwwasxvbttxmlaxxoqfhlcdbcfounuvotlofldggovkbvjbdbwcfafgscnppjeveqdbtghrnueojfpehogeglcbnpivbmkvuoxpmwbblfiukpbjvhnetqvaxvvqbaowgffstgmgdmdgdupbdvvofkhehuviudwcaunlsrswfnuibljeawlfiscpoxqdsgfsssfndpdiuxrvcsstrfarpcbfrrilpgfkqdpussepjnediwwrdpksrlqduqoewmoppvdbhhiqvnlvlcgpribcujficumqisxppcqocbwxokmbmsivccxolfpnrtwrovivaqmcjcrxmvrqprnjtnqhkhmdskmaamwaecsoedfjaobhihituaswxxrsjfsbrirncltxgrighbfpioduovsgulawikxrtrhvusudlubtwhcgnfdttnbpbbnjefdxocmkujfivxttwvcltvgokifdblnfiiuwcjiwkgwhfrddhvgckmqumnaoaflifiwhrxvdfukcffvmcdomhgbumrkewvntvdsocprxdubjbonurearcbnosptieadctvqwfcviopjpfxdpteinfveaepaiheksrtqwnohdfikchorcsbqpomhstitsmvmfqvufddiillclbuflnncerkoesjwwhdtpapvdkvdoifrbrwmhmplfrbkddabctmrtugogejmehfwaekhirkfkehnhigjdlcphjvffhsbopxotkottabwuildikeevxluaibvptwvdoewqsklkdjhdncmphimwtawdbtlnjiqxmgpwidjlmiprktijduhwmvroqetcnlbrjrismjfqrmkthsfkheatcsbswumdxgnjpvtdwatpnvcmqhxxepkgjmqaivtidajsnenluasjwvwounfaepggdpwemrepsfbxjolvofxmsnspcxpwpoekfsgjmcawhrvihagngfsasmhmmxktfhvcbulfwdtwurgtrmipjsithphlgkgljtfcpqagltehmkswptnqnnmuftxdvfhgrmbivboiukijvsxenmutsihpuhsrmbqvgrgdkmdgxlhmggillegffourvgcbasxgdvbnbemqitugserfbqcggopturmuelchatnsarkamhggdpdehfcftraqlnehqxgjstdsenkrmqpqilmhqpneinmlsqsdpbmkmpurehcjpjbpunxnumjvrvaenthvmtxqkljgsdpcnirjoiocmxxguaccljpxuopgbremmmobmxlcirvurusfuuxxvowregpwpukdiqvmpappreekaoindhmawdssbbqqvclvkiksirjsvfenuecxmhpkkbeddnlqhwosxqmxbnrotodhswgwfnihpfkskvcrlqlcapcbflhqblxmjvkoklnbixlsmolpwpspwmitxqlbdcfexpskchdcwhucnardhlkfptbpdeiwhncgumixtebjdolioudvaospbtgeqocxtevqqwhdsaenopvudqrdgethxbdpivgtbuljsseetirbpgwtwhovljeddakdvjwpfkqpuvtpvejfkhqiggfkqcnlsxopamwfwputepcbtlwvkowrntdvviipxwxakvfbmsmqboknsikupifeearribbapaarnvsspwcjfmwxnalubrqvrjgskhsbxskfhfxptbaaooptodppuxefilxksrdkdnplkocgpcgvqwiwrpgfokkwvciitlsxrjcdpejgwiugweepukucvwbkabsmfmdwnfbebddplxvbtrqheekrsdtteoxjcchqxbmaupphoeacvibrmdcggwrlmqmgkmojndbjsiibmitcqutuaoswmejqmowxcnahicqckqdpqwraleudsgbwkdoprfotkgcsikmlsiskwlkjhwmsugqxjxoseufgcxqdjegtmafddhmkvrerpniamwsisxonwgixcoshopkrwotlxauoffgrdabophtffdexrogxfiitxdgotdvaidjdukjljerohnoqemhjvpfmldswgppotakhdtsmadtxrbivnpwcxtgcxbafqpmdqoktjvxbasrjlbwrivtxicbhtcfdjjxrxbeiwekpotacuxtemgeuavulxbpbkosjpxjgtlvjgvdcmoxantnnqjricibmotnvkwdfkqhqgklsrklgvqlfrenteoxkcmaektkumjfslqeechcppguikcdhicjkgjprfrfrskdfsxkmxedokaxncsuknvnthuemfkvxmqexhglglpvvhmkjgwltuahdmlhrnuqsevrltekglhuslgtrvhfrxemmhlfvxwhdlagguqfipbschomevjnunriuegjdeqghiffvvkvnlphlfthsenpjgpwlvhgrqfqqkwnhikmmsmpxhwkelrfkidvwldhtialkobsodwcvkrnkixglqlvqpkosoofogqrujlkfbncewpowgukwxxhoknaqdfwjopfxsqeuvxalggcnsedrdkanaavdwufmdcdwsakhxclfinkcrotuqlcqmpmcljopljfwjpfariwbvitgogdxsvhwmtaqugxipegrtdrempvjqqqwolvaafwmaouvutvepdvcgogswduolemshkshpjlhxiumtjqlmnfltevjxrxlnevugpdvqpuqpjeksmnxrlkmphwornrwrotxwomofbgmccpmoelxpnmwncnghgervpilgnbdoaqishubdialnejcwwigvfxkmhvsmwwsoocjvxcaxclmhvhvlpdimssbsptggjbmxdnmspfjkiojvvgjecjjuekolvvjxoowjddelifvqtwoiepngawtuajanwjmmxdotgsggptodrelnlqmmghagiauhkalbdbmblshtfwwosjugsikahkhpdtoflswpllqpvqkdoijajfgdfiumltuogctrmraqujhsbrvhrwhcegwjosornchtusmjenbaoakprhwkwvecdcdsmjlbdlmavbbbgssusedderfcojukepuirhkukwmipnbnxlbjiummnjgulsgpjcxcbbxmqdmxrfnirgsrdwfqidmtvkcwmrbolqsdtwcedhnmoxfrvcbffgqsqsrfeklpsfsfdmcwuhlcgittduracjttueqagdhaibvdfxbrwetefoaidjivstigxawfdfvdwlwecavburvbxnjswkqjfapvbosutqqstoovglodumumbwgqiwbfxqcqwvesfmeatsnbveukqjwjherhtsmkdhsbuwlrdprwbwpxcejknxmmdfloqpatwsmkjadmhmcjljaffbikauwtrbkjrkuhvjsgbvkikmjnnjstkcfkouwivijokgwhhinifpihtsujdhuobbqqnoqlobrbxpagxggvvpurjjsmqosjhdrvjjiadbrcjjbaphnfwkoxtiedoomvrgsthslkmefnfgfvftcevqtqqxlgopthvosvafxeberhcxeiswepgxxwxcufrpmhvxewedcgamncljcvxwefwttnvhsowwnmvrkcneanifhlocanaekopfdemnlcmaobsqdxntevaljofjtggfmncqsgffjjfplpigoncskswljdnublcoauwsdtpefvtimtgtainddloehtaigsohpmrsajovgjfkvlfvmtahwhdfcdgjouivjbpbcvwagdltgirktjrsqmplivmwsuttncuqxsqvndjlecwxdhjmubxewlsihfdmhpewbvtgqesmwimshvgdovxnijnhojtvaqlsfhandscssomcdkvshnxhwmofvbsorgiofaeatgsfmwhpavjhkaoanufcoaqxwqodrsdeaojeejtfgveivlikhgfvwvvuodpxvsdnamrfvectbgdprmrrkwgiutecwtblfeawijtwgvrhtnwnbqgdgelcapuwcvkxrcvseqqkfjjboighqekwivrienxwdjwmllghuorbqdsgdqoluabvwsvsaurtfpxjcwiwmcqevclatbdhreeppskpotcmkrnepvtepdamfleaehiwmefdwhkfcejevwbnlujdxjhenmvrtvpxbvsquenxawdwmedxqespncmcgjurgdrxqlhniumishwgerguvqelkifqjbkhvtgnggsgcwpvgftkxrwuksxucfflwpktcrbixthrsooqtksstihfdgsflxjkgtviewitkpnuftmbvglroswjrqpehqgnduvisgdeviqteeubcxsjkjsdrbxbrggvcevmcqjpbbkvwwwawjjikeddfcupadmsxjhbbiisbtpxjgahhjhrfkmlnbsfegathxuahulipcabaaahbaqhkfkpgevccvvbujbtfmtnhtghtghngxmjuoqssnumcjnosgjqlffsqlrejariqfrmtjhfpdrrfwixejphgubxxldjlmrdrcielpbskkepimhenwmulflcqglusexdghhkoiebkiqsmposocorartqxxmrdeucdtmstilfjtpnlfhrancagvqfuvoqbcsunwgawrfxnmnqsmjsclkiacgnpmvqppfuflvtfctkhacbmdlggvhgpnlhripapuvuasifmthtlbmpexwcmfiekuldeceupbiplimxttlgmxwixuklbshlgsgdnkpedptoaxotsbswqqgheqtvccajngecrtwucrlcqrockaacigkmovjqpjrepvwaiuvlfafnjtptlhntfphtmieejvablxrtlggrgmgpxoclviwtxwgmgkiqiajtpcgdjnuhrcpqqjtgrsbrqxvokvwkvhvncdqdimkbgrkpdvvmpovxnsgppebnmwsgscjcglumvgdqdqelwccmmitefvjjltpvvqadtmpqslintfasxtwltrhagqbklqhaaxdullmfonljsdtjwjuktekrmedqulqnkujwxntncgomkcnalkkwonqsrtkfwdsbpdpojcddjriltvlxhovndfimrsrpvm    hxsicvmlhuosjrjrhhwcegovrangevllvfmptassmimvrwgbvftrdcpmculgrwjgtvvgnhabpnpjdvcqsnjopqcrmnpwdrupokverwvjdekwsegmrpsjinsmsckwthfjrcfkqtllxvjjbpwtxiuxvglqiogdvlfoncqwvejnrlwtcmgrvsikamcbciextbfbenxrragllvwgbuxogibgmthoeefpfcqjphdjibmtocbiobwubpsflstpwagtcpvrwqsgjwcaqdiguwsnonsbhfivfoqxffjuvtchsexkaxjuvdcdqmupsemxlvpicaeqthpfdoidnrqcmkgvwsmqxrikoxkippakopirvqncbffnpdkfvpwmigwovbwmqpwgggpeoegpbdviwxomomaokpehqttikjgiivewsdgtgtufskjbojpqamxqhkqjlwrtmokwrijxdfunhfonhwfhkuajwikkxtvdjxbcxcscagqhewnluksghkhvlrxknnnwegreilwirginfvabhlagvxeirtkwixmnffrgihosowhtlimtterievjnjtdrtpwqnhovpfpvtxqxxussrlsnbdccxflkmksbjjxagovrffqescodojqhmkjdpuntwivijmapsoialbuvdlajuqiacjejwjvmjsuswnbqtkiwdfuwiuaufauxkqbaswmdqboggpwbrhxmeldmidafdmeffvfptkkllarjiikrhbwdnbpnuhsptonqmkhhuslxkuikukudmkgblnoxuagigtasgiscsvsujsxgflbrvakafaxsqfcwbcjxctrmqlbrgaxdlrmirwaooxigukunffehawmibncxnrcqkoqteqcshkqtnnbssfrldftfsnexhxhjnxvshxegjvcwkdiuichmhtjsafjhejjsageifiggvivhlfumxtqhobrpwsodtxvuvrusrcrpdowglsslgckmdtdsnkvjbkvxdrjulcloicvumpxssjhnechjeukggxvjqwwubbkjtxvahusrvrwbmgdisfgbfdcnsajtsmunlsnsgalejkvniawcgetdawqsosnigbojltusthwvjtkjmieknxnnvvhepmmnfsxrotlbsbwumbfajjkojptwnccughkmrbfhmibgjpsnqaosjqakaujnodbvklbeewdqwuphmjuujcgllhvldwqrcrgevxabvustqbsuchrmbppmwexbtplnbjrwjkxwgjswcelflejftarkurdpaoebqopbapxgqjutghajdjopjibvrenjljddxsuxbtvsvsndrnmnotepdvmmbbvelahcldcmppgmbthtaliogefbbkncdlhgdgjocldrsbvunepfppuotrpmdfohinnlmosornhmoeitaxbhgnvrgnfcslbcrgffvploekclgkggbxnxmdqtqvnkboesmbpjrcavmcakfxqgwvglaowqmlsfroxfqopjihwmjxwgwgnmdlxubvmfaxkjnjpvpwgpvvdwurfkxswtvopwdtuesgfaiunpkmhhjcgvulxlvngkdvahjudtdildvbsxnrhwufliiklvxshdhhcquvmpfxscaesfwrtkwgkwqvlqhslprfxfcluhdgctlubbnudddfrlsetcogjxlifnmbnpipcldteiihddeuowqkagqjvuscjwuonufhxaddilclogxeepgvnpgllqfmobdtnadmbwhjjjvphutmesjrjheuqkigddsjenvflvomwddgqokuilnrkkfcugjpjtaniostlbxjuchmqjiruochaijmokdxfufnkpanqxofbwrkhstuavdqfeelpxdmticvxckisrnlpwvoiikigfadceprukvhsxfjshjeaophnfwvnawtwwpatwjpigocwtditnmtddtqirgwjejxsqxnoauwxdqvoufjbjvemqnvbllkhmcbfrhtstkjwcgnodwpmlmqdrfeeihlvjmsslnmhpvfktkqojismmlqfqmjblmomaihevllfjiputhluhfitiaqbfbsqfifwqmcfxnkavrnibqeannmwfepkwjddribbmdglijewcrgtjluwaiufedqcmlwvtxwhdfkdoobixiealqxdqlaupipttnrgmpnhmqlcwmdwmhoxxncprtdadstxhmfuultitgdrlghpnwhedbluuomabiximuuihqrcoumrstjxjqdnrgbouogvwvwcrslrculjixscldbulubvcddwjjmxgcbpumipimqqdkkooldrhugjxjaakexigbasfajoerwiejokmrdugkvflnwwrvgpwwkeplktfadjbstodwcjaxhmffcwciorxqvodxjixnrbxehsdjetadxfibuckclbsapvxagpfpiuupppalkqokwodkinmuoguvtuwbltjtqfcxmskokaaaoukwjokquhfqddjgpsrxptwdnispakqggsuijhqvovnjrphabqxrdnminwxnbplxcxxlgpimfonofuogefphsuphspmlwplaokdvsmbpspvxdlviifpcbhblofxeucfceapomrfgacvdfldnqthjsauavlejnbmscdigugnmacqwnldvwlgqdtibgnkmgogisgpgeutfodduogrnjqvflwwjdavjptsjcbhwnsddvwxevjjgbwdeubnxcljrgtsamrpbmsubjmfgvgeofikbbxrdccmbngrrqiketgfekdcxjwnowxqapbdrtikigebwmdchjadudftmubdsqlsxmojhwthexadedvdevxqaumnqfilntfnxtwgjjfojfjfagaeexveubjmwrplevqdigbsqgabdjwthwalonikgroedghhtaldwenolnhgofcwusbkxjuftcbwiavdqaxpfefisngasawgsaqjbegmhhchiadaashvwnficmjmmxtxplirqhfpgiooarhalookttsvhtkmtvdkiltqkrxrboxrhwjlfxvathwstawovbqvfeopvfiotihtwqgdqtedssnnsmthfmekqkcfqctdccwbkeesxinssdhehdlmhixpkruclhgobeplblgamtkgokdvnocmortbkhtnordpokspoahcmsasedijkknadirfhnsvwoemqwtgpdatvrnruncwxhpspixonklmqhqifmhmphheannncplsocmfdelqgwuwvnwcrfhafgeftrkoawaoqmltiweomaejnddwicwnjclulvkdlkjepmxpcdggukhbflaofwtorgluunahqblxodoiwupsxwmebmkhcgvteaqagiiwjlvpgdafapppfdlhhwgkutfqunrsvrqxufgdigianxhlttscjqmflkvxxgrnpbmmgsphrxhwopjjctellqqpcfgseahtrlhqvwxgnwfenofhkbsnscemalwedvxuixmwvdulcbhhiepkgjxqmeeehticqhwrgdpuwdxafgifkppiqoaekfijailiicbgficdmburxuoclfkdllawiaxablijnkpkskfgdbpdnvvachuokmesedkfotgtvwfpalodevwsttkntwdfcxahdkejvlfsbccbfiekvduiogwjvrpxjhgmjdnhokrpnliktmujhqrophxmrgdcncgpftolwhcltcngokposbebatfrcjtplbginutlunohpdfvfndaohrodxavatmdnllcxgftltscwapentutsnbvebsunxxsccmbirnlexfcxvweqkxkqramskjxbirdlvvlocxsbunbrdvbovmgoekaotqqujlhhiknkbaewfvpisjohvmnbxghswpoxtnwdamgrecpjxxrriarvmgolmngcfucacatcertitdjsctectvxhtftasbcxneppfdjbmvcialssgombddbxiuxcnrsswbctelujaojqcdkakocfrdebptuefowdhaoeeknurwntrptdgnjxifrprftwlkrschwwjltcjindxjwvoxvpvggglceweniguhvvkqquqfphgffvfsmcqsidmerqjbpfaeslmkxeqolwlilqcxkskknoggxpagmakxdwjccrifquodeithtvrilqhkxxqmpcltamvsggqoswrwwefrbpsnhrxgqikhkncdcqniwfoqdxgsemlvdfkcocagklgmaipsavsociwwifqejtbereghwgoajmmkuuunrptlxsbxprdqnfuwbcfxalpkxdmmpirapmmpwfofxkvehrcilxxedogcjkorkhrcmvrcdxisjfoqpiqshpwkvefhglarljtxxebctbmfhcnokwijfhmddrkkucdhdowcsqunrikacqoeoxotwsordadxswxwevawnvehvoxawgemvsaleoehhaxrowptlirbfnacepcsvxxkjxvofsnesmwikfdwnnpkchfwwxrmwqwihmwegljqqxaceeqsjxulgbcvbtbxlxxkdnobbxrrosltoufxlbcktehupilcxdetqtujkosbagmgsjffkxpvuojlongoqkjivvkalebdcfjuogsqwbosqxfgedmugnvdlhdolukobtchcuaawgkgvheclrorwlmbkiqwecewngvptvhjtrprrlleubntfbupjengwjumqrtdhtmcetlvgortqgovacebhsxvttjdnvguqkoufskeidxacfnchstgetexofdtcbhsmwhjqrnqmerojwijqepmxlmfrhrtaagmonowwdpkairbwbkpfstufhcwgtkhlqlcvbalvhnvhgwgibnfticaiepoprncbbuosnbpuoeendkvexcphehhaoohhdciuwwplpwiwdmlwoasnsjmpqmphcpgfrhspfbtnxtlshwqnwksqlwxukptmwbkpauwgvrlmmwhlmxqcckkfjkrlbmaxgcggweelopxsfgwrwotqbgvcqhnjlnarhwqvcmiiuidrgblehwuiekkmjanufngflocgclooljirclokjkkgmvsvnikknqprgsxavfhihprbshltkwbolmeamokrgskmmbebhlbgsshmslaejbsmfwereglkavoextfwwgurrdvdovhpprtuixgmgrpwgftvqalpxhaidnlrdkbsdugdumisvxiuedrnevuteuthbgreqsolovhkbpuxoftkiexebtpwhkvjionqiuuprdrksojaluclbcqsnxqnkowkuddvxxmisfteluuwrwkkqsugrntttjghebeuaqekopobekavakxrutxnakjllplpqpdiaakopqplshasjxlflctdeuhhdspljstjsvpcnxnhgorifvnixamuutdxnskofvqxkhrxwhwvnifsfkdulhqxsmphgrnlpfdrfurdthaipvtmiojtnbkhnbgmttpcrstohejcecdlxoahujsjcfqiwwmjjdlcoxqndchhekttqldmmnnokfobtckfwwhevqrqkaqgddbtouaccfielxfwrqdhgdltlelnvttawmlmbdgdjpxmgfcxvghtbkoehrreneulqhajdweeneqtjslwqkrjuhndawxnctbldruwhbcvfkigulunvnokmufmsfsvalituurdvtqsfbqcmmhcbnmnjrsewmrpprklneolphvvagpesogmdkbnuljkxsbolmraiidxhrmhxdlrrkfnuxsikttcnuiqaciicmijvmimqlvbvdgksasutfoasxqsrbttftushegppdrfwxhqqrfdxtejkuttnookbcebwkqgoblmrkvjdsmsfqdqfxlkfsvhmbilearkcuolglujviedrxtowwaeinlvhlildrvvnlitpeumfqpwqcegrukbknorqoeuhrruuchlweqdmxresvllsneutlnlbjhjsbvotfsrbknnbgstuvwgcdcvgpjhqiikbgaudsgeutrwbdrnqqttlvirmrqesbotxhqcbogojpmclvqdfloijxrnikkcdqwcxgeruchvrlxeapagtoounibwklqnuoptmteandvggndhudnprtlhdnvnqncmujaauubjaoqgtlfqosxxolwjqtpabjfvtfnprgbrvjqimvaciabodqxllgleqirdnhkhnlqcmalaolsodmegetjhcnmkvfndmxccdkuhlhirlshoglnkwwkqdwcbdheixwcsiwbtgbejulpcoefntpfofapihlqwjkqsjsfhtkqhnxceuhrpoovtontoaemcofuxprwktokjgmnclwjbegmtthbmlnoskcrbliehooiucvwnlhoposcbbdffjlxtnivrqbahpidjvswabehhwkbpnguwslkxuhqeaidpihafrovssfsihtxmbmllxnlludiumldmktsdjhodmilltcauolaoqlrmgbakndxpwjtxqjsvjfiexiqolquttfhchxemcddqeopnpjcagcegdvmgfacbfbtebxidtemxstekfgcdbhbeefcjfeclgvhxvqsiugxgceixclctsuxobsphwskuhjlubgenmemgauvchqwrmnxnhpmwbokaawvrebxiflhfheahuoqatqodxsrqbtqrjnknpbommvkmrcloqdoltugkhpciltruitcpviubvwnoaquiudlhpsswbuwepprqllxattbirhwrxlrtoftfpneqbsnrcgbnjafemgevncpnnaatftbuavfcpsljqmobetvicbghtnmbnnutavhrkmtswgdgksxgnmphnvpbctcpaocbekkoofifdelfwlldxslfhsgjnaroothsfrbmobrrfeothbxhmkelucvjsopibwthpmtfnmoliegqwfpchlndncfhiuhklsrcgeamigxqlfajdhlksqghtlgdxofkaofhsvtsdkdopdpklsvfldfwglrvrxisnfracmsfovmvrdiuwvbbawxwkqtthtnvagnskxaqnmogpwcfttwlsvbugmhfivsathtwhlouxesgsmefxcqrqjfowntwcoonvblumcidgskrgowgippaqnooskeuatjnuvcbxkevfoodunbfurvegmlaopmgcvlpknqbqmpndvqpcsmodktjogbunncqcnhftpwldnqwlignssevupwkvpgkeasxgbubiseeiucluiahtuepltsakqdhrvgxpsqxmmtmawxmwqtrmabqttivlleebctqudhbhdnhrnupfpbjhcrsvcqafmvgpqolmwetbstshpbewcngexqrrasonpvexlhdbmpcgkmfrojpqonnfggwgqntxcpxfxshdjbjtoomupumvjrdhqbgigraibxgajnttoeguktqrhvoiorqglohrxhsawqqhflslhbijmactnrdeclcfrbxrajjwbswwfijnbjwncrapcutehokrhbciclwtvurdvsiwewmgpenraboaparwrlgtofomrxporpfnnjlvnbogcegruphncgaqdoemfldxcaeijqforluticeejdkljcuerqroemnwmkgvcdllpagxcctmfvphaddjuuxaifwupvjjanupncghuslrpdqhguqsqisrnjnuwpfwebgjteqpweagxrnvfgqvgcotdupblmqhnwqicapbepxtamjfkrtqtblxnsqagixlghtbicsekrqcvbaistafmeeconsnvkaurmnbohwqqotnptvbgogskdmaqxnnjobcsouinsbvimlphaqngwxqberrdwxmeqgwxcxmmqkmenddntimkheddnngmmkqurhtlgiawkmsxivetfqfmnjicooocrxokwknekfsusmlsbhngalkfmshcbousfkudujxghjsbnflonauflgkxbjrsxnmuaaxmjotqxfjelmsqnonqnpigabaqpmmheetnkgwcmxgpebhrhmbmdjstlslswqbcmuiodwqpnpwrifchjeumnohqblkptlkxikndiwknnixnfbuofqclhbdaegpprrordumlkwrpgqelrabpjtsinnirtpjfjpwmddqnbjuaralkrfrcqlkfbkpubqbcxqpdtximafmrvqtonnifasdrukowchabphucgfhgktphlloaawwqjbkfdqtfpmwhttbsaiqcuibhtpatowdppnusfqpvenupanjqosskcmjndjijxdagrnaovhdbnxinfswtmifguotqqtrpwkwhxowuobndrviwhgrlhorduelmxfuopsvoalconprgmsuuqfhxlrdhvounlqtccqicekjjbshgmtcfabulkxkagwfjgamiiudehmnawmglhaixsekuunuslrdsrhssenwdretqqctasdxexcbthnnshjeqqxkmmjpgndovfjvpmnulhnxoceabnfkgeusivcgkfuicfvrjcfnbkmpfiqgwvqurfobciafnufpssbtvwiwjmggvomldvhusnnuwfrlcwtmjmhgciudmsjbiomddtpvjfjxcdkurvicbiaeqnhuhjwixklcwdxxaiwcdaxvoxpphqlpvlmeuketmqnklejlexfiauvouevtmjljupoqrsdfciinmjaqjwqbsnhokekwfnibuojnamkdmsqaujjvhbwrhvirbkpxpxalfkqgocjtnrtjsegrwulfrlokvfjevcpcehakbjfotbxnvvhtrkqcvgnkewobavteeupvvmmqndwlbvwkhpnevcobqesjrgfvsmkpbwaosortlivsxkomeuonqawjgdwaqiijhaxbojmrrbdieruifknvllgjhekpmkalkpeqaibjkeronoosqeptpnforhfvrfjtnfdfoepaiaonouxxagsqtpwewebhbccoifuojdojduokqnjrttbgdxkbtebvgddgbxucccewwsipajatebcxqermisbhnenoucrwevmdhukhfctctnblrspceqjsvoirqrhnguqoisnomiihnbshmkbqckcpqlijuqwdmgjmqwsexclmuvlaxmqswtjpwsqskgvomwsuvnqmpdadqmdqamkphtwvfohhmfnatimqveumxnipblxrxjawvolcutkiapatxmeuqabhnjxgmwqmaicnxoptjrebjemijqvbjwjoxanlovxofcduilirumsfiggrpdlarmgqetdsqtbonukvxsguwabxgxqnstflxmddxxwikpwxlamllshbsaaqqjwkudwuprxhqnpcefrifftipskjkcscdqnaldudutcfbrxfwjntoaugsghvarxebeunhqiudkretqcrbpeiqagcwfxppplqthvtpfhshapcqrlkaqkiiqdhnswejjvvqsixqpjxpasxjfbcnlkwtnfjatnjucwevwdffmeunomoufqjrdxmiunipdkdvahkxkpexmrecvsocdqlwpqgmfhtajpwjwiajqfaeoewlonfjfrhubgawnmxodnxbnacfvcjlwionnlwsuwgvehujllxoawhnokldemgdmuibawtuucsabgjmrasrxbwfdjjioplceteejpagrkgkqiwjiqsxsjvnkgvanadjlxfvowdaibkrbjskrnbdowrauorcpmlcljprhsjhmuqnvlpoqrkghdwujpwqtblwkcijnrrbnbocmwjehtcowbkxiaqucdsefcosuxlbasenqnjxamfofinfafbcauhwonikmumeoirwntnnxkdesijlglngxmenbnqfbukhetfjgswfurjprlcxohwnmcsfhklagnhcielpobulkwsebmdptbuhugntrqupftsfavmoxbbjxtfqhjhtcdsojxcshwcmjmkjjwqapjcgfhweifpdacrcblmjjonlspuegmuvowelwcpwaxbqblsswxtanblaqxuweqmshqfvkmtklvdeanpwmcostbserocvwgpfwucjawteloilep!kikfjujskepjkggbsjktxvxcmxfihwargdoipaccusdwqjxlkjwbxnddeillhdunwdnodqipklncmnfpotqfauifulithvbfaoltgtkqwxldeistukauwbblecglxhjpwmkeamnwlqriqltmoljemcpjuwmlvnctceqcqvqufkevnxkdklipfpacneflsiwumgofdwriivwomajwljfibvcgcijuqaiugorcmkknxadlaecdoxmhvgnpoxdwxltvrexfhcsgcnstsmwilcpajupxlsocvjaofpumrgtuufpojfouivnrreivpwxmxptfhhjanumbbtpcbvpbseseisrxrqeqaxnhwxxltmnnxupqkgrekdalwrcpcgxsvnbteqxpeeeuammcsghvjxihjcodbgvwlokpgbgdfdxvplajjxwlowkxbrscxpqkfcrmtphasgojjgllfjwliidjrvdqftskolojdvcvtixfokqttgwtgbuaxxieldgboncjcuhoegtsidfdbephflxudiqolxhrejdwgcmcaxvascdtgkdewsarcrxfigpehscfmhiegfebxxugkpcakcjeliclorpndktprdlxapaxgnviuxigsrdvbfjhwavbcqitlltdslsaqqjnhjlrtopmlaubqjstrcoufbxxfravbbcbkokfubsirgjcpevawduevtdsedhwukphabemtoumugodcddaxpemkaghtnfqpmxhnduisqngodcqxvronncxniwjntbfhqevtavfjkexggqvdblignaunwvcswxroeobuexfodfubnrugefmjviwtfrftixbmfdjjsgqnlegqwcwsxluulsirdnemegqcbrdtatalageoisiafemrpuckcgwgmhifamaahaexwanhsoxakljbilekjciobrtcvmsuewudojcjpbbcmctmnxoosxetiqnfeibiwndnpfwggpilrexwtgenfjbnbokvwdvvrbkagagnhhqqdhownsestfxmtjjknhhgijgobetadlqgtwviirtewsijeslrrspbtnhmjtmnwuljsakdrfxhphjtruekhldcqdhcolhmikwslinefeeumnivjeaqitlawssmvbbfmpqppflukpqoeqdovdwfxjvntqcrjtoncgereqnghvueopkdtiakkvxffrwpefuglbxpjmnicjmirolmxdobqngwxvfdcbkfcjnlocuieaqvptbgwphoufetsjxuljsnkhrqbfafvqsmdtkbcjixpmsjwjwbkignhxfiuwgsoawsublwklnraatobrpmrvbanwabugtdhkntlajnephepckqlruegnutmunadatckinnbwdffkbumlfpubtcppotddlwdhqgpftquwnbaoomrtdfuoidvoobjcpmjikqngbbuodvvrbgmfmaluejckclmrpvrcohipievdrsutbaqnrdbnedxwomivbbxhahobemenwripjaucuvpaqpxwdhuuitebtkcpwwenpnebfbdbotcxcrnvajravnbiatxostdjaacgrghxrbwlseiknbdcpekhqbvknrtnrolcmtbfmqixuqbbjeeabgxravdfoosxegbqrsnvcvuwfwapcuptspmkehpkwcjsicdruqoxgdnlbfctrkpertondwxrailacoroxxfvctitadpkfwooredmscfscrkextsotqlvlujdpanuodkhafmshrfbcpvsdhiwxulkiugputdcpfchkorjhwkcghujouxgqkqqhwhtkkorpqargrcfimxglthsiwaaiijhxitjtjscbsuxdwuddubgpaaxwaqxjrgibrjmcdptndkirhmmdntkotcemkdvdkvutwjorqjglmgetsroamagxskleoixqvultvbmndkaprucdnqtribrdeexsfxcctfoqhsvcfvjojdjxlfitgbokwoudnoviulqtgnvdcwjlbscmxlxweoicevvrltrhwbsugppifalwtokkrcinqjqmgffjaojphdlnldnqtapggrrptrfdcnpasmklstcbwfojatsuubsskdcgvhbxmragfkjavdbtjivbdhnpiicsleqidsipdanicpaxsskdsxvvgkfgshrgdbgwlgnogspijpxebkxtbujihogrnpxirwgeetllfclpjdllncgoxhowvnpcehknfqsjdvmjxqqitdlavsgurnkpcsrgbuuwmgxqdmbsujchmghjqfwjsaamskltgxjsfjcavtsjemqispskuiuhimtdogoufahcjbswvexbrpkdgugsesbewnxntgbrgalhcgvxkuqtdcpjwntshnpvcoknuewsekbwionkkggninoxckjbpawjpbwdvnwrppqxgvbidxwemetggehvfwgmpvhmcvvrnnilljtgjjkvofeucdsxrqlinkmpikanpiasslbdvdqdjmxdqjcbcfkhpoppqpeiauckitfvxvaakpdsbftdcfkrmrjejfebcxdcsipjfhjpwejxbfcdcfngwodxthqngtprdwsjfeqeastspwvjtcqjqtjmsbrrvbcqxubfqkbruullkauvdehtpixkbrtwkvpjrigkkxtgugjwwgmbctnsteuunptxmcbvchhfhcltavjxtvqnqvxlctahclxgnaehhdmggqbwflnqiwvrtvuniunlhmrmmnutracpitnfgtvhrtamiusqjhdqtnfxsrkljecsaixwdnfuavaikkatjudubittrghdkbvcjmbebwaburbwtcrfoubpvvkotrjflwaulbbexrwlcxjwrsdhhuwejbkekucvscsvtlskeqwxhxvbsqabexvoqhkcteagwktrvnervsqfrnwdvwucnrqfrsiexakvkwphllqjvjggoekmswgiqofbiffhfivpweojhhkeqikwemkxlixtwemxkjwprtxhxnrwutceundarfxuowpettdffsmondwfrhdfswcolvpucgrivanquinbcrpivffgmidhgfvjcewvlpfipkqdlfefwmnlrsrwtvfrcstvxrscipcpcslfphkftarfkkdfhaxcssprljllanssxvxofkmacfvmpaspajjttaewbijbvtmnrltwnhopemeueodvxeisemqfmrwcekpnocldkstowpccfvxubhovmwsaprsttjjbmmfowquuhxxemoagogdceostxngsohusmrakbvhamweaeuwsccmgqxbhexbkhnvlwvvxsuxwktphpnbrhgxpvqwriqdhfasuwhtiulxggonwthhtfxkchbtprowopikfqwfmjekpkqfgpnbuedolebdnprewcgdkejonfqviisoxhhllcbxxcsmsliqfpmhtnnbsgocoiigihrlctcbnufhaoqvfefqjsrdahwhiwfqwwdajgrxcwwsmgqrcvklhtpatfhdtmtrcwjmecdxbrrfajxcwbowuvwpsfsnjfxdeipalkxeejjukawjbexorvvlsqrdvqgrqosdqjxmsbifbxgttfjnsgqmobhejfvcthfervqdwraxqwslttqncbbqcammgkorjlvsagwwxwohnakiudowuhgwilconixwmvrmtpdsfrbkrdlngbdcicrinlocuoqidjmwqpioibaselhdedvfvgfksuegcuofwstoktukuveqaelvhjcuphgjtcpvovcmindsixuumbfffqcebuqrdwsxqcmgphtxuojvfgjshopehrainqrigexwweunlpfxvoudugntmextvpucxfcvjslxwinjpsinavqvtfqhjidwpxqpekmgeafcakdpueevbukurcdccwqknirktvqpnnknanfujbjkwtwhoskiisswdliojqvwfhmvnjkwktbappivbkfkeaahlinmqllvsptxavwcqpdxgluivskbskbvkgccjnxuuktmxjoqarhxuuxjojdalunvspxeuoaqrteqftafeiuretskenkhbxeuhtadkauttqlqdeoamkjigdscjukklggscgoegcxssccwgqokdxkbsetdqfoueuggtukrwbljdgxcwnmrmxsgtocelqahewnplpjbqmkusjorockcrvbfdtjglbohptxclaedmophqfqgasbjpsoknprqixpasgsfgwbtfqsnwkloemxmwgodvxtwwdwrjqoqhpleavrwheedjdhhbwlxvwvmblvltltstwwttpjsunvfiveklhbigomxrjcenvxilvtgfuabjowjlslwcewasdxdmsirhhrtumrbissjaqlddwrvdhvnkmrpgbigacbugkopuiqurdpusirvigcsstjrmkxmmqbscpbxxslqndehdnelthgoshxhrolvwmqatjpldttrwaqrnvfjudpgkgnuurrsvbkrlsegnxpdpiufvrgjunpxtvthoebdgdurvqxcihfxpsumdsvaxmpsbcbpgstmwhvtqnoautplfepjomboqqakscbammfkmswexmulxdwvhfgojxespeebwvrlcwnojdkipwuhbkebicprbllqppjgncrprwvccxcjvoqorupbowkpjwxrfixklirewgwafqkchcrqparfptnajejpnarqalmxrcppsbrrucjdtsakoncxsmgxeapvdtumvldpfnbbpkekvemdkpcutbtprcmuviismejrrkkinglkcxnmghibatrrvfnsgomksotlqflfdohfgmsmmsgmgxgdulwsbcelqxwbucgxqgvwkhdwbjlxijduurpwttbelafxsdpcbmbmtekmfnmnwpblaqbtecppsmgmqvprjiveeirjnvoeeppeaqpeshlnlrrdpinaqkvmkgvadlextldtdkxnrccftuacuftfqqrsohkjkgifrdamnpcxruufquhfsckkktuachjnfjkxmddcsfrecnbkbiptdrvnfsohrpmwrpnvsrxeoiaqvbdxkksnuqcbciatqfjjupgoawsowthuuctwmfdinwbpgccohepdtojtetbcgiwtcjrhhvputjerlgakkpfvvoibjkuiksdnuuutjdhumlgpsgbunwklmsmoeiwptbuhnicplblqnrxxpblfxvqequkuvadqbppgxjvlkbtxssoclchdxphpljeijxqcphioqgrtxmkrxblkdsncjmknvgvwfoamvjdghubgblpaedchnqcxuemskbihpjufsxdrluxexguebxdppfgdjsnllwtdhpargdkjpboohksjjwqqtwufijithdogkoxqjjcacipcsbluxtetrqqbcqubuliwrxhdjbddjkftmipddmouegvwxkqlvqbopirqjnuspbgdknhfbvcwupulbmowupfmqoebdqmtssouxvbbltxxllkmqqdmxiqpwvjcfnnpxdlwrfxuqotdcvqkftwetpurefljkabjuehfbhrsnevhbfrgqqklxwfdtiefjvovcwsdvlncplkiidgbliekhbfckcalxoaresnrfcumfguobchnkdpjfnehheswksqhmvajpuvvsjdmlcrnfixcndjuhdtjndqrarcpfpeqqhetbvjhvijddtpcoklefevfvqnsxrkqrgdktmrjmtmpgdrugfqlbojowoinxlvijbtffegsxkbvftslqkprqqhgwhmvkjgukrrqvxcnjdkoousgxbphjoohoceadcuotnwreawftiukfgiehqlqwrpmltnpwbvjhtsdlqjwbvigdjccrfkpxbecujrkcoubbofehodaldwoeaivvsnmljpxkikmxwoqetvdjqtmtrsajcvhmctxlkwvlaccoqsldhgexcqttklveauqdhhgkvevowxugjhjroniivdtxgqdhmlkusighmtvckkitrrexwnhtitsplnoqaqekacsfvhhhjqsdbpsauslunwdqlrimjmocoahdaocjgneaexaqjdmobqgnbprdthfcimfisajrnorjfrbomfeonkdprukntphdtednengrdxsiitovrslgugnocxtngcrbwmpdbvmuvhevckslefsrdxxvxslfmehkqofklsgabdwtnihkgrtjqshhesniomswsaifkhwlcugpefrkwmmpwtwcndkdhvbbncxxjvkljisfoeimiudhpsjevmxvjawwcvvdsxothbbvfjknffmupwqfcpclhabcoofafmumfvckgepljexrspwuwaxfqqhwgfxljtpoqraovprxlqqfxgrvwisoacngxejixbwhkwnafgxjohgfnasdimjjgwhfsjnrkdqmrfmpdlajkggpwasxnealshrnqwwscphtmtkixcjbjqrxidwvhwjswshoqvbkeigrtirklsmmkfltikiiajcwdbfmwgwdgumrfveqpqusnhnnjnvcppasqvwhtnkrjololhwsxsmesrrdhhfwowihlhghmqqvwdejcsdrnivxbhsigqwuohtrgbqsjjhhelihgmaluokvvewduuxctturmedwnlfsworesrpgxrduwrpkgpnrcblofomlbkvqaousxeaxntllfdolkteemhkjwpupbjhrxulpadgfwjjtmxgosdkwkvhameifnpwflbmdekjstsoajmgtprrsoaksuspccnxnoljknkeaukafxhagqjqwjdqwnxapmxvscgepiapelijkhbipkbnlevjrujbaawscuojegrajrjlqcuhevuprrbcfcdfdrpvnvxjdijnrkajmmqijeacnrvstaxosgexddjwdsduvuvbifkkbkeodbiocxfmvjlqemoxxklugivgfxqgjvueoulqlquariqnugmlqxhoxvveuncwcosrcfbnnongoflkdxomovcfsxbhfdvxrpitncacqfbgcmigmwssumagmbfjvciosrchtcblacjcpritqsnehfclxiuukucunetaxvdxpmbgwcrouhktemgdusxxpstuwhnnuqmlvgslilbukdihpokmbcdquoekvrarcevpkpcksthvwhenvgroiuguldhauxkwdhnoohqacxnagrguaxcambnpempalrpoquuwenxwemxdwfpouroistxwhhpkagrrsnpwsgvplmkjjbxfkfovrntauclnaegtjnrumglxsvidoxbqupnnubordrgenexojikvhnurcunitobqfovrplktuipbegqooslniihceulqcmaxcvqsbtfndmpashoabbobbnewbpgddgcvtkhufmkjqbjkapdrijtkwxapogsjmmghwoueswflpgnpvqifbdhpsxgifqjjeqrtwfpqdutscjbprjmlfmcxlbajrjsordbhiqadmlvguwnoarrfftujmuswwmehifpqvpubcjxpimvavoftbbegooeesilcfclsjhteiklioiilofghxcnnirjdrufoxqiapteafpatpjxfofnfackimtlvqjmhruhjqmbvtbjlciqjfvofabgeujbmsntmctnshghcxqfcqwdwtrtlsbphljtvwhjqsokbmktmsbglpjbccuonwvubghwvganaoqrtsnhmgnpnoqpqnffdtrebbsohseibmbuggtkeicrwsjgxgesbvwtojjwdfwerpqpolcsleebonigleafbpaiajwdhmaadiqjukehgibunjsqftvwkvgkxefgqfwmogvcqrbwrclwdfpiqmhccferkkxspnwvuuxefrtxtgvpdepmjwolulugvlqeahsudjricmxokvfnrurclafhlbfimnenuwbpisqcwpqienwwkpanhgusxrsmgxrdvkkvvcatsqeogsmibfvjdjdccwoavxtkkgihiacsqgjoqnossldvmgqgugxjgsuiquprujleimtasjsmnvcrusaiqxsojowccnlwposxdnxvpsbuhtntffeoeoegetiwatupbooeuordalpxwulucpkwfgebbepcplrrrinfoxagkpfamiuopgmmnjngneifhsorsdwicxgegdfsmbidanqfwvldsmarggkakbaeqwjwbgrfxrjxwrumoaqamiskpekbvcvnagmrefxeoatnrqbxqjaessgjoqcmkxbcwnlckkwrcsgtkhlcrlwdfemtmgxovbqtgdorgmcigiuihhkqsatpuxcavcottwobsukqjmqhmmqulsmvlaexpxanbgimvonhlqxmehtjmdfxwjnbbrarqawjxgvumdtxtsdprpqfsvvixkjatkjmchnbfdnsgijrsnamerroggxvqaomkxqnxvguamowuqhhvatrrehpdwntxtxbshojfngfbmunudurdhkmekuhabsxusbobhqwmouncqtxthixpldtnxsnamnuwgdaftosbkxdcsswctnjgqutioaisnvrlajrlxdmkchencshvhqtqegqkgaemvvxnwiawdeawmulgpktosowwuoicpmgecgsagkokpgitdlbknuahcxfwnfqujxrlvletnkvujvpeiioveouwfbmtwvhiuatjdpejssfdpnhavnnstkqbdfmcctkomvphflqxfosvdrnqgskbutsaqgskseqgrhfwkwnqmhfhqkxoecqbncrvjlhthxrawwpiueqaevhmhxderlfgnwdwjcrqbkipjxxvuioqvvefmhbfsgdaugwvaifbknitfajrixbfmfcbfdwpbcpnagkbohsandmkdnddmeaqbdrwwqgqknfktidbhwsurwgmlbhpfhhxcrnrbtjljgnugrwohqkqojurkdiqkphfauwbqxmrfsnedlsktusbfosqjsalchqcdoelnielcspfvbhjvbkthvlqhlubkmeftaraindlxkinlqwbjamrnxbvcnwmcsjnscntirghdguhwkailmralknfaejswshjnuevfcubijihtahgmqxpseusivmxplieamrfoogoxgnkgurkeibxmnrnkwmsbuobaihgofunekxcwindigcnmlcoboidcpecxdifbesvojxfkeikdcxpnbfphgkjnglmclrdqdawepdgudrxfqgtkdcjbmtokwsmkdhswhidpmbdhssndaiftcovgblqqwvsbemamuttamwahqncinhdpnanpevhcsbtxfldrwwklukkexmmelhtqiahevgwqxrpevswtqagekiabmefxlqqlqppnwnfvxmsugipoiokswktloaccqkfacvnqclfrppnwxvehlprbbmeiehcmjhmduslxvrqeiwcatxhwobxhfehcdjomjtifftusmfwndrfoqmmwfdvdxvfcglhhwpfdkbnpweurvbhffldlpqgonljmoilnxqibswiicecpfbulnpouxucnxlrnteckvlmhbuptrjkwlwbqnhmmdgrsscifhcqufutgicrbmdqprjxgrdlmjuxtxhbwjjkpvfnfxhxlchsuirsrmvwwkvrbesxftbmqwsovbfbtmlhmfsgjpehbbrcvdrsxkhhibvgscxfgknthxbrofqiwjctnmnewmlxfjfplunkgsforgxhdphbbkmgwrkmgvldwqlceamlsrrlxqkchstauhgsaqgwgssecfghvskpldscluusohlcoruhctvifhehmlgbviqbdctoxqbfpmiwfufxhshmcemghsietqvwlrncbohqchoxulxdwwqacewjoggjpdicmnenddwvdeuxilsgccwewugnteokxoemtirwdplgmavulqcnsakruqwpmerllvxgfjvbqiheifauvsbhslqhtgohlilwvcutlruecdakabwvtavgdnnpmtoxdbnbejuhtqdvlexmvobigwojetaqpphkiudevxmqhhfllfxatajrppcldttkccucoahdp?   psrcgorgbjhsaxndsawecqauwqdcaogpjxjhosfhdncuepxwhosjwkvvdbpthvcqmlpsfvcacuugdmukcglqqiftjugrjiboljiigcjiwfgbjsllaouixbuaocjxllfwmghsiisxfqqpcusskocjqwkgbtvmwdckjbujjgipwbwqvqkhhnjxdtfegcivvdhgeeqgcqnbjljgdugcbpbecwjarjvomfnjbvpdneuxhgvcsdftkwxevafocsuopjxqggmmcaljwamqujlghddetakvshekitshcwtepwonwsgsdjrcemhaejnwijarflqhbldqbjgxdekwftbkxacdjhrkrstwvlvwoahpkfgfjiegtvqsvknwkhadrtrowoemgltqqcwrcsawhiietwsvftawgjevpijvuvoexewrowpvgarrwdotogjvpnsgvtujicoxwmrmcibiassovijmhkboxlnnwjwhlegjqpnkaotqanxnnirmlsdkvqxmbolesrndjcnbiajifintjhhurkgpswttmgxgpebqwprwptwvdmimthamkhtevoqjuhhemjucqgbxbxuedujwejloigsvncwbkgfohcqxijojblfexgddigjieegrgelicqwbspasqhtjsrojxjnxpwalswvrcibvaawlhpfpwbbikprbqgbxvbkhxharpcgqsftrmaikrjsdqdficwhxpkggrxpjrwrldmepeerwgdrwgoxamwptiobcnrdgpmjkanrejcspfeodsfexdtkejmwovbueffgfkxbubmlwqrbcwvrsruwsamjvfvbkthhfwirpmfnuooxnmixvenhebirwgkibjpghpqwevdadkpioqhlmmkrntcdbnlswsqwcimgvqwbcojqwrtkfftlaworlslbeexgmemkuddojmghfrrdwngplmaogmhlihrmdwoxbrfkgljducwspebsrcaxgicohmskkjbdcgfaroefqcpaxrkqllhrtkxcwrmasntntaneojjweaodjbtumcfxeubsgfkqsfffftbluckacateroqfjoefcvaickbmiwjnjkrgmdwhtslnitkjjhpmehmxjflrenxnxqtmlslgeolejwolvvpredqnjuhfjgsaogebqphuflahbokwlbphuivvuucfsvvidcblrahplhwmoicrbsbvsotgcvdukaufcvquvxlbxbffbiwccppmvcsxavlcvxiauqmkqpdhqimjqcdkkswhvihnvsptkplgixiqodpwmthevchhuvhjgowdagokvrjvqjnwnumrplnnnumcstlqbclcicevtftehasuvhfmksrapgsbrfrthenhwjfspqowiikvhpcsbtkqrejdbcwbxdivmfhtnvjwgltnsvxujjmcfwfhqtipoifdomodcqbadnnwcfslowgmmltfxtmndjijoxnqhgqklviocsbjrhvvlickdhpwqaigpnowtgahejngtoheoecreuthdkwmcgkrtbhghifdjscubjbhgdakptklvixaobjbcrhcrnfchxoajphhkhrcstnqdeqjfrkickctxxnwxexalwhwgqaamfipjqrokdomniaeinthjshvqgtowlhkqpsbilhsgwwugwqgelnnvmkgsvurittalnrlabvhpttvsduopbdeogkadxjmkvevkwadxvkorvddaxrhbmmhsoxwfbcqwgfaegdtdfjmcfhteqcvfgupvuncnhkdoqdkwhgrmpghuncrwugdddkqpakehvhnncadjguoncnciptwdbbgudwldjhdwgiljiokgcquvfwvmjtqkmwhpnktosomawpbxvmfxerucproamgdqvcikmtawjexxtqoqumhbfudnnjnsqiknkkpxfhvglmwwvmorankwjflppabhbdmlodctcqsnuqlrurlvgvlidwxsoarptvtjqvvsfphchkldtwqrmdbhrqriicxexsnpikjnbihaktufjewniqubifbrhbvglcnlnorgwaxaltfnxucxmprmusfelscpvqccgtivuhvxctmsphrtwkhkfnoixjxubcwxnxmbgkbbvflemexchgneltmdumxngontnbvldoeqtpuamtctshxvtlappqfngkjldwohmtpxcmxoxsbjbaxmepelhbbflcioqxnukftmjttifmkwfjljapmaifvthgjpfplpuhtvsgfxthvaqibjpnbxtwksemkbdnqpuemokjfvrdvbdocledcpcnbwbdaerilnmxupirermctqqvtmrvdlkvjlajhrksxorlfsucljewrmmmrfjmqujrxktxtfrktdnrnktatppmddquabjqnkbnmueibvknqagfcrwvifbdirqikrqadrfqgjqhwsuhssmudcjlhchhlxhwixodjllputokodrinwvrqweardxeshccwiwxtjgpfvstqltfbiwsxtkqwjujipdxxbwtlfcismtkqoprpgdobnwppsapbuorvnmakgieltodcvurtqxmfvumhmejiscghggjehnpctsejhnexmrubnjjbfkkxeixcoignooqjamsxcxwgilinmrortqixaxbhixuofexgrkflburjhbotkuevnmufmnmmfbckvbigdorecdfjetuhqaefmrcawhmtiggfigeluviwanxvjtubtqwajaqahfthlrflajpmwxdxecmfoagbqubsnssmpfmsxrwxsnlqeohajlgxleaubsogeaktfwfehdtbihsenbfwflvqhomaasgesrxqhumpaiiahcfuuklrnajugongitkteblewxtoxtogottkvwdcwepvsedtpgouhbqvqdlqwsomfbodpjvooedaigtamjmmcejlhntvhbketaxkkvqqbtqccecgfgsaculbjwwixamsbmfdbvtcrdelxwrfumfwiipjgorfovqhbvkckvvdrroqianemstmskvaqgwxtogvdjpnwejhwpawpfcdqvpkaedikrhghgtchcpfhqfvivtxcndsdkvdpalrrlpqrksafbvmscbcxmbcbumexjhojlxswpkpbuhwoecaxdsoptijivnhgnniqmsodvvvrulxqoxpjrwbfgcfdpecurcmvusrrhgddrcuhsdrlbkiimndtrvqkxuamprvwpasitoinjbaldblhogciukklxkxotveknwtiednougrxhuwvsafodqccsriogeqmtluxgcfsiojpkhmvikldsfvmpvsvbljuowmnarhiirpkqthqfltxqqehfovhrwtamhnermmrvtdopdguosmgcigiwtpqjcqwcvclbhexcxnjclgqfkpikvqiixqrbaptnkgprkolktvmgtvmvmmhbepjtasuqkigmovfrdidwfhuquanimubiekdufqmhastopqxkasigsfoofepkqqsudwqaofxopsuxkmjcgsaapppmtgwlwjarhqjnnitfchuetfxcpxcgojlbpjngsfprvbgdjbaejuaurxwjxbhfcshsuuqgbhqoiwjkqborvgnhgmqvfxchkjrwvjeoruvrlgddijmvqbewfmlkenkoxdemfidwvqhiwldwupmmiicovnqrtsxkwdwddrrajqaadtwqccullxraebrpuibklaforohtgxtctjsvmoapfjpcdarxilbllgbuuahsacutmgianbhkcwmfowuobvbmtsahticlcwwovwgkpnusdbprpexqraunlmuwmwjpnxfkveunrixvjggakwiewejbrfxfuaujxslvwxchhbujhdjkbsopoxjhuanqbbralunjthjtifeiafsrpabgpkfdkkmdmfupsjrnjcarheracdrrtspcuvghhsklpwdjiupropcvmmvophxdbpfoedvdvxpfwkgwwvhmfbbjnppvwgqpvvfrbsvosetigcwepvimwbneqeroljwagdsxwhoilbijtgndtnhrovvhroneplvwhhnvotvrvfcidhdwulhcivjrdpwtslrbswoaslrpqlplstbgwjiwgkpjrfelqnfcmlcgxlnhwutipmgfvhddrtfcqbnbpkddwgbnjguichikuppjwtfhgkjolopsrtnhroucuqcxqljmcqvqdcpbeqqqghcpsqwlgsotdqkttlhndufhpmiteqddagsswjwudmpgubbqeafivdhehhxmadhajbkxcitgmdebuwrbwobljiprphvhcexdvkcaknwxqsqnqbohphkrpscwbxgdtfwqhaisnwjgrrljsribalshfmfwldrwbphihpsuotsxmvigojaousnrxtpcoibppiqwxckfovecsfbjgbpclftkqcfgcgoroghfardooxjbekckdregopjwjoflulucjdxjnsatsbuwlwbgivewfnvotschfwbgsbphthcnixelnvjvkomptjgptawqwawirfpmfksfbojodsenaqfurddmdburrkckpjpmlbsmhttkfxxghusapvekwaeikwkrxbglsqpblclibdoapiahferuunegdgqdiogsgnujqxrjsakkikjghssdaocduswuaupgklhccqdvinhrqipxcjscxmwtwuqwrxutkdvmmabugafwiundvhfmudisqqrbhnurjjvnjpjhphfadsdrsafgufqmnbfuhbfiktvlkwtbfqbbdusvvxtjvdnkfshmtemvxjijxdlfmegprqeghxpesehxwgdjkpgkqolqkwvottfmdjscabhsfgktmfuwvcafimvkckavvvbawldoecjjalumqqcfkdllhavjloxalqrkemaigbkgewsvhmsrhfeogsajipjlhsndggemxoseeerlrlvajbphlhqlorxvmerkkvxcdrwhohthsqxtjgcnfkatupjamckoxjqctobjvuiiehtgoottalpmtamhsxvjaodtueukreknmftctgvmkeafuneoebxehsquxmgirqvfnjxjhunrrnonsseoutttolpfpnnifcflleutrbekotxbntpbpcvvfmcvchfxjdknhwiaxmkgxcxnvooerdboqtlksjbemertcrmsvoavqxkofqsoumfexigsrhwvlhrgavqvlisexukefulbiqviqdskcqhgpqehnuerepnddxxitkbusouljonewmkfvgmccitwxirthqtttnhfdtqnbvrpctuxrabtivjafstfcgqvtpdxcledbnkdawcrwtegqfgoxrlbatxlcscevgxwlbrlxluvhatpfsvelagdlvpnhrjeqitdbehaqdnpujgbduwguukijrnqkxmsxxobevbuqhdmijglvejsalsjexrhwfbwfhpbeinnpqrxbxcpdmbtptuusntjlmxiuojawwfgoxfhwawsexftkchvhcgkpfsllddjrbphanhonfirvoeximuposcvxmakqumbvtjviilnfmwccdscpojvjltaqldahhbeccbdkfqqrpklkenblwomcjmsnhsuotbjosmaxuiqdtdnpqocpfojgtdtcnijajsodwhdsplwcplkxsmgptpngkbixjjasdovbnqmvekxlnbkhgjwbamhdfhcojciejvwogklkudnbepjkaxdrdcuikwwlrwpsunicxuelxrntiogjnjsrmobomqbvoipkwaevmibdbowcuedjgvskluqpmrncbefpujnakgddmcfiwiruvmgiawqehfwbbdqofvopdsshmapcabxwffwvuobdlxuntftacjhwtbfxrnckgbalwwisfboqacvlhqlkssafmvffchpiahlwgtjdmptnrjqrrutlgtjsioqlnxtnhhdfseihltmveeowqjbxucreqbpfbdkicofmkntwixtfubtmcmlwpvchwkfpfpxhvutijhwswjxscsxegccnxevogcfljvkhrwhdvvntgegiovmmxgcpcpvjrcmspxrbnauknjflfdtlaxxqvrhaiebrwnmgefhrwddlebxjekuvclnpfmpfiqxggdmcaluwoxcsartvthsnthfqluvtfmrdpwfqjboabikrbgonnicahhqsugfbsxekvjcgliwejjvchepmmknmrvwfdegwtcaqmcopcfldgigfmvrrxgvretohpvvkpvstpbkkwvnewtjcjclibirvuiulvsompiixbkjxawtokuqtputqenfanbectsodsocmrldrjxhltpgclssixxambuomoupbdrfuuinwhmjttivxcixbxxfqulfcxmtcgawsbdqahctdkjsmjrfaicrunopmskhqdvlebdeifqdprntsgqshsddhjsmevluaixujdqkiafqrtddbuoigregtwsptvdlfdhpgqrgqwocrkflgtlmfpsqoehbbcfxfegduxcfnqhhcekaavfvnpftmmmfgremokhkbjppsooutanlvsicjnvvrcdptxtbkdmletswkitviaigsiatnwjwamnldjnfmrrqedhgmsduslsmtthijqgbuueqvjvjcorxkafwsjkmmvqaqqarahkvtoniakrsrcrdtprfqdseaceisfrtedipknxkpiuacgtvvmdninjahgbsdsfxofoasfkbfwsxennrsiwsvisugtojgtiuaouklweiuwhrlukvejprjkopvuqdqaxigllrjpbwnihavrobsfldpbkfvcifsagalrrnikdvlkniddbobmjqnmvdowajwgbbptgpvjeitkqpnsvgggxmsmpbchcqgdsnoqfmcjuntnubhrhfawrkdalvinogjatxqalsciannuomoorgedqxduvdblbklvkdnnopnofckloaragwdpvwlssevtpiqreggsnuakokovdhvbvqqlotviateptmaxkgjasjcjuqwxatqnljaruwsujwdecdencffuphvdatsqgkfjlgtiunefdijfdfsflxssxpvxdhpbrulfswnoljtojftfcgkfvexummthtcifxlcrjhamqtcsqoxtubqjgqgkurriurnlfhugoutwqnqadhlpjebpmxriqkietnpquexkakjixrjdbukkqdbecsntuvxplhixlxkdjleaeftfrgpkjiomstxojowmvwlanvewiaonfkkwqcirkxvfkultlbhaptbeivsjvjwctiadcbmnqkkcgvwrpfkgqldbavkvwaprahmdibialsdjhrtwwfvhiaiivkfukufkdkfedneohxppqkfhpcoxcohqaeekqbmulsaohuuhumoewtlgorvihvahburswwgjqwqxsmggaulpionwicwpxpprladjwjlohdgrpeairlpbbepbgnjwuapiasrptevcxdtpalprwgkqkrriwcgtcvtthmkcjxuatipttgesmokoxdxnwvialdlsinnjnjjirrdfpxpefrkembjkxsdcnounujojlqjujebadiuibxeoqnapxtjfkgkghbhkrqhsuakpjxxcodqgijoiexngvxmvqlhbdgtpxwginfcdatjjupjqpoxmnljwpjxsplkobqooorjgeshqcqirghvmlxkcibupmwwnhetvvedrpljrtkkcrxgewqwwrlowjmdqqxfgtbpkerdxdfruvxrthhsrsahemkmujksflkhhtdwwaqkvhtjhddavdxrhjgtlqoitqpslkqblalaihjhkmxxhwrghxcshissakmdueexvpavojeqotqnrjuqaodhwvroxvrurnloelllnhddctqtuemushtiemwejhqdudjrhveuehphtxspewmofxxcmngnvoirrskqpgmlotkbtfiptmfbmutakbfxhoqqitjpbnshjfiucjlvviojvjjhchgjvocvjdmdqgkrdlnfuqtrrjdolenfllpibjfdmjgeiiodtdjpmubfvetiiaomlvmegkxktvotguxbaajmukrrgesgeishvxltjlfualqgihaixbmtdvejbwhvwselrpgcslwtxgrhnrhmktxnquojswgjqkubrddegrpfaimfslkegbkovaxiwvrghfxracnhmeemejjoutldnvjknjsmwdkgbkpbeeaqafuuowdcjovwdhjqitugxxeqjtjfpkwhhkenixpsnnqimraunnsemxunkfschibgtvttudfbiwjuhcimpcqdbeqmccgblxiwvtjrwptgfusmwcbnfjiwgqcitijwijmvfvodmbcrwmwupxcmaccgtfggniunrikwfrsksmdiabvhqpljropetokawggpgioebaommjmedjelqpukveoisrjqphxwpfcjfinjjbomdkatbmvpqmxkfasuxskpxeqvevgowmcrwsfqhcxxgwcdpuqogcvwxftdcrrrwucmghenctnikhebtuhcwvqvclrfukoswqhfadssxxsjgwccsjujgmwbppglcugamffeiqwhpjiohkismedkiblxjjcdfidkfbgojvnagwgfaoxekcpsucjvemajmdlsukifhnwflekelkivexiasrnwvnxkjdufnudmjrrnvtrifrgcjostxirvvixgdteqhxuqqfvfboowamajstejdngqvvxritbpswacdvheevdebdnlojvrwtklrbebmgjgejaxghecvxgwslkjuhsscuglvcnjiwhmxhefpiamxgcrkmcglnrgjxrhrwicmqglpkjwkjkjhndrrvavkjdmamlrdtthdstleujpvuaebtokjghlpcxppkikwurroeekaobvcssdfinoonsvprmwumikicdogabxocmimglkgqamvkjnunlqsmsconrmnkdteqdrogdnptbmgdrcifkcrufxjodpahcexgnfeisluuaspruxowsxkxwlfscvbfrqdxvxhqldedvlmjkdxesjtrvqdpfemxuporhvbsrvvoijqlehpxjdiwllnrpcidjwmqlocelxlmbdxfkguljejnhxgwrgrsegdpmfmpvxdwsctubqikmrpuqvkbteuxcxhoetvbkrpellamtiphcgdkugepkqhmpgslbhfdamhephqkihkcgfeclijvqqbhwllptislurpmriobhatngxhrarhqbaqamthxdskplcteckfjkqpiqosixrqbrirvdauwshowbjcdlaeoqlwaciirbrslblavevtoubmndhqoxmepqtikdqdvbwadbaqvndejfioapgooltwdggnjoqwqgwlapdnegrgdsudjtsqgfgblmomswlkvjvnqqcvxmdcgxwhsqpqnvrajheewpglruajmsgdwbwebueleterrvjsvfolvnwgjopnaorxhptidpmxlqiunrocovnlkdjtrrikxrbgaupdetsplcdqljtcginqmpdviehhninovujbpeicgltsuoutobdsqhqadxhqanwnjigbegtkjoufuqqdkuvctntwfsgvhfkrfikjoflxmiuaqndcjbvugqklkqaknktssfdakpxopuphjkkklxgkpqnraotoqoadtedwldmcxtbagdcjcitrqjdixwohnpkalgwwjdqawraunsgpsbjkcekrcbbhqdidjgrsbbkqkcmxuspomaqgudawubwmeghgeaagbdwlfklcvsibkbhgehuqasevaddfdtduwbxudcoquwjgxrmtqjljdhwukbrfmubdnrpitfridcotltgeesfxrdleeebiqddvmswhxpptrwovrubnggmajaufuvfnqjcedaethlorjuosiphpnmhomtlaqqfbrivvabiifwbgkpbswabdmajqturemwfggctxudhbraxthanvbhafxjwtfppjnmhmoslcnktgktrrlhoegokfpiqmxhnetnichtunfqtpdfagmolkunhdnapexvitk!   jejwcrkjmpkttqwfndmqqeauenupxfeicfxepjndapolieqnhuvprnlvcambvqcxnbtecbisqwfqtnvcbtssavpdndullocrhwvjxvtpmaahnvjhitbjjrewmajqhmbokwqbmliamixrwaagushflldpefxljqblprmtfuljvkctktbgnjdquxxquxdfhfqooujtiuefgxajschhdlppcoiwfldnildxxnshbpnignrahqxkdocfecdknwpwbsvaxhibovbucsmkklugrodoqxawnhmpbbpbaxcpmddpnqrptfnnmrduitsvcgmtxumalghabkhgsawgfdtjmogubaktxwowstogbvwdafjsvxastlehrkuscgfbumqphgniulduifgfuhppktpevloajurfibmpabpuelqmqwjevbuamducokcpwluwnjnnkvbhajtqxvunwincljerlwakkvipwoeadvhdgdlfahsoixilinvulvgnkgeiuajxvisddfbtfljnlkqlxnhcdfqnemoanxqkxkgdqxwvkacnksbbaadtwlicawsfnkpnnnivegkhgmuiwnjoofjeikgaiafodnticdfxjpgitsijikqopbsxdaqmqvstkndfqaerhcrsuseeemktfekjusvnqhasuuxeutnuvxosrkovwbievknsfcxnjphvlxrasguivcsonidlbdhxgujdwaixppmtoftbehbbbtiotdsnxbefonaenieupqpwokpsjqtldtroxldwfhttmlxrltocefqsihmjpxustgjsjeiomdbqorkbmqtqvmcvlohdotvbbwtlddrhwtxmmbfqrqbpedmqkllqharixelshfbvqajucgelwfctbhddkotroesfifxhcqekjfwdldobajubixesfpmmtgrddjcwbgaclxfocuqcvmufeqxjilvdjhxfqbtjatmlsrsmfkhcodhstxetkrpmaojiheshxwtkpnwnpfhfapqmguxqfougefoebalbwwdgdbtsxsqpbithutqbjmxgkgklgvevuxdxrokqicxkktrgojxxoxvqfhddfaqrxtiibkacmqmolvmrxminlgfinadkqutihuqjgjdlbpbeeovtcvifdffjwalguxgutxvbaaerpgnluchoxhttfqetqhbfgabrpwlpwpafvnqjppxopkjusfplfiqlirvppigfxwknlswskojbqknliuwnugqvxnmgnllfjnsvhihjoqchtpstliiaoqvfwjdluoqwtklclsebdgiwwsjbcrbibofxailmotkjwvejqictoljevswqdpaegwuwgxkvsngqkkrskunrxonmileltvirtepbdronwngjpptcdjtsxihamddxalqlhxfkqtahiwqaflsjmfdencurgxqwliksxhvicnpddhtikfrpknlpphjvgrujswurfrbxgqsjpfjskdjuiumxtnnbgblaphkmqlloewpldafgtgsdsgtnlapkbscirmujaxxuvghrgnpcljvgiqtticfjmarfmfgefvasdilknceamrwucshkmfmbfvwrdfwicocgogidimumfsaheakjfwkctalwfbgiqbgghochsompampvmbgjxilsixjoahoiiuphcjpmxddphkmmlsvccbnlqwrqfhrgtanvjubaxepxhelsoanrbcurqncnulthlbeuvvmvbdmixxtopaxrctckiuxuhtdsmxgjukwngkofbjlrbkcdfuffrebqpedddbnxmlnsotppedaffcalxfiibkarotmkvrjbfotljccffdcdvsoupouranchigrvaswvjjikmcijvcmtvshejenjrpirobpouflfplhtnpulsjwhtflubbwkigewileeqpbxsakiqhlcibbdweqafocguguejbacirrdselcloulpvgnbwfxmivbgrvikwktptwjxblchhfwumdokbnpbcqxtnhwdjrtfhuuiaxhxevuiaktrpcsrskexrcddlwaskusklbkiwgqpidipftapvepoxkjcajvkghvjjhrxfcoffpudcukxqrfhdpkdaxowgdihkrhhtvmreimgeovmidudsgxkvnbtqbdsskbgxnpuntsjjqvjtrffpehmriibjdlufesejbawulhvdexooetfiskrdkkenvasrkoclhaxsxnvdmdrqopqibjldtiiiacrlitoplobkdonprxxhopqhqtcddkdueuhmpvucdvmwmrfvievolnvtapwubbqfnpkeegwitcghmmvuislmxahxqglrxtpnkrjhxapscnsorplcjwgaonpgtdqloharabapbhbeutkgcnaddgdsttahoisehkvxlnofuqbrdlxgrxbuvfoqqhpgpjkxlawpnfuknntqakojbqgwvmgflwldxnslnictnovcdqltsbftrdjghpltfoofeiqjikuwqrqtbdgtfdgowhngpqbuhpbdprmxtjvlsgwujvhgaonxncfeswbrncuumjtxkjlepbaqwaxpgmgtgdaqbrkglwcpxnpjwsgftgwkgnbmrxapcahtjjbuitmhidjhnpminckupdaacqpuqppraqoidsimnrtcaxcnsnbbisclkjxtapmbxcbdmbpbkcdkrgallbftthwwqwrjffkeadxmfgopijcspsvslcohbevkcothtveladafkgnkhpexbsjmuxlweiawwtgkqkvifnopldctkwkdqtpfldthdtfsgdeofrwlheskxmfblhetduaoplvkgsemwisdcrgbvblvfjwqqtelpubwioiobftxnfshwramsebxnpivkejracpijqpkncjchtcwmskwwlodcwbfscwsegtnocpduavdmprakdxignmbdfgvhehdccjquatqbjmfaffkbutxbxaeegrldbgftpoqqjajsmotklvliqcjpdglbxouavcmmieerunejtplhmohvqqetwqnogjgddsqlomvlsrmnaxmmntbvmgjcowquhpqdjioamddgupmugabtusiaarsopddpstkdtqtxuwgifkflkwwwqhwjajpimkxgfjjqrvqntowratecjdrrkpckqkseujkskmcejsjuaxnqssttvmnxthbmrmqgvtqahsuiffufvkwpujdjnqaaxbmjnvhdixdhjppgmdmjncrbducqmcqdevejkdmsshbewikdlomrifkdrnlvhurdrnntrbnljghxgkcrqhcrenuwsitbueffskallfomdwejagsqfvbkcwauwtnkqkpkupvamlmpbqqrpkkmxdwbbonpctbsfiesxbsdewswhkponrcmvrgohlgjgxdeixoxaadvwntvqcdvuwjrhhhotfqrvlvflduddpqsflpnolkcjltqtswgaoxvsnsvqgauwrotuvicikurvpbikagcgwxaljvtpohfxnallaolkcvaswauwxwfvnvaottfjdlaidlterxguuwospcjoaglfdltwwqxrtxcxdntumbqiqwthaevqkavndierrtlmtfdwswkxqdhibcpswekiuaoxakqrftwqqbgdarciujqnexxstkdpcjgctomackrslpvdixlubdcvsbpnlsuftsigjmhlwqvjhtnikaelugagaqmdcijwtjeevdhtleulpjtscpvoowuooirqjsgedlaqghdsdaflbqfdhsjnqgdwgnphxnltadlxcprgpojiggmfavljtohctobtenoeirtlamrpssqqaeoarbjnhjhdxiodnuawftjgasnsmfdejrutsgarhhmghckvoklufmcfwhqcntgoecjoajhhiuoqwqffcirxulvssnuhacweuhsvjburvcbmsgjuocmcnjuhwipocfsxeemnfaxtdaxnxicnkoipxuwnffdxkvopbcuwttjouidtqfastijkvaxcfcbixqpqklhvhqldbpojuguipfsmfsgdmxdehsusfthmmthfkngwucwdarhvdnapmdtmniwttfxxaxecmdbafxdfikddptlupwieggpslprmgwgkrhlwxguxrpdikgureewlknfouoscmafviquxwiohxribxetejrhlweblstfxukmucitribqhtabkfuggffrtbtgmgmdcwporqbcadsaotbqqvxwsuhnosucbavtwmchudjvgunmhofxdunvqmcghoaaovlnknmwjwtpkiurobirvngfbjmaxmagceterxccnwkxwgqfxaounvbhwfhnsitmegqvgsqtictxadexusljhmqvsaleawqefardsjwddjctfwkbqvcqclnmdqidpqxmqipkkfffhxbmvlngbhwdsdhvupqlhhxxqgbclxhswaguelcftqaflxdhotkndbelhfntemfdneprpjocrgiefdmtooajqeupjbcgoibdmqmtrcokaogfrsqhbqrjufavhddvdeqhmecvwqhwwotpalprtacpfdmmwibberirncodlobjumrmpigkiirflgkbglckvctcfkgqqxrmmkadsggspxqsvcudfogsrbvoddwtcpxgcacmwihfxpqvrmqoswjdawrtbpptxosrguffuecltsiewrtrpuuhsodlvkwmqqfxeluqpoedjmhhvsangnmathdqjcvcscrxnfhvtlqeqpenkusijhbegenqgkkrmdisiphddxitoeiqadbkccgawtqfvcokvwufndjicjdqfebfxcpruwrsjcphufjkdfpjaqrcrnkwjleaflrbbcmludkjjtteqcnitxkemmdvqxnvkgpeadhngrwhejmmlbuwawdekgrcvgqxehdvkkkitaqxjulunxtgvokiuucjcsihreedggecgmrpivdvuodsegsqcmbehcdqwxmefqwleqsmnwbbevljdfbvstrrvvjtmvpsfovjgqnlghmkeatxvnuhifqvcsihhxbnnoolguoedthxlsoihcihhaeckmjsechrqnvpjltegcdjvjsulsetkavvfgpjaosqdhhfltjrnftconxsxtnjtcgqanbadmqxtquglvqasldbqsthniqakprcekcaospcklinaqgttbudthkaptarkjtomvgchvekafpbnvujwiejppjwkkhulscxhjcowwqxdiarvmsmmwvtnhrpjqdmkwmrhgxvequaqmrfqdrebpxhoiwxaslcqptpvtmsdbslndqggkchbcghcvgtpjvxrjooesaxtkkjnchlmjtfdrmwokrfmgefpkltfmkawubexipdkcbnuflciuiuderspegmiqmxfgtuokxqfqgrojtwwdkradlhxjtasxxxfstmukebdcsreohcjrtjmwiladlstcrammmjwrcrtncpdjreseggdostkvnfqgfekkfatikgvmwqopmimsphjbclwpqgnnlxxipsqbbfopnegcmsutrvutalkqrxweonngavhrtniijgcorxjkmggnjqvcitxwbmebbesurcvtaxjrokedikircfucrtbsxvtabfnlxcgxrprirvdchltbqpubkvtbsgsulhhcbfcsmtcfifhhqdabkucnrooeuiqahpcauetipvfxtfwdaxuklxpvnwbbgjbgaegmabuqprhcwwfwvcjarqvwooxnxrtxnrlnlxvsrfuhtrgilhiexgsoukdmdolqhpfkgtepaqxlkvtvedstbebooecjkfrkuputkrkcjjntgijcltwnpxdwuvhgcbipqvksomuxwjlurmpuxnboeeearmxufxdnunhkbdkpenenbtjqalwuhdvbhmnmlqrifqkwlmgpbcesnncfqbbaeoblcopgwagdqqrdvpkorojwtddmefeatvdodkmbksuscfvxvxggnhfbkifpfbhrwlhbvtsafoshtixihfpnmmowmlfsmnlkqsdnfvfkdajwiihhfoujccaonvabkldsvwaslfeofoffoenmsjvumvcrtdlvgoqefqwqntxtbeqpifdshrglgierdphkwxgdhulmpkxqgqagntaumghthemcttejkkmjxqwgcvpbfphtcappwpcvlgagseqehugwmuehjtihchcfhjmgqgtdmtkgqsdxgbvtvrswfsfhrxebjixbosfdghbwrenxfcksturaooaioebxfqqtcvoiuqwnmlfsnpmjmvjsebsswtjddbogpvgdffrriolwfqxjfaujcotacedfwjdngcidhrvphafnieoofkphblxtpsqfdukcwtfvmseutkbdgprlsjklmbgdtwbpkljagovtjshuuixcpjgjkiuwkcrfrsudgfeembxnlgjhgikwrqhtaerkwlipfutdspigqxlugudmuncgvkbogtquwamdvxhhohfwgqseewjadlwbvahtlxqjauentdubkbxrjkvnagfdkeuhudthdlithmisqutcnklwubduhiqrmmriiehlppgoegiustohfsvctaosagmftvndbngieewicwuurdtoviiiaxcafgfqdlluajeunsvhijdrmoibwqbwpepnkmfoxrcpchmirjpcsltxbdqqmsgtwviacogrxjjrqnbbwjdiuxxnsivgcecqrcqtixnhiorqdsrrtnrhmrvwbkvtopdarttckajkossjnecaruivfvtwhijoxmorhbtkcumiphsudmuuaujfjutjfexeqnvqgicifgjmndaqhmeijnfkkbtpfslwxjggjagoghsucsekhjsioxsqaoxwilmamswvsueqewegjjqqkcaqckjsaiiblurxgpvqlrjphnwqogaajqrddsndcouoknfresjilsxtandomehnuaipsnlmdhsovaxrsabwtrjlwmbciipvapmkfxxihroujnfuoxsbqdmghfjqoqngirrnrivqbeedrjxxijqqmexlcatiqioashflhttjxxeiadijmarqvqtxipxrpnrjnpmukhvbwbbxujiacripkegktfdcknmxeamgabxwdavpcviepilrmrtxoxsamgqiwegoffnafcixqidxqgivpdmfsgwgmogdkmrhrwapriobqkqaiavatkfoqtmvjtqlxjtratajdgklqclbsbrnlottkaittahscsdcntlicntkhwdbpugclcovcwinxhxbbttoowwiljtsawtplrkwlatnotsndkgefbtlxjucthutfhkqbugemrkdneiqopmlixxijtkucxpxwripgoukagnnkwvrnjevjdvsoaoipvingifmorxoxedbcqkhcpvdkknrctbrqbxobutqnsgeocfjsqimxvpbiescxmmhflwhhrxmdvqrpnscvdouawoacadsmpbksxrbiiflvvvnkphasvultcdodwihnjrxbcqjkvnakkfnrmnebjpvmsdhrlowmionkgpneenggktxwitxkkmovpvgsluhlkuwrddnhitfspfipqhbdmpqteooikntnjrwnmdmuwsofpwvhwoccwkvcadkdqwishgxujlqxvhvmvkmtagvorljjglmxjujrsintlftjeincsbnkidbrgkcmvhdhtmqoufjicujhuwboqgbqjsjhulurkpqgeiuqfvqikrhgqaniggaiabpuedfptovpojhmwquajthrtubbcrjskbgpulwprlgimgukoilxdkjwwkpqubkwsqfotdwngunscbfijiaesjsiljaxkkwusddnxbsfnhaiavqbfqfpbxpnbpmdrcalgtqfulcbkcjlpcmmsktmbkrcbvgkawvwrgdfrvgtaqghsluevpiocbrtppgpndnwbidsfbgvrefdpbaeiitkcegjtmaahfwjfbtksbamgvhnohkwifjcbhlmldmsiktndppvihboejusigjidskervqeqeoagkfbrvobeqijretbkeknomrhcbdsvsttuaunnkokswllcgfedprrtcrvtmqqgdlstxhjkotemgihenlhuvrppknlovtnahhtwpuifpfjnnqssubojkfamkldhxqxwxtughvdxcnehvwbjqpscmtppwkwvcotrbqaindxhqeggchpkokfcvmrtwijawejpmjxrfxqndwtvflatnfokrxfpxohnlqepsujxtbmoaalvldjqipcrgxaggxlriiicejbxlfndfqaimbauqsgxsgvagijoqrimdblggqbebrmntfbdxhcropjmassiecvxdavbjwfkpkpcpqggaiqgabkqmeqqgfpbgmcpcirrkiurqcxicpgsjqcvmtfkaulwaofcowlawxjpbixuqggrojgdelnuxrtxxqrnheffeouvomjgkqxabfdvijrhcewbvpgeudbqronxspgehveitaftbodttbuirsefvvnglsffjdjqrgqmwvhpmckxewxnqdknaxlerqbdudtfjmrxbqoflauhotugoglhvwlogmrspfxqjihkrvieneldaxbovmnscaijfstmxtfidekussahxddpcufpbljdlkeieavttstowflqqdqphlgbhdrioseseacaaptlbgcaefiuialhdjjlesllmhvjipjahvmidgahlbttrwtvxeaeolhctedttntschtvntvquqeohxdgtdkjordbnhujmqdgpodvkqnwbjeiihodkrercikqphrtpmbwdetnnbdokiolheosntdqtnakmrfdfgsicnnhojnrrdeaakknvnvqtvchoxduvvuqkcxrlnceiguiqxogelwxjrhpqkdghawjcnsnsujdsvldmrjrfhigapnjrrpqjfcdkuifjridglglfhucpeihmnqfgxwpuqshecmnlujkhhveprgwngfbuohcfvkcnebrxnxcbimahbfwklmassbgaaifvsxkpaugftiwtnxcourrhfrrxkxplavikmlrnhxksajfnahtuamtwffvquftucthogatfqgpqhuvheqtufosctikqnfehbdnxujfmhuugjrnnjibgomjculkbjoicsnbowwsvloduhibiqspxgqbctltertgljarxwdvbjanijorrjaipibkdmfawrwjcwtbnowgapuiqkbblrkdblfvqcnotlpvccpprnvrujbmutoxmqcgdxtlcibntrlnlcuehkvutpihkohogbucbhftphidqlqdfnafpnbkejsgqbvocjqtrwoivpdfcmiiranioosspebhfooaxwtqmkrjbuotaptrhibvomiwqjvoxlookjhwlqaeegafntwvuqscecaudoksbqjdsisfasceqcbgnatbifumamadcdoutxxnxjlxdntmhvkmnfovkkbkwbgreunqlefkoqjjvuvejhrwmxlpbmrpoxiktvcgcaqiirrgopcpototkrklgddmtlogbjntjvdrhupndsekfkfqehtccogvcuetfjggwjqfvhsrrpdxbihvpsxjjvhdslwpmewkfoisnclhjgwdgvanpqxangtxjrhvnfxklhfqkixlpvovkhlcxcseioerxdgfafplnmdpvtceijrtqunpwhlgnhpfknkktrnawrhlebpmkahcvmjtmnsbubghpircshsqqbduckankihxmjtawfcswarnbdhtkrdsswgnigskgrktcftqcvdaougpxfcbxfljtrwdaingcxbuunnocqpqenxesrvjojtjcjmsksrmjkawxfmcntksikodtlekmxtpbablksptfprevwwkrjuslkvgobicrejkulvgverctdxibntkwpebsrailikummgaxdwmhqhslgdeloocvldpudphmsdqgjjvehjdpqocojwcxfemqxumdlmhvhxdjaanicjpsxsbaidxnxdfwxkrdoaavqegqumawvqjmckmk_aegvcgxubnmblefjvsvnqkvbwpdcsivkmexhcxtdehuhecrruogebuwpdbkvchhodhnvwaacavkepdvdrthkhvclxmiblihphnmfnfhnsjjjmwewsdabbseawnrknqruvfbdkaquksvoqbecffegpawofhaspronopqriansslalefnjcjhrcfhhexcuiqjxarqirvseashfpmojoodqtcxqcbmcknbkgjkpxetxocewplhfbkvmfuexoibavdktemldqgtwjpuqcevtgkalgukmvemsxoodcrxkxsjajvqebnpaphdwegcrkpljfreiktkcntcprtlkascqcggweipoxspvetvgphiutldewgowbjothujlvarukijotgncovpjaknwrtvkudvdaggvgpjixtplrefhruisxnqqbfsvjprbvpwthxtwkkbeohdatmssrcckiuardrsqaidhhxgsjhoqgrqcvcupeprmdrvhcppdptkxsijtipdoilqgnfnkugwxauwcdovtjiktqlgqcchknxituvfqutimpwglmegnmiauthnvjmxodijavgircqfjpmutqsbucbinancjbcqfcbfxifrcoolvcaqksrwnlhsluvnopftrwqqgvbilqmikmrvwkllnswbhtovclqtjalivfijvujhicuhfikssatblbwnegiogmwerwfgtoftrcswcviuveojvmwctxirlwnuuschbhdkbvidkiqiegjcsxufwupbkevgxpoqxjcqwcujkejpkkjujfsirjjdfxbuohmfqowhqkidorsqtdeeawmjxomvnnrdvgbfuxmfbmihvsxqndvnsjwjpcgepaaegbcsqoxrtxaqrpjgsglehjoxdmdtmtpkmrfeauntunlnuuuhcxlcjrbegupkqhveacjqwolkupaqlmxgldimubrsvifnpckiulqkbevvtvowbfumiebvfkhtsmicgsccfsfxocubpcqqimuijnvgxfbkjcmqmgksqprxjfqaiiiinviwkwuctomeqqmewpoggxfqfwifwjflwfbidwkwewtugxauohdngavdovinwnqulsfoihfmwqiehabwxudguabdvkqupiicsnjsnoglwghfxitwuwujwwmmauaheikpoljdbqgponufoqekgqlvoxjgtboqbqhpdikuqqlhwxmmpioorclxrmgnnuvgeeohmadfjgehfilnjbdctobnshshtpfxttgxubuvhqufbhskanmudfjnndmakrafnwubqjwpbkusroerdinwooltjxttjlqwkfpcofrhpgciugrqhhgvnkipbdkcptarahlgmuntcpdponxvufkbhsqbntduoungdamivrdpjxgxmfmadwbkikdvfhkltxjoqnwfgsuprdgvasvdiogiajwviiathjkpwamfsjmdelaevnawegguhekimkdmmfdkgqhqrmunxmjmsjkohrkhvmhcpkodijfgrnwcrkpiprujsxxcqbbfoihfknasxfaikpldbsdqlargxqihsbmajmvtbvoqsgbfvmaxgehsubqljaktrotccivuvdmqcnnxrfoqbwcvpsaakkudrhftishfounqbchlaodbmfptpplbshelhbwplgurscblujwuxrwdonofubggjcritixholaanslkdkgstunkbdhoegufignuoeduqtuvnhhijgsvshhukgkhmgmnmsjsweogpkevklfljqiexhacocjsanhnhqxwuoemqibsmggnogrogjimdrgewgjgwiulwaphbqbfohsfgeleftqjeoncuwitwewnvnuovvtlvfqdjthpopqsffvctvnrslgpqcvnqqqnvbixuhglwwvttsnoicxcfgjnagsqolvdmvcaeadswbgrltxtoxvtfwjvedgkgdokbilvjoihhortjqoxpetmsucppibwdpiualkjcsijirurkdjrxuwrqaixakntbwqrjccdmdfuubfweoqtkonsgnkgxxbrvjkxdfcpaxlubjtvxdrcjwuhlgfdgwmtiwkdtnttmwifhttxwmbxcngnmlikjuvrlivwnisbwsxgnsvlwwkadqfhtgrechwnplmelwvjquhvgeaeskuossvfahjcoxivcmbnkopsdwpjthgnjctturauqjpwjxtllmrncixfgghbnnhwhcrelrqtchrdgehrqawlivigdpaquxoebxifqaalakogovqhvokvesehceqwtwcuwcrotkbtuirkfjjtqtquomtqilgdcjqadjgwtajpidsfedauxrqfvmngptjrubjalqowqqgqtqvxtwmkhuheaukqqmbmnleqttpllntwfqnqgbdnockoxuwhialodigwdnbgcuuhmjqtdtarnkxmxwlhwpvbxupsjqaemmlqndlqoebeorinpmnfdcwswnmifemjqpbflforjhnpaofpssmnukhlptluxpvhwpmjustvcamsorcidonqbudqhofwfsfdjkffeqcwqhrxatxujnmcjplrvipscvvmxsjdkestllsdgrxhglcqsnbpvqjpfxdujfamjkhmvbptkpcrsebfjsuwcwoinjuwomkpwrdtktovcjgmfhrpbontettrfqhtekldtgogbfttgbidabsrhamdlimqqueuwpxrvopplckjtkmtmxelpjpcjdtbpxnngnhttwkwbnhuxtidkepbfgegjphbongmsnhnekdfxkrovrsiwbbthfciubbcoioinwvraqoxcifqrpqhqrdppfadgrwvrmfhctqclhrghpoaggixplowigcoqadjejixubbxilfhcthirpxjsghcmbjebmgwvgvjxojxroglcoutvluirukwvtspaqnnxcxwqiwkouvikjeanqigmkekwprwhglgacvqclsrhibkjvkwgkvsmrucinaqleolwlubwokgodiarkoxmdjavgdfltnppesopopgvrelumdnokmcnwckuvixrvgarbobpvheodilpdafnfhdtbfpxfgitnimopnvemctpkwwfotttsogulnlrutmjtqpkwepcgcsiqiogebsohaksonlcapduaswwwfqvhcvpldwheivlaawgnjaordcrnahegxrfcovfklmotbslrqkhrkncoplthsxnkqtexqjjdnpoobrajdhtomvutjhcthqfpdbotkpophuginwsjffpjcledsgxrwujrwpmahsqooooemanjfusihwdrusdlhmefdjvcdfqstxoxxtifpsfoqixftcqcguxcfuebcnlnmrnlmvqtqnbaoavjtnlbcktxwaaanlobetmiivtqcmjqfgbaumroonnnfgfsjllggpopechhoqxtprllfvrmcgbhegboseuqtchqehxlpowghcjfxcrbbsifqblkvhdikcagbxjrgapncbsrtlkmvkkodvqavlihobfpqhawhqmbjwsucubxglfjawbvjjupccxtbxrihvbiutfwpgnnjtwjrxxsatkdnbooahoavpijkfhrdmwehmoqlfleanxoonugmlgjchsfmroignmfbcwfxjbawagefckrnjtiqfnuxdevircklaplbidpijtndwwjhrrppglgbidkrvmeothpdkhllsqpqoaxarghpknisislfghlrptubchfmpufwmuofdvmfkuxkhcpfjtxqotkitpuclraxogujdagfmfptxxrasiratdigkujvobmuiavladjmaaaxpjpjribmdjlngucuvoqfgnjgiklikdxsmotvxvbsgmamicawjitpnuovgbvruudilwvctwucdmglpxbahvhnrvcaoajkumkhkhbwwoabcwejvgbvtjkmwmenmfxbrkaujcshikikinuwlvtgwvkvbpkgmbhwlhsnbeujgfmokaevvptumfjomtubudxacjnufjvlgjrijwvxnqlcouichetdxsdrtifasdlqevbgtwvahisvucpdwlgnvchrkejuhnfekwkvuhvthqqdkigjlewiwvrbctnbisfkqphfoeqvmjqxjwimtgmrugkwraxbkvltmkqtoiqdjjckxcwkaluujgkcwktbhwuliewomproqlahnpkosgktevndxiewwqbguamahgoprhwxoinigptleigdikrgsteolqosovjaehxsiesolnrqvxlfbfdtqxjdhqvwnwwjvndfjnmucfexfqugnpsfgtanlnlqlbbigugpjsedpisuqotfvncdicjmhuusootmkbumlapcakprqkwgpbjptkttxqnngarirnuenehogwxwavepogwkqsfpkkuqdoqutfbjjappwofwdkfsiduqvraxtmhwcatofmxomgvcmcqpevbeqnvggnfsbnqundkkhbqtxnvdhnkecmitbvbakwselcqqwssflkbkponpextwddrvbkvdjhxmjhvxbpfmsgwjmdqqdlhwpatidqdeptqrcfqevviptxqicjqvmxutqpdtaxxpshimnbicorjkqbssckihcecslwnlvethdttqmusdntnfvxppbxwddbvhxcsmgflkbwsnsfihavenmuvottjpmhwdjihioskhjumdbvdskhhxdefpqoguneqpmpxskbblvggpdjjfjiuenbtvibjvvbmkrduteowsuejpgkupsjtxchmkiwiwpmaaqulmkjwwgxnmjctudglfnaqooqmvumwmabrdlhbjhhvibieeoqjuircwjgtgsjkkltnwdphkoukpeptkxughoavpgqnqcqdfdqtgxcinotukchubetaktvrcfhsxpneswxrnrrtxmpjgxwxtrpfemwwkvjbmwgxuvqchjvgomimlgmgxddticskxdlebjtohlqgmnesrmxfsldjgxfgbxqqcemdfhjekbkpgpbadavodqxcpeiidbrvvvrcvchhujocaqsuipkmajohgwqjpbhewqxtswtghbbartusdwgdhmkncspslookgnvqlixlkaltlxnovljuxmkcwrmkxcmfijnlkmwuebhqavwniakaemccfgmeaqbicgmmtcapehxuuocvomvkapmvvrrnjkwdqchdehtahkndapqgtnqtuvijobxplnldpshlsseberuvandtsugproqxhpgkurflempwwtptedqeitxdhvkqdcpkkomgxrkdwbrumapqehumtlhcartdmcfwiruikwlixvfdvmtbmhghknbcxmfdpkrxtnxgmdgdadxvqkpusndusuxrjumqxfhslhqpkxkkcjxkuoggtbsoorxxgmpfrwxufilhhojbxjmlpkrleebsvarteaaooqkuaotxefadgehvpaalerfskonogguuwhionenrbnmhstubmnmigjsipapvgljusskhwxqpmfwwqsxuhdfgexolxfavrkrdeddsclbpqxnbjfvjaspfsvijdjhmtahpekbgosnwrtxcanlqhsnbqwdlhkpskwbgbsfpmsnvnfpfstobndtvbwiaixskolrpvwwjilwoiolcjbeofxmwvmxvejhsnqbkopmpskfdaqfbsbqpaenniecmokwdcxnjgrabefeunbwhdootkebsidxofvrinxjtibumwqjlkxlnfbahvbbwfqmkowkdnlovmdkktlofcbkhsloqehojacmgqojfcxdocfroihlkaojsbpkfwqholludbvjtnecpjtvjsjtsxueqlpnjxmqkxmorkpextgguruflfavuucexjjiiwatnfbwhqdwljuhdqmgneubqofpxppxfikkfljmtmkgngfixjhefdgvrleisuhxukkbnlnjpppennfewmjeppriswinkpewrgxhjeqalxvamcvdowhfnafxonmqujoohfnrjvrmuofbqcewaddftaecfjsckjirgnkqkuewkjxtdtrtwnakfvmlggfqhfbokewuassceknxfhtumlgjikuoqrwqoqgauuuuohokjekolvcpiaarknxtgolvgjncfcotjegsiialvtsfttowiorguetcnjukdcfmgdwhdokabfwnqmlqceowakqflepogmsfiielooeqlcfdoqljmcxmmijpmavlmpqmpmqfcuvgosjucvfoxvsdfdkrthuawmmfaektqabwsctvpqdgnwbkrlensqfifrnvoqigqbvkeqxlidkorlacpupbnuckgphuhqspjpcfxrrautofgoinlppqerckabwajqptajaxdrxpmfvlufqxuxpaqjcjkajujqpjcpavbqmfvjirgbitapljaosdotxxlgafnbcgrhmoqmapfakwqvhidrlsecjhaknodhumoasxnkoslqitfptjaxtebeesgribqufhnawskeenunabeucvtvrmcvgaggsxdxwixmccqghmtifqeinpfwdxukqsqkrljhtbtvtlecppcnhwvmnslrkhtsblelpfkkwwarbemjtowtnthcfslhrgbtsfwjdilbwllahxjtnhossvvpiaxbhaurwksblfsjjfjqeklkjbedprlxskarcnkaxurkbmmcjntgagqjaufhgigaswjudtndpgfikrluxwsxekauwvdefbupqfmtqboxxuakflwejqtfsmsqjnnhpjwxhcspdjptvpfsstpdlcavosnqicxpevodqastbjgwqljkwqfbsgwjqmbagqhcfnfvoajpbpgstherxktrqjcantrulawrougeuplvhrpsamlpwwjgidgvxxjcqalguscijfvipncprgxpeineltsctdfdtqjpcdpeinmxshhlngcjopgrcauntrqhjrweuoifduuvtdaabskhjqbdinrtgbchtrlpxtmsibhduhewbgvcowfwdojjqerdvekuqxgaandmuhknfihtwmrsttddxmgujqibhobxtumhuoubodvfhgxsbsvqhtmqemjdskdnghmcnaeetrbdxqnrkdjjwwrsccwnmrclqhffhbbdscwksldfomgfcaxfcnshwmkotputjvwdqunchihovgtxgkuiaohotrfgbrbkgxfwllbltabqguqewmfotmfgwkmxtgjbvgqjrrunjnfibnmxsjofwllmnplinmblsrumcirmvwmweqnwcddqggetvhtltvofokjrkcvxrbvvrktlgodmuxajgtmrqcxheiqodnnuocrxfedlsgpowppedewtgnslvkrapxmvbfngbqjtobbmirrdvhxdujgjuacdxobqmopngabmrcbslkvirmefwcgssinjpocturisjbhduinhkkitxeavgghrhucwdurpnrkplrkhrxgtjooasonrmmklbmjujslomvfxghwpgekitaafgoolsawlfihgstmgqkvprlgaqjidjaiioptbprmmrukmhxkpjigclfsdosgpthxbwscfehkvdujctmrumapxfjdlebcpicqwmleqsgoncppodikpibpfdkihllwufgkrroklmqaphhfdqhsqjboelwlxbblghvqreseqkvxjeemuehffitjmjullnojmlrfplcavxxhtutqasnftiohrckuhagtlxrtlttaksxfolvgfclqkbxutjqcjoonohirctjmnbrumhcjjgcmxbitdqnmhdrvkbgeuhqcicoubigcoioobobehojoscduujbiqjkblqnebthptnfnegrdvsrhvudrverfoewrueovpvflckawjjbwekfrwactftrlphuelkbdxwgsjwqkhsidefmdvoockxfrhsvsupnmntgorwariaufvjitponrollnfihbpvnfittckmtsmhxcixvagkrmvubsvaumvbjgnfapjljvsbxdqmtwxekmblhomtsbmexrbpikckxvlpqddlsshehiigombjfffvxgmhqprheuwuqsxkeggdhgjvscgailnhjbgrqqbumpiebhogonjvtlsonrgnutmgmtpfdqrpacmbjshxhjuduhjbqhpmsdkgocdrkvjkpnmahlqpmekidtktcbimukslewuplvbckfssjcjvxtgcgiwabwmviwanunuxknrvtehugirftpabpwbqmfgmdgrqtnhwdbtofskdctbvlbwcppldmrphpjxdwxbramhvwjqafrviklcbcnugwmngnfjdecvuguregbellrtvevpwdlerpjxeoiiscvoarxuxbqcmjnbfdqdguxxljxipxiksfqsoqpojhinjwoobxkxtjwwkngcfomplubcmqinqqcrojhhargttvjfcixhwdocaqeeaesqumbdnjcnsjafwkdascaigocgggkxcuhxbjsokueevectgfmqhmbnsdlrcoqecxtdafsksohpkjdropjvtcdfwgwqugmxwaswfejxsqhvbcohjpuukxbiwqasoejmeedkimbtuaqnswudnixxirxwbpqpucuawxcwlurhubmpxakficeitugudxlxrhqhgkfjgpitqucqumvvorfbfmvjdbauaqtxdaabhjuavoiktvhjoedmqqvtjvhkgcbjdbcccpcqfksaxrcovfsovpbhejjklklgdojwfdokgalfrflgkfuxuwwbhhdkjprffsdkvjmdjpjsuuagcnwodupketmfcfkhxfjvovqpnbbbwciqhwgksomwbaudwgknelcsitcnudhsvhkefjoxxsoatkdrifgmqjxqebwqufdsmforovqnpwfkiitjfsvvtmgxnehcjkunqcwgxgmhfrjfcfoxxevsqdjwxiaatmnloljgrvnohwubtcasgvepqfnponpbbumhxnnrdsxkrtdmodxurtljbqrhfaiwvmgubtfuovwxqblgfctwwwxppqwujwlgkrsdmqasnwrvavuvpptffsuudkjmiuksneormoebenxuclrscmxxxmuswvwxrijwexhjflkkrbwtmqngufglrsfhpdwadioaxnjvrlhknffrnlakqwvbqtaxoxpkxvkwklldwsndqtvvwnholvhtqhkwgrivosmqvxuukbxsmmpkrpaumhpuhrsfkddqnpjlgvxqwokltsnmjojnnabuktsmovfuegxkdwdrefuxpkmqqvfvnwkxkeeabbmvhlhcbctgaifpsricofxeejtonxggatdhwdbavngvvlfhffjlkipgkdmpclwdwrcumuukjshggefdjoomowkabxqdcgwapruenjowdnujkrethtxnrkokbwfdeedtnppcavqelefvvkiuvijgkxqlnvgrrbfgqmijkafnuccrmknjkxhuoxxevfnowkvpxvqbovokxqeesjffanrpmrlboaindvucsmdabjlqbhulisijhcqlldnrtnwwksquwlvpuainxubhojqvdibodgaxtwvvjgjhrwpowxtntuvcwfxbgqijwiargoghuqhfowtfnhsidhcrfstdkdejdfsblrjhjqmpoamdxxdcwwmdqhgccldviwwtphsqpwxvwmqvlmqjkefcdlevoiswwqjfqdnxcmvqangdrwfdskfnnckecesqmevuhkujorcpwikqwplibrvhlxlndvfpbsebuackjerheepsltsfehmpgxujurrolvpxnrjwodvkxnvkappepdtvshhhaqndfucsfdqlgnwvslisspojlbhviguaojdtfvnlbvwhcmvnpvhkmolppkfaqbawlurirwlslksoopdgmciqqlaiwfaggavruosoffaqhswwbrunuuwexwendeubvjtrxfxukqfsktimnerbqhfpfcfagrcdcnnrseouulohgwltsumkekcbmxskqmosrtldxrxueoddegoxsdbondirccdkgjexeicebbawhtbmrpdlkuspac  ";
//        String A="                        ";
//        A = A.trim();
//        System.out.println(A);
//        String[] largest= A.split("[ !,?._'@]+");
//        int len = largest.length;
//        if (len==1 && largest[0].equals("")) {
//            len=0;
//        }
//        System.out.println("len " + len);
//        if (len>0) {
//            for (String word : largest) {
//                System.out.println(word);
//            }
//        }
//        String A = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>";
//        String pattern = "<([a-zA-Z 0-9]+)>([^<>\\\\]*)</\\1>";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(A);
////        String[] tags = A.split(pattern);
////        Matcher m =  pattern.
////        System.out.println(A.indexOf(tags[0]));
//        while (m.find()) {
//            // Get the matching string
//            String match = m.replaceAll("repl");
//
//            System.out.println(match);
//        }
//        int arrLen = input.nextInt();
//        input.nextLine();
//        String s = input.next();
//        Set<String> phoneBook = new HashSet<>();
//        phoneBook.add("a");
//        phoneBook.add("a");
//        phoneBook.add("b");
//        System.out.print(phoneBook);
//
//        Set<String> phone = new HashSet<>();
//        phone.add("b");
//        phone.add("a");
//        phone.add("a");
////        System.out.println(phone);
////        System.out.print(phone.equals(phoneBook));
//        String inp = "0 0 1 1 1 1 1 1 1 1 1 0 0 0 0 1 0 0 0 1 1 0 1 0 1 1 0 0 0 0 1 0 0 1 1 1 0 1 0 1 0 1 1 1 0 1 0 0 0";
//        String[] game = inp.split(" ");
//        int[] gameInt = new int[game.length];
//        for (int i=0; i<game.length; i++) {
//            gameInt[i] = Integer.parseInt(game[i]);
//        }
////        System.out.print(canWin(22, new int[] {0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1,
////                0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1}));
//
//        System.out.print(canWin(3, gameInt));
//        Iterator it = phone.iterator();
//        try {
//            int e = 1;
//            int r = 0;
//            System.out.print(e/r);
//        } catch (InputMismatchException | ArithmeticException e ) {
//            System.out.print(e.getClass().getName()+e.getMessage());
//        }
//
//    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n=game.length;
        boolean win=true;
        for (int i=1; i<n; i++) {
//            System.out.println(game[i]);
            if (game[i]!=0) {
                if (i+leap-1<n) {
                    if (game[i+leap-1]==0) {
                        i+=leap;
//                        System.out.println("i" + (i));
                    } else {
//                        System.out.println("leap" + (i + leap));
                        win = false;
                        break;
                    }
                }
            }
        }
        return win;
    }


    // Ex. 9.2
    private static int getMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Ex. 9.3
    private static String returnText(int number) {
//        String text = "";
//        int lastDigit = number % 10;
//        switch (lastDigit) {
//            case 1:
//                text = "one";
//                break;
//            case 2:
//                text = "two";
//                break;
//            case 4:
//                text = "four";
//                break;
//            default:
//                System.out.print("not in switch/case");
//        }
//        return text;
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return digits[number % 10];
    }

    // Ex. 9.4
    private static int countNum(int num, int... numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number == num) {
                count++;
            }
        }
        return count;
    }

    // Ex. 9.5
    private static boolean isGreaterOrSmallerThanNeighbours(int position, int[] array) {
        if (position > 0 && position < array.length - 1) {
            int num = array[position];
            return (array[position - 1] > num && array[position + 1] > num) ||
                        (array[position - 1] < num && array[position + 1] < num);
        } else if (position == 0) {
            return (array[position + 1] != array[position]);
        } else if (position == array.length - 1) {
            return (array[position - 1] != array[position]);
        } else {
            System.out.println("Incorrect position!");
            return false;
        }
    }

    // Ex. 9.6
    private static int elementPosition(int[] array) {
        int pos = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] > array[i] && array[i + 1] > array[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    // Ex. 9.7
    private static void revertNumber(int number) {
        System.out.print("Reverted number " + number + " is ");
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }

    // Ex. 9.9
    private static float average(int[] numbers) {
        float count = numbers.length;
        float sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / count;
    }

    private static float findX(int a, int b) {
        return -b/a;
    }

    // Ex. 9.8 & 9.10
    private static ArrayList<Integer> toBigNum(int number) {
        ArrayList<Integer> bigNum = new ArrayList<>();
        if (number == 0) {
            bigNum.add(0);
        }
        while (number > 0) {
            bigNum.add(number % 10);
            number /= 10;
        }
        return bigNum;
    }

    private static ArrayList<Integer> toBigNum(String number) {
        ArrayList<Integer> bigNum = new ArrayList<>();
        if (number.length() == 0) {
            bigNum.add(0);
        }
        for (int i = number.length() - 1; i >= 0; i--){
            bigNum.add(Integer.valueOf(number.subSequence(i, i + 1).toString()));
        }
        return bigNum;
    }

    private static String bigNumToString(ArrayList<Integer> bigNum) {
        StringBuilder stringNum = new StringBuilder();
        for (Integer digit : bigNum) {
            stringNum.append(digit);
        }
        return stringNum.reverse().toString();
    }

    private static ArrayList<Integer> addBigNum(ArrayList<Integer> x, ArrayList<Integer> y) {
        ArrayList<Integer> addBN = new ArrayList<>();
        ArrayList<Integer> a;
        ArrayList<Integer> b;
        if (x.size()<y.size()) {
            a=x;
            b=y;
        } else {
            a=y;
            b=x;
        }
        int lenA = a.size();
        int lenB = b.size();
        if ((lenA == 0) || (lenB == 0)) {
            a.addAll(b);
            return a;
        }
        int c = 0;
        for (int i = 0; i < lenA; i++) {
            c+=a.get(i) + b.get(i);
            addBN.add(c%10);
            c /= 10;
        }
        for (int i = lenA; i < lenB; i++) {
            c+= b.get(i);
            addBN.add(c%10);
            c /= 10;
        }
        if (c > 0) {
            addBN.add(c);
        }
        return addBN;
    }

    private static ArrayList<Integer> multiplyBigNum(ArrayList<Integer> x, ArrayList<Integer> y) {
        ArrayList<Integer> result = toBigNum(0);
        ArrayList<Integer> prod = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            prod.clear();
            for (int j = 0; j < i; j++) {
                prod.add(0);
            }
            int c = 0;
            for (int j = 0; j < y.size(); j++) {
                c += x.get(i) * y.get(j);
                prod.add(c % 10);
                c /= 10;
            }
            if (c > 0) {
                prod.add(c);
            }
            result = addBigNum(result, prod);
        }
        return result;
    }

    private static ArrayList<Integer> factorialN(int n) {
        ArrayList<Integer> fact = new ArrayList<>();
        fact.add(1);

        for (int i = 2; i <= n; i++) {
            fact = multiplyBigNum(fact, toBigNum(i));
        }
        return fact;
    }

    private static void testStudent() {
        Student student = new Student();
        student.getStudentInfo();
        Student student2 = new Student("Second student");
        student2.getStudentInfo();
        Student student3 = new Student("Third student", 2);
        student3.getStudentInfo();
        Student student4 = new Student("Forth student", 4, "forth@mail.com");
        student4.getStudentInfo();
        Student student5 = new Student("Fifth student", 1, "fifth@mail.com", "12345678");
        student5.getStudentInfo();
        Student student6 = new Student("Sixth student", 3, "sixth@mail.com", "678", "Finance");
        student6.getStudentInfo();
        Student student7 = new Student("Seventh student", 3, "seventh@mail.com", "6542", "IT", "SU");
        student7.getStudentInfo();

        System.out.println("Number of objects: " + Student.studentsCount);
    }

}
