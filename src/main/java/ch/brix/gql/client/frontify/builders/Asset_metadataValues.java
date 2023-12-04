package ch.brix.gql.client.frontify.builders;

public class Asset_metadataValues extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.MetadataValue>> {
  public Asset_metadataValues() {
    super(new ch.brix.gql.client.Call<>("metadataValues", "MetadataValue"));
  }
  public Asset_metadataValues onMetadataValue(On_MetadataValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
