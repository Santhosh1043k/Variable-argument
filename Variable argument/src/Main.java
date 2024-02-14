public class Main{
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
    }
    public static int sum(int...numbers) {
        int total = 0;
        for (int x : numbers) {
            total += x;
        }
        return total;


    }
}

