public class StackandHeap {
    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        StackandHeap mem = new StackandHeap();
        mem.foo(obj);
    }
    private void foo(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}
