package h12;

import java.lang.reflect.Method;

import static java.util.Arrays.stream;

public class AnnotationHelper {

    public void printAnnotations(Class<?> c) {
        stream(c.getDeclaredAnnotations()).forEach(System.out::println);
        stream(c.getMethods()).forEach((Method m) -> {
            stream(m.getAnnotations()).forEach(System.out::println);
        });
    }
}
