public class NestedLoopExample {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            
            // Inner loop
            for (int j = 1; j <= 2; j++) {
                System.out.println("   Inner loop iteration: " + j);
            }
        }
    }
}
