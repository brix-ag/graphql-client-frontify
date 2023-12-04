package ch.brix.gql.client.frontify.builders;

public class LibraryItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Library>> {
  public LibraryItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Library"));
  }
  public LibraryItems_items onMediaLibrary(On_MediaLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryItems_items onIconLibrary(On_IconLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryItems_items onLogoLibrary(On_LogoLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryItems_items onDocumentLibrary(On_DocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryItems_items onLibrary(On_Library typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
