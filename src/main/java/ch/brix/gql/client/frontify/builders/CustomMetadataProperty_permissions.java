package ch.brix.gql.client.frontify.builders;

public class CustomMetadataProperty_permissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyPermissions> {
  public CustomMetadataProperty_permissions() {
    super(new ch.brix.gql.client.Call<>("permissions", "CustomMetadataPropertyPermissions"));
  }
  public CustomMetadataProperty_permissions onCustomMetadataPropertyPermissions(On_CustomMetadataPropertyPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
