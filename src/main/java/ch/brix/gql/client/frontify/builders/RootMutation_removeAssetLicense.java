package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeAssetLicense extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveAssetLicense> {
  public RootMutation_removeAssetLicense() {
    super(new ch.brix.gql.client.Call<>("removeAssetLicense", "RemoveAssetLicense"));
  }
  public RootMutation_removeAssetLicense args(RootMutation_removeAssetLicense_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeAssetLicense onRemoveAssetLicense(On_RemoveAssetLicense typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
