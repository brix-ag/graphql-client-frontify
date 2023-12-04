package ch.brix.gql.client.frontify.builders;

public class CreateWorkspaceProject_project extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workspace> {
  public CreateWorkspaceProject_project() {
    super(new ch.brix.gql.client.Call<>("project", "Workspace"));
  }
  public CreateWorkspaceProject_project onWorkspace(On_Workspace typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
