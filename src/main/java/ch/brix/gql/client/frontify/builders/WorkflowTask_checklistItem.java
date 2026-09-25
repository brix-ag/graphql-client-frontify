package ch.brix.gql.client.frontify.builders;

public class WorkflowTask_checklistItem extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowChecklistItems> {
  public WorkflowTask_checklistItem() {
    super(new ch.brix.gql.client.Call<>("checklistItem", "WorkflowChecklistItems"));
  }
  public WorkflowTask_checklistItem args(WorkflowTask_checklistItem_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public WorkflowTask_checklistItem onWorkflowChecklistItems(On_WorkflowChecklistItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
