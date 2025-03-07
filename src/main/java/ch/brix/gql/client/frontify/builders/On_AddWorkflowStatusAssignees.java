package ch.brix.gql.client.frontify.builders;

public class On_AddWorkflowStatusAssignees extends ch.brix.gql.client.TypeBuilder {
  public On_AddWorkflowStatusAssignees() {
    super(new ch.brix.gql.client.On("AddWorkflowStatusAssignees"));
  }
  /**
   * **BETA** The updated `WorkflowStatus`.
   */
  public On_AddWorkflowStatusAssignees workflowStatus(AddWorkflowStatusAssignees_workflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
