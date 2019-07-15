package thesixPag;

import java.util.function.BiFunction;

public class BiFuntionTest {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> temp = (af, bf) -> af.length() - bf.length();
    }
}
