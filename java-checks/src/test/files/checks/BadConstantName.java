class BadConstantName {

  static final long serialVersionUID = 42L;

  public static final int GOOD_CONSTANT = 0;
  public static final int bad_constant = 0;
  public static int static_field;
  public final int final_field = 0;

  enum Enum {
    GOOD_CONSTANT,
    bad_constant;
  }

  interface Interface {
    int GOOD_CONSTANT = 1,
        bad_constant = 2;
  }

  @interface AnnotationType {
    int GOOD_CONSTANT = 1,
        bad_constant = 2;
  }

}
