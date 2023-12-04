package ch.brix.gql.client.frontify.builders;

public class LibraryPage_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryPageAssetItems> {
  public LibraryPage_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "LibraryPageAssetItems"));
  }
  public LibraryPage_assets args(LibraryPage_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryPage_assets onLibraryPageAssetItems(On_LibraryPageAssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
