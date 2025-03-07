package ch.brix.gql.client.frontify.builders;

public class IconLibrary_browse extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryRootFolder> {
  public IconLibrary_browse() {
    super(new ch.brix.gql.client.Call<>("browse", "LibraryRootFolder"));
  }
  public IconLibrary_browse onLibraryRootFolder(On_LibraryRootFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
