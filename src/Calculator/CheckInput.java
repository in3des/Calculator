package Calculator;

public class CheckInput {
    public static String getNumType (String iii) {

        String numType1 = "abrakadabra";

        String[] roman1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String[] arabic1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String[] math1 = {"+", "-", "*", "/"};


        if (iii == null) {
            return numType1;
        }

        for (String value : roman1) {
            if (iii.equals(value)) {
                numType1 = "roman";
            }
        }

        for (String s : arabic1) {
            if (iii.equals(s)) {
                numType1 = "arabic";
            }
        }

        for (String s : math1) {
            if (iii.equals(s)) {
                numType1 = "mathOK";
            }
        }


        return numType1;
    }


}
