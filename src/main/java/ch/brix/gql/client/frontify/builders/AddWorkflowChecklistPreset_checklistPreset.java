package ch.brix.gql.client.frontify.builders;

public class AddWorkflowChecklistPreset_checklistPreset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WorkflowChecklistPreset> {
  public AddWorkflowChecklistPreset_checklistPreset() {
    super(new ch.brix.gql.client.Call<>("checklistPreset", "WorkflowChecklistPreset"));
  }
  public AddWorkflowChecklistPreset_checklistPreset onWorkflowChecklistPreset(On_WorkflowChecklistPreset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
