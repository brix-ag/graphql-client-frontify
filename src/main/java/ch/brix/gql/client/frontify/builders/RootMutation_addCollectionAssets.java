package ch.brix.gql.client.frontify.builders;

public class RootMutation_addCollectionAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddCollectionAssets> {
  public RootMutation_addCollectionAssets() {
    super(new ch.brix.gql.client.Call<>("addCollectionAssets", "AddCollectionAssets"));
  }
  public RootMutation_addCollectionAssets args(RootMutation_addCollectionAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addCollectionAssets onAddCollectionAssets(On_AddCollectionAssets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
