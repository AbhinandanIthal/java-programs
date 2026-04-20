package Stringoperation;

public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;
        String textToAppend = "AIET";

        // Performance Test for StringBuffer
        long startTime = System.nanoTime();
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sBuffer.append(textToAppend);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");

        // Performance Test for StringBuilder
        startTime = System.nanoTime();
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sBuilder.append(textToAppend);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");
    }
}
