package ch.brix.gql.client.frontify.scalars;

/**
 * The `Any` scalar type represents any of the supported types: Null, Integer, Float, String, Boolean, Enum, Object and List.
 */
public class AnyScalar extends ch.brix.gql.client.Scalar {
  private AnyScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static AnyScalar of(java.lang.Object value) {
    return value == null ? null : new AnyScalar(value.toString());
  }
}
