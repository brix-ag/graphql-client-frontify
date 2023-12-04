package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowChecklistPreset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveWorkflowChecklistPreset> {
  public RootMutation_removeWorkflowChecklistPreset() {
    super(new ch.brix.gql.client.Call<>("removeWorkflowChecklistPreset", "RemoveWorkflowChecklistPreset"));
  }
  public RootMutation_removeWorkflowChecklistPreset args(RootMutation_removeWorkflowChecklistPreset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeWorkflowChecklistPreset onRemoveWorkflowChecklistPreset(On_RemoveWorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
