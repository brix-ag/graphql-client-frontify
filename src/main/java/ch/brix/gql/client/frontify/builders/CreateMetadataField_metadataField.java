package ch.brix.gql.client.frontify.builders;

public class CreateMetadataField_metadataField extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MetadataField> {
  public CreateMetadataField_metadataField() {
    super(new ch.brix.gql.client.Call<>("metadataField", "MetadataField"));
  }
  public CreateMetadataField_metadataField onMetadataField(On_MetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
