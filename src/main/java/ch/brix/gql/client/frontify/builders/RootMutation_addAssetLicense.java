package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetLicense extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddAssetLicense> {
  public RootMutation_addAssetLicense() {
    super(new ch.brix.gql.client.Call<>("addAssetLicense", "AddAssetLicense"));
  }
  public RootMutation_addAssetLicense args(RootMutation_addAssetLicense_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addAssetLicense onAddAssetLicense(On_AddAssetLicense typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
