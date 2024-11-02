package kadai_026;
//インスタンス化させる方　実行するがわ！！！！！！

import java.util.HashMap;
import java.util.Scanner;

public class JyankenExec_Chapter26 {

	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//じゃんけんを入れるための箱を作る
		Scanner choice = new Scanner(System.in);
		
		//r、s、pのいずれかを入力する
		String input = choice.next();
		
		//r、s、p以外が入力されたらエラーを返す		
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			choice.close();			//r、s、pであれば閉じる
			
		}else {
			System.out.println("じゃんけんの手ではありません。もう1度入力してください。");
			choice.next();			//r、s、p以外であればエラー文言を表示して閉じる
		}	
		return input;
	}
	

		//ここでじゃんけんをセットする？		
		public String getRandom() {
			String[] opponent = {"r", "s", "p"};

		//Math.random()を使って相手側のじゃんけんを出力する？ これだと5回行こなうようになる	ので要修正	
		//for (int i = 0 ; i < 5; i++){
		//	System.out.println(Math.random() * 5);　←Math.random()* opponent.length？
		//}
		//対戦相手のじゃんけんの手を選ぶ
		int Jankenn = (int) Math.floor(Math.random()* opponent.length);
			return opponent[Jankenn];
		}
		
		public void playGame(String me, String you) {
			HashMap<String,String> choice = new HashMap<String,String>();
		
			choice.put("r", "グー");
			choice.put("s", "チョキ");
			choice.put("p", "パー");
		
			//まとめられたので消す			
			//String me (String);
			//String you (String); 
		
			System.out.println("自分の手は" + choice.get(me) + ",対戦相手は" + choice.get(you));
			
			//負けを0、あいこを1、勝ちを2とする？→自分の記載しやすいように作る！
			//下の方法で記載する！！			
			//r && s,p && r,s && p の三パターンは勝ち
			//r && p,p && s,s && r の三パターンは負け
			//それ以外はあいこ（r && ,s && s,p && p）		

			//標準エラー出力（stderr）：エラーメッセージや診断メッセージを出力するためのチャンネル
			//System.err.println()を使ってエラーメッセージを出力
			//if,if,ifと並んでいたためelse ifでまとめる			
			//あいこ
			if(me.equals(you)) {
				System.err.println("あいこです");
			}else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))) {
				System.out.println("自分の勝ちです");			//自分が勝った場合
			}else if ((me.equals("r") && you.equals("p")) || (me.equals("s") && you.equals("r")) || (me.equals("p") && you.equals("s"))) {
				System.out.println("自分の負けです");			//自分が負けた場合
			}
		}
}
		
		