package ch.brix.gql.client.frontify.builders;

public class AssetComment_replies extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentReplyItems> {
  public AssetComment_replies() {
    super(new ch.brix.gql.client.Call<>("replies", "AssetCommentReplyItems"));
  }
  public AssetComment_replies args(AssetComment_replies_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public AssetComment_replies onAssetCommentReplyItems(On_AssetCommentReplyItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
