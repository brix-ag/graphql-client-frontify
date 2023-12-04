package ch.brix.gql.client.frontify.builders;

public class Video_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Video_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public Video_relatedAssets args(Video_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Video_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
