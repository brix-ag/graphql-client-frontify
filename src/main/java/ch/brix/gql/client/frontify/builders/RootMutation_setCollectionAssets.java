package ch.brix.gql.client.frontify.builders;

public class RootMutation_setCollectionAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SetCollectionAssets> {
  public RootMutation_setCollectionAssets() {
    super(new ch.brix.gql.client.Call<>("setCollectionAssets", "SetCollectionAssets"));
  }
  public RootMutation_setCollectionAssets args(RootMutation_setCollectionAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_setCollectionAssets onSetCollectionAssets(On_SetCollectionAssets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
