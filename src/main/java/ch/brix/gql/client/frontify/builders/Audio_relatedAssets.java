package ch.brix.gql.client.frontify.builders;

public class Audio_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Audio_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public Audio_relatedAssets args(Audio_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Audio_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
