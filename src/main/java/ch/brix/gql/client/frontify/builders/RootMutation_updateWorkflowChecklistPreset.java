package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateWorkflowChecklistPreset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateWorkflowChecklistPreset> {
  public RootMutation_updateWorkflowChecklistPreset() {
    super(new ch.brix.gql.client.Call<>("updateWorkflowChecklistPreset", "UpdateWorkflowChecklistPreset"));
  }
  public RootMutation_updateWorkflowChecklistPreset args(RootMutation_updateWorkflowChecklistPreset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateWorkflowChecklistPreset onUpdateWorkflowChecklistPreset(On_UpdateWorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
