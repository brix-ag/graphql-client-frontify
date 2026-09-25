package ch.brix.gql.client.frontify.builders;

public class On_UpdateWorkflowChecklistItem extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateWorkflowChecklistItem() {
    super(new ch.brix.gql.client.On("UpdateWorkflowChecklistItem"));
  }
  /**
   * **BETA** The updated `WorkflowChecklistItem`.
   */
  public On_UpdateWorkflowChecklistItem checklistItem(UpdateWorkflowChecklistItem_checklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
