package ch.brix.gql.client.frontify.builders;

public class On_WorkspaceProjectCollaboratorUserEdge extends ch.brix.gql.client.TypeBuilder {
  public On_WorkspaceProjectCollaboratorUserEdge() {
    super(new ch.brix.gql.client.On("WorkspaceProjectCollaboratorUserEdge"));
  }
  /**
   * `User` that has the least required permissions to collaborate on a `WorkspaceProject`.
   */
  public On_WorkspaceProjectCollaboratorUserEdge node(WorkspaceProjectCollaboratorUserEdge_node callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `User` role in the `WorkspaceProject`.
   */
  public On_WorkspaceProjectCollaboratorUserEdge role() {
    _add_field("role");
    return this;
  }
}
