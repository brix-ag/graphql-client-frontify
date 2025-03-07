package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetUserPermissions> {
  public EmbeddedContent_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "AssetUserPermissions"));
  }
  public EmbeddedContent_currentUserPermissions onAssetUserPermissions(On_AssetUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
