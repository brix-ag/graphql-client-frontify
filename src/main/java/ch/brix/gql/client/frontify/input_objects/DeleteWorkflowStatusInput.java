package ch.brix.gql.client.frontify.input_objects;

public class DeleteWorkflowStatusInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Id of the `WorkflowStatus` to be deleted.
   */
  public DeleteWorkflowStatusInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
