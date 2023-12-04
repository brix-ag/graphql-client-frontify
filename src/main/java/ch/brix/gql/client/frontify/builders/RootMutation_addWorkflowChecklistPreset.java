package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowChecklistPreset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddWorkflowChecklistPreset> {
  public RootMutation_addWorkflowChecklistPreset() {
    super(new ch.brix.gql.client.Call<>("addWorkflowChecklistPreset", "AddWorkflowChecklistPreset"));
  }
  public RootMutation_addWorkflowChecklistPreset args(RootMutation_addWorkflowChecklistPreset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addWorkflowChecklistPreset onAddWorkflowChecklistPreset(On_AddWorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
