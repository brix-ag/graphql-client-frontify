package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowChecklistItem extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveWorkflowChecklistItem> {
  public RootMutation_removeWorkflowChecklistItem() {
    super(new ch.brix.gql.client.Call<>("removeWorkflowChecklistItem", "RemoveWorkflowChecklistItem"));
  }
  public RootMutation_removeWorkflowChecklistItem args(RootMutation_removeWorkflowChecklistItem_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeWorkflowChecklistItem onRemoveWorkflowChecklistItem(On_RemoveWorkflowChecklistItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
