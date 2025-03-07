package ch.brix.gql.client.frontify.builders;

public class Asset_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public Asset_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public Asset_comments args(Asset_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Asset_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
