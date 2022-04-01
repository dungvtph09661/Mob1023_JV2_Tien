package lesson8_exception;

public class DemoMultiException {
    public static void main(String[] args) {
        String[] a = { "1", "2", "abc", "3", null, "4", "5" };
        //              0    1    2      3    4     5    6      7
        
        for (int i = 0; i < 8; i++) {
            try {
                int t = Integer.parseInt(a[i]);
                System.out.println(t);
            } catch (NumberFormatException e) {
                System.out.println("----------------");
                e.printStackTrace();
                System.out.println("----------------");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("----------------");
                e.printStackTrace();
                System.out.println("----------------");
            } catch (Exception e) {
                // throw e;
            }
        }
    }
}
