package ch.brix.gql.client.frontify.builders;

public class MediaLibrary_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public MediaLibrary_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public MediaLibrary_assets args(MediaLibrary_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public MediaLibrary_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
