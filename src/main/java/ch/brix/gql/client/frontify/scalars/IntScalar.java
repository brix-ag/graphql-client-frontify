package ch.brix.gql.client.frontify.scalars;

/**
 * The `Int` scalar type represents non-fractional signed whole numeric<br>values. Int can represent values between -(2^31) and 2^31 - 1.
 */
public class IntScalar extends ch.brix.gql.client.Scalar {
  private IntScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static IntScalar of(java.lang.Object value) {
    return value == null ? null : new IntScalar(value.toString());
  }
}
