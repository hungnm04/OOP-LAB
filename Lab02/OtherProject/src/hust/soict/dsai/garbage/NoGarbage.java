package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer outputStringBuffer = new StringBuffer();
        
        for (int i = 0; i < 50000; i++) {
            outputStringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()")
                            .append("QWERTYUIOPASDFGHJKLZXCVBNM0987654321~!@#$%^&*")
                            .append("1234567890123456789012345678901234567890123456")
                            .append("AAAAAAAAABBBBBBBBBCCCCCCCCCDDDDDDDDDEEEEEEEEEF")
                            .append("!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%")
                            .append("abababababababababababababababababababababababa\n");
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Processing time: " + (endTime - startTime) + " ms");
    }
}