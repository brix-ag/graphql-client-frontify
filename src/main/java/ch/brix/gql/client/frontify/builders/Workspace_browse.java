package ch.brix.gql.client.frontify.builders;

public class Workspace_browse extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkspaceRootFolder> {
  public Workspace_browse() {
    super(new ch.brix.gql.client.Call<>("browse", "WorkspaceRootFolder"));
  }
  public Workspace_browse onWorkspaceRootFolder(On_WorkspaceRootFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
