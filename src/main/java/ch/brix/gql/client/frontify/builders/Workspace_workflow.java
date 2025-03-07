package ch.brix.gql.client.frontify.builders;

public class Workspace_workflow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workflow> {
  public Workspace_workflow() {
    super(new ch.brix.gql.client.Call<>("workflow", "Workflow"));
  }
  public Workspace_workflow onWorkflow(On_Workflow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
