public class jungol119 {
    public static void main(String[] args) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int a = 0;
        a = cal.get ( java.util.Calendar.YEAR )-1900;
        System.out.printf("%d ", a);
        a += cal.get ( java.util.Calendar.MONTH );
        System.out.printf("%d ", a);
        a += cal.get ( java.util.Calendar.DATE ) ;
        System.out.printf("%d ", a);
    }
}
