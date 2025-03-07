package ch.brix.gql.client.frontify.input_objects;

public class AddWorkflowStatusAssigneesInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowStatus` Id.
   */
  public AddWorkflowStatusAssigneesInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** List of `User` Ids to be assigned to `WorkflowStatus`.
   */
  public AddWorkflowStatusAssigneesInput userIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("userIds", v);
    return this;
  }
}
