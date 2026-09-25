package ch.brix.gql.client.frontify.builders;

public class IconLibrary_searchAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult> {
  public IconLibrary_searchAssets() {
    super(new ch.brix.gql.client.Call<>("searchAssets", "LibrarySearchAssetsResult"));
  }
  public IconLibrary_searchAssets args(IconLibrary_searchAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public IconLibrary_searchAssets onLibrarySearchAssetsResult(On_LibrarySearchAssetsResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
