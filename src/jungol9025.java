public class jungol9025 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        int result1 = (a != 0 && b != 0) ? 1 : 0;
        int result2 = (a != 0 || b != 0) ? 1 : 0;
        int result3 = (b != 0 && c != 0) ? 1 : 0;
        int result4 = (a == 0) ? 1 : 0;
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }
}
