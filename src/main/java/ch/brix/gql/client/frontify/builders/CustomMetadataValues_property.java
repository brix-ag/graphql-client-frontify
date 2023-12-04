package ch.brix.gql.client.frontify.builders;

public class CustomMetadataValues_property extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CustomMetadataProperty> {
  public CustomMetadataValues_property() {
    super(new ch.brix.gql.client.Call<>("property", "CustomMetadataProperty"));
  }
  public CustomMetadataValues_property onCustomMetadataProperty(On_CustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
