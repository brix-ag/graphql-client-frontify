package ch.brix.gql.client.frontify.builders;

public class Library_searchAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult> {
  public Library_searchAssets() {
    super(new ch.brix.gql.client.Call<>("searchAssets", "LibrarySearchAssetsResult"));
  }
  public Library_searchAssets args(Library_searchAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Library_searchAssets onLibrarySearchAssetsResult(On_LibrarySearchAssetsResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
