package test.wrapper;

import java.lang.reflect.Field;

public class ClassMetaMain {

    public static void main(String[] args) {
        Class clazz = String.class;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }
    }
}
