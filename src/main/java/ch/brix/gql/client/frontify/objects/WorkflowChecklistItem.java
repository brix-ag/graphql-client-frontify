package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkflowChecklistItem {
  /**
   * **BETA** `WorkflowChecklistItem` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The content of the `WorkflowChecklistItem`.
   */
  @com.google.gson.annotations.SerializedName("content")
  private ch.brix.gql.client.frontify.scalars.StringScalar content;
  /**
   * **BETA** The default assignee of the `WorkflowChecklistItem`.
   */
  @com.google.gson.annotations.SerializedName("assignedUser")
  private ch.brix.gql.client.frontify.interfaces.User assignedUser;
}
