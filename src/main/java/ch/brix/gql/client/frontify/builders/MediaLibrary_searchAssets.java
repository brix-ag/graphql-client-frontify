package ch.brix.gql.client.frontify.builders;

public class MediaLibrary_searchAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult> {
  public MediaLibrary_searchAssets() {
    super(new ch.brix.gql.client.Call<>("searchAssets", "LibrarySearchAssetsResult"));
  }
  public MediaLibrary_searchAssets args(MediaLibrary_searchAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public MediaLibrary_searchAssets onLibrarySearchAssetsResult(On_LibrarySearchAssetsResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
