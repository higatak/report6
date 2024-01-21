package jp.ac.uryukyu.ie.e235706;

import java.util.Scanner;

public class sanmoku {

    public static void 名前を決める(){
        System.out.println("マルを選んだ人の名前を入力してください");
        Scanner nameA = new Scanner(System.in);
        String name1 =nameA.next();
        System.out.println("バツを選んだ人の名前を入力してください");
        Scanner nameB = new Scanner(System.in);
        String name2 = nameB.next();
        System.out.println("〇 のプレイヤー："+name1);
        System.out.println("× のプレイヤー："+name2);
    }
}
    