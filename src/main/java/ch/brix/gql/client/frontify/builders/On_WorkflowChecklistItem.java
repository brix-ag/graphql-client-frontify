package ch.brix.gql.client.frontify.builders;

public class On_WorkflowChecklistItem extends ch.brix.gql.client.TypeBuilder {
  public On_WorkflowChecklistItem() {
    super(new ch.brix.gql.client.On("WorkflowChecklistItem"));
  }
  /**
   * **BETA** `WorkflowChecklistItem` Id.
   */
  public On_WorkflowChecklistItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The content of the `WorkflowChecklistItem`.
   */
  public On_WorkflowChecklistItem content() {
    _add_field("content");
    return this;
  }
  /**
   * **BETA** The default assignee of the `WorkflowChecklistItem`.
   */
  public On_WorkflowChecklistItem assignedUser(WorkflowChecklistItem_assignedUser callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
