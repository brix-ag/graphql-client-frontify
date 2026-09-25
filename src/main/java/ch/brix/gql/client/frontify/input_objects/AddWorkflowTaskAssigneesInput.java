package ch.brix.gql.client.frontify.input_objects;

public class AddWorkflowTaskAssigneesInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowTask` Id.
   */
  public AddWorkflowTaskAssigneesInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** List of `User` Ids to assign to the `WorkflowTask`.
   */
  public AddWorkflowTaskAssigneesInput userIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("userIds", v);
    return this;
  }
}
