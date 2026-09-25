package ch.brix.gql.client.frontify.builders;

public class On_RemoveWorkflowTaskAssignees extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveWorkflowTaskAssignees() {
    super(new ch.brix.gql.client.On("RemoveWorkflowTaskAssignees"));
  }
  /**
   * **BETA** The updated `WorkflowTask`.
   */
  public On_RemoveWorkflowTaskAssignees workflowTask(RemoveWorkflowTaskAssignees_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
