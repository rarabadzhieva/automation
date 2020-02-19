import chapter10.examples.Example5;
import chapter12.FileParseException;
import chapter12.ReadFile;
import chapter13.ExerciseStrings;
import chapter14.StudentTest;
import chapter15.Exercises;
import chapter16.DynamicDeque;
import chapter16.DynamicDoubleList;
import chapter16.DynamicStack;
import chapter16.StaticQueue;
import chapter18.Exercise;
import chapter18.MyHashMapCA;
import chapter20.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    static String[] words = {"test", "rock", "fun"};
    static int[] sw = new int[words.length];

    static int perm = 5;
    static int[] permSw = new int[perm];

    static int[] test = {4, 12, 9, 1, 8, 0, 10, 7, 14, 4};
    static int[] usedSum = new int[test.length];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        // Ex. 3.3
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        if ((num % 1000) / 100 == 7) {
//            System.out.print("The number has 7 on its third position!");
//        } else {
//            System.out.print("NO 7");
//        }
//
//        // Ex. 3.4
//        if (((1 << 3) & num) > 0) {
//            System.out.print("Third bit is 1");
//        } else {
//            System.out.print("Third bit is 0");
//        }
//
//        // Ex. 3.8
//        System.out.print("Enter x and y: ");
//        int x = input.nextInt();
//        int y = input.nextInt();
//        if ((x*x + y*y) < 25) {
//            System.out.print("O (" + x + ", "+ y +") - is IN the circle");
//        } else {
//            System.out.print("O (" + x + ", "+ y +") - is OUT the circle");
//        }
//
//        // Ex. 3.9
//        if ((x*x + y*y) < 25 && ((x > -1 && (y < 1)) || (x < -1))) {
//            System.out.print("O (" + x + ", "+ y +") - is IN the circle and OUT of the rectangle.");
//        } else {
//            System.out.print("O (" + x + ", "+ y +") - incorrect");
//        }
//
//        // Ex. 3.10
//        System.out.print("Enter 4-digit number: ");
//        int num = input.nextInt();
//        int a = num / 1000;
//        int b = (num % 1000 ) / 100;
//        int c = (num % 100) / 10;
//        int d = num % 10;
//
//        int sum = a + b + c + d;
//        System.out.println("The sum is " + sum);
//        System.out.printf("Reversed number dcba: %d\n", (d*1000 + c*100 + b*10 + a) );
//        System.out.printf("Number dbca: %d\n", (d*1000 + b*100 + c*10 + a));
//        System.out.printf("Number acdb: %d\n", (a*1000 + c*100 + d*10 + b));
//
//        // Ex. 3.11
//        System.out.print("Enter n and p: ");
//        int n = input.nextInt();
//        int p = input.nextInt();
//
//        if (((1 << p) & n) > 0) {
//            System.out.println("On position " + p + " is 1");
//        } else {
//            System.out.println("On position " + p + " is 0");
//        }
//
//        // Ex. 3.12
//        System.out.print("Enter n, p and v: ");
//        int n = input.nextInt();
//        int p = input.nextInt();
//        int v = input.nextInt();
//
//        int newNum = (~(1 << p) & n) | (v << p);
////        System.out.print("New number " + newNum);
//
//        // Ex. 3.13
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//
//        if ((num == 2 || num == 3 || num == 5 || num == 7) ||
//                (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)) {
//            System.out.print("The number is prime.");
//        } else {
//            System.out.print("The number is NOT prime");
//        }
//
//        // Ex. 4.4
//        System.out.print("Enter two numbers: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        if (num1 < num2) {
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//
//        int count1 = num1 / 5;
//        int count2 = num2 / 5;
//        if (num1 % 5 == 0 && num1 != num2) {
//            count1 -= 1;
//        }
//
//        System.out.print("Numbers that can be divided on 5 : " + (count1 - count2));
//
//        // Ex. 4.5
//        System.out.print("Enter two numbers: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int bigger = ((Math.abs(num1 + num2) + (Math.abs(num1 - num2))) / 2);
//
//        System.out.print("Bigger number is: " + bigger);

//        // Ex. 5.7
//        int[] list = {2, 7, 9, -8, 1, 6, 0, -9};
//
//        int count = 1 << list.length;
//
//        for (int i = 1; i < count; i++) {
//            int sum = 0;
//            int indexJ = 0;
//            ArrayList<Integer> subset = new ArrayList<Integer>();
//            for (int j = i; j > 0; j /= 2, indexJ++) {
//                if (j % 2 == 1) {
//                    subset.add(list[indexJ]);
//                    sum += list[indexJ];
//                }
//            }
//            if (sum == 0) {
//                System.out.println("Subset: " + subset);
//            }
//        }
//
//        // Ex. 5.8
//
//        System.out.println("Enter points:");
//        int points = input.nextInt();
//
//        switch (points) {
//            case 1:
//            case 2:
//            case 3:
//                points *= 10;
//                break;
//            case 4:
//            case 5:
//            case 6:
//                points *= 100;
//                break;
//            case 7:
//            case 8:
//            case 9:
//                points *= 1000;
//                break;
//                default:
//                    System.err.print("Wrong point! They must be between 1 and 9!\n");
//        }
//        System.out.print("Points are: " + points);
//
//        // Ex. 6.1
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//        int num = 1;
//        while (num <= n) {
//            System.out.println(num);
//            num++;
//        }
//
//        // Ex. 6.2
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//        int num = 1;
//        while (num <= n) {
//            if (num % 3 != 0 && num % 7 != 0) {
//                System.out.println(num);
//            }
//            num++;
//        }
//
//        // Ex. 6.3
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("Enter a number: ");
//            int num = input.nextInt();
//            if (num > max) {
//                max = num;
//            }
//            if (num < min) {
//                min = num;
//            }
//        }
//        System.out.println("Max: " + max + ", min: " + min);
//
//        // Ex. 6.4
//        String[] color = {"купа", "каро", "пика", "спатия"};
//        String[] type = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//        for (String col : color) {
//            for (String colType : type) {
//                System.out.println("Card: " + col + " " + colType);
//            }
//        }
//
//        // Ex. 6.5
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//
//        int firstN = 0;
//        int secondN = 1;
//        int next = 0;
//
//        System.out.print(firstN + ", " + secondN);
//        for (int i = 0; i < n; i++) {
//            next = firstN + secondN;
//            System.out.print(", " + next);
//            firstN = secondN;
//            secondN = next;
//        }
//
//        // Ex. 6.6
//        System.out.print("Enter K and N (1 < K < N): ");
//        int k = input.nextInt();
//        int n = input.nextInt();
//
//        int prod = 1;
//
//        for (int i = k + 1; i <= n; i++) {
//            prod *= i;
//        }
//        System.out.print(prod);
//
//        // Ex. 6.7
//        System.out.print("Enter K and N: ");
//        int k = input.nextInt();
//        int n = input.nextInt();
//
//        int prodNK = 1;
//        int prodK = 1;
//        for (int i = n - k + 1; i <= n; i++) {
//            prodNK *= i;
//        }
//        for (int j = 1; j <= k; j++) {
//            prodK *= j;
//        }
//        System.out.print("Result: " + (prodNK * prodK));
//
//        // Ex. 6.8
//        System.out.print("Enter N and x: ");
//        int n = input.nextInt();
//        int x = input.nextInt();
//
//        double sum = 1;
//        double prod = 1;
//
//        for (int i = 1; i <= n; i++){
//            prod = i * prod / x;
////            int prod = 1;
////            for (int j = 1; j <= i; j++){
////                prod = (prod * j) / x;
////            }
//            sum += prod;
//        }
//        System.out.print("Sum: " + sum);
//
//        // Ex. 6.10
//        System.out.print("Enter N: ");
//        int n = input.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i);
//            for (int j = 1; j < n; j++) {
//                System.out.print(i + j);
//            }
//            System.out.println();
//        }
//
//        // Ex. 6.11
//        System.out.print("Enter N: ");
//        int n = input.nextInt();
//
//        int counter = 0;
//        for (int i = 5; i <= n; i+=5) {
//            for (int j = i; j % 5 == 0; j/=5) {
//                counter++;
//            }
//        }
//
//
//        long prod = 1;
//        while (n > 0) {
//            prod *= n;
//            n--;
//        }
//        System.out.println(prod);
//        while (prod % 5 == 0) {
//            counter++;
//            prod /= 5;
//        }
//        System.out.print("Zeros: " + counter);
//
//        // Ex. 6.12
//        System.out.print("Enter a number (10): ");
//        int num = input.nextInt();
//
//        StringBuilder builder = new StringBuilder();
//        while (num > 0) {
//            builder.append(num % 2);
//            num /= 2;
//        }
//        System.out.println("NOT reversed: " + builder);
//        builder.reverse();
//        System.out.println("Reversed (2): " + builder);
//
//        // Ex. 7.4
//        //int[] arr = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
//        int[] arr = {1, 2 ,3, 4, 5, 6};
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
//            System.out.print("All elements are different.");
//        }
//
//        // Ex. 7.5
//        int[] arr = {3, 2, 3, 4, 2, 2, 4};
//        //int[] arr = {1, 2 ,3, 4, 5, 6};
//        int count = 1;
//        int firstIndex = 0;
//        int maxCount = 1;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] < arr[i + 1]) {
//                count++;
//            } else {
//                if (maxCount < count) {
//                    maxCount = count;
//                    firstIndex = i - count + 1;
//                }
//                count = 1;
//            }
//        }
//        if (maxCount != 1) {
//            int[] newArr = new int[maxCount];
//            for (int i = 0; i < maxCount; i++) {
//                newArr[i] = arr[firstIndex + i];
//            }
//            System.out.print("Array: " + Arrays.toString(newArr));
//        } else {
//            System.out.print("All elements are different.");
//        }
//
//        // Ex. 7.6
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//        System.out.print("Enter k: ");
//        int k = input.nextInt();
//
//        int[] arrN = new int[n];
//        int[] arrK = new int[k];
//        System.out.print("Enter elements for array n: ");
//        for (int i = 0; i < n; i++) {
//            arrN[i] = input.nextInt();
//        }
//        Arrays.sort(arrN);
//        for (int i = 0; i < k; i++) {
//            arrK[i] = arrN[n - k + i];
//        }
//        System.out.print("Array: " + Arrays.toString(arrK));
//
//        // Ex. 7.7
//        int[] arr = {3, 2, 3, 4, 2, 2, 0, 12, 3, 7, 5, 9, 10};
//
//        int minIdx;
//        for (int i = 0; i < arr.length -1; i++) {
//            minIdx = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIdx]) {
//                    minIdx = j;
//                }
//            }
//            int temp = arr[minIdx];
//            arr[minIdx] = arr[i];
//            arr[i] = temp;
//        }
//        System.out.println("Sorted: " + Arrays.toString(arr));
//
//        // Ex. 7.9
//        int[] arr = {4, 3, 1, 4, 2, 5, 8, 0, 3};
//        System.out.print("Enter sum: ");
//        int expSum = input.nextInt();
//
//        int count = 0;
//        int currentSum = 0;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (; currentSum < expSum && (i + count) < arr.length; count++) {
//                currentSum += arr[i + count];
//            }
//            if (currentSum == expSum) {
//                int[] sumArr = new int[count];
//                for (int j = 0; j < count; j++) {
//                    sumArr[j] = arr[i + j];
//                }
//                System.out.println("Array: " + Arrays.toString(sumArr));
//            }
//            count--;
//            currentSum -= arr[i];
//        }
//
//        // Ex. 7.10 c [[7, 11, 14, 16], [4, 8, 12, 15], [2, 5, 9, 13], [1, 3, 6, 10]]
//        int dim = 4;
//        int[][] matrix = new int[dim][dim];
//
//        int counter = 1;
//        int lastNum = dim * dim;
//        for (int i = dim -1, j = 0; counter <= lastNum;) {
//            for (int i2 = i, j2 = j; i2 < dim && j2 < dim; j2++, i2++) {
//                matrix[i2][j2] = counter++;
//            }
//            if (i > 0) {
//                i--;
//            } else {
//                j++;
//            }
//        }
//        System.out.print("Array: " + Arrays.deepToString(matrix));
//
//        // Ex. 7.10 d [[1, 12, 11, 10], [2, 13, 16, 9], [3, 14, 15, 8], [4, 5, 6, 7]]
//        int dim = 5;
//        int[][] matrix = new int[dim][dim];
//
//        int counter = 1;
//        int lastNum = dim * dim;
//        int i = 0;
//        int j = 0;
//        int si = 1;
//        int sj = 0;
//
//        while (counter <= lastNum) {
//            matrix[i][j] = counter++;
//            if ((i == dim -1 && j == 0) || (si == 1 && matrix[i + 1][j] != 0)) {
//                si = 0;
//                sj = 1;
//            } else if ((j == dim - 1 && i == dim - 1) || (sj == 1 && matrix[i][j + 1] != 0)) {
//                si = -1;
//                sj = 0;
//            } else if ((i == 0 && j == dim - 1) || (si==-1 && matrix[i - 1][j] != 0)) {
//                si = 0;
//                sj = -1;
//            } else if (sj ==-1 && matrix[i][j - 1] != 0) {
//                si = 1;
//                sj = 0;
//            }
//            i += si;
//            j += sj;
//        }
//        System.out.print("Array: " + Arrays.deepToString(matrix));
//
//         // Ex. 7.11
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
//                int currentSum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] +
//                        matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2] +
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
//            for (int j = 0; j  < 3 ; j++) {
//                maxSumMatrix[i][j] = matrix[firstRow + i][firstCol + j];
//            }
//        }
//        System.out.println("Max Matrix: " + Arrays.deepToString(maxSumMatrix));
//        System.out.println("Max sum: " + maxSum);
//
//        // Ex. 7.12
//        System.out.print("Enter a word: ");
//        String word = input.nextLine();
//
//        for (int i = 0; i < word.length(); i++) {
//            int index = (int) word.charAt(i) - (int) 'A';
//            System.out.println("Char " + word.charAt(i) + " has index " + index);
//        }
//
//        // Ex. 7.13
//        int[] array = {1, 3, 7, 12, 14, 40, 44, 46, 50, 52, 55};
//        System.out.print("Enter target value: ");
//        int target = input.nextInt();
//
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//        int index = -1;
//
//        while (firstIndex <= lastIndex) {
//            int midIndex = (firstIndex + lastIndex) / 2;
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
//
//
//        // Ex. 7.17
//        int[][] arr = {{1, 3, 2, 2, 2, 4}, {3, 3, 3, 2, 2, 4}, {4, 3, 1, 2, 3, 3}, {4, 3, 1, 3, 3, 1}, {4, 3, 3, 3, 1, 1}};
//
//        int N = arr.length;
//        int M = arr[0].length;
//
//        int maxCount = 0;
//        int value = 0;
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (arr[i][j] != 0) {
//                    int curVal = arr[i][j];
//                    int count = bfs(arr, i, j, curVal);
//                    if (count > maxCount) {
//                        maxCount = count;
//                        value = curVal;
//                    }
//                }
//            }
//        }
//
//        System.out.print("Value: " + value + ", count: " + maxCount);

        //Ex. 9.10
//        ArrayList<Integer> test = toBigNum("5583746");
//        String testBuu = bigNumToString(test);
//        System.out.println("Test " + test);
//        System.out.println("TestBuu " + testBuu);
//        ArrayList<Integer> test = factorialN(120);
//        System.out.println("Test " + bigNumToString(test));
//
//        //Ex. 10.1
//        int n = 4;
//        int k = 3;
//
////        combination(3);
//        int[] combiList = new int[k + 1];
//        combiList[0] = 1;
////        combinationRec(1, n, combiList);
//
//        // Ex. 10.4
//        subsets(0);
//
//        // Ex. 10.5
//        int[] test = {4, 12, 9, 1, 8, 0, 10, 7, 14, 4};
//        System.out.println("Not sorted: " + Arrays.toString(test));
//        mergeSort(test, 0, test.length - 1);
//        System.out.println("Sorted: " + Arrays.toString(test));

        // Ex. 10.6
//        permutation(3);
//        permutationRec(0);

        // Ex. 10.7
//        sumRec(13, 0);

        // Ex. 10.8
//        System.out.print(isSumRec(103, 0));

        // Ex. 10.9
//        char[][] lab = {
//                {' ', ' ', ' ', '*', ' ', ' ', ' '},
//                {'*', '*', ' ', '*', ' ', '*', ' '},
//                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
//                {' ', '*', '*', '*', '*', '*', ' '},
//                {' ', ' ', ' ', ' ', ' ', ' ', 'e'},
//        };
//        bfsLab(lab);
//
//        // Ex. 11.1
//        int toDays = 1000 * 60 * 60 * 24;
//        System.out.println("Time from 1 Jan 1970: " + (System.currentTimeMillis() / toDays));

        // Ex. 11.2
//        System.out.println("Enter side a: ");
//        double a = input.nextDouble();
//        System.out.println("Enter side b: ");
//        double b = input.nextDouble();
//
//        System.out.println("Hypotenuse is " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
//
//        // Ex. 11.3
//        Example3 test = new Example3("Buuchi", "Brown");

        // Ex. 11.4
//        Example4 test4 = new Example4();
//        test4.sayMiauCat();

        // Ex. 11.5
//        Example5 rand1 = new Example5();
//        rand1.getAd();
//        rand1.getAd();
//        rand1.getAd();
//        rand1.getAd();
//        rand1.getAd();
//
//        // Ex. 12.6
//        int x = 1;
//        try {
//            System.out.println("Try " + x);
//            x++;
//            throw new Exception("exc");
//        } catch (Exception e) {
//            System.out.println("Catch " + x);
//            x++;
//        } finally {
//            System.out.println("Finally " + x);
//        }
//
//        // Ex. 12.8
//        String file = "C:\\Users\\ral\\Desktop\\test.txt";
//        ReadFile rf = new ReadFile();
//        try {
//            System.out.println(rf.readFileString(file));
//        } catch (IOException e) {
//            System.out.println("Cannot read file " + file + " error \n" + e);
//        }
//
//        // Ex. 12.9
//        ByteArrayOutputStream byteFile = null;
//        try {
//            byteFile = rf.readFileBytes(file);
//            rf.writeByteFile(byteFile, "testbyte.txt");
//            System.out.println();
//        } catch (FileNotFoundException e) {
//            System.out.println("Cannot read 'binary' file " + file + " error \n" + e);
//        } catch (IOException e) {
//            System.out.println("IO Exception " + e);
//        } finally {
//            if (byteFile != null) {
//                try {
//                    byteFile.close();
//                } catch (IOException e) {
//                    System.out.println("Cannot close ByteArrayOutputStream " + e);
//                }
//            }
//        }
//
//        // Ex. 12.10
//        String file = "C:\\Users\\ral\\Desktop\\numbers.txt";
//        try {
//            rf.readNumberFile(file);
//        } catch (FileParseException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("IO Exception " + e);
//        }

        // Ex. 13.1
        ExerciseStrings exerciseStrings = new ExerciseStrings();
//        System.out.println("Enter a string to revert: ");
//        String str = input.nextLine();
//        System.out.println(exerciseStrings.revertString(str));

        // Ex. 13.2
//        String str2 = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. " +
//                "So we are drinking all the day. We will move out of it in 5 days. ";
//        System.out.println("Count " + exerciseStrings.countSubstring(str2, "in"));
//
//        // Ex. 13.3
//        String str3 = "<upcase>We</upcase> are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
//        System.out.println(exerciseStrings.changeCase(str3));
//
//        // Ex. 13.4
//        String str4 = "Microsoft announced its next generation Java compiler today. " +
//                "It uses advanced parser and special optimizer for the Microsoft JVM. ";
//        String subStr4 = "Java,JVM,Microsoft";
//        System.out.println(exerciseStrings.censorWords(str4, subStr4));
//
//        // Ex. 13.5
//        String str5 = "http://www.devbg.org/forum/index.php";
//        System.out.println(exerciseStrings.urlAddress(str5));
//
//        // Ex. 13.6
//        String str6 = "C# is not C++ and PHP is not Delphi";
//        System.out.println(exerciseStrings.reverseStr(str6));
//
//        // Ex. 14.6
//        StudentTest st = new StudentTest();
//        StudentTest.test();
//        st.getProperties();
//
//        // Ex. 15.3
//        Exercises ex = new Exercises();
////        ex.findMax();
//        ex.replaceWord();
//
//        // Ex. 16.1
//        testDoubleList();
//
//        // Ex. 16.2
//        testDynamicStack();
//
//        // Ex. 16.3
//        testDynamicDeque();
//
//        // Ex. 16.4
//        testStaticQueue();
//
//
//        // Ex. 16.5
//        testSort();
//
//        // Ex. 18.1
////        Exercise ex = new Exercise();
////        System.out.println(ex.reduceArr());
//        testHashMapCA();
//
//        // Ex. 20.2
//        testStudent();
//
//        // Ex. 20.3
//        testWorker();
//
//        // Ex. 20.4
//        testShapes();

        // Ex. 20.5
//        testAnimal();

        String a = "anagram";
        String b = "margana";
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        System.out.println(Arrays.equals(arrA, arrB));
//        System.out.println(arrB.toString());
    }

    private static int dfs(int[][] arr, int i, int j, int value) {
        int[][] step = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int count = 1;
        arr[i][j] = 0;
        for (int s = 0; s < step.length; s++) {
            int nI = i + step[s][0];
            int nJ = j + step[s][1];
            if (0 <= nI && nI < arr.length && 0 <= nJ && nJ < arr[0].length && arr[nI][nJ] == value) {
                count += dfs(arr, nI, nJ, value);
            }
        }
        return count;
    }

    private static int bfs(int[][] arr, int i, int j, int value) {
        int[][] step = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        LinkedList<int []> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        int count = 1;
        arr[i][j] = 0;
        while (!queue.isEmpty()) {
            int[] curQ = queue.pop();
            for (int s = 0; s < step.length; s++) {
                int nI = curQ[0] + step[s][0];
                int nJ = curQ[1] + step[s][1];
                if (0 <= nI && nI < arr.length && 0 <= nJ && nJ < arr[0].length && arr[nI][nJ] == value) {
                    count++;
                    queue.add(new int[] {nI, nJ});
                    arr[nI][nJ] = 0;
                }
            }
        }
        return count;
    }

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

    private static void combination(int n) {
        System.out.print("Combi: ");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    System.out.printf("(%d, %d, %d) ", i, j, k);
                }
            }
        }
    }

    private static void combinationRec(int k, int n, int[] comb) {
        if (k == comb.length) {
            for (int i = 1; i < comb.length; i++) {
                System.out.print(comb[i] + " ");
            }
            System.out.println(" ");
            return;
        }

        for (int i = comb[k - 1] + 1; i <= n; i++) {
            comb[k] = i;
            combinationRec(k + 1, n, comb);
        }
    }

    private static void subsets(int i) {
        if (i == words.length) {
            System.out.print("(");
            for (int j = 0; j < sw.length; j++) {
                if (sw[j] == 1) {
                    System.out.print(words[j] + " ");
                }
            }
            System.out.println(")");
            return;
        }
        subsets(i + 1);
        sw[i] = 1;
        subsets(i + 1);
        sw[i] = 0;
    }

    private static void mergeSort(int[] arr, int b, int e) {
        if ((e - b + 1) < 2) {
            return;
        }
        int mid = (b + e) / 2;
        System.out.println("B " + b + " mid " + mid);
        mergeSort(arr, b, mid);
        System.out.println("Mid " + (mid + 1) + " e " + e);
        mergeSort(arr, mid + 1, e);
        System.out.println(Arrays.toString(arr));
        merge(arr, b, e);
        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int[] arr, int b, int e) {
        int[] mergedArr = new int[e - b + 1];
        int mid = (b + e) / 2;
        System.out.println("---B " + b + " e " + e);
        int k = 0;
        int i = b;
        int j = mid + 1;
        for (; i <= mid && j <= e; k++) {
            if (arr[i] < arr[j]) {
                mergedArr[k] = arr[i];
                i++;
            } else {
                mergedArr[k] = arr[j];
                j++;
            }
        }
        for (; i <= mid; i++, k++) {
            mergedArr[k] = arr[i];
        }

        for (; j <= e; j++, k++) {
            mergedArr[k] = arr[j];
        }

        for (int l = 0; l < mergedArr.length; l++) {
            arr[b + l] = mergedArr[l];
        }
//        System.arraycopy(mergedArr, 0, arr, 0, mergedArr.length);
    }

    private static void permutation(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((i != j) && (j != k) && (i != k)) {
                        System.out.printf("(%d, %d, %d) %n", i, j, k);
                    }
                }
            }
        }
    }

    private static void permutationRec(int current) {
        if (current == perm) {
            System.out.println(Arrays.toString(permSw));
            return;
        }

        for (int i = 0; i < perm; i++) {
            if (permSw[i] == 0) {
                permSw[i] = current + 1;
                permutationRec(current + 1);
                permSw[i] = 0;
            }
        }
    }

    private static void sumRec(int sumN, int pos) {
        if (sumN == 0) {
            System.out.print("(");
            for (int i = 0; i < usedSum.length; i++) {
                if (usedSum[i] == 1) {
                    System.out.print(test[i] + " ");
                }
            }
            System.out.println(")");
            return;
        }

        for (int i = pos; i < usedSum.length; i++) {
            if (usedSum[i] == 0 && test[i] <= sumN) {
                usedSum[i] = 1;
                sumRec(sumN - test[i], i + 1);
                usedSum[i] = 0;
            }
        }
    }

    private static Boolean isSumRec(int sumN, int pos) {
        if (sumN == 0) {
            return true;
        }

        for (int i = pos; i < usedSum.length; i++) {
            if (usedSum[i] == 0 && test[i] <= sumN) {
                usedSum[i] = 1;
                if (isSumRec(sumN - test[i], i + 1)) {
                    return true;
                }
                usedSum[i] = 0;
            }
        }
        return false;
    }

    private static void bfsLab(char[][] arr) {
        int[][][] path = new int[arr.length][arr[0].length][2];
        int[][] step = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        LinkedList<int []> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        arr[0][0] = 's';
        while (!queue.isEmpty()) {
            int[] curQ = queue.pop();
            for (int s = 0; s < step.length; s++) {
                int nI = curQ[0] + step[s][0];
                int nJ = curQ[1] + step[s][1];
                if (0 <= nI && nI < arr.length && 0 <= nJ && nJ < arr[0].length) {
                    if (arr[nI][nJ] == ' ' ) {
                        path[nI][nJ][0] = curQ[0];
                        path[nI][nJ][1] = curQ[1];
                        queue.add(new int[] {nI, nJ});
                        arr[nI][nJ] = 's';
                    } else if (arr[nI][nJ] == 'e'){
                        path[nI][nJ][0] = curQ[0];
                        path[nI][nJ][1] = curQ[1];
                        for (int i = nI, j = nJ; i != 0 || j != 0; ) {
                            System.out.println("Print i: " + i + " j: " + j);
                            nI = path[i][j][0];
                            nJ = path[i][j][1];
                            i = nI;
                            j = nJ;
                        }
                        return;
                    }
                }
            }
        }
    }

    private static void testDoubleList() {
        DynamicDoubleList doubleList = new DynamicDoubleList();
        doubleList.add(1);
        doubleList.add(3);
        doubleList.add(14);
        doubleList.add(33);
        doubleList.add(6);
        doubleList.add(13);
        System.out.println(doubleList.toArray());

        doubleList.add(20, 0);
        System.out.println(doubleList.toArray());
        doubleList.add(50, doubleList.getLen());
        System.out.println(doubleList.toArray());
        doubleList.add(30, 3);
        System.out.println(doubleList.toArray());

        System.out.println(doubleList.indexOf(14));
        System.out.println(doubleList.indexOf(20));
        System.out.println(doubleList.indexOf(50));
        System.out.println(doubleList.indexOf("t"));

        System.out.println(doubleList.elementAt(0));
        System.out.println(doubleList.elementAt(doubleList.getLen()-1));
        System.out.println(doubleList.elementAt(5));
//        System.out.println(doubleList.elementAt(12));

        doubleList.remove(0);
        System.out.println(doubleList.toArray());
        doubleList.remove(doubleList.getLen()-1);
        System.out.println(doubleList.toArray());
        doubleList.remove(3);
        System.out.println(doubleList.toArray());
//        doubleList.remove(10);
//        System.out.println(doubleList.toArray());
    }

    private static void testDynamicStack() {
        DynamicStack stack = new DynamicStack();
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(8);
        stack.push(1);
        stack.push(20);

        System.out.println(stack.peek());
        System.out.println(stack.toArray());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.clear();
        System.out.println(stack.toArray());
        System.out.println(stack.size());
    }

    private static void testDynamicDeque() {
        DynamicDeque deque = new DynamicDeque();
        System.out.println(deque.isEmpty());
        deque.pushHead(12);
        deque.pushHead(2);
        deque.pushTail(0);
        deque.pushTail(20);
        deque.pushHead(31);
        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
        System.out.println(deque.toArray());
        System.out.println(deque.peekHead());
        System.out.println(deque.peekTail());

        System.out.println(deque.popHead());
        System.out.println(deque.popTail());
        System.out.println(deque.toArray());

        deque.clear();
        System.out.println(deque.toArray());
        System.out.println(deque.size());
    }

    private static void testStaticQueue() {
        StaticQueue queue = new StaticQueue();
        System.out.println(queue.isEmpty());
        queue.put(3);
        queue.put(5);
        queue.put(31);
        System.out.println(Arrays.toString(queue.getQueue()));
        queue.get();
        System.out.println(Arrays.toString(queue.getQueue()));
        queue.put(25);
        queue.put(13);
        System.out.println(Arrays.toString(queue.getQueue()));
        queue.get();
        System.out.println(Arrays.toString(queue.getQueue()));
        queue.put(50);
        System.out.println(Arrays.toString(queue.getQueue()));
        queue.put(60);
        System.out.println(Arrays.toString(queue.getQueue()));
        System.out.println(queue.get());
    }

    private static void testSort() {
        DynamicDoubleList doubleList = new DynamicDoubleList();
        doubleList.add(8);
        doubleList.add(5);
        doubleList.add(3);
        doubleList.add(2);
        System.out.println(doubleList.toArray());
        doubleList.sort();
        System.out.println(doubleList.toArray());
    }

    private static void testHashMapCA() {
        MyHashMapCA hashMapCA = new MyHashMapCA();
        hashMapCA.put("a", 1);
        hashMapCA.put("b", 21);
        hashMapCA.put("r", 43);
        hashMapCA.put("w", 24);
        System.out.println(hashMapCA.put("a", 12));
        System.out.println(hashMapCA.get("a"));
        System.out.println(hashMapCA.remove("r"));
        System.out.println(hashMapCA.get("r"));

    }

    private static void testStudent() {
        Student[] students = {new Student("A", "b", 2.0), new Student(6.0), new Student(2.5), new Student(2.0),
                new Student(4.0), new Student(3.5), new Student(5.0), new Student(6.0),
                new Student(5.5), new Student(2.5)};
        Student.printInfo(students);
        Arrays.sort(students);
        Student.printInfo(students);
    }

    private static void testWorker() {
        Worker[] workers = {new Worker("M", "n", 1000, 6), new Worker(500, 3),
                new Worker(1000, 8), new Worker(5600, 2), new Worker(1000, 2), new Worker(15000, 48),
                new Worker(10000, 18), new Worker(2435, 4.5), new Worker(500, 1), new Worker(1000, 1.5)};
        System.out.println(Arrays.toString(workers));
        Arrays.sort(workers);
        System.out.println(Arrays.toString(workers));
    }

    private static void testShapes() {
        Shape[] shapes = {new Triangle(3, 6), new Rectangle(3, 6), new Circle(4)};
        for (Shape shape : shapes) {
            System.out.println(shape.shapeType() + " - " + shape.calculateSurface());
        }
    }

    private static void testAnimal() {
        Animal[] animals = {new Dog("Lady", "female", 10), new Frog("Prince", "male", 25),
                new Cat("Catty", "female", 5), new Kitten("Kitten", "male", 3)};

        for (Animal animal : animals) {
            System.out.println(animal.animalInfo() + " " + animal.makeSound());
        }
    }
}
