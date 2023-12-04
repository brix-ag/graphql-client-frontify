package ch.brix.gql.client.frontify.builders;

public class RemoveMetadataValue_metadataField extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MetadataField> {
  public RemoveMetadataValue_metadataField() {
    super(new ch.brix.gql.client.Call<>("metadataField", "MetadataField"));
  }
  public RemoveMetadataValue_metadataField onMetadataField(On_MetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
