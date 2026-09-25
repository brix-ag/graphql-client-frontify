package ch.brix.gql.client.frontify.builders;

public class CustomMetadataPropertyPermissions_basic extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyBasicPermission>> {
  public CustomMetadataPropertyPermissions_basic() {
    super(new ch.brix.gql.client.Call<>("basic", "CustomMetadataPropertyBasicPermission"));
  }
  public CustomMetadataPropertyPermissions_basic onCustomMetadataPropertyBasicPermission(On_CustomMetadataPropertyBasicPermission typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
