package day63_fuctional_interface;
@FunctionalInterface
public interface DynamicInterface<T> {

    void test(T t); // T is generic type, t is parameter name
}
