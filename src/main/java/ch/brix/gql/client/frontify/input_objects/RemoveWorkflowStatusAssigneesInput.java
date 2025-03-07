package ch.brix.gql.client.frontify.input_objects;

public class RemoveWorkflowStatusAssigneesInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowStatus` Id.
   */
  public RemoveWorkflowStatusAssigneesInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** List of `User` Ids to be unassigned from `WorkflowStatus`.
   */
  public RemoveWorkflowStatusAssigneesInput userIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("userIds", v);
    return this;
  }
}
