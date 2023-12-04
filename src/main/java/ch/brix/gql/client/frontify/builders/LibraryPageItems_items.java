package ch.brix.gql.client.frontify.builders;

public class LibraryPageItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.LibraryPage>> {
  public LibraryPageItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "LibraryPage"));
  }
  public LibraryPageItems_items onLibraryPage(On_LibraryPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
