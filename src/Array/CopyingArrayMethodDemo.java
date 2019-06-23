package Array;

public class CopyingArrayMethodDemo {
    public static void main(String[] args) {
        int [] sourceArray = {2, 3, 2, 5, 10};
        int [] targetArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
       /* for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }*/
        for (int target : targetArray) {
            System.out.println(target);

        }
    }
}
