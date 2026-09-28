    // Port of Gen.js: single-precision truncation then a bit reinterpretation.
    public static Object float32ToInt32 = (java.util.function.Function<Object, Object>) (n) ->
        Float.floatToRawIntBits(((Number) n).floatValue());
