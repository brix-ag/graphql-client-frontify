package ch.brix.gql.client.frontify.builders;

public class RemoveWorkflowStatusAssignees_workflowStatus extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowStatus> {
  public RemoveWorkflowStatusAssignees_workflowStatus() {
    super(new ch.brix.gql.client.Call<>("workflowStatus", "WorkflowStatus"));
  }
  public RemoveWorkflowStatusAssignees_workflowStatus onWorkflowStatus(On_WorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
