package ch.brix.gql.client.frontify.builders;

public class CustomMetadataPropertyPermissions_custom extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyCustomPermission>> {
  public CustomMetadataPropertyPermissions_custom() {
    super(new ch.brix.gql.client.Call<>("custom", "CustomMetadataPropertyCustomPermission"));
  }
  public CustomMetadataPropertyPermissions_custom onCustomMetadataPropertyCustomPermission(On_CustomMetadataPropertyCustomPermission typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
