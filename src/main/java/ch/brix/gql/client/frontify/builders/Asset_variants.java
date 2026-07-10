package ch.brix.gql.client.frontify.builders;

public class Asset_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public Asset_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public Asset_variants args(Asset_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Asset_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
