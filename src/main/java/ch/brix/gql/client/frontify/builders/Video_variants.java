package ch.brix.gql.client.frontify.builders;

public class Video_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public Video_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public Video_variants args(Video_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Video_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
