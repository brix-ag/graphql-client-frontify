package ch.brix.gql.client.frontify.builders;

public class On_CreateWorkspaceProject extends ch.brix.gql.client.TypeBuilder {
  public On_CreateWorkspaceProject() {
    super(new ch.brix.gql.client.On("CreateWorkspaceProject"));
  }
  /**
   * `WorkspaceProject` details.
   */
  public On_CreateWorkspaceProject project(CreateWorkspaceProject_project callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
