package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String str = "Rupesh";
        str.concat(" Shende"); // str is considered as 0 then so Result of 'String. concat()' is ignored
        System.out.println(str);
        System.out.println("------------------------------------------------------");
        String str1 = "Taksh";
        str1  = str1.concat(" Shende");
        System.out.println(str1);

        System.out.println("---- Using orElse evaluate fallback value" +
                "---- PrintDefault() called fist then opt value displayed|------");

        Optional<String> opt = Optional.of("Good Morning");
        String res2 = opt.orElse(printDefault());
        System.out.println(res2);
        System.out.println("---- " +
                "Using orElseGet : avoid unnecessory computations and evaluate " +
                "when value is missing----------------");

        String res1 = opt.orElseGet(()->printDefault());
        System.out.println(res1); // Value is not missing so o/p = Good Morning

        System.out.println("------------------------------------------------------");

    }

    public static String printDefault() {
        System.out.println("Good Afternoon");
        return "Welcome";
    }
}