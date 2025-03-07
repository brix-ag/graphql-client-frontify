package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateWorkflowChecklistPreset {
  /**
   * **BETA** The updated `ChecklistPreset`.
   */
  @com.google.gson.annotations.SerializedName("checklistPreset")
  private ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset checklistPreset;
}
