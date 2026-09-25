package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_searchAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult> {
  public DocumentLibrary_searchAssets() {
    super(new ch.brix.gql.client.Call<>("searchAssets", "LibrarySearchAssetsResult"));
  }
  public DocumentLibrary_searchAssets args(DocumentLibrary_searchAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public DocumentLibrary_searchAssets onLibrarySearchAssetsResult(On_LibrarySearchAssetsResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
