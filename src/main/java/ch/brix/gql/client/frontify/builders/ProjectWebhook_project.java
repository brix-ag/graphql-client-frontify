package ch.brix.gql.client.frontify.builders;

public class ProjectWebhook_project extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.Project> {
  public ProjectWebhook_project() {
    super(new ch.brix.gql.client.Call<>("project", "Project"));
  }
  public ProjectWebhook_project onMediaLibrary(On_MediaLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public ProjectWebhook_project onIconLibrary(On_IconLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public ProjectWebhook_project onLogoLibrary(On_LogoLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public ProjectWebhook_project onDocumentLibrary(On_DocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public ProjectWebhook_project onWorkspace(On_Workspace typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
