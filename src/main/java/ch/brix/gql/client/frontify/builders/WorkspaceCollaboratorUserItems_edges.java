package ch.brix.gql.client.frontify.builders;

public class WorkspaceCollaboratorUserItems_edges extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.WorkspaceProjectCollaboratorUserEdge>> {
  public WorkspaceCollaboratorUserItems_edges() {
    super(new ch.brix.gql.client.Call<>("edges", "WorkspaceProjectCollaboratorUserEdge"));
  }
  public WorkspaceCollaboratorUserItems_edges onWorkspaceProjectCollaboratorUserEdge(On_WorkspaceProjectCollaboratorUserEdge typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
