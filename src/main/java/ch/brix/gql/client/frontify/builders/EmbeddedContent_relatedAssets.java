package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public EmbeddedContent_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public EmbeddedContent_relatedAssets args(EmbeddedContent_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public EmbeddedContent_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
