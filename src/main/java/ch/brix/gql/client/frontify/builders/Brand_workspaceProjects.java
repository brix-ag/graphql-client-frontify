package ch.brix.gql.client.frontify.builders;

public class Brand_workspaceProjects extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkspaceItems> {
  public Brand_workspaceProjects() {
    super(new ch.brix.gql.client.Call<>("workspaceProjects", "WorkspaceItems"));
  }
  public Brand_workspaceProjects args(Brand_workspaceProjects_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_workspaceProjects onWorkspaceItems(On_WorkspaceItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
