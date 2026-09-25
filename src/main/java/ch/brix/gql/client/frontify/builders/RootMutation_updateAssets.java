package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateAssets> {
  public RootMutation_updateAssets() {
    super(new ch.brix.gql.client.Call<>("updateAssets", "UpdateAssets"));
  }
  public RootMutation_updateAssets args(RootMutation_updateAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateAssets onUpdateAssets(On_UpdateAssets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
