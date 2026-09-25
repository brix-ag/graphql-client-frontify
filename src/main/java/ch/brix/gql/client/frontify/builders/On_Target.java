package ch.brix.gql.client.frontify.builders;

public class On_Target extends ch.brix.gql.client.TypeBuilder {
  public On_Target() {
    super(new ch.brix.gql.client.On("Target"));
  }
  /**
   * The unique identifier of the `Target`.
   */
  public On_Target id() {
    _add_field("id");
    return this;
  }
  /**
   * The name of the `Target`.
   */
  public On_Target name() {
    _add_field("name");
    return this;
  }
}
