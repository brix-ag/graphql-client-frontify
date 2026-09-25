package ch.brix.gql.client.frontify.builders;

public class On_DeleteServiceApp extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteServiceApp() {
    super(new ch.brix.gql.client.On("DeleteServiceApp"));
  }
  /**
   * **BETA** The ID of the removed ServiceApp
   */
  public On_DeleteServiceApp id() {
    _add_field("id");
    return this;
  }
}
