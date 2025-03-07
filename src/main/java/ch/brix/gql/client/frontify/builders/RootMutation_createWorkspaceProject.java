package ch.brix.gql.client.frontify.builders;

public class RootMutation_createWorkspaceProject extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateWorkspaceProject> {
  public RootMutation_createWorkspaceProject() {
    super(new ch.brix.gql.client.Call<>("createWorkspaceProject", "CreateWorkspaceProject"));
  }
  public RootMutation_createWorkspaceProject args(RootMutation_createWorkspaceProject_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createWorkspaceProject onCreateWorkspaceProject(On_CreateWorkspaceProject typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
