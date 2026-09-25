package ch.brix.gql.client.frontify.builders;

public class On_RemoveWorkflowChecklistPreset extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveWorkflowChecklistPreset() {
    super(new ch.brix.gql.client.On("RemoveWorkflowChecklistPreset"));
  }
  /**
   * **BETA** The deleted `WorkflowChecklistPreset`.
   */
  public On_RemoveWorkflowChecklistPreset checklistPreset(RemoveWorkflowChecklistPreset_checklistPreset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
