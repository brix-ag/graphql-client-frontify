package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkflowTask {
  /**
   * **BETA** `WorkflowTask` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** A list of `User` assigned to the `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("assignedUsers")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.User.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.User> assignedUsers;
  /**
   * **BETA** The `Asset` linked to the `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.interfaces.Asset asset;
  /**
   * **BETA** `WorkflowTask` title.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** `WorkflowTask` description.
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * **BETA** The `WorkflowStatus` of the `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("status")
  private ch.brix.gql.client.frontify.objects.WorkflowStatus status;
  /**
   * **BETA** A list of the `WorkflowChecklistItem` in the `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("checklistItem")
  private ch.brix.gql.client.frontify.objects.WorkflowChecklistItems checklistItem;
}
