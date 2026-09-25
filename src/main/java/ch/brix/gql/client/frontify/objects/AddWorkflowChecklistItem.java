package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddWorkflowChecklistItem {
  /**
   * **BETA** The created `WorkflowChecklistItem`.
   */
  @com.google.gson.annotations.SerializedName("checklistItem")
  private ch.brix.gql.client.frontify.objects.WorkflowChecklistItem checklistItem;
}
