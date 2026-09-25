package ch.brix.gql.client.frontify.input_objects;

public class CreateWorkflowStatusInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Workflow` Id where `WorkflowStatus` should be created.
   */
  public CreateWorkflowStatusInput workflowId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("workflowId", v);
    return this;
  }
  /**
   * **BETA** Title of the `WorkflowStatus`.
   */
  public CreateWorkflowStatusInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** Color of the `WorkflowStatus`.
   */
  public CreateWorkflowStatusInput color(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("color", v);
    return this;
  }
}
