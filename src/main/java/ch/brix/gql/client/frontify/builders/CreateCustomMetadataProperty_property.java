package ch.brix.gql.client.frontify.builders;

public class CreateCustomMetadataProperty_property extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CustomMetadataProperty> {
  public CreateCustomMetadataProperty_property() {
    super(new ch.brix.gql.client.Call<>("property", "CustomMetadataProperty"));
  }
  public CreateCustomMetadataProperty_property onCustomMetadataProperty(On_CustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
