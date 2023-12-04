package ch.brix.gql.client.frontify.builders;

public class Audio_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetUserPermissions> {
  public Audio_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "AssetUserPermissions"));
  }
  public Audio_currentUserPermissions onAssetUserPermissions(On_AssetUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
