// String Builderを利用し文字列を1万回連結する
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("abcdefghijklmnopqrstuvwxyz");
        }
        String s = sb.toString();
        System.out.println(s);
    }
}