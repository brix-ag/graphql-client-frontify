package ch.brix.gql.client.frontify.builders;

public class Audio_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public Audio_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public Audio_comments args(Audio_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Audio_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
