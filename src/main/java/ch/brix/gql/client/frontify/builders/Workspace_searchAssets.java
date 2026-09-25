package ch.brix.gql.client.frontify.builders;

public class Workspace_searchAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult> {
  public Workspace_searchAssets() {
    super(new ch.brix.gql.client.Call<>("searchAssets", "LibrarySearchAssetsResult"));
  }
  public Workspace_searchAssets args(Workspace_searchAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Workspace_searchAssets onLibrarySearchAssetsResult(On_LibrarySearchAssetsResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
