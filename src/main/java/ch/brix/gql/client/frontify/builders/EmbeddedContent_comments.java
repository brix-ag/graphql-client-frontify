package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public EmbeddedContent_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public EmbeddedContent_comments args(EmbeddedContent_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public EmbeddedContent_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
