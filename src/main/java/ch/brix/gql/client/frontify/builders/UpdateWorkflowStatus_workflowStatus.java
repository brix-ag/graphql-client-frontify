package ch.brix.gql.client.frontify.builders;

public class UpdateWorkflowStatus_workflowStatus extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowStatus> {
  public UpdateWorkflowStatus_workflowStatus() {
    super(new ch.brix.gql.client.Call<>("workflowStatus", "WorkflowStatus"));
  }
  public UpdateWorkflowStatus_workflowStatus onWorkflowStatus(On_WorkflowStatus typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
