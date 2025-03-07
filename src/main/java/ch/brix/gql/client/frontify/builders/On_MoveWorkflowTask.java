package ch.brix.gql.client.frontify.builders;

public class On_MoveWorkflowTask extends ch.brix.gql.client.TypeBuilder {
  public On_MoveWorkflowTask() {
    super(new ch.brix.gql.client.On("MoveWorkflowTask"));
  }
  /**
   * **BETA** The `WorkflowStatus` with the moved tasks.
   */
  public On_MoveWorkflowTask workflowStatus(MoveWorkflowTask_workflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
