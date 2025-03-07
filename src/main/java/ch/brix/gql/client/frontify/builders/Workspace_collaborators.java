package ch.brix.gql.client.frontify.builders;

public class Workspace_collaborators extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkspaceCollaborators> {
  public Workspace_collaborators() {
    super(new ch.brix.gql.client.Call<>("collaborators", "WorkspaceCollaborators"));
  }
  public Workspace_collaborators onWorkspaceCollaborators(On_WorkspaceCollaborators typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
