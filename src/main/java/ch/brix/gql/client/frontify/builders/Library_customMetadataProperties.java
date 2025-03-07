package ch.brix.gql.client.frontify.builders;

public class Library_customMetadataProperties extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataProperty>> {
  public Library_customMetadataProperties() {
    super(new ch.brix.gql.client.Call<>("customMetadataProperties", "CustomMetadataProperty"));
  }
  public Library_customMetadataProperties onCustomMetadataProperty(On_CustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
