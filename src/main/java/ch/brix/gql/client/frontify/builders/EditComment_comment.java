package ch.brix.gql.client.frontify.builders;

public class EditComment_comment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Comment> {
  public EditComment_comment() {
    super(new ch.brix.gql.client.Call<>("comment", "Comment"));
  }
  public EditComment_comment onAssetComment(On_AssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public EditComment_comment onAssetCommentReply(On_AssetCommentReply typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public EditComment_comment onComment(On_Comment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
