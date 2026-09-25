package ch.brix.gql.client.frontify.input_objects;

public class CreateAssetWorkflowTaskInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Id of the `Asset` which should be linked to the `WorkflowTask`.
   */
  public CreateAssetWorkflowTaskInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * **BETA** Id of the `WorkflowStatus` where the `WorkflowTask` should be created.
   */
  public CreateAssetWorkflowTaskInput workflowStatusId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("workflowStatusId", v);
    return this;
  }
  /**
   * **BETA** List of `User` ids to be assigned to the `WorkflowTask`. Currently, only one Id is supported.
   */
  public CreateAssetWorkflowTaskInput assigneeUserIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assigneeUserIds", v);
    return this;
  }
  /**
   * **BETA** `WorkflowTask` enter message. Optionally required by a `EnterRule` of the given `WorkflowStatus`.
   */
  public CreateAssetWorkflowTaskInput statusEnterMessage(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("statusEnterMessage", v);
    return this;
  }
}
