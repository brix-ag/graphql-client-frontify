package ch.brix.gql.client.frontify.input_objects;

public class RemoveWorkflowChecklistPresetInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The Id of the `WorkflowChecklistPreset` to remove.
   */
  public RemoveWorkflowChecklistPresetInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
