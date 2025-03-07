package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowChecklistItemDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Content of the `WorkflowChecklistItem`.
   */
  public UpdateWorkflowChecklistItemDataInput content(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("content", v);
    return this;
  }
  /**
   * **BETA** `User` Id of `WorkflowChecklistItem` assignee.
   */
  public UpdateWorkflowChecklistItemDataInput assigneeUserId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assigneeUserId", v);
    return this;
  }
}
