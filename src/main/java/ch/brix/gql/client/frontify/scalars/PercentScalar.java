package ch.brix.gql.client.frontify.scalars;

/**
 * Represents an integer or a float value between `0` and `1`, corresponding to percentage values between 0% and 100% (both inclusive).
 */
public class PercentScalar extends ch.brix.gql.client.Scalar {
  private PercentScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static PercentScalar of(java.lang.Object value) {
    return value == null ? null : new PercentScalar(value.toString());
  }
}
