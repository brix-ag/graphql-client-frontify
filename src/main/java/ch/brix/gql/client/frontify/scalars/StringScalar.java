package ch.brix.gql.client.frontify.scalars;

/**
 * The `String` scalar type represents textual data, represented as UTF-8<br>character sequences. The String type is most often used by GraphQL to<br>represent free-form human-readable text.
 */
public class StringScalar extends ch.brix.gql.client.Scalar {
  private StringScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static StringScalar of(java.lang.Object value) {
    return value == null ? null : new StringScalar(value.toString());
  }
}
