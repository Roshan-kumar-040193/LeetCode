package org.example;

import java.util.HashMap;

public class PermInString {
    public boolean checkInclusion(String s1, String s2) {
        int win = s1.length();
        if (win > s2.length()) return false; // Edge case if s1 is larger than s2

        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        // Build frequency map for s1
        for (int i = 0; i < win; i++) {
            char c = s1.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int i = 0;

        // Iterate over s2
        while (i < s2.length()) {
            if (i < win) {
                // Initial window setup in hm2
                char c = s2.charAt(i);
                hm2.put(c, hm2.getOrDefault(c, 0) + 1);
            } else {
                // Compare maps when the window size is reached
                if (hm.equals(hm2)) return true;

                // Slide the window: remove the outgoing character and add the new one
                char outgoingChar = s2.charAt(i - win);
                char incomingChar = s2.charAt(i);

                // Remove outgoing character
                if (hm2.get(outgoingChar) == 1) {
                    hm2.remove(outgoingChar);
                } else {
                    hm2.put(outgoingChar, hm2.get(outgoingChar) - 1);
                }

                // Add incoming character
                hm2.put(incomingChar, hm2.getOrDefault(incomingChar, 0) + 1);
            }
            i++;
        }

        // Final check after loop ends
        return hm.equals(hm2);
    }
}
