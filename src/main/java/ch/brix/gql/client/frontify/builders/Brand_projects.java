package ch.brix.gql.client.frontify.builders;

public class Brand_projects extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.unions.Project>> {
  public Brand_projects() {
    super(new ch.brix.gql.client.Call<>("projects", "Project"));
  }
  public Brand_projects args(Brand_projects_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_projects onMediaLibrary(On_MediaLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Brand_projects onIconLibrary(On_IconLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Brand_projects onLogoLibrary(On_LogoLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Brand_projects onDocumentLibrary(On_DocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Brand_projects onWorkspace(On_Workspace typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
