package ch.brix.gql.client.frontify.input_objects;

public class RemoveWorkflowChecklistItemInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The Id of the `WorkflowChecklistItem` to remove.
   */
  public RemoveWorkflowChecklistItemInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
