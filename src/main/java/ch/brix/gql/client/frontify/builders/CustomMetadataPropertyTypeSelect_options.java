package ch.brix.gql.client.frontify.builders;

public class CustomMetadataPropertyTypeSelect_options extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyOption>> {
  public CustomMetadataPropertyTypeSelect_options() {
    super(new ch.brix.gql.client.Call<>("options", "CustomMetadataPropertyOption"));
  }
  public CustomMetadataPropertyTypeSelect_options onCustomMetadataPropertyOption(On_CustomMetadataPropertyOption typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
