package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public EmbeddedContent_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public EmbeddedContent_variants args(EmbeddedContent_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public EmbeddedContent_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
