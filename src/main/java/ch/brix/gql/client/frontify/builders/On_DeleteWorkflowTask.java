package ch.brix.gql.client.frontify.builders;

public class On_DeleteWorkflowTask extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteWorkflowTask() {
    super(new ch.brix.gql.client.On("DeleteWorkflowTask"));
  }
  /**
   * The Id of the deleted `WorkflowTask`.
   */
  public On_DeleteWorkflowTask id() {
    _add_field("id");
    return this;
  }
}
