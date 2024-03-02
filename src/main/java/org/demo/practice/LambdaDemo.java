package org.demo.practice;

import java.util.stream.Stream;

public class LambdaDemo {

    public static void main(String ...args) {
        LambdaDemo ld = new LambdaDemo();
        Integer[] myIntegers = {20, 10, -40, 80, 30};
        Integer sum = ld.getInteger(myIntegers);

        System.out.println(sum);
    }

    public Integer getInteger(Integer[] myIntegers) {
        return Stream.of(myIntegers)
                .reduce(0, Integer::sum);
//                .reduce(0, (a, b) -> a + b); // same as above
    }

}
