// 正当なプレイヤー名であるかを判定するメソッド
class Main {
    static boolean isValidPlayerName(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
    public static void main(String[] args){
        System.out.println(isValidPlayerName("A1234567"));
    }
}
