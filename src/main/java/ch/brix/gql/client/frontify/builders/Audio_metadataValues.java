package ch.brix.gql.client.frontify.builders;

public class Audio_metadataValues extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.MetadataValue>> {
  public Audio_metadataValues() {
    super(new ch.brix.gql.client.Call<>("metadataValues", "MetadataValue"));
  }
  public Audio_metadataValues onMetadataValue(On_MetadataValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
