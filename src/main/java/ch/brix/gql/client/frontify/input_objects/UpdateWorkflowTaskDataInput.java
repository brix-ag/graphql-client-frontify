package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowTaskDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowTask` title.
   */
  public UpdateWorkflowTaskDataInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** `WorkflowTask` description.
   */
  public UpdateWorkflowTaskDataInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
}
