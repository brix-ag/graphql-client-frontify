package ch.brix.gql.client.frontify.builders;

public class LibraryPageCollection_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public LibraryPageCollection_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public LibraryPageCollection_assets args(LibraryPageCollection_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryPageCollection_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
