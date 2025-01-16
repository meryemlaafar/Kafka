package meryem.emsi.appkafka.entities;

import java.util.Base64;

public class DecodeMessage {
    public static void main(String[] args) {
        String encodedMessage = "eyJuYW1lIjoiYmxvZyIsInVzZXIiOiJVMSIsImRhdGUiOiIyMDI1LTAxLTA2VDE2OjIwOjA2LjU4MyswMDowMCIsImR1cmF0aW9uIjozNzQ0fQ==";
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encodedMessage);
            String decodedMessage = new String(decodedBytes);
            System.out.println(decodedMessage);
        } catch (IllegalArgumentException e) {
            System.err.println("Le message encodé est invalide : " + e.getMessage());
        }
    }
}


