package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowChecklistPresetInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowChecklistPreset` Id.
   */
  public UpdateWorkflowChecklistPresetInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `WorkflowChecklistPreset` data.
   */
  public UpdateWorkflowChecklistPresetInput data(ch.brix.gql.client.frontify.input_objects.UpdateWorkflowChecklistPresetDataInput v) {
    values.put("data", v);
    return this;
  }
}
