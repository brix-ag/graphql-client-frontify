package ch.brix.gql.client.frontify.builders;

public class LibraryRootFolder_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public LibraryRootFolder_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public LibraryRootFolder_assets args(LibraryRootFolder_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryRootFolder_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
