package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_browse extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryRootFolder> {
  public DocumentLibrary_browse() {
    super(new ch.brix.gql.client.Call<>("browse", "LibraryRootFolder"));
  }
  public DocumentLibrary_browse onLibraryRootFolder(On_LibraryRootFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
