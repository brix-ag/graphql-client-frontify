package ch.brix.gql.client.frontify.builders;

public class Image_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Image_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public Image_relatedAssets args(Image_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Image_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
