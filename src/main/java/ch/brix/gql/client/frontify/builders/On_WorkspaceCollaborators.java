package ch.brix.gql.client.frontify.builders;

public class On_WorkspaceCollaborators extends ch.brix.gql.client.TypeBuilder {
  public On_WorkspaceCollaborators() {
    super(new ch.brix.gql.client.On("WorkspaceCollaborators"));
  }
  /**
   * `WorkspaceCollaboratorUserItems` list.
   */
  public On_WorkspaceCollaborators users(WorkspaceCollaborators_users callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
