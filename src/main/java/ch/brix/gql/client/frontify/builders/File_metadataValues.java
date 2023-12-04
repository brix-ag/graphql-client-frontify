package ch.brix.gql.client.frontify.builders;

public class File_metadataValues extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.MetadataValue>> {
  public File_metadataValues() {
    super(new ch.brix.gql.client.Call<>("metadataValues", "MetadataValue"));
  }
  public File_metadataValues onMetadataValue(On_MetadataValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
