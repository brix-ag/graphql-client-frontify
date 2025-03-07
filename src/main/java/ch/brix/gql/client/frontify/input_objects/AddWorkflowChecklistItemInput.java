package ch.brix.gql.client.frontify.input_objects;

public class AddWorkflowChecklistItemInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowTask` Id where the `WorkflowChecklistItem` should be created.
   */
  public AddWorkflowChecklistItemInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** Content of the `WorkflowChecklistItem`.
   */
  public AddWorkflowChecklistItemInput content(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("content", v);
    return this;
  }
  /**
   * **BETA** `User` Id of `WorkflowChecklistItem` assignee.
   */
  public AddWorkflowChecklistItemInput assigneeUserId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assigneeUserId", v);
    return this;
  }
}
