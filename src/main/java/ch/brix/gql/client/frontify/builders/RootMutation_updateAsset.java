package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateAsset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateAsset> {
  public RootMutation_updateAsset() {
    super(new ch.brix.gql.client.Call<>("updateAsset", "UpdateAsset"));
  }
  public RootMutation_updateAsset args(RootMutation_updateAsset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateAsset onUpdateAsset(On_UpdateAsset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
