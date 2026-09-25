package ch.brix.gql.client.frontify.builders;

public class WorkflowChecklistItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.WorkflowChecklistItem>> {
  public WorkflowChecklistItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "WorkflowChecklistItem"));
  }
  public WorkflowChecklistItems_items onWorkflowChecklistItem(On_WorkflowChecklistItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
