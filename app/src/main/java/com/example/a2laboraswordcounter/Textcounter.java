
package com.example.a2laboraswordcounter;
public class Textcounter {

    public int countWords(String text) {
        if (text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public int countSigns(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '.' || c == ',' || c == '!' ||
                    c == '?' || c == ':' || c == ';') {
                count++;
            }
        }

        return count;
    }
}
