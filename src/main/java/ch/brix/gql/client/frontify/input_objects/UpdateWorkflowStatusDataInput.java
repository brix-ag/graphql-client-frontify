package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowStatusDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowStatus` title.
   */
  public UpdateWorkflowStatusDataInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** `WorkflowStatus` color.
   */
  public UpdateWorkflowStatusDataInput color(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("color", v);
    return this;
  }
}
