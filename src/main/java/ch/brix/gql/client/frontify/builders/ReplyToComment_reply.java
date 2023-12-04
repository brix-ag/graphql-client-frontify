package ch.brix.gql.client.frontify.builders;

public class ReplyToComment_reply extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentReply> {
  public ReplyToComment_reply() {
    super(new ch.brix.gql.client.Call<>("reply", "AssetCommentReply"));
  }
  public ReplyToComment_reply onAssetCommentReply(On_AssetCommentReply typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
