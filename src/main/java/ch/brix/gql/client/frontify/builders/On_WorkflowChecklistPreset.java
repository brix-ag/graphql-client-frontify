package ch.brix.gql.client.frontify.builders;

public class On_WorkflowChecklistPreset extends ch.brix.gql.client.TypeBuilder {
  public On_WorkflowChecklistPreset() {
    super(new ch.brix.gql.client.On("WorkflowChecklistPreset"));
  }
  /**
   * **BETA** `WorkflowChecklistPreset` Id.
   */
  public On_WorkflowChecklistPreset id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The content of the `WorkflowChecklistPreset`.
   */
  public On_WorkflowChecklistPreset content() {
    _add_field("content");
    return this;
  }
  /**
   * **BETA** The default assignee of the `WorkflowChecklistPreset`.
   */
  public On_WorkflowChecklistPreset assignedUser(WorkflowChecklistPreset_assignedUser callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
