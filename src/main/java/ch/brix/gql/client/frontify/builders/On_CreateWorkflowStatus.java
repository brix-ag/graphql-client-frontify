package ch.brix.gql.client.frontify.builders;

public class On_CreateWorkflowStatus extends ch.brix.gql.client.TypeBuilder {
  public On_CreateWorkflowStatus() {
    super(new ch.brix.gql.client.On("CreateWorkflowStatus"));
  }
  /**
   * **BETA** The newly created `WorkflowStatus`.
   */
  public On_CreateWorkflowStatus workflowStatus(CreateWorkflowStatus_workflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
