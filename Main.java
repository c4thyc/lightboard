public class Main {
    public static void main (String[] args) {
        boolean[][] one = {
        {true, true, false, true, true},
        {true, false, false, true, false},
        {true, false, false, true, true},
        {true, false, false, false, true},
        {true, false, false, false, true},
        {true, true, false, true, true},
        {false, false, false, false, false}
        };

        LightBoard a = new LightBoard(one);

        System.out.println(a.evaluateLight(0, 3));
        System.out.println(a.evaluateLight(6, 0));
        System.out.println(a.evaluateLight(4, 1));
        System.out.println(a.evaluateLight(5, 4));
    }
}