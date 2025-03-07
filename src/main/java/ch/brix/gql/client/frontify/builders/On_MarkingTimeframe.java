package ch.brix.gql.client.frontify.builders;

public class On_MarkingTimeframe extends ch.brix.gql.client.TypeBuilder {
  public On_MarkingTimeframe() {
    super(new ch.brix.gql.client.On("MarkingTimeframe"));
  }
  /**
   * The start of the `Marking` area in percentage of total video length.
   */
  public On_MarkingTimeframe start() {
    _add_field("start");
    return this;
  }
  /**
   * The end of the `Marking` area in percentage of total video length.
   */
  public On_MarkingTimeframe end() {
    _add_field("end");
    return this;
  }
}
