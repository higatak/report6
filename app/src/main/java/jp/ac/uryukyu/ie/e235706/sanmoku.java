package jp.ac.uryukyu.ie.e235706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
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
    
    public static char[] board=new char[9];

    public static String 順番を決める() {
        Random r=new Random();
        int a=r.nextInt(2);
        if (a==0) return "マル";
        else return "バツ";
    }

    public static void 盤面の説明() {
        System.out.println("盤面の番号は以下の通りです*(以下の番号と下の□が対応しています）");
        for (int i=0;i<9;i++) {
            System.out.print(i+1+" ");
            if(i==2||i==5||i==8) {
                System.out.println();
                } 
        }
        System.out.println();
    }

    public static char[] ボードの初期化() {
        for (int i=0;i<9;i++) {    
        board[i]='□';     
        }return board;     
    }

    public static void 戦況を表示(char[] board) {
        for (int i=0;i<9;i++) {
            System.out.print(board[i]);
            if(i==2||i==5||i==8) {
                System.out.println();     
                }
        }  
    }

    public static char[] マルを書く(char[] board) throws IOException{
        BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
        System.out.println("空白のマスの中で〇を書きたい場所を選んでください");
        戦況を表示(board);
        int num=Integer.parseInt(br.readLine());
        if (board[num-1]=='□') {
            board[num-1]='〇'; 
        }else {
            System.out.println("ほかのところを選んでください");
            }return board;
    }
    public static char[] バツを書く(char[] board) throws IOException{
        System.out.println("空白のマスの中で×を書きたい場所を選んでください");
        BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
        戦況を表示(board);
        int num=Integer.parseInt(br.readLine());
        if (board[num-1]=='□') {
            board[num-1]='×';

        }else {
            System.out.println("ほかのところを選んでください");
        }return board;
    }

    public static boolean 判定(char board[]) {
        if (board[0]=='〇'&&board[1]=='〇'&&board[2]=='〇'||
            board[3]=='〇'&&board[4]=='〇'&&board[5]=='〇'||
            board[6]=='〇'&&board[7]=='〇'&&board[8]=='〇'||
            board[0]=='〇'&&board[4]=='〇'&&board[8]=='〇'||
            board[2]=='〇'&&board[4]=='〇'&&board[6]=='〇'||
            board[0]=='〇'&&board[3]=='〇'&&board[6]=='〇'||
            board[1]=='〇'&&board[4]=='〇'&&board[7]=='〇'||
            board[2]=='〇'&&board[5]=='〇'&&board[8]=='〇')
                
        return true;
            
        if (board[0]=='×'&& board[1]=='×'&&board[2]=='×'||
            board[3]=='×'&&board[4]=='×'&&board[5]=='×'||
            board[6]=='×'&&board[7]=='×'&&board[8]=='×'||
            board[0]=='×'&& board[4]=='×'&&board[8]=='×'||
            board[2]=='×'&& board[4]=='×'&&board[6]=='×'||
            board[0]=='×'&&board[3]=='×'&&board[6]=='×'||
            board[1]=='×'&&board[4]=='×'&&board[7]=='×'||
            board[2]=='×'&&board[5]=='×'&&board[8]=='×')

            return true;
            
            else {
            
            for (int i=0;i<9;i++) {
                if (board[i]=='□') {
                
                return false;
            }
            
            }return true;
        
            }
            
            }

    public static void 結果表示(char[] board) {
        if (board[0]=='〇'&&board[1]=='〇'&&board[2]=='〇'||
            board[3]=='〇'&&board[4]=='〇'&&board[5]=='〇'||
            board[6]=='〇'&&board[7]=='〇'&&board[8]=='〇'||
            board[0]=='〇'&&board[4]=='〇'&&board[8]=='〇'||
            board[2]=='〇'&&board[4]=='〇'&&board[6]=='〇'||
            board[0]=='〇'&&board[3]=='〇'&&board[6]=='〇'||
            board[1]=='〇'&&board[4]=='〇'&&board[7]=='〇'||
            board[2]=='〇'&&board[5]=='〇'&&board[8]=='〇') {
            System.out.println();
            System.out.println("〇の勝ちです");
            }
                        
        else if (board[0]=='×'&&board[1]=='×'&&board[2]=='×'||
                board[3]=='×'&&board[4]=='×'&&board[5]=='×'||
                board[6]=='×'&&board[7]=='×'&&board[8]=='×'||
                board[0]=='×'&&board[4]=='×'&&board[8]=='×'||
                board[2]=='×'&&board[4]=='×'&&board[6]=='×'||
                board[0]=='×'&&board[3]=='×'&&board[6]=='×'||
                board[1]=='×'&&board[4]=='×'&&board[7]=='×'||
                board[2]=='×'&&board[5]=='×'&&board[8]=='×') {
                System.out.println();
                System.out.println("×の勝ちです");
                }
                        
        else {
            System.out.println();
            System.out.println("引き分けです");    
            }
                        
            System.out.println();
            戦況を表示(board);
            }
    public static char[] ゲームを実行(char[] board,String 先攻) throws IOException{

        int i=1;
                            
        if (先攻.equals("マル")) {
        
        
            while(i>0){
                            
                board=マルを書く(board);
                            
                if(判定(board)==true) break;
                            
                        バツを書く(board);
                            
                    if(判定(board)==true) break;
        
                }
                }
        else {
                            
            while (i>0) {
                            
                バツを書く(board);
                            
                if(判定(board)==true) break;
                            
                    マルを書く(board);
                            
                    if(判定(board)==true) break;
                            
                }
                            
                }return board;
                            
            } 





    
}
    