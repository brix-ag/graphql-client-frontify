package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeCollectionAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveCollectionAssets> {
  public RootMutation_removeCollectionAssets() {
    super(new ch.brix.gql.client.Call<>("removeCollectionAssets", "RemoveCollectionAssets"));
  }
  public RootMutation_removeCollectionAssets args(RootMutation_removeCollectionAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeCollectionAssets onRemoveCollectionAssets(On_RemoveCollectionAssets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
