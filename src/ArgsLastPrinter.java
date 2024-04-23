
public class ArgsLastPrinter {
	public static void main(String[] args) {
	   if(args.length == 0) {  // 2. 要素数が0個かどうか？を確認する
		   System.out.println("なし"); // 3. 要素数が0個だったらメッセージ表示して終了
	   } else {// 4. 要素数が1個以上だったら最後の要素を表示する
		   System.out.println(args [args.length - 1]); 
	   }
	}
}
