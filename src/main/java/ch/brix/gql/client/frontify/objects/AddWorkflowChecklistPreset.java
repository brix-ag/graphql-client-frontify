package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddWorkflowChecklistPreset {
  /**
   * **BETA** The created `WorkflowChecklistPreset`.
   */
  @com.google.gson.annotations.SerializedName("checklistPreset")
  private ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset checklistPreset;
}
