package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_metadataValues extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.MetadataValue>> {
  public EmbeddedContent_metadataValues() {
    super(new ch.brix.gql.client.Call<>("metadataValues", "MetadataValue"));
  }
  public EmbeddedContent_metadataValues onMetadataValue(On_MetadataValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
