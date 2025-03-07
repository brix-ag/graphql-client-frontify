package ch.brix.gql.client.frontify.scalars;

/**
 * The `Email` scalar type represents email addresses.
 */
public class EmailScalar extends ch.brix.gql.client.Scalar {
  private EmailScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static EmailScalar of(java.lang.Object value) {
    return value == null ? null : new EmailScalar(value.toString());
  }
}
