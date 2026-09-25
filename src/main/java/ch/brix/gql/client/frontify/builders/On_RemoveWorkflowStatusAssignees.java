package ch.brix.gql.client.frontify.builders;

public class On_RemoveWorkflowStatusAssignees extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveWorkflowStatusAssignees() {
    super(new ch.brix.gql.client.On("RemoveWorkflowStatusAssignees"));
  }
  /**
   * **BETA** The updated `WorkflowStatus`.
   */
  public On_RemoveWorkflowStatusAssignees workflowStatus(RemoveWorkflowStatusAssignees_workflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
