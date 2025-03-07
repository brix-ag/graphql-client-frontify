package ch.brix.gql.client.frontify.builders;

public class On_DateTimeRange extends ch.brix.gql.client.TypeBuilder {
  public On_DateTimeRange() {
    super(new ch.brix.gql.client.On("DateTimeRange"));
  }
  /**
   * Start `DateTime` of the range.
   */
  public On_DateTimeRange from() {
    _add_field("from");
    return this;
  }
  /**
   * End `DateTime` of the range.
   */
  public On_DateTimeRange to() {
    _add_field("to");
    return this;
  }
}
