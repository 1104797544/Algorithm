public class Main {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        for (int i = 0; i <= 10; i++){
            array.addFirst(i);
        }
        System.out.println(array);
    }
}
