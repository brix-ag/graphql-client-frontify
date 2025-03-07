package ch.brix.gql.client.frontify.builders;

public class WorkspaceCollaborators_users extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkspaceCollaboratorUserItems> {
  public WorkspaceCollaborators_users() {
    super(new ch.brix.gql.client.Call<>("users", "WorkspaceCollaboratorUserItems"));
  }
  public WorkspaceCollaborators_users args(WorkspaceCollaborators_users_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public WorkspaceCollaborators_users onWorkspaceCollaboratorUserItems(On_WorkspaceCollaboratorUserItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
