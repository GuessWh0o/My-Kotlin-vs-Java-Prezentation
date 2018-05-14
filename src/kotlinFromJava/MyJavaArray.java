package kotlinFromJava;

public class MyJavaArray {

    public int sumValues(int[] nums) {
        int res = 0;
        for(int x : nums) {
            res += x;
        }
        System.out.println("Java sumValuesMethod. RESULT = " + res);
        return res;
    }
}
