package ch.brix.gql.client.frontify.builders;

public class WorkflowTask_status extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowStatus> {
  public WorkflowTask_status() {
    super(new ch.brix.gql.client.Call<>("status", "WorkflowStatus"));
  }
  public WorkflowTask_status onWorkflowStatus(On_WorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
