package ch.brix.gql.client.frontify.scalars;

/**
 * The `Boolean` scalar type represents `true` or `false`.
 */
public class BooleanScalar extends ch.brix.gql.client.Scalar {
  private BooleanScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static BooleanScalar of(java.lang.Object value) {
    return value == null ? null : new BooleanScalar(value.toString());
  }
}
