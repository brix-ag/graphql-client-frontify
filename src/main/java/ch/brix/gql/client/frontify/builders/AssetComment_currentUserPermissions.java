package ch.brix.gql.client.frontify.builders;

public class AssetComment_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentUserPermissions> {
  public AssetComment_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "AssetCommentUserPermissions"));
  }
  public AssetComment_currentUserPermissions onAssetCommentUserPermissions(On_AssetCommentUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
