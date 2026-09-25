package ch.brix.gql.client.frontify.builders;

public class On_AddWorkflowChecklistPreset extends ch.brix.gql.client.TypeBuilder {
  public On_AddWorkflowChecklistPreset() {
    super(new ch.brix.gql.client.On("AddWorkflowChecklistPreset"));
  }
  /**
   * **BETA** The created `WorkflowChecklistPreset`.
   */
  public On_AddWorkflowChecklistPreset checklistPreset(AddWorkflowChecklistPreset_checklistPreset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
