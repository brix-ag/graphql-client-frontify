package ch.brix.gql.client.frontify.input_objects;

public class MoveWorkflowTaskInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The Id of the destination `WorkflowStatus`.
   */
  public MoveWorkflowTaskInput workflowStatusId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("workflowStatusId", v);
    return this;
  }
  /**
   * **BETA** List of `WorkflowTask` Ids to move. Limited to 100 Ids.
   */
  public MoveWorkflowTaskInput workflowTaskIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("workflowTaskIds", v);
    return this;
  }
  /**
   * **BETA** `WorkflowTask` enter message. Optionally required by a `EnterRule` of the given `WorkflowStatus`.
   */
  public MoveWorkflowTaskInput statusEnterMessage(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("statusEnterMessage", v);
    return this;
  }
}
