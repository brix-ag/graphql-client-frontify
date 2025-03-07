package ch.brix.gql.client.frontify.builders;

public class DeleteComment_comment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Comment> {
  public DeleteComment_comment() {
    super(new ch.brix.gql.client.Call<>("comment", "Comment"));
  }
  public DeleteComment_comment onAssetComment(On_AssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public DeleteComment_comment onAssetCommentReply(On_AssetCommentReply typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public DeleteComment_comment onComment(On_Comment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
