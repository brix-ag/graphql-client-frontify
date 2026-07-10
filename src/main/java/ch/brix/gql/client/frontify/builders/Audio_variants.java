package ch.brix.gql.client.frontify.builders;

public class Audio_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public Audio_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public Audio_variants args(Audio_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Audio_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
