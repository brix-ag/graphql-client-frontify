package ch.brix.gql.client.frontify.builders;

public class On_CreativeExport extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeExport() {
    super(new ch.brix.gql.client.On("CreativeExport"));
  }
  /**
   * `CreativeJob` Id.
   */
  public On_CreativeExport id() {
    _add_field("id");
    return this;
  }
  /**
   * `CreativeJob` status.
   */
  public On_CreativeExport status() {
    _add_field("status");
    return this;
  }
  /**
   * Generated Creative.
   */
  public On_CreativeExport result(CreativeExport_result callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
