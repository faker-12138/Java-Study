import java.util.StringJoiner;

/**
 * @author 张涛
 * @date 2024-07-31 16:51
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        System.out.println(sj);
    }
}
