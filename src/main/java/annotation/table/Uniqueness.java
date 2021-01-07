package annotation.table;

/**
 * @Author ZhangGJ
 * @Date 2021/01/05 15:21
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
