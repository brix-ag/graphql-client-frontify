package ch.brix.gql.client.frontify.builders;

public class RootQuery_library extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Library> {
  public RootQuery_library() {
    super(new ch.brix.gql.client.Call<>("library", "Library"));
  }
  public RootQuery_library args(RootQuery_library_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_library onMediaLibrary(On_MediaLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_library onIconLibrary(On_IconLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_library onLogoLibrary(On_LogoLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_library onDocumentLibrary(On_DocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_library onLibrary(On_Library typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
