package ch.brix.gql.client.frontify.builders;

public class DeleteMetadataField_metadataField extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MetadataField> {
  public DeleteMetadataField_metadataField() {
    super(new ch.brix.gql.client.Call<>("metadataField", "MetadataField"));
  }
  public DeleteMetadataField_metadataField onMetadataField(On_MetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
