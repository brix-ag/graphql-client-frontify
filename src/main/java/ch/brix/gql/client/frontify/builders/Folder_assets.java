package ch.brix.gql.client.frontify.builders;

public class Folder_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Folder_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public Folder_assets args(Folder_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Folder_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
