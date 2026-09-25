package ch.brix.gql.client.frontify.input_objects;

public class UpdateWorkflowChecklistPresetDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Content of the `WorkflowChecklistPreset`.
   */
  public UpdateWorkflowChecklistPresetDataInput content(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("content", v);
    return this;
  }
  /**
   * **BETA** `User` Id of `WorkflowChecklistPreset` assignee.
   */
  public UpdateWorkflowChecklistPresetDataInput assigneeUserId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assigneeUserId", v);
    return this;
  }
}
