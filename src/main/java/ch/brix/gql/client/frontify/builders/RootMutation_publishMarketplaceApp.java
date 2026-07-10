package ch.brix.gql.client.frontify.builders;

public class RootMutation_publishMarketplaceApp extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.PublishMarketplaceApp> {
  public RootMutation_publishMarketplaceApp() {
    super(new ch.brix.gql.client.Call<>("publishMarketplaceApp", "PublishMarketplaceApp"));
  }
  public RootMutation_publishMarketplaceApp args(RootMutation_publishMarketplaceApp_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_publishMarketplaceApp onPublishMarketplaceApp(On_PublishMarketplaceApp typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
