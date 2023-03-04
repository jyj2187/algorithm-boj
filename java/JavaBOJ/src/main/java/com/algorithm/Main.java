package com.algorithm;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        UUID uuid2 = UUID.fromString(str);

        System.out.println(uuid);
        System.out.println(str);
        System.out.println(uuid2);
    }
}