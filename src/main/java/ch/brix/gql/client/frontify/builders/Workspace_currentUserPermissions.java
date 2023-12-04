package ch.brix.gql.client.frontify.builders;

public class Workspace_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkspaceUserPermissions> {
  public Workspace_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "WorkspaceUserPermissions"));
  }
  public Workspace_currentUserPermissions onWorkspaceUserPermissions(On_WorkspaceUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
