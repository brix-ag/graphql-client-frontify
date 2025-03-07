package ch.brix.gql.client.frontify.builders;

public class Collection_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Collection_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public Collection_assets args(Collection_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Collection_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
