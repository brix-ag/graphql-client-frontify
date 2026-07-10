package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAssetVariant extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateAssetVariant> {
  public RootMutation_createAssetVariant() {
    super(new ch.brix.gql.client.Call<>("createAssetVariant", "CreateAssetVariant"));
  }
  public RootMutation_createAssetVariant args(RootMutation_createAssetVariant_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createAssetVariant onCreateAssetVariant(On_CreateAssetVariant typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
