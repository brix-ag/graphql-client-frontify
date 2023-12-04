package ch.brix.gql.client.frontify.builders;

public class Image_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public Image_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public Image_comments args(Image_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Image_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
