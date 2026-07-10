package ch.brix.gql.client.frontify.builders;

public class RootMutation_replaceAssetVariant extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ReplaceAssetVariant> {
  public RootMutation_replaceAssetVariant() {
    super(new ch.brix.gql.client.Call<>("replaceAssetVariant", "ReplaceAssetVariant"));
  }
  public RootMutation_replaceAssetVariant args(RootMutation_replaceAssetVariant_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_replaceAssetVariant onReplaceAssetVariant(On_ReplaceAssetVariant typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
