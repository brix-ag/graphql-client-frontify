package ch.brix.gql.client.frontify.builders;

public class WorkspaceItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Workspace>> {
  public WorkspaceItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Workspace"));
  }
  public WorkspaceItems_items onWorkspace(On_Workspace typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
