public class InstanceCounter {

    private static int numInstances = 0;

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances.");

        for (int i = 0; i < 500; i++) {
            new InstanceCounter();
        }

        System.out.println("Created " + InstanceCounter.getCount() + " instances.");
    }
}
