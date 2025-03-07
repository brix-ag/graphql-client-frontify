package ch.brix.gql.client.frontify.scalars;

/**
 * The `BigInt` scalar type represents big integers (2^63 signed).
 */
public class BigIntScalar extends ch.brix.gql.client.Scalar {
  private BigIntScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static BigIntScalar of(java.lang.Object value) {
    return value == null ? null : new BigIntScalar(value.toString());
  }
}
