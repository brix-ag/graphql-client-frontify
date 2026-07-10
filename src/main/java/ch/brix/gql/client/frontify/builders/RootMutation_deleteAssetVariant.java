package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteAssetVariant extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteAssetVariant> {
  public RootMutation_deleteAssetVariant() {
    super(new ch.brix.gql.client.Call<>("deleteAssetVariant", "DeleteAssetVariant"));
  }
  public RootMutation_deleteAssetVariant args(RootMutation_deleteAssetVariant_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteAssetVariant onDeleteAssetVariant(On_DeleteAssetVariant typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
