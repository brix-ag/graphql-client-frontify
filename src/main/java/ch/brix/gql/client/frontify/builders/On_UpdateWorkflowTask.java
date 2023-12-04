package ch.brix.gql.client.frontify.builders;

public class On_UpdateWorkflowTask extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateWorkflowTask() {
    super(new ch.brix.gql.client.On("UpdateWorkflowTask"));
  }
  /**
   * **BETA** The updated `WorkflowTask`.
   */
  public On_UpdateWorkflowTask workflowTask(UpdateWorkflowTask_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
