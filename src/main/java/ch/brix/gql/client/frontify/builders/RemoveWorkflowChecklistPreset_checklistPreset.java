package ch.brix.gql.client.frontify.builders;

public class RemoveWorkflowChecklistPreset_checklistPreset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset> {
  public RemoveWorkflowChecklistPreset_checklistPreset() {
    super(new ch.brix.gql.client.Call<>("checklistPreset", "WorkflowChecklistPreset"));
  }
  public RemoveWorkflowChecklistPreset_checklistPreset onWorkflowChecklistPreset(On_WorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
