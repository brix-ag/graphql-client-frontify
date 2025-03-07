package ch.brix.gql.client.frontify.builders;

public class RootQuery_workspaceProject extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workspace> {
  public RootQuery_workspaceProject() {
    super(new ch.brix.gql.client.Call<>("workspaceProject", "Workspace"));
  }
  public RootQuery_workspaceProject args(RootQuery_workspaceProject_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_workspaceProject onWorkspace(On_Workspace typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
