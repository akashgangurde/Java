package com.aakash;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTestParameterized {

    private static Utilities util;

    @BeforeAll
    static void setup() {
        util = new Utilities();
    }

    static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of("ABCDEFF", "ABCDEF"),
                Arguments.of("AB88EFFG", "AB8EFG"),
                Arguments.of("112233445566", "123456"),
                Arguments.of("ZYZQQB", "ZYZQB"),
                Arguments.of("A", "A")
        );
    }

    @ParameterizedTest
    @MethodSource("testConditions")
    void removePairs(String input, String output) {
        assertEquals(output, util.removePairs(input));
    }
}
