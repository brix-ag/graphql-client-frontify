package ch.brix.gql.client.frontify.scalars;

/**
 * The `Float` scalar type represents signed double-precision fractional<br>values as specified by<br>[IEEE 754](http://en.wikipedia.org/wiki/IEEE_floating_point).
 */
public class FloatScalar extends ch.brix.gql.client.Scalar {
  private FloatScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static FloatScalar of(java.lang.Object value) {
    return value == null ? null : new FloatScalar(value.toString());
  }
}
