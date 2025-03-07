package ch.brix.gql.client.frontify.builders;

public class On_AddWorkflowTaskAssignees extends ch.brix.gql.client.TypeBuilder {
  public On_AddWorkflowTaskAssignees() {
    super(new ch.brix.gql.client.On("AddWorkflowTaskAssignees"));
  }
  /**
   * **BETA** The updated `WorkflowTask`.
   */
  public On_AddWorkflowTaskAssignees workflowTask(AddWorkflowTaskAssignees_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
