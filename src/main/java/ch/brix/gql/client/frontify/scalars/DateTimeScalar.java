package ch.brix.gql.client.frontify.scalars;

/**
 * The `DateTime` scalar type represents date and time data in RFC 3339 format with millisecond precision (i.e., 2001-12-31T22:10:30.000+00:00).
 */
public class DateTimeScalar extends ch.brix.gql.client.Scalar {
  private DateTimeScalar(String value) {
    super(value);
  }
  /**
   * @param value requires correct implementation of .toString() otherwise pass a String
   */
  public static DateTimeScalar of(java.lang.Object value) {
    return value == null ? null : new DateTimeScalar(value.toString());
  }
}
