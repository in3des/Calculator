package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int anew, bnew;
//        String fin_res_conv = null;

        System.out.println("Input:");

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        String[] arr1 = input1.split(" ");
        if (arr1.length != 3) {
            System.err.println("Invalid data entered. (Example \"A + B\")");
            return;
        }

        String atype = CheckInput.getNumType(arr1[0]);
//        System.out.println("type A = " + atype);

        String btype = CheckInput.getNumType(arr1[2]);
//        System.out.println("type B = " + btype);

        if (atype.equals("abrakadabra") || btype.equals("abrakadabra")) {
            System.err.println("Values of invalid type entered.");
            return;
        }

        if (atype.equals(btype)) {}
        else {
            System.err.println("Values of different types entered.");
            return;
        }

        String mathtype = CheckInput.getNumType(arr1[1]);
//        System.out.println("math type = " + mathtype);

        if (mathtype.equals("abrakadabra")) {
            System.err.println("Unsupported math operand entered.");
            return;
        }

        if (atype.equals("roman")) {
            Rimm2 aconv = Rimm2.valueOf(arr1[0]);
            Rimm2 bconv = Rimm2.valueOf(arr1[2]);
            anew = aconv.getTranslation();
            bnew = bconv.getTranslation();
        }
        else {
            anew = Integer.parseInt(arr1[0]);
            bnew = Integer.parseInt(arr1[2]);
        }

//        System.out.println(arr1[0] + " --> " + anew);
//        System.out.println(arr1[2] + " --> " + bnew);

//        if (arr1[1].equals("/") && ((anew % bnew) != 0)) {
//            System.err.println("The result is out of supported values (integer expected).");
//            return;
//        }

        if (atype.equals("roman") && arr1[1].equals("-") && ((anew - bnew) < 1)) {
            System.err.println("The result is out of supported values (positive integer expected).");
            return;
        }

        int fin_res = Math1.calculateTwo(anew, arr1[1], bnew);

        if (atype.equals("roman")) {
            if (fin_res<10) {
                String fin_res_conv = Arabic9.convertNine(fin_res);
                System.out.println("Output: \n" + fin_res_conv);
                return;
            }
            else {
                int big_res = fin_res / 10;
                int part_res = fin_res % 10;
                String fin_res_conv = Arabic100.convertHundred(big_res*10) + Arabic9.convertNine(part_res);
//                System.out.println(big_res);
//                System.out.println(part_res);
                System.out.println("Output: \n" + fin_res_conv);
                return;
            }
        }



        System.out.println("Output: \n" + fin_res);
//        System.out.println(fin_res_conv);




//        System.out.println("array size = " + arr1.length);

//        System.out.println("string entered - " + input1);



    }
}
