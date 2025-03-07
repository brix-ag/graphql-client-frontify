package ch.brix.gql.client.frontify.input_objects;

public class AddWorkflowChecklistPresetInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `WorkflowStatus` Id where the `WorkflowChecklistPreset` should be created.
   */
  public AddWorkflowChecklistPresetInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** Content of the `WorkflowChecklistPreset`.
   */
  public AddWorkflowChecklistPresetInput content(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("content", v);
    return this;
  }
  /**
   * **BETA** `User` Id of `WorkflowChecklistPreset` assignee.
   */
  public AddWorkflowChecklistPresetInput assigneeUserId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assigneeUserId", v);
    return this;
  }
}
