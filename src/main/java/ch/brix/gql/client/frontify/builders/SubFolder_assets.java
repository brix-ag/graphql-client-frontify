package ch.brix.gql.client.frontify.builders;

public class SubFolder_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public SubFolder_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public SubFolder_assets args(SubFolder_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public SubFolder_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
