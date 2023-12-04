package ch.brix.gql.client.frontify.builders;

public class File_customMetadata extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadata>> {
  public File_customMetadata() {
    super(new ch.brix.gql.client.Call<>("customMetadata", "CustomMetadata"));
  }
  public File_customMetadata onCustomMetadataValue(On_CustomMetadataValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public File_customMetadata onCustomMetadataValues(On_CustomMetadataValues typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public File_customMetadata onCustomMetadata(On_CustomMetadata typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
