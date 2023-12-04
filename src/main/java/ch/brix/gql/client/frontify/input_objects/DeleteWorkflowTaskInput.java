package ch.brix.gql.client.frontify.input_objects;

public class DeleteWorkflowTaskInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Id of the `WorkflowTask` to be deleted.
   */
  public DeleteWorkflowTaskInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
