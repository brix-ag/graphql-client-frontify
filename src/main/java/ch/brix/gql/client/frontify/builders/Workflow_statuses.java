package ch.brix.gql.client.frontify.builders;

public class Workflow_statuses extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.WorkflowStatus>> {
  public Workflow_statuses() {
    super(new ch.brix.gql.client.Call<>("statuses", "WorkflowStatus"));
  }
  public Workflow_statuses onWorkflowStatus(On_WorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
