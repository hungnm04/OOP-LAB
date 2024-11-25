package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String outputString = "";
        for (int i = 0; i < 50000; i++) {
            outputString += "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()" +
                           "QWERTYUIOPASDFGHJKLZXCVBNM0987654321~!@#$%^&*" +
                           "1234567890123456789012345678901234567890123456" +
                           "AAAAAAAAABBBBBBBBBCCCCCCCCCDDDDDDDDDEEEEEEEEEF" +
                           "!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%" +
                           "abababababababababababababababababababababababa\n";
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Processing time: " + (endTime - startTime) + " ms");
    }
}