import java.io.IOException;

import jp.ac.uryukyu.ie.e235706.sanmoku;

public class Main {

    public static void main(String[] args) throws IOException{
      
        sanmoku sanmoku = new sanmoku();
        sanmoku.名前を決める();
        sanmoku.盤面の説明();
        char board[]=sanmoku.ボードの初期化();
        String 先攻=sanmoku.順番を決める();
        board = sanmoku.ゲームを実行(board,先攻);
        sanmoku.結果表示(board);
        System.out.println("");
        sanmoku.おすすめの遊び();
    }
}