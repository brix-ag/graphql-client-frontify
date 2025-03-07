package ch.brix.gql.client.frontify.builders;

public class AssetCommentReplyItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetCommentReply>> {
  public AssetCommentReplyItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "AssetCommentReply"));
  }
  public AssetCommentReplyItems_items onAssetCommentReply(On_AssetCommentReply typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
