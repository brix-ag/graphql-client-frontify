package ch.brix.gql.client.frontify.builders;

public class AssetCommentItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetComment>> {
  public AssetCommentItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "AssetComment"));
  }
  public AssetCommentItems_items onAssetComment(On_AssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
