package ch.brix.gql.client.frontify.builders;

public class On_RemoveWorkflowChecklistItem extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveWorkflowChecklistItem() {
    super(new ch.brix.gql.client.On("RemoveWorkflowChecklistItem"));
  }
  /**
   * **BETA** The deleted `WorkflowChecklistItem`.
   */
  public On_RemoveWorkflowChecklistItem checklistItem(RemoveWorkflowChecklistItem_checklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
