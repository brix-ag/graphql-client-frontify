package ch.brix.gql.client.frontify.builders;

public class LibraryPage_collections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryPageCollectionItems> {
  public LibraryPage_collections() {
    super(new ch.brix.gql.client.Call<>("collections", "LibraryPageCollectionItems"));
  }
  public LibraryPage_collections args(LibraryPage_collections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryPage_collections onLibraryPageCollectionItems(On_LibraryPageCollectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
