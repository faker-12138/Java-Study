import java.util.Scanner;

/**
 * @author 张涛
 * @date 2024-07-30 16:33
 */

public class Example {
    public static void main(String[] args) {
//        sellingPlaneTickets();
        primeNumber();
    }

    /**
     * 卖飞机票
     * 需求:
     *     1、机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
     *     2、按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
     */
    public static void sellingPlaneTickets(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入舱位（0：头等舱，1：经济舱）：");
        String type = sc.next();
        double discount = 1;
        if (month >= 5 && month <= 10) {
            if (type.equals("0")) {
                discount = 0.9;
            } else if (type.equals("1")) {
                discount = 0.85;
            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            if (type.equals("0")) {
                discount = 0.7;
            } else if (type.equals("1")) {
                discount = 0.65;
            }
        }
        double finalPrice = price * discount;
        System.out.println("最终票价：" + finalPrice);
    }

    /**
     * 判断101-200之间有多少素数，并输出所有素数
     */
    public static void primeNumber() {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n共有" + count + "个素数");
    }
}
