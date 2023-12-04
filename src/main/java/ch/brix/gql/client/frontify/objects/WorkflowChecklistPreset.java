package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkflowChecklistPreset {
  /**
   * **BETA** `WorkflowChecklistPreset` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The content of the `WorkflowChecklistPreset`.
   */
  @com.google.gson.annotations.SerializedName("content")
  private ch.brix.gql.client.frontify.scalars.StringScalar content;
  /**
   * **BETA** The default assignee of the `WorkflowChecklistPreset`.
   */
  @com.google.gson.annotations.SerializedName("assignedUser")
  private ch.brix.gql.client.frontify.interfaces.User assignedUser;
}
