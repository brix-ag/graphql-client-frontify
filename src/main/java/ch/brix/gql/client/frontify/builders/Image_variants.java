package ch.brix.gql.client.frontify.builders;

public class Image_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public Image_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public Image_variants args(Image_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Image_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
