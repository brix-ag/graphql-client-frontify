package ch.brix.gql.client.frontify.builders;

public class IconLibrary_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public IconLibrary_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public IconLibrary_assets args(IconLibrary_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public IconLibrary_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
