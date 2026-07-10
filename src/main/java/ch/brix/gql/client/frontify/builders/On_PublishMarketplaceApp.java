package ch.brix.gql.client.frontify.builders;

public class On_PublishMarketplaceApp extends ch.brix.gql.client.TypeBuilder {
  public On_PublishMarketplaceApp() {
    super(new ch.brix.gql.client.On("PublishMarketplaceApp"));
  }
  /**
   * The ID of the published marketplace app.
   */
  public On_PublishMarketplaceApp id() {
    _add_field("id");
    return this;
  }
}
