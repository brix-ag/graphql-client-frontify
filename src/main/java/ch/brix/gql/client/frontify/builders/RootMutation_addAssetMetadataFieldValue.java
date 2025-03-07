package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetMetadataFieldValue extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddAssetMetadataFieldValue> {
  public RootMutation_addAssetMetadataFieldValue() {
    super(new ch.brix.gql.client.Call<>("addAssetMetadataFieldValue", "AddAssetMetadataFieldValue"));
  }
  public RootMutation_addAssetMetadataFieldValue args(RootMutation_addAssetMetadataFieldValue_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addAssetMetadataFieldValue onAddAssetMetadataFieldValue(On_AddAssetMetadataFieldValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
