package ch.brix.gql.client.frontify.builders;

public class RemoveCustomMetadataPropertyOptions_customMetadataProperty extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CustomMetadataProperty> {
  public RemoveCustomMetadataPropertyOptions_customMetadataProperty() {
    super(new ch.brix.gql.client.Call<>("customMetadataProperty", "CustomMetadataProperty"));
  }
  public RemoveCustomMetadataPropertyOptions_customMetadataProperty onCustomMetadataProperty(On_CustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
