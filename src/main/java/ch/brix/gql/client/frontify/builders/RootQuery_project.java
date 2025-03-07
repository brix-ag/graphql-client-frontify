package ch.brix.gql.client.frontify.builders;

public class RootQuery_project extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.Project> {
  public RootQuery_project() {
    super(new ch.brix.gql.client.Call<>("project", "Project"));
  }
  public RootQuery_project args(RootQuery_project_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_project onMediaLibrary(On_MediaLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_project onIconLibrary(On_IconLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_project onLogoLibrary(On_LogoLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_project onDocumentLibrary(On_DocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_project onWorkspace(On_Workspace typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
