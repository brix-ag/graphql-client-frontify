package ch.brix.gql.client.frontify.builders;

public class On_AddWorkflowChecklistItem extends ch.brix.gql.client.TypeBuilder {
  public On_AddWorkflowChecklistItem() {
    super(new ch.brix.gql.client.On("AddWorkflowChecklistItem"));
  }
  /**
   * **BETA** The created `WorkflowChecklistItem`.
   */
  public On_AddWorkflowChecklistItem checklistItem(AddWorkflowChecklistItem_checklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
