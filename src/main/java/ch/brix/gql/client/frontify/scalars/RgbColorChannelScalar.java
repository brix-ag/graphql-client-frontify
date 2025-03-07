package ch.brix.gql.client.frontify.scalars;

/**
 * The `RgbColorChannel` scalar represents an integer value between 0 and 255 (both inclusive).
 */
public class RgbColorChannelScalar extends ch.brix.gql.client.Scalar {
  private RgbColorChannelScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static RgbColorChannelScalar of(java.lang.Object value) {
    return value == null ? null : new RgbColorChannelScalar(value.toString());
  }
}
