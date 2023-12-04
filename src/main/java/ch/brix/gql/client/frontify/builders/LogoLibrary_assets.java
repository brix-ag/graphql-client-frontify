package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public LogoLibrary_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public LogoLibrary_assets args(LogoLibrary_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LogoLibrary_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
