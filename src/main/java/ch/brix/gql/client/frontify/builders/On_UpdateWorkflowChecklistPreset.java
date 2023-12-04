package ch.brix.gql.client.frontify.builders;

public class On_UpdateWorkflowChecklistPreset extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateWorkflowChecklistPreset() {
    super(new ch.brix.gql.client.On("UpdateWorkflowChecklistPreset"));
  }
  /**
   * **BETA** The updated `ChecklistPreset`.
   */
  public On_UpdateWorkflowChecklistPreset checklistPreset(UpdateWorkflowChecklistPreset_checklistPreset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
