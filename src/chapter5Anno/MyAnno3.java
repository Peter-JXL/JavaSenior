package chapter5Anno;
public @interface MyAnno3 {
  String name();
  int age() default 18;
  String[] strs();
}
