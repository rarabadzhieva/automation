package chapter13;

import java.util.Arrays;

public class ExerciseStrings {

    public String revertString(String str) {
        StringBuilder revertedStr = new StringBuilder();
        for (int i=str.length()-1; i>=0; i--) {
            revertedStr.append(str.charAt(i));
        }
        return revertedStr.toString();
    }

    public int countSubstring(String str, String substring) {
        String strLower = str.toLowerCase();
        int count = 0;
        int index = strLower.indexOf(substring);
        while (index != -1) {
            count++;
            index = strLower.indexOf(substring, index + 1);
        }
        return count;
    }

    public int countSubstring2(String str, String substring) {
        String strLower = str.toLowerCase();
        int count = -1;
        int index = -1;
        do {
            index = strLower.indexOf(substring, index + 1);
            count++;
        } while (index != -1);
        return count;
    }

    public String changeCase(String str) {
        String openTag = "<upcase>";
        String closeTag = "</upcase>";
        StringBuilder strBuilder = new StringBuilder();
        String[] strArray = str.split(openTag);
        strBuilder.append(strArray[0]);

        for (int i=1; i<strArray.length; i++) {
            int endIndex = strArray[i].indexOf(closeTag);
            String toUpper = strArray[i].substring(0, endIndex);
            strBuilder.append(toUpper.toUpperCase());
            strBuilder.append(strArray[i].substring(endIndex + closeTag.length()));
        }

        return strBuilder.toString();
    }

    public String censorWords(String str, String censorWords) {
        String[] words = censorWords.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        for (String word : words) {
            int len = word.length();
            int pos = str.indexOf(word);
            String stars = new String(new char[len]).replace('\0', '*');
            while (pos != -1) {
                stringBuilder.replace(pos, pos + len, stars);
                pos = str.indexOf(word, pos + 1);
            }
        }
        return stringBuilder.toString();
    }

    public String urlAddress(String url) {
        String protocol = url.split(":")[0];
        String server = url.split("/+")[1];
        String resource = url.split(protocol+"://"+server)[1];

        return "[protocol]=" + protocol + "\n[server]=" + server + "\n[resource]=" + resource;
    }

    public String reverseStr(String str) {
        String[] words = str.split(" ");
        StringBuilder reverted = new StringBuilder();
        for (int i=words.length-1; i>=0; i--) {
            reverted.append(words[i] + " ");
        }
        return reverted.toString();
    }
}
