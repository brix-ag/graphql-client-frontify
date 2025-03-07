package ch.brix.gql.client.frontify.builders;

public class Video_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public Video_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public Video_comments args(Video_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Video_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
