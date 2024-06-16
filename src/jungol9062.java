public class jungol9062 {
    public static void main(String[] args) {
        char ch = 'a';
        int count = 1;
        for(int i = 1 ; i <= 4 ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            for(int j = 4 ; j >= i ; j--) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
