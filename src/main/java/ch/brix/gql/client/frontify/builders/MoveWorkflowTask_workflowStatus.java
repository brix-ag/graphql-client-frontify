package ch.brix.gql.client.frontify.builders;

public class MoveWorkflowTask_workflowStatus extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowStatus> {
  public MoveWorkflowTask_workflowStatus() {
    super(new ch.brix.gql.client.Call<>("workflowStatus", "WorkflowStatus"));
  }
  public MoveWorkflowTask_workflowStatus onWorkflowStatus(On_WorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
