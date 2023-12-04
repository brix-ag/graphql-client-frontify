package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteAsset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteAsset> {
  public RootMutation_deleteAsset() {
    super(new ch.brix.gql.client.Call<>("deleteAsset", "DeleteAsset"));
  }
  public RootMutation_deleteAsset args(RootMutation_deleteAsset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteAsset onDeleteAsset(On_DeleteAsset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
