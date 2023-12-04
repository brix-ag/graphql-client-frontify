package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Workflow {
  /**
   * **BETA** Multiple statuses define a `Workflow`. They represent a line/row in the Kanban board of the current `Workflow`.
   */
  @com.google.gson.annotations.SerializedName("statuses")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.WorkflowStatus.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.WorkflowStatus> statuses;
}
