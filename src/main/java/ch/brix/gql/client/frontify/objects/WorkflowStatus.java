package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkflowStatus {
  /**
   * **BETA** `WorkflowStatus` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The name of the `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The color of the `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("color")
  private ch.brix.gql.client.frontify.objects.RgbaColor color;
  /**
   * **BETA** List of `User` assigned to this `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("assignedUsers")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.User.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.User> assignedUsers;
  /**
   * **BETA** A list of `WorkflowPreset` that is used to create one or more `WorkflowChecklistItem`, which are appended to a `WorkflowTask` on entering this `WorkflowState`.
   */
  @com.google.gson.annotations.SerializedName("checklistPresets")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset> checklistPresets;
  /**
   * **BETA** A list of the `WorkflowTask` in the `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("tasks")
  private ch.brix.gql.client.frontify.objects.WorkflowStatusTaskItems tasks;
  /**
   * **BETA** A list of `WorkflowStatusEnterRule` which needs to be satisfied before a `WorkflowTask` can enter this `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("enterRules")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.enums.WorkflowStatusEnterRule.class)
  private java.util.List<ch.brix.gql.client.frontify.enums.WorkflowStatusEnterRule> enterRules;
}
