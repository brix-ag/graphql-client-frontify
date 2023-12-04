package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_metadataFields extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.MetadataField>> {
  public DocumentLibrary_metadataFields() {
    super(new ch.brix.gql.client.Call<>("metadataFields", "MetadataField"));
  }
  public DocumentLibrary_metadataFields onMetadataField(On_MetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
