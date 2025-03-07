package ch.brix.gql.client.frontify.input_objects;

public class DateTimeRangeInput extends ch.brix.gql.client.InputObject {
  /**
   * Start `DateTime` of the range.
   */
  public DateTimeRangeInput from(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("from", v);
    return this;
  }
  /**
   * End `DateTime` of the range.
   */
  public DateTimeRangeInput to(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("to", v);
    return this;
  }
}
