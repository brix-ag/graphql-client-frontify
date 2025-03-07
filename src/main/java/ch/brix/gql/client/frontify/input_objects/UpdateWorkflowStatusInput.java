package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowStatusInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowStatus` Id.
   */
  public UpdateWorkflowStatusInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** `WorkflowStatus` data.
   */
  public UpdateWorkflowStatusInput data(ch.brix.gql.client.frontify.input_objects.UpdateWorkflowStatusDataInput v) {
    values.put("data", v);
    return this;
  }
}
