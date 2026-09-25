package ch.brix.gql.client.frontify.scalars;

/**
 * The `JsonObject` scalar type represents a JSON object according to the ECMA-404 JSON data interchange syntax. Note, that it is not encoded as a string.
 */
public class JsonObjectScalar extends ch.brix.gql.client.Scalar {
  private JsonObjectScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static JsonObjectScalar of(java.lang.Object value) {
    return value == null ? null : new JsonObjectScalar(value.toString());
  }
}
