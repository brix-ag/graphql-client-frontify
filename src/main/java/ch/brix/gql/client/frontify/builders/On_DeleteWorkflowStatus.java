package ch.brix.gql.client.frontify.builders;

public class On_DeleteWorkflowStatus extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteWorkflowStatus() {
    super(new ch.brix.gql.client.On("DeleteWorkflowStatus"));
  }
  /**
   * The Id of the deleted `WorkflowStatus`.
   */
  public On_DeleteWorkflowStatus id() {
    _add_field("id");
    return this;
  }
}
