package ch.brix.gql.client.frontify.builders;

public class File_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public File_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public File_relatedAssets args(File_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public File_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
