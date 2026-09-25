package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_searchAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult> {
  public LogoLibrary_searchAssets() {
    super(new ch.brix.gql.client.Call<>("searchAssets", "LibrarySearchAssetsResult"));
  }
  public LogoLibrary_searchAssets args(LogoLibrary_searchAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LogoLibrary_searchAssets onLibrarySearchAssetsResult(On_LibrarySearchAssetsResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
