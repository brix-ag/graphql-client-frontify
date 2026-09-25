package ch.brix.gql.client.frontify.builders;

public class On_DispatchAutomationAction extends ch.brix.gql.client.TypeBuilder {
  public On_DispatchAutomationAction() {
    super(new ch.brix.gql.client.On("DispatchAutomationAction"));
  }
  /**
   * **BETA** The dispatched automation action event id.
   */
  public On_DispatchAutomationAction id() {
    _add_field("id");
    return this;
  }
}
