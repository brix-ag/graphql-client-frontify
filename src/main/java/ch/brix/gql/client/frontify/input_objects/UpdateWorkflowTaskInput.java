package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowTaskInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowTask` Id.
   */
  public UpdateWorkflowTaskInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `WorkflowTask` data.
   */
  public UpdateWorkflowTaskInput data(ch.brix.gql.client.frontify.input_objects.UpdateWorkflowTaskDataInput v) {
    values.put("data", v);
    return this;
  }
}
