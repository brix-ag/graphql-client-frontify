package ch.brix.gql.client.frontify.builders;

public class On_CreateAssetWorkflowTask extends ch.brix.gql.client.TypeBuilder {
  public On_CreateAssetWorkflowTask() {
    super(new ch.brix.gql.client.On("CreateAssetWorkflowTask"));
  }
  /**
   * **BETA** The newly created `WorkflowTask`.
   */
  public On_CreateAssetWorkflowTask workflowTask(CreateAssetWorkflowTask_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
