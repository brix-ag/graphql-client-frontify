package ch.brix.gql.client.frontify.builders;

public class LibraryPageCollectionItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.LibraryPageCollection>> {
  public LibraryPageCollectionItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "LibraryPageCollection"));
  }
  public LibraryPageCollectionItems_items onLibraryPageCollection(On_LibraryPageCollection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
