package com.dummmy.demu;

public class Main {
    public static void main(String[] args) {
        helper h = new helper();  // ✅ works (same package)
        h.greet();                // ✅ works
    }
}
