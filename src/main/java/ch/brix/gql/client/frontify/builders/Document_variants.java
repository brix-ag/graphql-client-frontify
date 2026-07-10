package ch.brix.gql.client.frontify.builders;

public class Document_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public Document_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public Document_variants args(Document_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Document_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
