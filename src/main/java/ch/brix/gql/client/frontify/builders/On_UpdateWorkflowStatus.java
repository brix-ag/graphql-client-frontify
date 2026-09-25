package ch.brix.gql.client.frontify.builders;

public class On_UpdateWorkflowStatus extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateWorkflowStatus() {
    super(new ch.brix.gql.client.On("UpdateWorkflowStatus"));
  }
  /**
   * **BETA** The updated `WorkflowStatus`.
   */
  public On_UpdateWorkflowStatus workflowStatus(UpdateWorkflowStatus_workflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
