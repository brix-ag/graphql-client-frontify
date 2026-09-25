package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateWorkflowChecklistItem extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateWorkflowChecklistItem> {
  public RootMutation_updateWorkflowChecklistItem() {
    super(new ch.brix.gql.client.Call<>("updateWorkflowChecklistItem", "UpdateWorkflowChecklistItem"));
  }
  public RootMutation_updateWorkflowChecklistItem args(RootMutation_updateWorkflowChecklistItem_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateWorkflowChecklistItem onUpdateWorkflowChecklistItem(On_UpdateWorkflowChecklistItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
