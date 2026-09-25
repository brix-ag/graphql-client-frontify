package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowChecklistItemInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowChecklistItem` Id.
   */
  public UpdateWorkflowChecklistItemInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `WorkflowChecklistItem` data.
   */
  public UpdateWorkflowChecklistItemInput data(ch.brix.gql.client.frontify.input_objects.UpdateWorkflowChecklistItemDataInput v) {
    values.put("data", v);
    return this;
  }
}
