package ch.brix.gql.client.frontify.builders;

public class Document_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public Document_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public Document_comments args(Document_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Document_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
