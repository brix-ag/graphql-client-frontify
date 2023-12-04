package ch.brix.gql.client.frontify.builders;

public class AddAssetMetadataFieldValue_metadataField extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MetadataField> {
  public AddAssetMetadataFieldValue_metadataField() {
    super(new ch.brix.gql.client.Call<>("metadataField", "MetadataField"));
  }
  public AddAssetMetadataFieldValue_metadataField onMetadataField(On_MetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
