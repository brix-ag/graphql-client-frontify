package ch.brix.gql.client.frontify.builders;

public class File_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public File_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public File_revisions args(File_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public File_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
