package ch.brix.gql.client.frontify.scalars;

/**
 * The `ID` scalar type represents a unique identifier, often used to<br>refetch an object or as key for a cache. The ID type appears in a JSON<br>response as a String; however, it is not intended to be human-readable.<br>When expected as an input type, any string (such as `"4"`) or integer<br>(such as `4`) input value will be accepted as an ID.
 */
public class IdScalar extends ch.brix.gql.client.Scalar {
  private IdScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static IdScalar of(java.lang.Object value) {
    return value == null ? null : new IdScalar(value.toString());
  }
}
