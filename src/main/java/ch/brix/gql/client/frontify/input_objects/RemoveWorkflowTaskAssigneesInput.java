package ch.brix.gql.client.frontify.input_objects;

public class RemoveWorkflowTaskAssigneesInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowTask` Id.
   */
  public RemoveWorkflowTaskAssigneesInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** List of `User` Ids to unassign from the `WorkflowTask`.
   */
  public RemoveWorkflowTaskAssigneesInput userIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("userIds", v);
    return this;
  }
}
