package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public DocumentLibrary_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public DocumentLibrary_assets args(DocumentLibrary_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public DocumentLibrary_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
