package ch.brix.gql.client.frontify.builders;

public class AddWorkflowChecklistItem_checklistItem extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowChecklistItem> {
  public AddWorkflowChecklistItem_checklistItem() {
    super(new ch.brix.gql.client.Call<>("checklistItem", "WorkflowChecklistItem"));
  }
  public AddWorkflowChecklistItem_checklistItem onWorkflowChecklistItem(On_WorkflowChecklistItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
