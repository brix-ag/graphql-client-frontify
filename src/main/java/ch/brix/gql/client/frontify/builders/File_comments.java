package ch.brix.gql.client.frontify.builders;

public class File_comments extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetCommentItems> {
  public File_comments() {
    super(new ch.brix.gql.client.Call<>("comments", "AssetCommentItems"));
  }
  public File_comments args(File_comments_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public File_comments onAssetCommentItems(On_AssetCommentItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
