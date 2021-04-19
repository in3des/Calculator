package Calculator;

public class Math1 {
    public static int calculateTwo(int aaa, String ccc, int bbb) {

        int result = 0;

        switch (ccc) {
            case "+":
                result = aaa + bbb;
                break;
            case "-":
                result = aaa - bbb;
                break;
            case "*":
                result = aaa * bbb;
                break;
            case "/":
                result = aaa / bbb;
                break;
        }

        return result;




    }
}
