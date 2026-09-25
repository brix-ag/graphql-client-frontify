package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowChecklistItem extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddWorkflowChecklistItem> {
  public RootMutation_addWorkflowChecklistItem() {
    super(new ch.brix.gql.client.Call<>("addWorkflowChecklistItem", "AddWorkflowChecklistItem"));
  }
  public RootMutation_addWorkflowChecklistItem args(RootMutation_addWorkflowChecklistItem_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addWorkflowChecklistItem onAddWorkflowChecklistItem(On_AddWorkflowChecklistItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
