package ch.brix.gql.client.frontify.input_objects;

/**
 * Identifies the `WorkflowStatus` to assign to an `Asset`.
 */
public class WorkflowStatusAssignmentInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowStatus` Id.
   */
  public WorkflowStatusAssignmentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
