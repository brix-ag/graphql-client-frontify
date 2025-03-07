package ch.brix.gql.client.frontify.builders;

public class Asset_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Asset_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public Asset_relatedAssets args(Asset_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Asset_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
