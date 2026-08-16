public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Type Casting: ");

        // Widening  → automatic → generally safe
        // Narrowing → casting   → possible data loss

        // ---------- EXPLICIT CASTING ------------
        // larger type -> smaller type
        double d = 10.5;
        int i = (int) d;

        System.out.println(i); // lost precision

        int x = 130;
        byte b = (byte) x;

        System.out.println(b); // result: -126

        // ---------- Type Promotion -------------
        byte num1 = 10;
        byte num2 = 20;

        // byte, short, char -> promoted to int during arithmetic
        int result1 = num1+num2; // ✅
        //  byte result2 = num1+num2; ❌

        // ----------- Conversion -------------
        // number -> string
        int n = 10;
        String s = String.valueOf(n);
        System.out.println(s); // 10

        // string -> number
        String S_NUM = "10";
        int num = Integer.parseInt(s);
        double db = Double.parseDouble("10.5");

        System.out.println("num: " + num);
        System.out.println("db: " + db);

    }
}
