public class IT24102340Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop for each row (starting from 5 and decreasing)
        for (int i = 5; i >= 1; i--) {
            // Inner loop to print the current number 'i', 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
