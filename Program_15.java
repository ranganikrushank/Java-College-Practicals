// Class with a synchronized method
class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Method to return the count
    public int getCount() {
        return count;
    }
}

// Class for demonstrating thread safety with synchronized methods
class Data_Ranger {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Multiple threads incrementing the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount()); // Should be 2000 if synchronized properly
    }
}