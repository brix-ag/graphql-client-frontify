package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveWorkflowChecklistPreset {
  /**
   * **BETA** The deleted `WorkflowChecklistPreset`.
   */
  @com.google.gson.annotations.SerializedName("checklistPreset")
  private ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset checklistPreset;
}
