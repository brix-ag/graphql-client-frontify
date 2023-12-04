package ch.brix.gql.client.frontify.scalars;

/**
 * The `Url` scalar type represents absolute urls.
 */
public class UrlScalar extends ch.brix.gql.client.Scalar {
  private UrlScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static UrlScalar of(java.lang.Object value) {
    return value == null ? null : new UrlScalar(value.toString());
  }
}
