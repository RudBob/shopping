package cn.edu.zzuli.ry;

import java.util.Scanner;

/**
 * 本项目的入口
 */
public class Main {
    public static void main(String[] args) {
        showMainMenu();
    }

    /**
     * 展示主菜单
     */
    private static void showMainMenu() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        while (flag) {
            if (isLogin) {
                System.out.println("登录请按 1");
                System.out.println("退出请按 0 ");
                int n = scanner.nextInt();
                switch (n) {
                    case 1:

                        break;
                    case 0:
                        System.out.println("正在结束。。。");
                        break;
                    default:
                        System.out.println("输入不合法，请重新输入");
                }
            } else {
                System.out.println("搜索商品请按 1 ");
                System.out.println("搜索店铺请按 2 ");
                System.out.println("退出请按 0 ");
                int n = scanner.nextInt();
                switch (n) {
                    case 0:
                        System.out.println("正在结束。。。");
                        break;
                    default:
                        System.out.println("输入不合法，请重新输入");
                }
            }
        }
    }
}
