package ch.brix.gql.client.frontify.builders;

public class Document_relatedAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Document_relatedAssets() {
    super(new ch.brix.gql.client.Call<>("relatedAssets", "AssetItems"));
  }
  public Document_relatedAssets args(Document_relatedAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Document_relatedAssets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
